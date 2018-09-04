
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UnitCalendarAvailSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitCalendarAvailSegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DailyAvailability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StayRequirements" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfStayRequirementType" minOccurs="0"/>
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
@XmlType(name = "UnitCalendarAvailSegmentType", propOrder = {
    "dailyAvailability",
    "stayRequirements"
})
public class UnitCalendarAvailSegmentType {

    @XmlElement(name = "DailyAvailability")
    protected String dailyAvailability;
    @XmlElement(name = "StayRequirements")
    protected ArrayOfStayRequirementType stayRequirements;
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
