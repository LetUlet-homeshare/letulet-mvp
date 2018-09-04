package com.letulet.backend.model;

import com.letulet.backend.db.DBUtils;
import com.letulet.utils.Log;

import java.sql.SQLException;
import java.util.Date;

/**
 * Created by stephan on 09/11/17.
 */
public class BankAccountManager {

	static BankAccountManager instance = null;

    static {
		instance = new BankAccountManager();
	}

	static public BankAccountManager getInstance() {
		return instance;
	}


    public BankAccount createBankAccount() {

        try {
            BankAccount bankAccount = DBUtils.getEntityManager().create(BankAccount.class);
            bankAccount.setIsActive(true);
            return bankAccount;

        } catch (SQLException se) {
            se.printStackTrace();
        }
        return null;
    }

    /*public BankAccount getBankAccountByTenant(Tenant tenant) {

        if(tenant == null) { throw new IllegalArgumentException(); }

        try {
            BankAccount[] b = DBUtils.getEntityManager().find(BankAccount.class, "tenantID = ? AND isDeleted = 0", tenant);
            if(b.length == 0)
                return null;
            else
                return b[0];

        } catch (SQLException se) {
            Log.error(BankAccountManager.class, se.getMessage());
        }
        return null;
    }

    public BankAccount[] getBankAccountsByLandlord(Landlord landlord) {

        if(landlord == null) { throw new IllegalArgumentException(); }

        try {

            return DBUtils.getEntityManager().find(BankAccount.class, "landlordID = ? AND isDeleted = 0", landlord);
        } catch (SQLException se) {
            Log.error(BankAccountManager.class, se.getMessage());
        }
        return null;
    }*/

    public BankAccount getBankAccountByID(String id) {

        if(id == null) { throw new IllegalArgumentException(); }

        try {

            BankAccount[] b = DBUtils.getEntityManager().find(BankAccount.class, "ID = ?", id);
            if(b.length == 0)
                return null;
            else
                return b[0];
        } catch (SQLException se) {
            Log.error(BankAccountManager.class, se.getMessage());
        }
        return null;
    }
}