
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignKeywordReferralType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignKeywordReferralType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ReferralHost" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="KeywordName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="KeywordValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignKeywordReferralType")
public class CampaignKeywordReferralType {

    @XmlAttribute(name = "ReferralHost")
    protected String referralHost;
    @XmlAttribute(name = "KeywordName")
    protected String keywordName;
    @XmlAttribute(name = "KeywordValue")
    protected String keywordValue;

    /**
     * Gets the value of the referralHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralHost() {
        return referralHost;
    }

    /**
     * Sets the value of the referralHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralHost(String value) {
        this.referralHost = value;
    }

    /**
     * Gets the value of the keywordName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywordName() {
        return keywordName;
    }

    /**
     * Sets the value of the keywordName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywordName(String value) {
        this.keywordName = value;
    }

    /**
     * Gets the value of the keywordValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywordValue() {
        return keywordValue;
    }

    /**
     * Sets the value of the keywordValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywordValue(String value) {
        this.keywordValue = value;
    }

}
