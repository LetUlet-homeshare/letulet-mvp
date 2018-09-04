
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankAcctType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAcctType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankAcctName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcctHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.escapia.com/EVRN/2007/02}AddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ShareMarketInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="BankID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ChecksAcceptedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AcctNumberToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaskedAcctNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RoutingNumberToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaskedRoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAcctType", propOrder = {
    "bankAcctName",
    "acctHolderName",
    "address"
})
public class BankAcctType {

    @XmlElement(name = "BankAcctName")
    protected String bankAcctName;
    @XmlElement(name = "AcctHolderName")
    protected String acctHolderName;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "BankID")
    protected String bankID;
    @XmlAttribute(name = "AcctType")
    protected String acctType;
    @XmlAttribute(name = "BankAcctNumber")
    protected String bankAcctNumber;
    @XmlAttribute(name = "ChecksAcceptedInd")
    protected Boolean checksAcceptedInd;
    @XmlAttribute(name = "AcctNumberToken")
    protected String acctNumberToken;
    @XmlAttribute(name = "MaskedAcctNumber")
    protected String maskedAcctNumber;
    @XmlAttribute(name = "RoutingNumberToken")
    protected String routingNumberToken;
    @XmlAttribute(name = "MaskedRoutingNumber")
    protected String maskedRoutingNumber;

    /**
     * Gets the value of the bankAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctName() {
        return bankAcctName;
    }

    /**
     * Sets the value of the bankAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctName(String value) {
        this.bankAcctName = value;
    }

    /**
     * Gets the value of the acctHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctHolderName() {
        return acctHolderName;
    }

    /**
     * Sets the value of the acctHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctHolderName(String value) {
        this.acctHolderName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the bankID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankID() {
        return bankID;
    }

    /**
     * Sets the value of the bankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankID(String value) {
        this.bankID = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the bankAcctNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctNumber() {
        return bankAcctNumber;
    }

    /**
     * Sets the value of the bankAcctNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctNumber(String value) {
        this.bankAcctNumber = value;
    }

    /**
     * Gets the value of the checksAcceptedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChecksAcceptedInd() {
        return checksAcceptedInd;
    }

    /**
     * Sets the value of the checksAcceptedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChecksAcceptedInd(Boolean value) {
        this.checksAcceptedInd = value;
    }

    /**
     * Gets the value of the acctNumberToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNumberToken() {
        return acctNumberToken;
    }

    /**
     * Sets the value of the acctNumberToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNumberToken(String value) {
        this.acctNumberToken = value;
    }

    /**
     * Gets the value of the maskedAcctNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedAcctNumber() {
        return maskedAcctNumber;
    }

    /**
     * Sets the value of the maskedAcctNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedAcctNumber(String value) {
        this.maskedAcctNumber = value;
    }

    /**
     * Gets the value of the routingNumberToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingNumberToken() {
        return routingNumberToken;
    }

    /**
     * Sets the value of the routingNumberToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingNumberToken(String value) {
        this.routingNumberToken = value;
    }

    /**
     * Gets the value of the maskedRoutingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedRoutingNumber() {
        return maskedRoutingNumber;
    }

    /**
     * Sets the value of the maskedRoutingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedRoutingNumber(String value) {
        this.maskedRoutingNumber = value;
    }

}
