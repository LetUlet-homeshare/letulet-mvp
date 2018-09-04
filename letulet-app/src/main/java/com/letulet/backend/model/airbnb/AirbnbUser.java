package com.letulet.backend.model.airbnb;


import com.letulet.backend.model.User;
import net.java.ao.Entity;

import java.util.Date;

/*  An entity representing an AirBnB PM account managed by an Orbirental agency */
public interface AirbnbUser extends Entity {

    //https://www.airbnb.com/developer/docs/user/

    public String getAirbnbUserID();
    public void setAirbnbUserID(String airbnbUserID);

    public String getAccessToken();
    public void setAccessToken(String accessToken);

    public String getRefreshToken();
    public void setRefreshToken(String refreshToken);

    // the user in charge of this AirBnB PM account.
    // In theory, could be either an employee or an agent
    User getUser();
    void setUser(User user);

    public String getEmail();
    public void setEmail(String email);

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

    public String getPhoneNumber();
    public void setPhoneNumber(String phoneNumber);

    public String getLocation();
    public void setLocation(String location);

    public String getPictureUrl();
    public void setPictureUrl(String pictureUrl);

    public String getPictureLargeUrl();
    public void setPictureLargeUrl(String pictureLargeUrl);

    String getScope();
    void setScope(String scope);
}
