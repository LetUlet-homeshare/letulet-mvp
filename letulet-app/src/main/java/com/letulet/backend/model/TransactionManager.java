package com.letulet.backend.model;

import com.letulet.backend.db.DBUtils;
import com.letulet.utils.Log;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by stephan on 13/11/17.
 */
public class TransactionManager {

	static TransactionManager instance = null;

    static {
		instance = new TransactionManager();
	}

	static public TransactionManager getInstance() {
		return instance;
	}


    public Transaction createTransaction(BankAccount bankAccountSource, BankAccount bankAccountDestination, Agreement agreement, double amount) {

        try {
            Transaction transaction = DBUtils.getEntityManager().create(Transaction.class);
            transaction.setBankAccountSource(bankAccountSource);
            transaction.setBankAccountDestination(bankAccountDestination);
            transaction.setAmount(amount);
            transaction.setAgreement(agreement);
            transaction.setCreated(new Date());
            transaction.setStatus(Transaction.Status.NEW);
            transaction.save();

            return transaction;
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return null;
    }

    public Transaction getTransactionByID(String id) {

        if(id == null) { throw new IllegalArgumentException(); }

        try {
            Transaction[] a = DBUtils.getEntityManager().find(Transaction.class, "ID = ?", id);
            if(a.length == 0)
                return null;
            else
                return a[0];

        } catch (SQLException se) {
            Log.error(TransactionManager.class, se.getMessage());
        }
        return null;
    }

    public Transaction[] getTransactionsByAgreement(Agreement agreement) {

        if(agreement == null) { throw new IllegalArgumentException(); }

        try {

            return DBUtils.getEntityManager().find(Transaction.class, "agreementID = ?", agreement);

        } catch (SQLException se) {
            Log.error(TransactionManager.class, se.getMessage());
        }
        return null;
    }

    public Transaction[] getTransactionsByBankAccount(BankAccount bankAccount) {

        if(bankAccount == null) { throw new IllegalArgumentException(); }

        try {

            return DBUtils.getEntityManager().find(Transaction.class, "bankAccountDestinationID = ? OR bankAccountSourceID = ?", bankAccount, bankAccount);

        } catch (SQLException se) {
            Log.error(TransactionManager.class, se.getMessage());
        }
        return null;
    }
}

