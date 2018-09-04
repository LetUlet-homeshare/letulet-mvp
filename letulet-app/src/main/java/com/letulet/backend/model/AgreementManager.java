package com.letulet.backend.model;

import com.letulet.backend.db.DBUtils;
import com.letulet.utils.Log;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by stephan on 13/11/17.
 */
public class AgreementManager {

	static AgreementManager instance = null;

    static {
		instance = new AgreementManager();
	}

	static public AgreementManager getInstance() {
		return instance;
	}


    public Agreement createAgreement(Property property) {

        try {
            Agreement agreement = DBUtils.getEntityManager().create(Agreement.class);
            agreement.setProperty(property);
            agreement.setCreated(new Date());
            agreement.setStatus(Agreement.Status.NEW);
            agreement.setUID(java.util.UUID.randomUUID().toString());

            return agreement;

        } catch (SQLException se) {
            se.printStackTrace();
        }
        return null;
    }

    public Agreement getAgreementByUid(String uid) {

        if(uid == null) { throw new IllegalArgumentException(); }

        try {
            Agreement[] a = DBUtils.getEntityManager().find(Agreement.class, "uID = ?", uid);
            if(a.length == 0)
                return null;
            else
                return a[0];

        } catch (SQLException se) {
            Log.error(AgreementManager.class, se.getMessage());
        }
        return null;
    }

    public Agreement[] getAgreementsByProperty(Property property) {

        if(property == null) { throw new IllegalArgumentException(); }

        try {

            return DBUtils.getEntityManager().find(Agreement.class, "propertyID = ?", property);

        } catch (SQLException se) {
            Log.error(AgreementManager.class, se.getMessage());
        }
        return null;
    }

    public Agreement getAgreementByProperty(Property property) {

        if(property == null) { throw new IllegalArgumentException(); }

        try {

            Agreement[] a = DBUtils.getEntityManager().find(Agreement.class, "propertyID = ?", property);
            if(a.length == 0)
                return null;
            else
                return a[0];
        } catch (SQLException se) {
            Log.error(AgreementManager.class, se.getMessage());
        }
        return null;
    }

    public Agreement[] getAgreementsByLandlord(Landlord landlord) {

        ArrayList<Agreement> agreements = new ArrayList<Agreement>();

        Property[] properties = PropertyManager.getInstance().getPropertiesByLandlord(landlord);

        for (Property p : properties) {

            Agreement a = AgreementManager.getInstance().getAgreementByProperty(p);

            if (a != null) {

                agreements.add(a);
            }
        }

        return agreements.toArray(new Agreement[0]);
    }

    public Agreement[] getAgreementsByTenant(Tenant tenant) {

        ArrayList<Agreement> agreements = new ArrayList<Agreement>();

        Property[] properties = PropertyManager.getInstance().getPropertiesByTenant(tenant);

        for (Property p : properties) {

            Agreement a = AgreementManager.getInstance().getAgreementByProperty(p);

            if (a != null) {

                agreements.add(a);
            }
        }

        return agreements.toArray(new Agreement[0]);
    }
}

