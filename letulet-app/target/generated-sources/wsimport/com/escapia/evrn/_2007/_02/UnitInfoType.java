
package com.escapia.evrn._2007._02;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UnitInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="UnitShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CategoryCodes" type="{http://www.escapia.com/EVRN/2007/02}EVRN_CategoryCodesType" minOccurs="0"/>
 *         &lt;element name="Descriptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MultimediaDescriptions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.escapia.com/EVRN/2007/02}MultimediaDescriptionsType">
 *                           &lt;attribute name="InfoCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AdditionalDetailCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RateNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *         &lt;element name="Services" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfUnitInfoTypeService" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.escapia.com/EVRN/2007/02}AddressType" minOccurs="0"/>
 *         &lt;element name="UnitAmenity" type="{http://www.escapia.com/EVRN/2007/02}UnitAmenityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RateRanges" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfRateRangeType" minOccurs="0"/>
 *         &lt;element name="Distribution" type="{http://www.escapia.com/EVRN/2007/02}DistributionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AreaSquareFeet" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="NumberFloors" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="WhenBuilt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitInfoType", propOrder = {
    "unitName",
    "categoryCodes",
    "descriptions",
    "position",
    "services",
    "address",
    "unitAmenity",
    "rateRanges",
    "distribution"
})
public class UnitInfoType {

    @XmlElement(name = "UnitName")
    protected UnitInfoType.UnitName unitName;
    @XmlElement(name = "CategoryCodes")
    protected EVRNCategoryCodesType categoryCodes;
    @XmlElement(name = "Descriptions")
    protected UnitInfoType.Descriptions descriptions;
    @XmlElement(name = "Position")
    protected UnitInfoType.Position position;
    @XmlElement(name = "Services")
    protected ArrayOfUnitInfoTypeService services;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "UnitAmenity")
    protected List<UnitAmenityType> unitAmenity;
    @XmlElement(name = "RateRanges")
    protected ArrayOfRateRangeType rateRanges;
    @XmlElement(name = "Distribution")
    protected DistributionType distribution;
    @XmlAttribute(name = "AreaSquareFeet")
    protected BigDecimal areaSquareFeet;
    @XmlAttribute(name = "MaxOccupancy")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxOccupancy;
    @XmlAttribute(name = "NumberFloors")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberFloors;
    @XmlAttribute(name = "WhenBuilt")
    protected String whenBuilt;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;

    /**
     * Gets the value of the unitName property.
     * 
     * @return
     *     possible object is
     *     {@link UnitInfoType.UnitName }
     *     
     */
    public UnitInfoType.UnitName getUnitName() {
        return unitName;
    }

    /**
     * Sets the value of the unitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitInfoType.UnitName }
     *     
     */
    public void setUnitName(UnitInfoType.UnitName value) {
        this.unitName = value;
    }

    /**
     * Gets the value of the categoryCodes property.
     * 
     * @return
     *     possible object is
     *     {@link EVRNCategoryCodesType }
     *     
     */
    public EVRNCategoryCodesType getCategoryCodes() {
        return categoryCodes;
    }

    /**
     * Sets the value of the categoryCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EVRNCategoryCodesType }
     *     
     */
    public void setCategoryCodes(EVRNCategoryCodesType value) {
        this.categoryCodes = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link UnitInfoType.Descriptions }
     *     
     */
    public UnitInfoType.Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitInfoType.Descriptions }
     *     
     */
    public void setDescriptions(UnitInfoType.Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link UnitInfoType.Position }
     *     
     */
    public UnitInfoType.Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitInfoType.Position }
     *     
     */
    public void setPosition(UnitInfoType.Position value) {
        this.position = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnitInfoTypeService }
     *     
     */
    public ArrayOfUnitInfoTypeService getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnitInfoTypeService }
     *     
     */
    public void setServices(ArrayOfUnitInfoTypeService value) {
        this.services = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
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
     * Gets the value of the rateRanges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRateRangeType }
     *     
     */
    public ArrayOfRateRangeType getRateRanges() {
        return rateRanges;
    }

    /**
     * Sets the value of the rateRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRateRangeType }
     *     
     */
    public void setRateRanges(ArrayOfRateRangeType value) {
        this.rateRanges = value;
    }

    /**
     * Gets the value of the distribution property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionType }
     *     
     */
    public DistributionType getDistribution() {
        return distribution;
    }

    /**
     * Sets the value of the distribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionType }
     *     
     */
    public void setDistribution(DistributionType value) {
        this.distribution = value;
    }

    /**
     * Gets the value of the areaSquareFeet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAreaSquareFeet() {
        return areaSquareFeet;
    }

    /**
     * Sets the value of the areaSquareFeet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAreaSquareFeet(BigDecimal value) {
        this.areaSquareFeet = value;
    }

    /**
     * Gets the value of the maxOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * Sets the value of the maxOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxOccupancy(BigInteger value) {
        this.maxOccupancy = value;
    }

    /**
     * Gets the value of the numberFloors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberFloors() {
        return numberFloors;
    }

    /**
     * Sets the value of the numberFloors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberFloors(BigInteger value) {
        this.numberFloors = value;
    }

    /**
     * Gets the value of the whenBuilt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhenBuilt() {
        return whenBuilt;
    }

    /**
     * Sets the value of the whenBuilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhenBuilt(String value) {
        this.whenBuilt = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
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
     *         &lt;element name="MultimediaDescriptions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.escapia.com/EVRN/2007/02}MultimediaDescriptionsType">
     *                 &lt;attribute name="InfoCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AdditionalDetailCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RateNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "multimediaDescriptions",
        "descriptiveText",
        "rateNotes"
    })
    public static class Descriptions {

        @XmlElement(name = "MultimediaDescriptions")
        protected UnitInfoType.Descriptions.MultimediaDescriptions multimediaDescriptions;
        @XmlElement(name = "DescriptiveText")
        protected String descriptiveText;
        @XmlElement(name = "RateNotes")
        protected String rateNotes;

        /**
         * Gets the value of the multimediaDescriptions property.
         * 
         * @return
         *     possible object is
         *     {@link UnitInfoType.Descriptions.MultimediaDescriptions }
         *     
         */
        public UnitInfoType.Descriptions.MultimediaDescriptions getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        /**
         * Sets the value of the multimediaDescriptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link UnitInfoType.Descriptions.MultimediaDescriptions }
         *     
         */
        public void setMultimediaDescriptions(UnitInfoType.Descriptions.MultimediaDescriptions value) {
            this.multimediaDescriptions = value;
        }

        /**
         * Gets the value of the descriptiveText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescriptiveText() {
            return descriptiveText;
        }

        /**
         * Sets the value of the descriptiveText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescriptiveText(String value) {
            this.descriptiveText = value;
        }

        /**
         * Gets the value of the rateNotes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateNotes() {
            return rateNotes;
        }

        /**
         * Sets the value of the rateNotes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateNotes(String value) {
            this.rateNotes = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}MultimediaDescriptionsType">
         *       &lt;attribute name="InfoCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AdditionalDetailCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MultimediaDescriptions
            extends MultimediaDescriptionsType
        {

            @XmlAttribute(name = "InfoCode")
            protected String infoCode;
            @XmlAttribute(name = "AdditionalDetailCode")
            protected String additionalDetailCode;

            /**
             * Gets the value of the infoCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfoCode() {
                return infoCode;
            }

            /**
             * Sets the value of the infoCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfoCode(String value) {
                this.infoCode = value;
            }

            /**
             * Gets the value of the additionalDetailCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalDetailCode() {
                return additionalDetailCode;
            }

            /**
             * Sets the value of the additionalDetailCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalDetailCode(String value) {
                this.additionalDetailCode = value;
            }

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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="UnitShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class UnitName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "UnitShortName")
        protected String unitShortName;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the unitShortName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitShortName() {
            return unitShortName;
        }

        /**
         * Sets the value of the unitShortName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitShortName(String value) {
            this.unitShortName = value;
        }

    }

}
