package com.letulet.backend.model.airbnb;

import com.letulet.backend.db.DBUtils;
import com.letulet.backend.model.User;
import com.letulet.backend.model.UserManager;
import com.letulet.utils.Log;
import com.letulet.utils.StringPool;
import com.letulet.utils.Validator;
import org.json.JSONObject;

import java.sql.SQLException;


public class AirbnbUserManager {

    static AirbnbUserManager instance = null;

    static {
        instance = new AirbnbUserManager();
    }

    static public AirbnbUserManager getInstance() {
        return instance;
    }

    public AirbnbUser createAirbnbUser(String userID, String accessToken, String refreshToken, User user) {

        if(userID == null || accessToken == null || refreshToken == null) { throw new IllegalArgumentException(); }

        try {
            AirbnbUser airbnbUser = DBUtils.getEntityManager().create(AirbnbUser.class);

            airbnbUser.setAccessToken(accessToken);
            airbnbUser.setAirbnbUserID(userID);
            airbnbUser.setRefreshToken(refreshToken);
            airbnbUser.setUser(user);
            airbnbUser.save();

            return airbnbUser;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteAirbnbUser(AirbnbUser airbnbUser) {

        if(airbnbUser == null) { throw new IllegalArgumentException(); }

        try {

            DBUtils.getEntityManager().delete(airbnbUser);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public AirbnbUser getAirbnbUserByAirbnbUserID(String airbnbUserID) {

        if(airbnbUserID == null) { throw new IllegalArgumentException(); }

        try {
            AirbnbUser[] l = DBUtils.getEntityManager().find(AirbnbUser.class, "airbnbUserID = ?", airbnbUserID);
            if(l.length == 0)
                return null;
            else
                return l[0];

        } catch (SQLException se) {
            se.printStackTrace();
        }
        return null;
    }

    public AirbnbUser getAirbnbUserByUserID(String userID) {

        if(userID == null) { throw new IllegalArgumentException(); }

        try {
            AirbnbUser[] l = DBUtils.getEntityManager().find(AirbnbUser.class, "userID = ?", userID);
            if(l.length == 0)
                return null;
            else
                return l[0];

        } catch (SQLException se) {
            se.printStackTrace();
        }
        return null;
    }


    public String showBestProfile(AirbnbUser airbnbUser) {

        if(Validator.isNotNull(airbnbUser.getFirstName()) && Validator.isNotNull(airbnbUser.getLastName())) {
            return airbnbUser.getFirstName() + StringPool.SPACE +  airbnbUser.getLastName();
        } else if (Validator.isNotNull(airbnbUser.getFirstName())) {
            return airbnbUser.getFirstName();
        } else if (Validator.isNotNull(airbnbUser.getEmail())) {

            if (airbnbUser.getEmail().contains(StringPool.AT)) {

                return airbnbUser.getEmail().substring(0, airbnbUser.getEmail().indexOf(StringPool.AT));
            }

            return airbnbUser.getEmail();
        }

        return "";
    }

    // returns the AirBnB users (PMs) managed by this Orbirental user
    public AirbnbUser[] getAirbnbUsersByUser(User user) {

        if(user == null) { throw new IllegalArgumentException(); }

        try {
            return DBUtils.getEntityManager().find(AirbnbUser.class, "userID = ?", user);

        } catch (SQLException se) {
            se.printStackTrace();
        }
        return null;
    }
}