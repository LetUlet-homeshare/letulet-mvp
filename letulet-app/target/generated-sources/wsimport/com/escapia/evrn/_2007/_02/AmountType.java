
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
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Base" type="{http://www.escapia.com/EVRN/2007/02}TotalType" minOccurs="0"/>
 *         &lt;element name="AdditionalGuestAmounts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdditionalGuestAmount" type="{http://www.escapia.com/EVRN/2007/02}AdditionalGuestAmountType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Fees" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfFeeType" minOccurs="0"/>
 *         &lt;element name="CancelPolicies" type="{http://www.escapia.com/EVRN/2007/02}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="PaymentPolicies" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/>
 *         &lt;element name="Discount" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.escapia.com/EVRN/2007/02}DiscountType">
 *                 &lt;attribute name="AppliesTo">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Base"/>
 *                       &lt;enumeration value="AdditionalGuestAmount"/>
 *                       &lt;enumeration value="Fee"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ItemRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Total" type="{http://www.escapia.com/EVRN/2007/02}TotalType" minOccurs="0"/>
 *         &lt;element name="RateDescription" type="{http://www.escapia.com/EVRN/2007/02}ParagraphType" minOccurs="0"/>
 *         &lt;element name="AdditionalCharges" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdditionalCharge" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Amount" type="{http://www.escapia.com/EVRN/2007/02}TotalType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RoomAmenityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdvanceBookingRestriction" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Release" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MinAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="MaxAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="AgeTimeUnit" type="{http://www.escapia.com/EVRN/2007/02}TimeUnitType" />
 *       &lt;attribute name="GuaranteedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="RateTimeUnit" type="{http://www.escapia.com/EVRN/2007/02}TimeUnitType" />
 *       &lt;attribute name="UnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="MinGuestApplicable" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="MaxGuestApplicable" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="StayOverDate" type="{http://www.escapia.com/EVRN/2007/02}DayOfWeekType" />
 *       &lt;attribute name="AlternateCurrencyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType", propOrder = {
    "base",
    "additionalGuestAmounts",
    "fees",
    "cancelPolicies",
    "paymentPolicies",
    "discount",
    "total",
    "rateDescription",
    "additionalCharges",
    "advanceBookingRestriction"
})
public class AmountType {

    @XmlElement(name = "Base")
    protected TotalType base;
    @XmlElement(name = "AdditionalGuestAmounts")
    protected AmountType.AdditionalGuestAmounts additionalGuestAmounts;
    @XmlElement(name = "Fees")
    protected ArrayOfFeeType fees;
    @XmlElement(name = "CancelPolicies")
    protected CancelPenaltiesType cancelPolicies;
    @XmlElement(name = "PaymentPolicies")
    protected ArrayOfRequiredPaymentsTypeGuaranteePayment paymentPolicies;
    @XmlElement(name = "Discount")
    protected List<AmountType.Discount> discount;
    @XmlElement(name = "Total")
    protected TotalType total;
    @XmlElement(name = "RateDescription")
    protected ParagraphType rateDescription;
    @XmlElement(name = "AdditionalCharges")
    protected AmountType.AdditionalCharges additionalCharges;
    @XmlElement(name = "AdvanceBookingRestriction")
    protected AmountType.AdvanceBookingRestriction advanceBookingRestriction;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "AgeQualifyingCode")
    protected String ageQualifyingCode;
    @XmlAttribute(name = "MinAge")
    protected BigInteger minAge;
    @XmlAttribute(name = "MaxAge")
    protected BigInteger maxAge;
    @XmlAttribute(name = "AgeTimeUnit")
    protected TimeUnitType ageTimeUnit;
    @XmlAttribute(name = "GuaranteedInd")
    protected Boolean guaranteedInd;
    @XmlAttribute(name = "NumberOfUnits")
    protected BigInteger numberOfUnits;
    @XmlAttribute(name = "RateTimeUnit")
    protected TimeUnitType rateTimeUnit;
    @XmlAttribute(name = "UnitMultiplier")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger unitMultiplier;
    @XmlAttribute(name = "MinGuestApplicable")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger minGuestApplicable;
    @XmlAttribute(name = "MaxGuestApplicable")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxGuestApplicable;
    @XmlAttribute(name = "MinLOS")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minLOS;
    @XmlAttribute(name = "MaxLOS")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxLOS;
    @XmlAttribute(name = "StayOverDate")
    protected DayOfWeekType stayOverDate;
    @XmlAttribute(name = "AlternateCurrencyInd")
    protected Boolean alternateCurrencyInd;

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link TotalType }
     *     
     */
    public TotalType getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalType }
     *     
     */
    public void setBase(TotalType value) {
        this.base = value;
    }

    /**
     * Gets the value of the additionalGuestAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType.AdditionalGuestAmounts }
     *     
     */
    public AmountType.AdditionalGuestAmounts getAdditionalGuestAmounts() {
        return additionalGuestAmounts;
    }

    /**
     * Sets the value of the additionalGuestAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType.AdditionalGuestAmounts }
     *     
     */
    public void setAdditionalGuestAmounts(AmountType.AdditionalGuestAmounts value) {
        this.additionalGuestAmounts = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeeType }
     *     
     */
    public ArrayOfFeeType getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeeType }
     *     
     */
    public void setFees(ArrayOfFeeType value) {
        this.fees = value;
    }

    /**
     * Gets the value of the cancelPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancelPolicies() {
        return cancelPolicies;
    }

    /**
     * Sets the value of the cancelPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancelPolicies(CancelPenaltiesType value) {
        this.cancelPolicies = value;
    }

    /**
     * Gets the value of the paymentPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     *     
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment getPaymentPolicies() {
        return paymentPolicies;
    }

    /**
     * Sets the value of the paymentPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     *     
     */
    public void setPaymentPolicies(ArrayOfRequiredPaymentsTypeGuaranteePayment value) {
        this.paymentPolicies = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType.Discount }
     * 
     * 
     */
    public List<AmountType.Discount> getDiscount() {
        if (discount == null) {
            discount = new ArrayList<AmountType.Discount>();
        }
        return this.discount;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link TotalType }
     *     
     */
    public TotalType getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalType }
     *     
     */
    public void setTotal(TotalType value) {
        this.total = value;
    }

    /**
     * Gets the value of the rateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getRateDescription() {
        return rateDescription;
    }

    /**
     * Sets the value of the rateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setRateDescription(ParagraphType value) {
        this.rateDescription = value;
    }

    /**
     * Gets the value of the additionalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType.AdditionalCharges }
     *     
     */
    public AmountType.AdditionalCharges getAdditionalCharges() {
        return additionalCharges;
    }

    /**
     * Sets the value of the additionalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType.AdditionalCharges }
     *     
     */
    public void setAdditionalCharges(AmountType.AdditionalCharges value) {
        this.additionalCharges = value;
    }

    /**
     * Gets the value of the advanceBookingRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType.AdvanceBookingRestriction }
     *     
     */
    public AmountType.AdvanceBookingRestriction getAdvanceBookingRestriction() {
        return advanceBookingRestriction;
    }

    /**
     * Sets the value of the advanceBookingRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType.AdvanceBookingRestriction }
     *     
     */
    public void setAdvanceBookingRestriction(AmountType.AdvanceBookingRestriction value) {
        this.advanceBookingRestriction = value;
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
     * Gets the value of the ageQualifyingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    /**
     * Sets the value of the ageQualifyingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeQualifyingCode(String value) {
        this.ageQualifyingCode = value;
    }

    /**
     * Gets the value of the minAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinAge() {
        return minAge;
    }

    /**
     * Sets the value of the minAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinAge(BigInteger value) {
        this.minAge = value;
    }

    /**
     * Gets the value of the maxAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxAge() {
        return maxAge;
    }

    /**
     * Sets the value of the maxAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxAge(BigInteger value) {
        this.maxAge = value;
    }

    /**
     * Gets the value of the ageTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnitType }
     *     
     */
    public TimeUnitType getAgeTimeUnit() {
        return ageTimeUnit;
    }

    /**
     * Sets the value of the ageTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnitType }
     *     
     */
    public void setAgeTimeUnit(TimeUnitType value) {
        this.ageTimeUnit = value;
    }

    /**
     * Gets the value of the guaranteedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteedInd() {
        return guaranteedInd;
    }

    /**
     * Sets the value of the guaranteedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteedInd(Boolean value) {
        this.guaranteedInd = value;
    }

    /**
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfUnits(BigInteger value) {
        this.numberOfUnits = value;
    }

    /**
     * Gets the value of the rateTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnitType }
     *     
     */
    public TimeUnitType getRateTimeUnit() {
        return rateTimeUnit;
    }

    /**
     * Sets the value of the rateTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnitType }
     *     
     */
    public void setRateTimeUnit(TimeUnitType value) {
        this.rateTimeUnit = value;
    }

    /**
     * Gets the value of the unitMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnitMultiplier() {
        return unitMultiplier;
    }

    /**
     * Sets the value of the unitMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnitMultiplier(BigInteger value) {
        this.unitMultiplier = value;
    }

    /**
     * Gets the value of the minGuestApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinGuestApplicable() {
        return minGuestApplicable;
    }

    /**
     * Sets the value of the minGuestApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinGuestApplicable(BigInteger value) {
        this.minGuestApplicable = value;
    }

    /**
     * Gets the value of the maxGuestApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxGuestApplicable() {
        return maxGuestApplicable;
    }

    /**
     * Sets the value of the maxGuestApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxGuestApplicable(BigInteger value) {
        this.maxGuestApplicable = value;
    }

    /**
     * Gets the value of the minLOS property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinLOS() {
        return minLOS;
    }

    /**
     * Sets the value of the minLOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinLOS(BigInteger value) {
        this.minLOS = value;
    }

    /**
     * Gets the value of the maxLOS property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxLOS() {
        return maxLOS;
    }

    /**
     * Sets the value of the maxLOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxLOS(BigInteger value) {
        this.maxLOS = value;
    }

    /**
     * Gets the value of the stayOverDate property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getStayOverDate() {
        return stayOverDate;
    }

    /**
     * Sets the value of the stayOverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setStayOverDate(DayOfWeekType value) {
        this.stayOverDate = value;
    }

    /**
     * Gets the value of the alternateCurrencyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlternateCurrencyInd() {
        return alternateCurrencyInd;
    }

    /**
     * Sets the value of the alternateCurrencyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternateCurrencyInd(Boolean value) {
        this.alternateCurrencyInd = value;
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
     *         &lt;element name="AdditionalCharge" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Amount" type="{http://www.escapia.com/EVRN/2007/02}TotalType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RoomAmenityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "additionalCharge"
    })
    public static class AdditionalCharges {

        @XmlElement(name = "AdditionalCharge")
        protected List<AmountType.AdditionalCharges.AdditionalCharge> additionalCharge;
        @XmlAttribute(name = "AmountBeforeTax")
        protected BigDecimal amountBeforeTax;
        @XmlAttribute(name = "AmountAfterTax")
        protected BigDecimal amountAfterTax;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the additionalCharge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalCharge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalCharge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AmountType.AdditionalCharges.AdditionalCharge }
         * 
         * 
         */
        public List<AmountType.AdditionalCharges.AdditionalCharge> getAdditionalCharge() {
            if (additionalCharge == null) {
                additionalCharge = new ArrayList<AmountType.AdditionalCharges.AdditionalCharge>();
            }
            return this.additionalCharge;
        }

        /**
         * Gets the value of the amountBeforeTax property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmountBeforeTax() {
            return amountBeforeTax;
        }

        /**
         * Sets the value of the amountBeforeTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmountBeforeTax(BigDecimal value) {
            this.amountBeforeTax = value;
        }

        /**
         * Gets the value of the amountAfterTax property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmountAfterTax() {
            return amountAfterTax;
        }

        /**
         * Sets the value of the amountAfterTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmountAfterTax(BigDecimal value) {
            this.amountAfterTax = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Amount" type="{http://www.escapia.com/EVRN/2007/02}TotalType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="RoomAmenityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "amount"
        })
        public static class AdditionalCharge {

            @XmlElement(name = "Amount")
            protected TotalType amount;
            @XmlAttribute(name = "RoomAmenityCode")
            protected String roomAmenityCode;
            @XmlAttribute(name = "Quantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger quantity;

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link TotalType }
             *     
             */
            public TotalType getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link TotalType }
             *     
             */
            public void setAmount(TotalType value) {
                this.amount = value;
            }

            /**
             * Gets the value of the roomAmenityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoomAmenityCode() {
                return roomAmenityCode;
            }

            /**
             * Sets the value of the roomAmenityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoomAmenityCode(String value) {
                this.roomAmenityCode = value;
            }

            /**
             * Gets the value of the quantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQuantity() {
                return quantity;
            }

            /**
             * Sets the value of the quantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQuantity(BigInteger value) {
                this.quantity = value;
            }

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
     *       &lt;sequence>
     *         &lt;element name="AdditionalGuestAmount" type="{http://www.escapia.com/EVRN/2007/02}AdditionalGuestAmountType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "additionalGuestAmount"
    })
    public static class AdditionalGuestAmounts {

        @XmlElement(name = "AdditionalGuestAmount")
        protected List<AdditionalGuestAmountType> additionalGuestAmount;
        @XmlAttribute(name = "AmountBeforeTax")
        protected BigDecimal amountBeforeTax;
        @XmlAttribute(name = "AmountAfterTax")
        protected BigDecimal amountAfterTax;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the additionalGuestAmount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalGuestAmount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalGuestAmount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AdditionalGuestAmountType }
         * 
         * 
         */
        public List<AdditionalGuestAmountType> getAdditionalGuestAmount() {
            if (additionalGuestAmount == null) {
                additionalGuestAmount = new ArrayList<AdditionalGuestAmountType>();
            }
            return this.additionalGuestAmount;
        }

        /**
         * Gets the value of the amountBeforeTax property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmountBeforeTax() {
            return amountBeforeTax;
        }

        /**
         * Sets the value of the amountBeforeTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmountBeforeTax(BigDecimal value) {
            this.amountBeforeTax = value;
        }

        /**
         * Gets the value of the amountAfterTax property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmountAfterTax() {
            return amountAfterTax;
        }

        /**
         * Sets the value of the amountAfterTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmountAfterTax(BigDecimal value) {
            this.amountAfterTax = value;
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
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Release" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MinAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="MaxAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdvanceBookingRestriction {

        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "Release")
        protected String release;
        @XmlAttribute(name = "MinAdvanceBookingOffset")
        protected Duration minAdvanceBookingOffset;
        @XmlAttribute(name = "MaxAdvanceBookingOffset")
        protected Duration maxAdvanceBookingOffset;
        @XmlAttribute(name = "Mon")
        protected Boolean mon;
        @XmlAttribute(name = "Tue")
        protected Boolean tue;
        @XmlAttribute(name = "Weds")
        protected Boolean weds;
        @XmlAttribute(name = "Thur")
        protected Boolean thur;
        @XmlAttribute(name = "Fri")
        protected Boolean fri;
        @XmlAttribute(name = "Sat")
        protected Boolean sat;
        @XmlAttribute(name = "Sun")
        protected Boolean sun;

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * Gets the value of the release property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRelease() {
            return release;
        }

        /**
         * Sets the value of the release property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRelease(String value) {
            this.release = value;
        }

        /**
         * Gets the value of the minAdvanceBookingOffset property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMinAdvanceBookingOffset() {
            return minAdvanceBookingOffset;
        }

        /**
         * Sets the value of the minAdvanceBookingOffset property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMinAdvanceBookingOffset(Duration value) {
            this.minAdvanceBookingOffset = value;
        }

        /**
         * Gets the value of the maxAdvanceBookingOffset property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMaxAdvanceBookingOffset() {
            return maxAdvanceBookingOffset;
        }

        /**
         * Sets the value of the maxAdvanceBookingOffset property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMaxAdvanceBookingOffset(Duration value) {
            this.maxAdvanceBookingOffset = value;
        }

        /**
         * Gets the value of the mon property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMon() {
            return mon;
        }

        /**
         * Sets the value of the mon property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMon(Boolean value) {
            this.mon = value;
        }

        /**
         * Gets the value of the tue property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTue() {
            return tue;
        }

        /**
         * Sets the value of the tue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTue(Boolean value) {
            this.tue = value;
        }

        /**
         * Gets the value of the weds property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWeds() {
            return weds;
        }

        /**
         * Sets the value of the weds property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWeds(Boolean value) {
            this.weds = value;
        }

        /**
         * Gets the value of the thur property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isThur() {
            return thur;
        }

        /**
         * Sets the value of the thur property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setThur(Boolean value) {
            this.thur = value;
        }

        /**
         * Gets the value of the fri property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFri() {
            return fri;
        }

        /**
         * Sets the value of the fri property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFri(Boolean value) {
            this.fri = value;
        }

        /**
         * Gets the value of the sat property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSat() {
            return sat;
        }

        /**
         * Sets the value of the sat property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSat(Boolean value) {
            this.sat = value;
        }

        /**
         * Gets the value of the sun property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSun() {
            return sun;
        }

        /**
         * Sets the value of the sun property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSun(Boolean value) {
            this.sun = value;
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
     *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}DiscountType">
     *       &lt;attribute name="AppliesTo">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Base"/>
     *             &lt;enumeration value="AdditionalGuestAmount"/>
     *             &lt;enumeration value="Fee"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ItemRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Discount
        extends DiscountType
    {

        @XmlAttribute(name = "AppliesTo")
        protected String appliesTo;
        @XmlAttribute(name = "ItemRPH")
        protected String itemRPH;

        /**
         * Gets the value of the appliesTo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppliesTo() {
            return appliesTo;
        }

        /**
         * Sets the value of the appliesTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAppliesTo(String value) {
            this.appliesTo = value;
        }

        /**
         * Gets the value of the itemRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemRPH() {
            return itemRPH;
        }

        /**
         * Sets the value of the itemRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemRPH(String value) {
            this.itemRPH = value;
        }

    }

}
