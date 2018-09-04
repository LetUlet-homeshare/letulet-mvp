
package com.escapia.evrn._2007._02;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSearchCriterionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSearchCriterionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *         &lt;element name="Address" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.escapia.com/EVRN/2007/02}AddressType">
 *                 &lt;attribute name="SameCountryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *                 &lt;attribute name="UnitClassCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Radius" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DistanceMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Direction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DistanceMax" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Region" type="{http://www.escapia.com/EVRN/2007/02}RegionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ExactMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ImportanceType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Mandatory"/>
 *             &lt;enumeration value="High"/>
 *             &lt;enumeration value="Medium"/>
 *             &lt;enumeration value="Low"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Ranking" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSearchCriterionType", propOrder = {
    "position",
    "address",
    "unitRef",
    "radius",
    "region"
})
@XmlSeeAlso({
    UnitSearchCriterionType.class
})
public class ItemSearchCriterionType {

    @XmlElement(name = "Position")
    protected ItemSearchCriterionType.Position position;
    @XmlElement(name = "Address")
    protected ItemSearchCriterionType.Address address;
    @XmlElement(name = "UnitRef")
    protected ItemSearchCriterionType.UnitRef unitRef;
    @XmlElement(name = "Radius")
    protected ItemSearchCriterionType.Radius radius;
    @XmlElement(name = "Region")
    protected RegionType region;
    @XmlAttribute(name = "ExactMatch")
    protected Boolean exactMatch;
    @XmlAttribute(name = "ImportanceType")
    protected String importanceType;
    @XmlAttribute(name = "Ranking")
    protected BigInteger ranking;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.Position }
     *     
     */
    public ItemSearchCriterionType.Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.Position }
     *     
     */
    public void setPosition(ItemSearchCriterionType.Position value) {
        this.position = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.Address }
     *     
     */
    public ItemSearchCriterionType.Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.Address }
     *     
     */
    public void setAddress(ItemSearchCriterionType.Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the unitRef property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.UnitRef }
     *     
     */
    public ItemSearchCriterionType.UnitRef getUnitRef() {
        return unitRef;
    }

    /**
     * Sets the value of the unitRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.UnitRef }
     *     
     */
    public void setUnitRef(ItemSearchCriterionType.UnitRef value) {
        this.unitRef = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.Radius }
     *     
     */
    public ItemSearchCriterionType.Radius getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.Radius }
     *     
     */
    public void setRadius(ItemSearchCriterionType.Radius value) {
        this.radius = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link RegionType }
     *     
     */
    public RegionType getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionType }
     *     
     */
    public void setRegion(RegionType value) {
        this.region = value;
    }

    /**
     * Gets the value of the exactMatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExactMatch() {
        return exactMatch;
    }

    /**
     * Sets the value of the exactMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExactMatch(Boolean value) {
        this.exactMatch = value;
    }

    /**
     * Gets the value of the importanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportanceType() {
        return importanceType;
    }

    /**
     * Sets the value of the importanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportanceType(String value) {
        this.importanceType = value;
    }

    /**
     * Gets the value of the ranking property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRanking() {
        return ranking;
    }

    /**
     * Sets the value of the ranking property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRanking(BigInteger value) {
        this.ranking = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}AddressType">
     *       &lt;attribute name="SameCountryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Address
        extends AddressType
    {

        @XmlAttribute(name = "SameCountryInd")
        protected Boolean sameCountryInd;

        /**
         * Gets the value of the sameCountryInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSameCountryInd() {
            return sameCountryInd;
        }

        /**
         * Sets the value of the sameCountryInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSameCountryInd(Boolean value) {
            this.sameCountryInd = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DistanceMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Direction" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DistanceMax" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Radius {

        @XmlAttribute(name = "Distance")
        protected String distance;
        @XmlAttribute(name = "DistanceMeasure")
        protected String distanceMeasure;
        @XmlAttribute(name = "Direction")
        protected String direction;
        @XmlAttribute(name = "DistanceMax")
        protected String distanceMax;

        /**
         * Gets the value of the distance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistance() {
            return distance;
        }

        /**
         * Sets the value of the distance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistance(String value) {
            this.distance = value;
        }

        /**
         * Gets the value of the distanceMeasure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistanceMeasure() {
            return distanceMeasure;
        }

        /**
         * Sets the value of the distanceMeasure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistanceMeasure(String value) {
            this.distanceMeasure = value;
        }

        /**
         * Gets the value of the direction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDirection() {
            return direction;
        }

        /**
         * Sets the value of the direction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDirection(String value) {
            this.direction = value;
        }

        /**
         * Gets the value of the distanceMax property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistanceMax() {
            return distanceMax;
        }

        /**
         * Sets the value of the distanceMax property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistanceMax(String value) {
            this.distanceMax = value;
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
     *       &lt;attribute name="UnitClassCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        @XmlAttribute(name = "UnitClassCode")
        protected String unitClassCode;

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

    }

}
