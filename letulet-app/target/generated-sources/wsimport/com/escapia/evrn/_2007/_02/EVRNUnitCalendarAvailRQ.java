
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}EVRN_BaseRQType">
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
 *         &lt;element name="CalendarDateRange" type="{http://www.escapia.com/EVRN/2007/02}DateTimeSpanType" minOccurs="0"/>
 *         &lt;element name="ShowHolds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "unitRef",
    "calendarDateRange",
    "showHolds"
})
@XmlRootElement(name = "EVRN_UnitCalendarAvailRQ")
public class EVRNUnitCalendarAvailRQ
    extends EVRNBaseRQType
{

    @XmlElement(name = "UnitRef")
    protected EVRNUnitCalendarAvailRQ.UnitRef unitRef;
    @XmlElement(name = "CalendarDateRange")
    protected DateTimeSpanType calendarDateRange;
    @XmlElement(name = "ShowHolds")
    protected String showHolds;

    /**
     * Gets the value of the unitRef property.
     * 
     * @return
     *     possible object is
     *     {@link EVRNUnitCalendarAvailRQ.UnitRef }
     *     
     */
    public EVRNUnitCalendarAvailRQ.UnitRef getUnitRef() {
        return unitRef;
    }

    /**
     * Sets the value of the unitRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link EVRNUnitCalendarAvailRQ.UnitRef }
     *     
     */
    public void setUnitRef(EVRNUnitCalendarAvailRQ.UnitRef value) {
        this.unitRef = value;
    }

    /**
     * Gets the value of the calendarDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType }
     *     
     */
    public DateTimeSpanType getCalendarDateRange() {
        return calendarDateRange;
    }

    /**
     * Sets the value of the calendarDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType }
     *     
     */
    public void setCalendarDateRange(DateTimeSpanType value) {
        this.calendarDateRange = value;
    }

    /**
     * Gets the value of the showHolds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowHolds() {
        return showHolds;
    }

    /**
     * Sets the value of the showHolds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowHolds(String value) {
        this.showHolds = value;
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
