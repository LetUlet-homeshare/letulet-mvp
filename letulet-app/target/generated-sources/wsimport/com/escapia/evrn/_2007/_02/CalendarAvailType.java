
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
 * <p>Java class for CalendarAvailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarAvailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalendarDateRange" type="{http://www.escapia.com/EVRN/2007/02}DateTimeSpanType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PropertyManagerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnitName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InternalUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnitHeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PropertyURL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StateCodeList">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CountryCodeList">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="UpdatedAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarAvailType", propOrder = {
    "calendarDateRange"
})
public class CalendarAvailType {

    @XmlElement(name = "CalendarDateRange")
    protected DateTimeSpanType calendarDateRange;
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
    @XmlAttribute(name = "StateCodeList")
    protected List<String> stateCodeList;
    @XmlAttribute(name = "CountryCodeList")
    protected List<String> countryCodeList;
    @XmlAttribute(name = "UpdatedAfter")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAfter;

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
     * Gets the value of the stateCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStateCodeList() {
        if (stateCodeList == null) {
            stateCodeList = new ArrayList<String>();
        }
        return this.stateCodeList;
    }

    /**
     * Gets the value of the countryCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountryCodeList() {
        if (countryCodeList == null) {
            countryCodeList = new ArrayList<String>();
        }
        return this.countryCodeList;
    }

    /**
     * Gets the value of the updatedAfter property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedAfter() {
        return updatedAfter;
    }

    /**
     * Sets the value of the updatedAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedAfter(XMLGregorianCalendar value) {
        this.updatedAfter = value;
    }

}
