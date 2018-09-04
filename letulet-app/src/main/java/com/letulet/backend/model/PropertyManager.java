package com.letulet.backend.model;

import com.letulet.backend.db.DBUtils;
import com.letulet.utils.Log;

import java.sql.SQLException;
import java.util.Date;

/**
 * Created by stephan on 09/11/17.
 */
public class PropertyManager {

	static PropertyManager instance = null;

    static {
		instance = new PropertyManager();
	}

	static public PropertyManager getInstance() {
		return instance;
	}


    public Property createProperty() {

        try {
            Property property = DBUtils.getEntityManager().create(Property.class);
            Date now = new Date();
            property.setCreatedOn(now);
            property.setUpdatedOn(now);
            property.setUID(java.util.UUID.randomUUID().toString());

            return property;

        } catch (SQLException se) {
            se.printStackTrace();
        }
        return null;
    }

    public Property getPropertyByUid(String uid) {

        if(uid == null) { throw new IllegalArgumentException(); }

        try {
            Property[] p = DBUtils.getEntityManager().find(Property.class, "uID = ?", uid);
            if(p.length == 0)
                return null;
            else
                return p[0];

        } catch (SQLException se) {
            Log.error(PropertyManager.class, se.getMessage());
        }
        return null;
    }

    public Property[] getPropertiesByTenant(Tenant tenant) {

        if(tenant == null) { throw new IllegalArgumentException(); }

        try {

            return DBUtils.getEntityManager().find(Property.class, "tenantID = ?", tenant);
        } catch (SQLException se) {
            Log.error(PropertyManager.class, se.getMessage());
        }
        return null;
    }

    public Property[] getPropertiesByLandlord(Landlord landlord) {

        if(landlord == null) { throw new IllegalArgumentException(); }

        try {

            return DBUtils.getEntityManager().find(Property.class, "landlordID = ?", landlord);
        } catch (SQLException se) {
            Log.error(PropertyManager.class, se.getMessage());
        }
        return null;
    }

    public static Property getPropertyByAirBnBID(String id) {

        if(id == null) { throw new IllegalArgumentException();  }

        Property[] p = null;

        try {

            p = DBUtils.getEntityManager().find(Property.class, "airBnBID = ?", id);

            if(p.length == 0)
                return null;
            else if(p.length > 0)
                return p[0];

        } catch (SQLException se) {
            Log.error(PropertyManager.class, se.getMessage());
        }
        return null;
    }


    public int convertStringBathroomsToInteger(String bathrooms) {

        double _bath = Double.valueOf(bathrooms);

        int bath = 0;

        //cant be high than 9.5
        if (_bath % 1 != 0 && _bath > 9.5) {
            return (int) _bath;
        }

        if (_bath % 1 != 0) {

            bath = (int)  (_bath * 100);
        } else {
            bath = (int) _bath;
        }

        return bath;
    }
}