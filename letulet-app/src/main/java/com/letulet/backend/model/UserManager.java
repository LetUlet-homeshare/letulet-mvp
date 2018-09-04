package com.letulet.backend.model;

import com.letulet.backend.db.DBUtils;
import com.letulet.utils.HashPasswordUtil;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by stephan on 09/11/17.
 */
public class UserManager {

	static UserManager instance = null;

    protected static final String EMAIL = "email";

    static {
		instance = new UserManager();
	}

	static public UserManager getInstance() {
		return instance;
	}

    public UserManager() {
        super();
    }

    public User createUser(User user, String password) {

        try {
            String hashedPassword = null;
            try {
                hashedPassword = HashPasswordUtil.hash(password);
            } catch(NoSuchAlgorithmException nsae) {
                nsae.printStackTrace();
            }

            user.setHashedPassword(hashedPassword);

            if(user instanceof Tenant) {
                user.setHashedEmail(HashPasswordUtil.hash(((Tenant) user).getEmail()));
            } else if(user instanceof Landlord){

            }

            user.setHashedEmail(HashPasswordUtil.hash(((Landlord)user).getEmail()));

            Date now = new Date();
            user.setLastLogin(now);
            user.setCreated(now);
            user.setModified(now);
            user.save();
            return user;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public User getUserByEmail(String emailAddress) {

        if(emailAddress == null)
            return null;
        try {
            User[] results = DBUtils.getEntityManager().find(Tenant.class, "email = ?", emailAddress);
            if(results.length == 0) {
                results = DBUtils.getEntityManager().find(Landlord.class, "email = ?", emailAddress);
            }
            return (results.length > 0 ? results[0] : null);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return null;
        }
    }


    public User getUserByHashedEmail(String hashedEmailAddress) {

        if(hashedEmailAddress == null)
            return null;
        try {
            User[] results = DBUtils.getEntityManager().find(Tenant.class, "hashedEmail = ?", hashedEmailAddress);
            if(results.length == 0) {
                results = DBUtils.getEntityManager().find(Landlord.class, "hashedEmail = ?", hashedEmailAddress);
            }
            return (results.length > 0 ? results[0] : null);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return null;
        }
    }


    public User getUserById(String id) {

        if(id == null)return null;
        try {
            User[] results = DBUtils.getEntityManager().find(Tenant.class, "ID = ?", id);
            if(results.length == 0) {
                results = DBUtils.getEntityManager().find(Landlord.class, "ID = ?", id);
            }
            return (results.length > 0 ? results[0] : null);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return null;
        }
    }

    public boolean authenticate(User storedUser, String password) {

        if(HashPasswordUtil.sha1PasswordHashesMatch(password, storedUser.getHashedPassword())) {
            return true;
        }
        return false;
    }

}
