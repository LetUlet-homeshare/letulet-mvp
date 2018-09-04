
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicUnitInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicUnitInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VendorMessages" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfVendorMessageType" minOccurs="0"/>
 *         &lt;element name="Position" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Address" type="{http://www.escapia.com/EVRN/2007/02}AddressInfoType" minOccurs="0"/>
 *         &lt;element name="ContactNumbers" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfBasicUnitInfoTypeContactNumber" minOccurs="0"/>
 *         &lt;element name="Award" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UnitAmenity" type="{http://www.escapia.com/EVRN/2007/02}UnitAmenityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnitSummary" type="{http://www.escapia.com/EVRN/2007/02}UnitStayCandidateType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PropertyManagerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnitName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InternalUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnitHeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PropertyURL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnitClassCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicUnitInfoType", propOrder = {
    "vendorMessages",
    "position",
    "address",
    "contactNumbers",
    "award",
    "unitAmenity",
    "unitSummary"
})
@XmlSeeAlso({
    UnitValueMatchType.class
})
public class BasicUnitInfoType {

    @XmlElement(name = "VendorMessages")
    protected ArrayOfVendorMessageType vendorMessages;
    @XmlElement(name = "Position")
    protected BasicUnitInfoType.Position position;
    @XmlElement(name = "Address")
    protected AddressInfoType address;
    @XmlElement(name = "ContactNumbers")
    protected ArrayOfBasicUnitInfoTypeContactNumber contactNumbers;
    @XmlElement(name = "Award")
    protected List<BasicUnitInfoType.Award> award;
    @XmlElement(name = "UnitAmenity")
    protected List<UnitAmenityType> unitAmenity;
    @XmlElement(name = "UnitSummary")
    protected UnitStayCandidateType unitSummary;
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
    @XmlAttribute(name = "UnitClassCode")
    protected String unitClassCode;

    /**
     * Gets the value of the vendorMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVendorMessageType }
     *     
     */
    public ArrayOfVendorMessageType getVendorMessages() {
        return vendorMessages;
    }

    /**
     * Sets the value of the vendorMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVendorMessageType }
     *     
     */
    public void setVendorMessages(ArrayOfVendorMessageType value) {
        this.vendorMessages = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BasicUnitInfoType.Position }
     *     
     */
    public BasicUnitInfoType.Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicUnitInfoType.Position }
     *     
     */
    public void setPosition(BasicUnitInfoType.Position value) {
        this.position = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfoType }
     *     
     */
    public AddressInfoType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfoType }
     *     
     */
    public void setAddress(AddressInfoType value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBasicUnitInfoTypeContactNumber }
     *     
     */
    public ArrayOfBasicUnitInfoTypeContactNumber getContactNumbers() {
        return contactNumbers;
    }

    /**
     * Sets the value of the contactNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBasicUnitInfoTypeContactNumber }
     *     
     */
    public void setContactNumbers(ArrayOfBasicUnitInfoTypeContactNumber value) {
        this.contactNumbers = value;
    }

    /**
     * Gets the value of the award property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the award property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAward().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicUnitInfoType.Award }
     * 
     * 
     */
    public List<BasicUnitInfoType.Award> getAward() {
        if (award == null) {
            award = new ArrayList<BasicUnitInfoType.Award>();
        }
        return this.award;
    }

    /**
     * Gets the value of the unitAmenity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitAmenity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitAmenity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitAmenityType }
     * 
     * 
     */
    public List<UnitAmenityType> getUnitAmenity() {
        if (unitAmenity == null) {
            unitAmenity = new ArrayList<UnitAmenityType>();
        }
        return this.unitAmenity;
    }

    /**
     * Gets the value of the unitSummary property.
     * 
     * @return
     *     possible object is
     *     {@link UnitStayCandidateType }
     *     
     */
    public UnitStayCandidateType getUnitSummary() {
        return unitSummary;
    }

    /**
     * Sets the value of the unitSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitStayCandidateType }
     *     
     */
    public void setUnitSummary(UnitStayCandidateType value) {
        this.unitSummary = value;
    }

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

    /**
     * Gets the value of the unitClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitClassCode() {
        return unitClassCode;
    }

    /**
     * Sets the value of the unitClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitClassCode(String value) {
        this.unitClassCode = value;
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
     *       &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Award {

        @XmlAttribute(name = "Provider")
        protected String provider;
        @XmlAttribute(name = "Rating")
        protected String rating;

        /**
         * Gets the value of the provider property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProvider() {
            return provider;
        }

        /**
         * Sets the value of the provider property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProvider(String value) {
            this.provider = value;
        }

        /**
         * Gets the value of the rating property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRating() {
            return rating;
        }

        /**
         * Sets the value of the rating property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRating(String value) {
            this.rating = value;
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
     *       &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Position {

        @XmlAttribute(name = "Latitude")
        protected String latitude;
        @XmlAttribute(name = "Longitude")
        protected String longitude;
        @XmlAttribute(name = "Altitude")
        protected String altitude;
        @XmlAttribute(name = "AltitudeUnitOfMeasureCode")
        protected String altitudeUnitOfMeasureCode;

        /**
         * Gets the value of the latitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * Sets the value of the latitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * Gets the value of the longitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * Sets the value of the longitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

        /**
         * Gets the value of the altitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitude() {
            return altitude;
        }

        /**
         * Sets the value of the altitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitude(String value) {
            this.altitude = value;
        }

        /**
         * Gets the value of the altitudeUnitOfMeasureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitudeUnitOfMeasureCode() {
            return altitudeUnitOfMeasureCode;
        }

        /**
         * Sets the value of the altitudeUnitOfMeasureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitudeUnitOfMeasureCode(String value) {
            this.altitudeUnitOfMeasureCode = value;
        }

    }

}
