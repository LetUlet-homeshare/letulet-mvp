package com.letulet.backend.model.channel.airbnb;

import com.letulet.backend.model.Tenant;
import net.java.ao.Entity;

import java.util.Date;

/**
 * Created by stephan on 05/01/18.
 */
public interface AirbnbUser extends Entity {

    //https://www.airbnb.com/developer/docs/user/

    public String getAirbnbUserID();
    public void setAirbnbUserID(String airbnbUserID);

    public String getAccessToken();
    public void setAccessToken(String accessToken);

    public String getRefreshToken();
    public void setRefreshToken(String refreshToken);

    Tenant getTenant();
    void setTenant(Tenant tenant);

    public String getEmail();
    public void setEmail(String email);

    public String getFirstName();
    public void setFirstName(String fistName);

    public String getLastName();
    public void setLastName(String lastName);

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

}
