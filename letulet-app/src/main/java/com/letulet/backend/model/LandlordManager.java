package com.letulet.backend.model;

import com.letulet.backend.db.DBUtils;
import com.letulet.utils.HashPasswordUtil;
import com.letulet.utils.Log;
import com.letulet.utils.StringPool;
import com.letulet.utils.Validator;
import net.java.ao.DBParam;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Date;


/**
 * Created by stephan on 07/11/17.
 */
public class LandlordManager {

    protected static final String EMAIL = "email";

	static LandlordManager instance = null;

    static {
		instance = new LandlordManager();
	}

	static public LandlordManager getInstance() {
		return instance;
	}


    public Landlord createLandlord(String emailAddress, String password) {

        Date now = new Date();

        try {
            Landlord landlord = DBUtils.getEntityManager().create(Landlord.class, new DBParam(EMAIL, emailAddress));
            landlord.setIsActive(true);
            landlord.setCountryCode(CountryCode.US);

            String hashedPassword = null;
            try {
                hashedPassword = HashPasswordUtil.hash(password);
            } catch(NoSuchAlgorithmException nsae) {
                nsae.printStackTrace();
            }

            landlord.setHashedPassword(hashedPassword);
            landlord.setHashedEmail(HashPasswordUtil.hash(landlord.getEmail()));
            landlord.setLastLogin(now);
            landlord.setCreated(now);
            landlord.setModified(now);
            landlord.save();

            return landlord;

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String showBestProfile(Landlord landlord) {

        if(Validator.isNotNull(landlord.getFirstName()) && Validator.isNotNull(landlord.getLastName())) {
            return landlord.getFirstName() + StringPool.SPACE +  landlord.getLastName();
        } else if (Validator.isNotNull(landlord.getFirstName())) {
            return landlord.getFirstName();
        } else if (Validator.isNotNull(landlord.getEmail())) {

            if (landlord.getEmail().contains(StringPool.AT)) {

                return landlord.getEmail().substring(0, landlord.getEmail().indexOf(StringPool.AT));
            }

            return landlord.getEmail();
        }

        return "";
    }

    public Landlord getLandlordById(String id) {

        if(id == null) { throw new IllegalArgumentException(); }

        try {
            Landlord[] a = DBUtils.getEntityManager().find(Landlord.class, "ID = ?", id);
            if(a.length == 0)
                return null;
            else
                return a[0];

        } catch (SQLException se) {
            Log.error(LandlordManager.class, se.getMessage());
        }
        return null;
    }
}
