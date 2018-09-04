package com.letulet.backend.model;

import net.java.ao.Entity;
import net.java.ao.Polymorphic;
import net.java.ao.schema.Default;
import net.java.ao.schema.Unique;

import java.util.Date;

/**
 * Created by stephan on 09/11/17.
 */
@Polymorphic
public interface User extends Entity {

    public String getFirstName();
    public void setFirstName(String fistName);

    public String getLastName();
    public void setLastName(String lastName);

    String getHashedPassword();
    void setHashedPassword(String hashedPassword);

    Date getCreated();
    void setCreated(Date created);

    Date getModified();
    void setModified(Date modified);

    Date getLastLogin();
    void setLastLogin(Date lastLogin);

    /*Date getDateOfBirth();
    void setDateOfBirth(Date dateOfBirth);*/

    // using this field for storing unique user id in cookies
    public String getHashedEmail();
    public void setHashedEmail(String hashedEmail);

    @Default("1")
    int getPhoneNumberAreaCode();
    void setPhoneNumberAreaCode(int phoneNumberAreaCode);

    public String getPhoneNumber();
    public void setPhoneNumber(String phoneNumber);

    String getMobilePhoneNumber();
    void setMobilePhoneNumber(String mobilePhoneNumber);

    @Default("1")
    boolean getIsActive();
    void setIsActive(boolean isActive);

    String getAddress1();
    void setAddress1(String address1);

    String getAddress2();
    void setAddress2(String address2);

    String getCity();
    void setCity(String city);

    String getZipCode();
    void setZipCode(String zipCode);

    String getState();
    void setState(String state);

    CountryCode getCountryCode();
    public void setCountryCode(CountryCode country);

    public String getPictureURL();
    public void setPictureURL(String pictureURL);

    /*String getCompanyName();
    void setCompanyName(String companyName);*/
}

