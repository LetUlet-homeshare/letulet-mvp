package com.letulet.backend.model;

import net.java.ao.Entity;
import net.java.ao.schema.Default;
import net.java.ao.schema.Unique;

import java.util.Date;

/**
 * Created by stephan on 07/11/17.
 */
public interface Tenant extends User {

    @Unique
    public String getEmail();
    public void setEmail(String email);

    BankAccount getBankAccount();
    void setBankAccount(BankAccount bankAccount);
}
