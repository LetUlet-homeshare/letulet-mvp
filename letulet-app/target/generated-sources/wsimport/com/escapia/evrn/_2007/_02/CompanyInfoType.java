
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName" type="{http://www.escapia.com/EVRN/2007/02}CompanyNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddressInfo" type="{http://www.escapia.com/EVRN/2007/02}AddressInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TelephoneInfo" type="{http://www.escapia.com/EVRN/2007/02}TelephoneInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.escapia.com/EVRN/2007/02}EmailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.escapia.com/EVRN/2007/02}URL_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BusinessLocale" type="{http://www.escapia.com/EVRN/2007/02}AddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentForm" type="{http://www.escapia.com/EVRN/2007/02}PaymentFormType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactPerson" type="{http://www.escapia.com/EVRN/2007/02}ContactPersonType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TravelArranger" type="{http://www.escapia.com/EVRN/2007/02}TravelArrangerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LoyaltyProgram" type="{http://www.escapia.com/EVRN/2007/02}LoyaltyProgramType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyInfoType", propOrder = {
    "companyName",
    "addressInfo",
    "telephoneInfo",
    "email",
    "url",
    "businessLocale",
    "paymentForm",
    "contactPerson",
    "travelArranger",
    "loyaltyProgram"
})
public class CompanyInfoType {

    @XmlElement(name = "CompanyName")
    protected List<CompanyNameType> companyName;
    @XmlElement(name = "AddressInfo")
    protected List<AddressInfoType> addressInfo;
    @XmlElement(name = "TelephoneInfo")
    protected List<TelephoneInfoType> telephoneInfo;
    @XmlElement(name = "Email")
    protected List<EmailType> email;
    @XmlElement(name = "URL")
    protected List<URLType> url;
    @XmlElement(name = "BusinessLocale")
    protected List<AddressType> businessLocale;
    @XmlElement(name = "PaymentForm")
    protected List<PaymentFormType> paymentForm;
    @XmlElement(name = "ContactPerson")
    protected List<ContactPersonType> contactPerson;
    @XmlElement(name = "TravelArranger")
    protected List<TravelArrangerType> travelArranger;
    @XmlElement(name = "LoyaltyProgram")
    protected List<LoyaltyProgramType> loyaltyProgram;

    /**
     * Gets the value of the companyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNameType }
     * 
     * 
     */
    public List<CompanyNameType> getCompanyName() {
        if (companyName == null) {
            companyName = new ArrayList<CompanyNameType>();
        }
        return this.companyName;
    }

    /**
     * Gets the value of the addressInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressInfoType }
     * 
     * 
     */
    public List<AddressInfoType> getAddressInfo() {
        if (addressInfo == null) {
            addressInfo = new ArrayList<AddressInfoType>();
        }
        return this.addressInfo;
    }

    /**
     * Gets the value of the telephoneInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelephoneInfoType }
     * 
     * 
     */
    public List<TelephoneInfoType> getTelephoneInfo() {
        if (telephoneInfo == null) {
            telephoneInfo = new ArrayList<TelephoneInfoType>();
        }
        return this.telephoneInfo;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailType }
     * 
     * 
     */
    public List<EmailType> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailType>();
        }
        return this.email;
    }

    /**
     * Gets the value of the url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link URLType }
     * 
     * 
     */
    public List<URLType> getURL() {
        if (url == null) {
            url = new ArrayList<URLType>();
        }
        return this.url;
    }

    /**
     * Gets the value of the businessLocale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessLocale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessLocale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getBusinessLocale() {
        if (businessLocale == null) {
            businessLocale = new ArrayList<AddressType>();
        }
        return this.businessLocale;
    }

    /**
     * Gets the value of the paymentForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentFormType }
     * 
     * 
     */
    public List<PaymentFormType> getPaymentForm() {
        if (paymentForm == null) {
            paymentForm = new ArrayList<PaymentFormType>();
        }
        return this.paymentForm;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPersonType }
     * 
     * 
     */
    public List<ContactPersonType> getContactPerson() {
        if (contactPerson == null) {
            contactPerson = new ArrayList<ContactPersonType>();
        }
        return this.contactPerson;
    }

    /**
     * Gets the value of the travelArranger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelArranger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelArranger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelArrangerType }
     * 
     * 
     */
    public List<TravelArrangerType> getTravelArranger() {
        if (travelArranger == null) {
            travelArranger = new ArrayList<TravelArrangerType>();
        }
        return this.travelArranger;
    }

    /**
     * Gets the value of the loyaltyProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyProgramType }
     * 
     * 
     */
    public List<LoyaltyProgramType> getLoyaltyProgram() {
        if (loyaltyProgram == null) {
            loyaltyProgram = new ArrayList<LoyaltyProgramType>();
        }
        return this.loyaltyProgram;
    }

}
