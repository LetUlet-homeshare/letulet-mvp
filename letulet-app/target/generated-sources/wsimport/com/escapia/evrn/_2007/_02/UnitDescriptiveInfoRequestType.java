
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
 * <p>Java class for UnitDescriptiveInfoRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitDescriptiveInfoRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Policies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SendPolicies" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UnitReviews" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SendReviews" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Promotions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SendPromotions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
 *       &lt;attribute name="BrandCodeList">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UpdatedAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitDescriptiveInfoRequestType", propOrder = {
    "unitInfo",
    "policies",
    "unitReviews",
    "promotions"
})
public class UnitDescriptiveInfoRequestType {

    @XmlElement(name = "UnitInfo")
    protected UnitDescriptiveInfoRequestType.UnitInfo unitInfo;
    @XmlElement(name = "Policies")
    protected UnitDescriptiveInfoRequestType.Policies policies;
    @XmlElement(name = "UnitReviews")
    protected UnitDescriptiveInfoRequestType.UnitReviews unitReviews;
    @XmlElement(name = "Promotions")
    protected UnitDescriptiveInfoRequestType.Promotions promotions;
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
    @XmlAttribute(name = "BrandCodeList")
    protected List<String> brandCodeList;
    @XmlAttribute(name = "MoreDataEchoToken")
    protected String moreDataEchoToken;
    @XmlAttribute(name = "UpdatedAfter")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAfter;

    /**
     * Gets the value of the unitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UnitDescriptiveInfoRequestType.UnitInfo }
     *     
     */
    public UnitDescriptiveInfoRequestType.UnitInfo getUnitInfo() {
        return unitInfo;
    }

    /**
     * Sets the value of the unitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitDescriptiveInfoRequestType.UnitInfo }
     *     
     */
    public void setUnitInfo(UnitDescriptiveInfoRequestType.UnitInfo value) {
        this.unitInfo = value;
    }

    /**
     * Gets the value of the policies property.
     * 
     * @return
     *     possible object is
     *     {@link UnitDescriptiveInfoRequestType.Policies }
     *     
     */
    public UnitDescriptiveInfoRequestType.Policies getPolicies() {
        return policies;
    }

    /**
     * Sets the value of the policies property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitDescriptiveInfoRequestType.Policies }
     *     
     */
    public void setPolicies(UnitDescriptiveInfoRequestType.Policies value) {
        this.policies = value;
    }

    /**
     * Gets the value of the unitReviews property.
     * 
     * @return
     *     possible object is
     *     {@link UnitDescriptiveInfoRequestType.UnitReviews }
     *     
     */
    public UnitDescriptiveInfoRequestType.UnitReviews getUnitReviews() {
        return unitReviews;
    }

    /**
     * Sets the value of the unitReviews property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitDescriptiveInfoRequestType.UnitReviews }
     *     
     */
    public void setUnitReviews(UnitDescriptiveInfoRequestType.UnitReviews value) {
        this.unitReviews = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * @return
     *     possible object is
     *     {@link UnitDescriptiveInfoRequestType.Promotions }
     *     
     */
    public UnitDescriptiveInfoRequestType.Promotions getPromotions() {
        return promotions;
    }

    /**
     * Sets the value of the promotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitDescriptiveInfoRequestType.Promotions }
     *     
     */
    public void setPromotions(UnitDescriptiveInfoRequestType.Promotions value) {
        this.promotions = value;
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
     * Gets the value of the brandCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brandCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrandCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBrandCodeList() {
        if (brandCodeList == null) {
            brandCodeList = new ArrayList<String>();
        }
        return this.brandCodeList;
    }

    /**
     * Gets the value of the moreDataEchoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreDataEchoToken() {
        return moreDataEchoToken;
    }

    /**
     * Sets the value of the moreDataEchoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreDataEchoToken(String value) {
        this.moreDataEchoToken = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="SendPolicies" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Policies {

        @XmlAttribute(name = "SendPolicies")
        protected Boolean sendPolicies;

        /**
         * Gets the value of the sendPolicies property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isSendPolicies() {
            if (sendPolicies == null) {
                return true;
            } else {
                return sendPolicies;
            }
        }

        /**
         * Sets the value of the sendPolicies property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendPolicies(Boolean value) {
            this.sendPolicies = value;
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
     *       &lt;attribute name="SendPromotions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Promotions {

        @XmlAttribute(name = "SendPromotions")
        protected Boolean sendPromotions;

        /**
         * Gets the value of the sendPromotions property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendPromotions() {
            return sendPromotions;
        }

        /**
         * Sets the value of the sendPromotions property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendPromotions(Boolean value) {
            this.sendPromotions = value;
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
     *       &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UnitInfo {

        @XmlAttribute(name = "SendData")
        protected Boolean sendData;

        /**
         * Gets the value of the sendData property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isSendData() {
            if (sendData == null) {
                return true;
            } else {
                return sendData;
            }
        }

        /**
         * Sets the value of the sendData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendData(Boolean value) {
            this.sendData = value;
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
     *       &lt;attribute name="SendReviews" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UnitReviews {

        @XmlAttribute(name = "SendReviews")
        protected Boolean sendReviews;

        /**
         * Gets the value of the sendReviews property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendReviews() {
            return sendReviews;
        }

        /**
         * Sets the value of the sendReviews property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSendReviews(Boolean value) {
            this.sendReviews = value;
        }

    }

}
