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
public class TenantManager {

    protected static final String EMAIL = "email";

	static TenantManager instance = null;

    static {
		instance = new TenantManager();
	}

	static public TenantManager getInstance() {
		return instance;
	}

    public Tenant createTenant(String emailAddress, String password) {

        Date now = new Date();

        try {
            Tenant tenant = DBUtils.getEntityManager().create(Tenant.class, new DBParam(EMAIL, emailAddress));
            tenant.setIsActive(true);
            tenant.setCountryCode(CountryCode.US);

            String hashedPassword = null;
            try {
                hashedPassword = HashPasswordUtil.hash(password);
            } catch(NoSuchAlgorithmException nsae) {
                nsae.printStackTrace();
            }

            tenant.setHashedPassword(hashedPassword);
            tenant.setHashedEmail(HashPasswordUtil.hash(tenant.getEmail()));
            tenant.setLastLogin(now);
            tenant.setCreated(now);
            tenant.setModified(now);
            tenant.save();

            return tenant;

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String showBestProfile(Tenant tenant) {

        if(Validator.isNotNull(tenant.getFirstName()) && Validator.isNotNull(tenant.getLastName())) {
            return tenant.getFirstName() + StringPool.SPACE +  tenant.getLastName();
        } else if (Validator.isNotNull(tenant.getFirstName())) {
            return tenant.getFirstName();
        } else if (Validator.isNotNull(tenant.getEmail())) {

            if (tenant.getEmail().contains(StringPool.AT)) {

                return tenant.getEmail().substring(0, tenant.getEmail().indexOf(StringPool.AT));
            }

            return tenant.getEmail();
        }

        return "";
    }

    public Tenant getTenantById(String id) {

        if(id == null) { throw new IllegalArgumentException(); }

        try {
            Tenant[] a = DBUtils.getEntityManager().find(Tenant.class, "ID = ?", id);
            if(a.length == 0)
                return null;
            else
                return a[0];

        } catch (SQLException se) {
            Log.error(TenantManager.class, se.getMessage());
        }
        return null;
    }
}
