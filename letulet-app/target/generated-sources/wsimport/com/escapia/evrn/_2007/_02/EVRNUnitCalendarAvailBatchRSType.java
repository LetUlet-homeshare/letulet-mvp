
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EVRN_UnitCalendarAvailBatchRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EVRN_UnitCalendarAvailBatchRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}EVRN_BaseRSType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="UnitCalendarAvails" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="UnitCalendarAvail" type="{http://www.escapia.com/EVRN/2007/02}UnitCalendarAvailType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="CachedData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Warnings" type="{http://www.escapia.com/EVRN/2007/02}WarningsType" minOccurs="0"/>
 *           &lt;element name="Success" type="{http://www.escapia.com/EVRN/2007/02}SuccessType" minOccurs="0"/>
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
@XmlType(name = "EVRN_UnitCalendarAvailBatchRSType", propOrder = {
    "unitCalendarAvailsOrWarningsOrSuccess"
})
public class EVRNUnitCalendarAvailBatchRSType
    extends EVRNBaseRSType
{

    @XmlElements({
        @XmlElement(name = "UnitCalendarAvails", type = EVRNUnitCalendarAvailBatchRSType.UnitCalendarAvails.class),
        @XmlElement(name = "Warnings", type = WarningsType.class),
        @XmlElement(name = "Success", type = SuccessType.class),
        @XmlElement(name = "Errors", type = ErrorsType.class)
    })
    protected List<Object> unitCalendarAvailsOrWarningsOrSuccess;

    /**
     * Gets the value of the unitCalendarAvailsOrWarningsOrSuccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitCalendarAvailsOrWarningsOrSuccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitCalendarAvailsOrWarningsOrSuccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EVRNUnitCalendarAvailBatchRSType.UnitCalendarAvails }
     * {@link WarningsType }
     * {@link SuccessType }
     * {@link ErrorsType }
     * 
     * 
     */
    public List<Object> getUnitCalendarAvailsOrWarningsOrSuccess() {
        if (unitCalendarAvailsOrWarningsOrSuccess == null) {
            unitCalendarAvailsOrWarningsOrSuccess = new ArrayList<Object>();
        }
        return this.unitCalendarAvailsOrWarningsOrSuccess;
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
     *         &lt;element name="UnitCalendarAvail" type="{http://www.escapia.com/EVRN/2007/02}UnitCalendarAvailType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="CachedData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "unitCalendarAvail"
    })
    public static class UnitCalendarAvails {

        @XmlElement(name = "UnitCalendarAvail")
        protected List<UnitCalendarAvailType> unitCalendarAvail;
        @XmlAttribute(name = "CachedData")
        protected Boolean cachedData;

        /**
         * Gets the value of the unitCalendarAvail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the unitCalendarAvail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUnitCalendarAvail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UnitCalendarAvailType }
         * 
         * 
         */
        public List<UnitCalendarAvailType> getUnitCalendarAvail() {
            if (unitCalendarAvail == null) {
                unitCalendarAvail = new ArrayList<UnitCalendarAvailType>();
            }
            return this.unitCalendarAvail;
        }

        /**
         * Gets the value of the cachedData property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCachedData() {
            return cachedData;
        }

        /**
         * Sets the value of the cachedData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCachedData(Boolean value) {
            this.cachedData = value;
        }

    }

}
