
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitStayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitStayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitRates" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfUnitStayTypeUnitRate" minOccurs="0"/>
 *         &lt;element name="GuestCounts" type="{http://www.escapia.com/EVRN/2007/02}GuestCountType" minOccurs="0"/>
 *         &lt;element name="TimeSpan" type="{http://www.escapia.com/EVRN/2007/02}DateTimeSpanType" minOccurs="0"/>
 *         &lt;element name="DepositPayments" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/>
 *         &lt;element name="CancelPenalties" type="{http://www.escapia.com/EVRN/2007/02}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.escapia.com/EVRN/2007/02}TotalType" minOccurs="0"/>
 *         &lt;element name="BasicUnitInfo" type="{http://www.escapia.com/EVRN/2007/02}BasicUnitInfoType" minOccurs="0"/>
 *         &lt;element name="RentalAgreement" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfParagraphType" minOccurs="0"/>
 *         &lt;element name="Pets" type="{http://www.escapia.com/EVRN/2007/02}PetsPoliciesType" minOccurs="0"/>
 *         &lt;element name="UnitInsuranceInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DamageWaiverOptions" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfDamageWaiverOptionType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="AvailabilityStatus" type="{http://www.escapia.com/EVRN/2007/02}RateIndicatorType" />
 *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitStayType", propOrder = {
    "unitRates",
    "guestCounts",
    "timeSpan",
    "depositPayments",
    "cancelPenalties",
    "total",
    "basicUnitInfo",
    "rentalAgreement",
    "pets",
    "unitInsuranceInfo"
})
@XmlSeeAlso({
    com.escapia.evrn._2007._02.ArrayOfUnitStaysTypeUnitStay.UnitStay.class
})
public class UnitStayType {

    @XmlElement(name = "UnitRates")
    protected ArrayOfUnitStayTypeUnitRate unitRates;
    @XmlElement(name = "GuestCounts")
    protected GuestCountType guestCounts;
    @XmlElement(name = "TimeSpan")
    protected DateTimeSpanType timeSpan;
    @XmlElement(name = "DepositPayments")
    protected ArrayOfRequiredPaymentsTypeGuaranteePayment depositPayments;
    @XmlElement(name = "CancelPenalties")
    protected CancelPenaltiesType cancelPenalties;
    @XmlElement(name = "Total")
    protected TotalType total;
    @XmlElement(name = "BasicUnitInfo")
    protected BasicUnitInfoType basicUnitInfo;
    @XmlElement(name = "RentalAgreement")
    protected ArrayOfParagraphType rentalAgreement;
    @XmlElement(name = "Pets")
    protected PetsPoliciesType pets;
    @XmlElement(name = "UnitInsuranceInfo")
    protected UnitStayType.UnitInsuranceInfo unitInsuranceInfo;
    @XmlAttribute(name = "AvailabilityStatus")
    protected RateIndicatorType availabilityStatus;
    @XmlAttribute(name = "PromotionCode")
    protected String promotionCode;

    /**
     * Gets the value of the unitRates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnitStayTypeUnitRate }
     *     
     */
    public ArrayOfUnitStayTypeUnitRate getUnitRates() {
        return unitRates;
    }

    /**
     * Sets the value of the unitRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnitStayTypeUnitRate }
     *     
     */
    public void setUnitRates(ArrayOfUnitStayTypeUnitRate value) {
        this.unitRates = value;
    }

    /**
     * Gets the value of the guestCounts property.
     * 
     * @return
     *     possible object is
     *     {@link GuestCountType }
     *     
     */
    public GuestCountType getGuestCounts() {
        return guestCounts;
    }

    /**
     * Sets the value of the guestCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCountType }
     *     
     */
    public void setGuestCounts(GuestCountType value) {
        this.guestCounts = value;
    }

    /**
     * Gets the value of the timeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType }
     *     
     */
    public DateTimeSpanType getTimeSpan() {
        return timeSpan;
    }

    /**
     * Sets the value of the timeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType }
     *     
     */
    public void setTimeSpan(DateTimeSpanType value) {
        this.timeSpan = value;
    }

    /**
     * Gets the value of the depositPayments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     *     
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment getDepositPayments() {
        return depositPayments;
    }

    /**
     * Sets the value of the depositPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     *     
     */
    public void setDepositPayments(ArrayOfRequiredPaymentsTypeGuaranteePayment value) {
        this.depositPayments = value;
    }

    /**
     * Gets the value of the cancelPenalties property.
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * Sets the value of the cancelPenalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancelPenalties(CancelPenaltiesType value) {
        this.cancelPenalties = value;
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
     * Gets the value of the basicUnitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BasicUnitInfoType }
     *     
     */
    public BasicUnitInfoType getBasicUnitInfo() {
        return basicUnitInfo;
    }

    /**
     * Sets the value of the basicUnitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicUnitInfoType }
     *     
     */
    public void setBasicUnitInfo(BasicUnitInfoType value) {
        this.basicUnitInfo = value;
    }

    /**
     * Gets the value of the rentalAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParagraphType }
     *     
     */
    public ArrayOfParagraphType getRentalAgreement() {
        return rentalAgreement;
    }

    /**
     * Sets the value of the rentalAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParagraphType }
     *     
     */
    public void setRentalAgreement(ArrayOfParagraphType value) {
        this.rentalAgreement = value;
    }

    /**
     * Gets the value of the pets property.
     * 
     * @return
     *     possible object is
     *     {@link PetsPoliciesType }
     *     
     */
    public PetsPoliciesType getPets() {
        return pets;
    }

    /**
     * Sets the value of the pets property.
     * 
     * @param value
     *     allowed object is
     *     {@link PetsPoliciesType }
     *     
     */
    public void setPets(PetsPoliciesType value) {
        this.pets = value;
    }

    /**
     * Gets the value of the unitInsuranceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UnitStayType.UnitInsuranceInfo }
     *     
     */
    public UnitStayType.UnitInsuranceInfo getUnitInsuranceInfo() {
        return unitInsuranceInfo;
    }

    /**
     * Sets the value of the unitInsuranceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitStayType.UnitInsuranceInfo }
     *     
     */
    public void setUnitInsuranceInfo(UnitStayType.UnitInsuranceInfo value) {
        this.unitInsuranceInfo = value;
    }

    /**
     * Gets the value of the availabilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RateIndicatorType }
     *     
     */
    public RateIndicatorType getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * Sets the value of the availabilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateIndicatorType }
     *     
     */
    public void setAvailabilityStatus(RateIndicatorType value) {
        this.availabilityStatus = value;
    }

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
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
     *         &lt;element name="DamageWaiverOptions" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfDamageWaiverOptionType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "damageWaiverOptions"
    })
    public static class UnitInsuranceInfo {

        @XmlElement(name = "DamageWaiverOptions")
        protected ArrayOfDamageWaiverOptionType damageWaiverOptions;

        /**
         * Gets the value of the damageWaiverOptions property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfDamageWaiverOptionType }
         *     
         */
        public ArrayOfDamageWaiverOptionType getDamageWaiverOptions() {
            return damageWaiverOptions;
        }

        /**
         * Sets the value of the damageWaiverOptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfDamageWaiverOptionType }
         *     
         */
        public void setDamageWaiverOptions(ArrayOfDamageWaiverOptionType value) {
            this.damageWaiverOptions = value;
        }

    }

}
