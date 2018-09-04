package com.letulet.backend.model.channel.airbnb;

import com.letulet.backend.db.DBUtils;
import com.letulet.backend.model.Tenant;

import java.sql.SQLException;

/**
 * Created by stephan on 05/01/18.
 */
public class AirbnbUserManager {

    static AirbnbUserManager instance = null;

    static {
        instance = new AirbnbUserManager();
    }

    static public AirbnbUserManager getInstance() {
        return instance;
    }


    public AirbnbUser createAirbnbUser(String userID, String accessToken, String refreshToken, Tenant tenant) {

        if(tenant == null || userID == null || accessToken == null || refreshToken == null) { throw new IllegalArgumentException(); }

        try {
            AirbnbUser airbnbUser = DBUtils.getEntityManager().create(AirbnbUser.class);

            airbnbUser.setAccessToken(accessToken);
            airbnbUser.setAirbnbUserID(userID);
            airbnbUser.setRefreshToken(refreshToken);
            airbnbUser.setTenant(tenant);
            airbnbUser.save();

            return airbnbUser;

        } catch (Exception e) {
            e.printStackTrace();
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


    public boolean hasAlreadyConnected(Tenant tenant) {

        AirbnbUser airbnbUser = AirbnbUserManager.getInstance().getAirbnbUserByUserID(String.valueOf(tenant.getID()));
        if(airbnbUser != null) {
            return true;
        }
        return false;

    }

    // returns the AirBnB users (PMs) managed by this Orbirental user
    public AirbnbUser[] getAirbnbUsersByUser(Tenant tenant) {

        if(tenant == null) { throw new IllegalArgumentException(); }

        try {
            return DBUtils.getEntityManager().find(AirbnbUser.class, "userID = ?", tenant);

        } catch (SQLException se) {
            se.printStackTrace();
        }
        return null;
    }

}