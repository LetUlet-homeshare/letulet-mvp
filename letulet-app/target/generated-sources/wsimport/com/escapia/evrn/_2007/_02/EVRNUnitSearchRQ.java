
package com.escapia.evrn._2007._02;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Criteria" type="{http://www.escapia.com/EVRN/2007/02}UnitSearchCriteriaType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MaxResponses" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SendRateDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="SendUnitSummary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="PictureSize" default="Thumbnail">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Thumbnail"/>
 *             &lt;enumeration value="Original"/>
 *             &lt;enumeration value="Standard"/>
 *             &lt;enumeration value="Descriptive"/>
 *             &lt;enumeration value="Large"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ResponseType" default="PropertyList">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="PropertyList"/>
 *             &lt;enumeration value="AreaList"/>
 *             &lt;enumeration value="PropertyRateList"/>
 *             &lt;enumeration value="RateInfoDetails"/>
 *             &lt;enumeration value="ProfilePrefs"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "criteria"
})
@XmlRootElement(name = "EVRN_UnitSearchRQ")
public class EVRNUnitSearchRQ
    extends EVRNBaseRQType
{

    @XmlElement(name = "Criteria")
    protected UnitSearchCriteriaType criteria;
    @XmlAttribute(name = "MaxResponses")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxResponses;
    @XmlAttribute(name = "SortOrder")
    protected String sortOrder;
    @XmlAttribute(name = "SendRateDetails")
    protected Boolean sendRateDetails;
    @XmlAttribute(name = "SendUnitSummary")
    protected Boolean sendUnitSummary;
    @XmlAttribute(name = "PictureSize")
    protected String pictureSize;
    @XmlAttribute(name = "ResponseType")
    protected String responseType;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link UnitSearchCriteriaType }
     *     
     */
    public UnitSearchCriteriaType getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitSearchCriteriaType }
     *     
     */
    public void setCriteria(UnitSearchCriteriaType value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the maxResponses property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxResponses() {
        return maxResponses;
    }

    /**
     * Sets the value of the maxResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxResponses(BigInteger value) {
        this.maxResponses = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortOrder(String value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the sendRateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSendRateDetails() {
        if (sendRateDetails == null) {
            return true;
        } else {
            return sendRateDetails;
        }
    }

    /**
     * Sets the value of the sendRateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendRateDetails(Boolean value) {
        this.sendRateDetails = value;
    }

    /**
     * Gets the value of the sendUnitSummary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSendUnitSummary() {
        if (sendUnitSummary == null) {
            return true;
        } else {
            return sendUnitSummary;
        }
    }

    /**
     * Sets the value of the sendUnitSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendUnitSummary(Boolean value) {
        this.sendUnitSummary = value;
    }

    /**
     * Gets the value of the pictureSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureSize() {
        if (pictureSize == null) {
            return "Thumbnail";
        } else {
            return pictureSize;
        }
    }

    /**
     * Sets the value of the pictureSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureSize(String value) {
        this.pictureSize = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseType() {
        if (responseType == null) {
            return "PropertyList";
        } else {
            return responseType;
        }
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseType(String value) {
        this.responseType = value;
    }

}
