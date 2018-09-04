package com.letulet.backend.model;


import net.java.ao.Entity;
import net.java.ao.schema.Default;
import net.java.ao.schema.Unique;

public interface Setting extends Entity {

    @Unique
    User getUser();
    void setUser(User tenant);

    @Default("0")
    boolean getEmailNotifications();
    void setEmailNotifications(boolean emailNotifications);

    @Default("0")
    boolean getSMSNotifications();
    void setSMSNotifications(boolean smsNotifications);

    @Default("0")
    boolean getAgreementStatus();
    void setAgreementStatus(boolean agreementStatus);


    @Default("0")
    boolean getNewMessage();
    void setNewMessage(boolean newMessage);

    @Default("0")
    boolean getNewDeposit();
    void setNewDeposit(boolean newDeposit);

    @Default("0")
    boolean getStayLoggedIn();
    void setStayLoggedIn(boolean stayLoggedIn);


    @Default("0")
    boolean getSMSVerification();
    void setSMSVerification(boolean smsVerification);
}
