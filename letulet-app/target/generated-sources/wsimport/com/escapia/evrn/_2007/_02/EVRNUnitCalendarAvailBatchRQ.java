
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
 *         &lt;element name="CalenadAvails" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfCalendarAvailType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SummaryOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ShowHold" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "calenadAvails"
})
@XmlRootElement(name = "EVRN_UnitCalendarAvailBatchRQ")
public class EVRNUnitCalendarAvailBatchRQ
    extends EVRNBaseRQType
{

    @XmlElement(name = "CalenadAvails")
    protected ArrayOfCalendarAvailType calenadAvails;
    @XmlAttribute(name = "SummaryOnly")
    protected Boolean summaryOnly;
    @XmlAttribute(name = "ShowHold")
    protected Boolean showHold;

    /**
     * Gets the value of the calenadAvails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCalendarAvailType }
     *     
     */
    public ArrayOfCalendarAvailType getCalenadAvails() {
        return calenadAvails;
    }

    /**
     * Sets the value of the calenadAvails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCalendarAvailType }
     *     
     */
    public void setCalenadAvails(ArrayOfCalendarAvailType value) {
        this.calenadAvails = value;
    }

    /**
     * Gets the value of the summaryOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSummaryOnly() {
        if (summaryOnly == null) {
            return false;
        } else {
            return summaryOnly;
        }
    }

    /**
     * Sets the value of the summaryOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSummaryOnly(Boolean value) {
        this.summaryOnly = value;
    }

    /**
     * Gets the value of the showHold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowHold() {
        if (showHold == null) {
            return false;
        } else {
            return showHold;
        }
    }

    /**
     * Sets the value of the showHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowHold(Boolean value) {
        this.showHold = value;
    }

}
