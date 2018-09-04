package com.letulet.backend.model;


import net.java.ao.Entity;
import net.java.ao.schema.Default;
import net.java.ao.schema.StringLength;

import java.util.Date;

public interface Booking extends Entity {

    Property getProperty();
    void setProperty(Property property);

    Date getCheckinDate();
    void setCheckinDate(Date checkinDate);

    Date getCheckoutDate();
    void setCheckoutDate(Date checkoutDate);

    @Default("1")
    int getAdultCount();
    void setAdultCount(int adultCount);

    @Default("0")
    int getChildrenCount();
    void setChildrenCount(int childrenCount);

    Date getCreated();
    void setCreated(Date created);

    String getUID();
    void setUID(String uid);

    //Amount paid to Host for reservation, in Host's currency. Formatted with the recommended ISO-4217 exponent corresponding to the currency. See decimal formatting. To lean more about how payout is calculated see Payout Details.
    @Default("0")
    double getExpectedPayoutAmountAccurate();
    void setExpectedPayoutAmountAccurate(double expectedPayoutAmountAccurate);

    //Reservation price without fees. Formatted with the recommended ISO-4217 exponent corresponding to the currency.
    @Default("0")
    double getListingBasePriceAccurate();
    void setListingBasePriceAccurate(double listingBasePriceAccurate);

    @Default("0")
    double getCleaningFeeAmount();
    void setCleaningFeeAmount(double cleaningFeeAmount);

    @Default("0")
    double getTaxationRate();
    void setTaxationRate(double taxationRate);

    String getCancellationPolicy();
    void setCancellationPolicy(String cancellationPolicy);

    String getCancellationPolicyCategory();
    void setCancellationPolicyCategory(String cancellationPolicyCategory);

    String getConfirmationCode();
    void setConfirmationCode(String confirmationCode);

    String getGuestEmail();
    void setGuestEmail(String guestEmail);

    String getGuestFirstName();
    void setGuestFirstName(String guestFirstName);

    String getGuestLastName();
    void setGuestLastName(String guestLastName);

    String getGuestID();
    void setGuestID(String guestID);

    String getThreadID();
    void setThreadID(String threadID);
}
