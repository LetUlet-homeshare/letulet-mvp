package com.letulet.backend.model;

import net.java.ao.Entity;
import net.java.ao.schema.Default;
import net.java.ao.schema.StringLength;

import java.util.Date;


/**
 * Created by stephan on 13/11/17.
 */
public interface Transaction extends Entity {

    BankAccount getBankAccountSource();
    void setBankAccountSource(BankAccount bankAccount);

    BankAccount getBankAccountDestination();
    void setBankAccountDestination(BankAccount bankAccount);

    Agreement getAgreement();
    void setAgreement(Agreement agreement);

    public Date getCreated();
    void setCreated(Date created);

    double getAmount();
    void setAmount(double payout);

    //Credit card
    enum Status {
        NEW,
        PROCESSED,
        FAILED;
    }

    public Status getStatus();
    void setStatus(Status status);
}
