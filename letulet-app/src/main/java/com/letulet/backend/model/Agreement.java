package com.letulet.backend.model;

import net.java.ao.Entity;
import net.java.ao.schema.Default;
import net.java.ao.schema.StringLength;

import java.util.Date;


/**
 * Created by stephan on 13/11/17.
 */
public interface Agreement extends Entity {

    Property getProperty();
    void setProperty(Property property);

    BankAccount getLandlordBankAccount();
    void setLandlordBankAccount(BankAccount landlordBankAccount);

    public Date getCreated();
    void setCreated(Date created);

    double getLandlordCommissionRate();
    void setLandlordCommissionRate(double landlordCommissionRate);

    int getPayout();
    void setPayout(int payout);

    @Default("0")
    double getCleaningFeeAmount();
    void setCleaningFeeAmount(double cleaningFeeAmount);

    @Default("0")
    boolean getPersonnalize1();
    void setPersonnalize1(boolean personnalize1);

    @Default("0")
    boolean getPersonnalize2();
    void setPersonnalize2(boolean personnalize2);

    @StringLength(StringLength.UNLIMITED)
    String getPersonalContent();
    void setPersonalContent(String personalContent);

    @StringLength(StringLength.UNLIMITED)
    String getReasonOfDecline();
    void setReasonOfDecline(String reasonOfDecline);

    Status getStatus();
    void setStatus(Status status);

    String getUID();
    void setUID(String uid);

    enum Status {
        NEW,
        ACCEPTED,
        COUNTER_OFFER_SENT,
        DECLINED;

        public String getLabel() {
            switch(this) {
                case NEW:
                    return "New";
                case ACCEPTED:
                    return "Accepted";
                case COUNTER_OFFER_SENT:
                    return "Counter offer sent";
                case DECLINED:
                    return "Declined";
                default:
                    return "New";
            }
        }
     }

}
