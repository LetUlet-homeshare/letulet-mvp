
package com.escapia.evrn._2007._02;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 * <p>Java class for TaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxDescription" type="{http://www.escapia.com/EVRN/2007/02}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.escapia.com/EVRN/2007/02}AmountDeterminationType" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ChargeUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ChargeFrequency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ChargeUnitExempt" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="ChargeFrequencyExempt" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="MaxChargeUnitApplies" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="MaxChargeFrequencyApplies" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxType", propOrder = {
    "taxDescription"
})
public class TaxType {

    @XmlElement(name = "TaxDescription")
    protected List<ParagraphType> taxDescription;
    @XmlAttribute(name = "Type")
    protected AmountDeterminationType type;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Percent")
    protected BigDecimal percent;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "ChargeUnit")
    protected String chargeUnit;
    @XmlAttribute(name = "ChargeFrequency")
    protected String chargeFrequency;
    @XmlAttribute(name = "ChargeUnitExempt")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger chargeUnitExempt;
    @XmlAttribute(name = "ChargeFrequencyExempt")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger chargeFrequencyExempt;
    @XmlAttribute(name = "MaxChargeUnitApplies")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxChargeUnitApplies;
    @XmlAttribute(name = "MaxChargeFrequencyApplies")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxChargeFrequencyApplies;

    /**
     * Gets the value of the taxDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getTaxDescription() {
        if (taxDescription == null) {
            taxDescription = new ArrayList<ParagraphType>();
        }
        return this.taxDescription;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AmountDeterminationType }
     *     
     */
    public AmountDeterminationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountDeterminationType }
     *     
     */
    public void setType(AmountDeterminationType value) {
        this.type = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the decimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the chargeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeUnit() {
        return chargeUnit;
    }

    /**
     * Sets the value of the chargeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeUnit(String value) {
        this.chargeUnit = value;
    }

    /**
     * Gets the value of the chargeFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeFrequency() {
        return chargeFrequency;
    }

    /**
     * Sets the value of the chargeFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeFrequency(String value) {
        this.chargeFrequency = value;
    }

    /**
     * Gets the value of the chargeUnitExempt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChargeUnitExempt() {
        return chargeUnitExempt;
    }

    /**
     * Sets the value of the chargeUnitExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChargeUnitExempt(BigInteger value) {
        this.chargeUnitExempt = value;
    }

    /**
     * Gets the value of the chargeFrequencyExempt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChargeFrequencyExempt() {
        return chargeFrequencyExempt;
    }

    /**
     * Sets the value of the chargeFrequencyExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChargeFrequencyExempt(BigInteger value) {
        this.chargeFrequencyExempt = value;
    }

    /**
     * Gets the value of the maxChargeUnitApplies property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxChargeUnitApplies() {
        return maxChargeUnitApplies;
    }

    /**
     * Sets the value of the maxChargeUnitApplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxChargeUnitApplies(BigInteger value) {
        this.maxChargeUnitApplies = value;
    }

    /**
     * Gets the value of the maxChargeFrequencyApplies property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxChargeFrequencyApplies() {
        return maxChargeFrequencyApplies;
    }

    /**
     * Sets the value of the maxChargeFrequencyApplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxChargeFrequencyApplies(BigInteger value) {
        this.maxChargeFrequencyApplies = value;
    }

}
