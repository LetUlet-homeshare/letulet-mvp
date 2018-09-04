
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InquiryRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="PropertyManagerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="UnitName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="InternalUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="UnitHeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PropertyURL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Contact" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.escapia.com/EVRN/2007/02}PersonNameType" minOccurs="0"/>
 *                   &lt;element name="Email" type="{http://www.escapia.com/EVRN/2007/02}EmailType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Telephone" type="{http://www.escapia.com/EVRN/2007/02}TelephoneInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="PreferredContactMethod" type="{http://www.escapia.com/EVRN/2007/02}PreferredContactMethodType" />
 *                 &lt;attribute name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Message" type="{http://www.escapia.com/EVRN/2007/02}FormattedTextTextType" minOccurs="0"/>
 *         &lt;element name="Source" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="UnitDescriptionURL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StayDateRange" type="{http://www.escapia.com/EVRN/2007/02}DateTimeSpanType" minOccurs="0"/>
 *         &lt;element name="GuestCounts" type="{http://www.escapia.com/EVRN/2007/02}GuestCountType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="InquiryType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InquiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryRequestType", propOrder = {
    "unitRef",
    "contact",
    "message",
    "source",
    "stayDateRange",
    "guestCounts"
})
public class InquiryRequestType {

    @XmlElement(name = "UnitRef")
    protected InquiryRequestType.UnitRef unitRef;
    @XmlElement(name = "Contact")
    protected InquiryRequestType.Contact contact;
    @XmlElement(name = "Message")
    protected FormattedTextTextType message;
    @XmlElement(name = "Source")
    protected InquiryRequestType.Source source;
    @XmlElement(name = "StayDateRange")
    protected DateTimeSpanType stayDateRange;
    @XmlElement(name = "GuestCounts")
    protected GuestCountType guestCounts;
    @XmlAttribute(name = "InquiryType")
    protected String inquiryType;
    @XmlAttribute(name = "InquiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inquiryDate;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;

    /**
     * Gets the value of the unitRef property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryRequestType.UnitRef }
     *     
     */
    public InquiryRequestType.UnitRef getUnitRef() {
        return unitRef;
    }

    /**
     * Sets the value of the unitRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryRequestType.UnitRef }
     *     
     */
    public void setUnitRef(InquiryRequestType.UnitRef value) {
        this.unitRef = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryRequestType.Contact }
     *     
     */
    public InquiryRequestType.Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryRequestType.Contact }
     *     
     */
    public void setContact(InquiryRequestType.Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextTextType }
     *     
     */
    public FormattedTextTextType getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextTextType }
     *     
     */
    public void setMessage(FormattedTextTextType value) {
        this.message = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryRequestType.Source }
     *     
     */
    public InquiryRequestType.Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryRequestType.Source }
     *     
     */
    public void setSource(InquiryRequestType.Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the stayDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType }
     *     
     */
    public DateTimeSpanType getStayDateRange() {
        return stayDateRange;
    }

    /**
     * Sets the value of the stayDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType }
     *     
     */
    public void setStayDateRange(DateTimeSpanType value) {
        this.stayDateRange = value;
    }

    /**
     * Gets the value of the guestCounts property.
     * 
     * @return
     *     possible object is
     *     {@link GuestCountType }
     *     
     */
    public GuestCountType getGuestCounts() {
        return guestCounts;
    }

    /**
     * Sets the value of the guestCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCountType }
     *     
     */
    public void setGuestCounts(GuestCountType value) {
        this.guestCounts = value;
    }

    /**
     * Gets the value of the inquiryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryType() {
        return inquiryType;
    }

    /**
     * Sets the value of the inquiryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryType(String value) {
        this.inquiryType = value;
    }

    /**
     * Gets the value of the inquiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInquiryDate() {
        return inquiryDate;
    }

    /**
     * Sets the value of the inquiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInquiryDate(XMLGregorianCalendar value) {
        this.inquiryDate = value;
    }

    /**
     * Gets the value of the transactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets the value of the transactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Name" type="{http://www.escapia.com/EVRN/2007/02}PersonNameType" minOccurs="0"/>
     *         &lt;element name="Email" type="{http://www.escapia.com/EVRN/2007/02}EmailType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Telephone" type="{http://www.escapia.com/EVRN/2007/02}TelephoneInfoType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="PreferredContactMethod" type="{http://www.escapia.com/EVRN/2007/02}PreferredContactMethodType" />
     *       &lt;attribute name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "email",
        "telephone"
    })
    public static class Contact {

        @XmlElement(name = "Name")
        protected PersonNameType name;
        @XmlElement(name = "Email")
        protected List<EmailType> email;
        @XmlElement(name = "Telephone")
        protected List<TelephoneInfoType> telephone;
        @XmlAttribute(name = "PreferredContactMethod")
        protected PreferredContactMethodType preferredContactMethod;
        @XmlAttribute(name = "IPAddress")
        protected String ipAddress;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link PersonNameType }
         *     
         */
        public PersonNameType getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonNameType }
         *     
         */
        public void setName(PersonNameType value) {
            this.name = value;
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
         * Gets the value of the telephone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the telephone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTelephone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TelephoneInfoType }
         * 
         * 
         */
        public List<TelephoneInfoType> getTelephone() {
            if (telephone == null) {
                telephone = new ArrayList<TelephoneInfoType>();
            }
            return this.telephone;
        }

        /**
         * Gets the value of the preferredContactMethod property.
         * 
         * @return
         *     possible object is
         *     {@link PreferredContactMethodType }
         *     
         */
        public PreferredContactMethodType getPreferredContactMethod() {
            return preferredContactMethod;
        }

        /**
         * Sets the value of the preferredContactMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferredContactMethodType }
         *     
         */
        public void setPreferredContactMethod(PreferredContactMethodType value) {
            this.preferredContactMethod = value;
        }

        /**
         * Gets the value of the ipAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIPAddress() {
            return ipAddress;
        }

        /**
         * Sets the value of the ipAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIPAddress(String value) {
            this.ipAddress = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="UnitDescriptionURL" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Source {

        @XmlAttribute(name = "UnitDescriptionURL")
        protected String unitDescriptionURL;

        /**
         * Gets the value of the unitDescriptionURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitDescriptionURL() {
            return unitDescriptionURL;
        }

        /**
         * Sets the value of the unitDescriptionURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitDescriptionURL(String value) {
            this.unitDescriptionURL = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="PropertyManagerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="UnitName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InternalUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="UnitHeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PropertyURL" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UnitRef {

        @XmlAttribute(name = "PropertyManagerCode")
        protected String propertyManagerCode;
        @XmlAttribute(name = "UnitCode")
        protected String unitCode;
        @XmlAttribute(name = "UnitName")
        protected String unitName;
        @XmlAttribute(name = "InfoSource")
        protected String infoSource;
        @XmlAttribute(name = "InternalUnitCode")
        protected String internalUnitCode;
        @XmlAttribute(name = "UnitHeadline")
        protected String unitHeadline;
        @XmlAttribute(name = "PropertyURL")
        protected String propertyURL;

        /**
         * Gets the value of the propertyManagerCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyManagerCode() {
            return propertyManagerCode;
        }

        /**
         * Sets the value of the propertyManagerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyManagerCode(String value) {
            this.propertyManagerCode = value;
        }

        /**
         * Gets the value of the unitCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitCode() {
            return unitCode;
        }

        /**
         * Sets the value of the unitCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitCode(String value) {
            this.unitCode = value;
        }

        /**
         * Gets the value of the unitName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitName() {
            return unitName;
        }

        /**
         * Sets the value of the unitName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitName(String value) {
            this.unitName = value;
        }

        /**
         * Gets the value of the infoSource property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfoSource() {
            return infoSource;
        }

        /**
         * Sets the value of the infoSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfoSource(String value) {
            this.infoSource = value;
        }

        /**
         * Gets the value of the internalUnitCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInternalUnitCode() {
            return internalUnitCode;
        }

        /**
         * Sets the value of the internalUnitCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInternalUnitCode(String value) {
            this.internalUnitCode = value;
        }

        /**
         * Gets the value of the unitHeadline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitHeadline() {
            return unitHeadline;
        }

        /**
         * Sets the value of the unitHeadline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitHeadline(String value) {
            this.unitHeadline = value;
        }

        /**
         * Gets the value of the propertyURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyURL() {
            return propertyURL;
        }

        /**
         * Sets the value of the propertyURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyURL(String value) {
            this.propertyURL = value;
        }

    }

}
