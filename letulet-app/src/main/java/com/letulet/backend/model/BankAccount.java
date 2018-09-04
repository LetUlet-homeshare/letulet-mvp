package com.letulet.backend.model;

import com.auth0.jwt.internal.org.bouncycastle.math.ec.tools.DiscoverEndomorphisms;
import net.java.ao.Entity;
import net.java.ao.schema.Default;
import net.java.ao.schema.StringLength;

import java.util.Date;

/**
 * Created by stephan on 09/11/17.
 */
public interface BankAccount extends Entity {

    Date getCreated();
    void setCreated(Date created);

    Date getModified();
    void setModified(Date modified);

    String getName();
    void setName(String name);

    String getAccountHolderName();
    void setAccountHolderName(String accountHolderName);

    String getTaxID();
    void setTaxID(String taxID);

    String getType();
    void setType(String type);

    String getRoutingNumber();
    void setRoutingNumber(String routingNumber);

    String getAccountNumber();
    void setAccountNumber(String accountNumber);

    String getStreetAddress();
    void setStreetAddress(String streetAddress);

    String getCity();
    void setCity(String city);

    String getState();
    void setState(String state);

    String getZipCode();
    void setZipCode(String zipCode);

    @Default("0")
    boolean getIsDeleted();
    void setIsDeleted(boolean isDeleted);

    @Default("1")
    boolean getIsActive();
    void setIsActive(boolean isActive);

    //Credit card
    enum CreditCardType {
        VISA,
        MASTERCARD,
        AMEX,
        DISCOVER;

        public String getLabel() {
            switch(this) {
                case VISA:
                    return "Visa";
                case MASTERCARD:
                    return "MasterCard";
                case AMEX:
                    return "Amex";
                case DISCOVER:
                    return "Discover";
                default:
                    return "Other";
            }
        }
    }

    public CreditCardType getCreditCardType();
    void setCreditCardType(CreditCardType creditCardType);

    String getCreditCardFirstName();
    void setCreditCardFirstName(String creditCardFirstName);

    String getCreditCardLastName();
    void setCreditCardLastName(String creditCardLastName);

    String getCreditCardNumber();
    void setCreditCardNumber(String creditCardNumber);

    String getCreditCardExpiration();
    void setCreditCardExpiration(String creditCardExpiration);

    String getCreditCardBillingZipCode();
    void setCreditCardBillingZipCode(String creditCardBillingZipCode);

    String getCreditCardCvv();
    void setCreditCardCvv(String creditCardCvv);

    String getCompanyName();
    void setCompanyName(String companyName);

    String getSSN();
    void setSSN(String SSN);

    Date getDateOfBirth();
    void setDateOfBirth(Date dateOfBirth);

    String getNC2Status();
    void setNC2Status(String NC2Status); //"open, closed"

    String getNC2Flag();
    void setNC2Flag(String NC2Flag); // "'Green', 'Red', 'Orange'",
}

