
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}EVRN_BaseRSType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="UnitCalendarAvailSegments" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="UnitCalendarAvailSegment" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="DailyAvailability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="StayRequirements" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfStayRequirementType" minOccurs="0"/>
 *                               &lt;element name="DailyMinLOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                             &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="PropertyManagerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="UnitName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="InternalUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="UnitHeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="PropertyURL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Success" type="{http://www.escapia.com/EVRN/2007/02}SuccessType" minOccurs="0"/>
 *           &lt;element name="Warnings" type="{http://www.escapia.com/EVRN/2007/02}WarningsType" minOccurs="0"/>
 *           &lt;element name="Errors" type="{http://www.escapia.com/EVRN/2007/02}ErrorsType" minOccurs="0"/>
 *         &lt;/choice>
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
    "unitCalendarAvailSegmentsOrSuccessOrWarnings"
})
@XmlRootElement(name = "EVRN_UnitCalendarAvailRS")
public class EVRNUnitCalendarAvailRS
    extends EVRNBaseRSType
{

    @XmlElements({
        @XmlElement(name = "UnitCalendarAvailSegments", type = EVRNUnitCalendarAvailRS.UnitCalendarAvailSegments.class),
        @XmlElement(name = "Success", type = SuccessType.class),
        @XmlElement(name = "Warnings", type = WarningsType.class),
        @XmlElement(name = "Errors", type = ErrorsType.class)
    })
    protected List<Object> unitCalendarAvailSegmentsOrSuccessOrWarnings;

    /**
     * Gets the value of the unitCalendarAvailSegmentsOrSuccessOrWarnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitCalendarAvailSegmentsOrSuccessOrWarnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitCalendarAvailSegmentsOrSuccessOrWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EVRNUnitCalendarAvailRS.UnitCalendarAvailSegments }
     * {@link SuccessType }
     * {@link WarningsType }
     * {@link ErrorsType }
     * 
     * 
     */
    public List<Object> getUnitCalendarAvailSegmentsOrSuccessOrWarnings() {
        if (unitCalendarAvailSegmentsOrSuccessOrWarnings == null) {
            unitCalendarAvailSegmentsOrSuccessOrWarnings = new ArrayList<Object>();
        }
        return this.unitCalendarAvailSegmentsOrSuccessOrWarnings;
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
     *         &lt;element name="UnitCalendarAvailSegment" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DailyAvailability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="StayRequirements" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfStayRequirementType" minOccurs="0"/>
     *                   &lt;element name="DailyMinLOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
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
    @XmlType(name = "", propOrder = {
        "unitCalendarAvailSegment"
    })
    public static class UnitCalendarAvailSegments {

        @XmlElement(name = "UnitCalendarAvailSegment")
        protected List<EVRNUnitCalendarAvailRS.UnitCalendarAvailSegments.UnitCalendarAvailSegment> unitCalendarAvailSegment;
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
         * Gets the value of the unitCalendarAvailSegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the unitCalendarAvailSegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUnitCalendarAvailSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EVRNUnitCalendarAvailRS.UnitCalendarAvailSegments.UnitCalendarAvailSegment }
         * 
         * 
         */
        public List<EVRNUnitCalendarAvailRS.UnitCalendarAvailSegments.UnitCalendarAvailSegment> getUnitCalendarAvailSegment() {
            if (unitCalendarAvailSegment == null) {
                unitCalendarAvailSegment = new ArrayList<EVRNUnitCalendarAvailRS.UnitCalendarAvailSegments.UnitCalendarAvailSegment>();
            }
            return this.unitCalendarAvailSegment;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DailyAvailability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="StayRequirements" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfStayRequirementType" minOccurs="0"/>
         *         &lt;element name="DailyMinLOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "dailyAvailability",
            "stayRequirements",
            "dailyMinLOS"
        })
        public static class UnitCalendarAvailSegment {

            @XmlElement(name = "DailyAvailability")
            protected String dailyAvailability;
            @XmlElement(name = "StayRequirements")
            protected ArrayOfStayRequirementType stayRequirements;
            @XmlElement(name = "DailyMinLOS")
            protected String dailyMinLOS;
            @XmlAttribute(name = "StartDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar startDate;
            @XmlAttribute(name = "EndDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar endDate;

            /**
             * Gets the value of the dailyAvailability property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDailyAvailability() {
                return dailyAvailability;
            }

            /**
             * Sets the value of the dailyAvailability property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDailyAvailability(String value) {
                this.dailyAvailability = value;
            }

            /**
             * Gets the value of the stayRequirements property.
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfStayRequirementType }
             *     
             */
            public ArrayOfStayRequirementType getStayRequirements() {
                return stayRequirements;
            }

            /**
             * Sets the value of the stayRequirements property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfStayRequirementType }
             *     
             */
            public void setStayRequirements(ArrayOfStayRequirementType value) {
                this.stayRequirements = value;
            }

            /**
             * Gets the value of the dailyMinLOS property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDailyMinLOS() {
                return dailyMinLOS;
            }

            /**
             * Sets the value of the dailyMinLOS property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDailyMinLOS(String value) {
                this.dailyMinLOS = value;
            }

            /**
             * Gets the value of the startDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getStartDate() {
                return startDate;
            }

            /**
             * Sets the value of the startDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setStartDate(XMLGregorianCalendar value) {
                this.startDate = value;
            }

            /**
             * Gets the value of the endDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEndDate() {
                return endDate;
            }

            /**
             * Sets the value of the endDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEndDate(XMLGregorianCalendar value) {
                this.endDate = value;
            }

        }

    }

}
