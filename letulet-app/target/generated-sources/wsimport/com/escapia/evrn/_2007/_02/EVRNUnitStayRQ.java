
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="UnitStay" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UnitRef" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="PropertyManagerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="UnitName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="InternalUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="UnitHeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="PropertyURL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="StayDateRange" type="{http://www.escapia.com/EVRN/2007/02}DateTimeSpanType" minOccurs="0"/>
 *                   &lt;element name="GuestCounts" type="{http://www.escapia.com/EVRN/2007/02}GuestCountType" minOccurs="0"/>
 *                   &lt;element name="DepositPayments" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CancelPenalties" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BasicUnitInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RentalAgreement" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Pets" type="{http://www.escapia.com/EVRN/2007/02}PetsPoliciesType" minOccurs="0"/>
 *                   &lt;element name="AdditionalCharges" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AdditionalCharge" type="{http://www.escapia.com/EVRN/2007/02}AdditionalChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="OptionalChargesIndicator">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="IncludeAll"/>
 *                                 &lt;enumeration value="ExcludeAll"/>
 *                                 &lt;enumeration value="IncludeSpecified"/>
 *                                 &lt;enumeration value="IncludeDefault"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Discount" type="{http://www.escapia.com/EVRN/2007/02}DiscountType" minOccurs="0"/>
 *                   &lt;element name="OverriddenUnitRates" type="{http://www.escapia.com/EVRN/2007/02}OverriddenUnitStayRateType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="AvailableOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SourceCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SourceSubCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "unitStay"
})
@XmlRootElement(name = "EVRN_UnitStayRQ")
public class EVRNUnitStayRQ
    extends EVRNBaseRQType
{

    @XmlElement(name = "UnitStay")
    protected List<EVRNUnitStayRQ.UnitStay> unitStay;

    /**
     * Gets the value of the unitStay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitStay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitStay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EVRNUnitStayRQ.UnitStay }
     * 
     * 
     */
    public List<EVRNUnitStayRQ.UnitStay> getUnitStay() {
        if (unitStay == null) {
            unitStay = new ArrayList<EVRNUnitStayRQ.UnitStay>();
        }
        return this.unitStay;
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
     *         &lt;element name="UnitRef" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="PropertyManagerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="UnitName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="InternalUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="UnitHeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PropertyURL" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="StayDateRange" type="{http://www.escapia.com/EVRN/2007/02}DateTimeSpanType" minOccurs="0"/>
     *         &lt;element name="GuestCounts" type="{http://www.escapia.com/EVRN/2007/02}GuestCountType" minOccurs="0"/>
     *         &lt;element name="DepositPayments" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CancelPenalties" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BasicUnitInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RentalAgreement" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Pets" type="{http://www.escapia.com/EVRN/2007/02}PetsPoliciesType" minOccurs="0"/>
     *         &lt;element name="AdditionalCharges" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AdditionalCharge" type="{http://www.escapia.com/EVRN/2007/02}AdditionalChargeType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="OptionalChargesIndicator">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="IncludeAll"/>
     *                       &lt;enumeration value="ExcludeAll"/>
     *                       &lt;enumeration value="IncludeSpecified"/>
     *                       &lt;enumeration value="IncludeDefault"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Discount" type="{http://www.escapia.com/EVRN/2007/02}DiscountType" minOccurs="0"/>
     *         &lt;element name="OverriddenUnitRates" type="{http://www.escapia.com/EVRN/2007/02}OverriddenUnitStayRateType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="AvailableOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SourceCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SourceSubCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "unitRef",
        "stayDateRange",
        "guestCounts",
        "depositPayments",
        "cancelPenalties",
        "basicUnitInfo",
        "rentalAgreement",
        "pets",
        "additionalCharges",
        "discount",
        "overriddenUnitRates"
    })
    public static class UnitStay {

        @XmlElement(name = "UnitRef")
        protected EVRNUnitStayRQ.UnitStay.UnitRef unitRef;
        @XmlElement(name = "StayDateRange")
        protected DateTimeSpanType stayDateRange;
        @XmlElement(name = "GuestCounts")
        protected GuestCountType guestCounts;
        @XmlElement(name = "DepositPayments")
        protected EVRNUnitStayRQ.UnitStay.DepositPayments depositPayments;
        @XmlElement(name = "CancelPenalties")
        protected EVRNUnitStayRQ.UnitStay.CancelPenalties cancelPenalties;
        @XmlElement(name = "BasicUnitInfo")
        protected EVRNUnitStayRQ.UnitStay.BasicUnitInfo basicUnitInfo;
        @XmlElement(name = "RentalAgreement")
        protected EVRNUnitStayRQ.UnitStay.RentalAgreement rentalAgreement;
        @XmlElement(name = "Pets")
        protected PetsPoliciesType pets;
        @XmlElement(name = "AdditionalCharges")
        protected EVRNUnitStayRQ.UnitStay.AdditionalCharges additionalCharges;
        @XmlElement(name = "Discount")
        protected DiscountType discount;
        @XmlElement(name = "OverriddenUnitRates")
        protected OverriddenUnitStayRateType overriddenUnitRates;
        @XmlAttribute(name = "AvailableOnlyIndicator")
        protected Boolean availableOnlyIndicator;
        @XmlAttribute(name = "PromotionCode")
        protected String promotionCode;
        @XmlAttribute(name = "SourceCategory")
        protected String sourceCategory;
        @XmlAttribute(name = "SourceSubCategory")
        protected String sourceSubCategory;

        /**
         * Gets the value of the unitRef property.
         * 
         * @return
         *     possible object is
         *     {@link EVRNUnitStayRQ.UnitStay.UnitRef }
         *     
         */
        public EVRNUnitStayRQ.UnitStay.UnitRef getUnitRef() {
            return unitRef;
        }

        /**
         * Sets the value of the unitRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link EVRNUnitStayRQ.UnitStay.UnitRef }
         *     
         */
        public void setUnitRef(EVRNUnitStayRQ.UnitStay.UnitRef value) {
            this.unitRef = value;
        }

        /**
         * Gets the value of the stayDateRange property.
         * 
         * @return
         *     possible object is
         *     {@link DateTimeSpanType }
         *     
         */
        public DateTimeSpanType getStayDateRange() {
            return stayDateRange;
        }

        /**
         * Sets the value of the stayDateRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimeSpanType }
         *     
         */
        public void setStayDateRange(DateTimeSpanType value) {
            this.stayDateRange = value;
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
         * Gets the value of the depositPayments property.
         * 
         * @return
         *     possible object is
         *     {@link EVRNUnitStayRQ.UnitStay.DepositPayments }
         *     
         */
        public EVRNUnitStayRQ.UnitStay.DepositPayments getDepositPayments() {
            return depositPayments;
        }

        /**
         * Sets the value of the depositPayments property.
         * 
         * @param value
         *     allowed object is
         *     {@link EVRNUnitStayRQ.UnitStay.DepositPayments }
         *     
         */
        public void setDepositPayments(EVRNUnitStayRQ.UnitStay.DepositPayments value) {
            this.depositPayments = value;
        }

        /**
         * Gets the value of the cancelPenalties property.
         * 
         * @return
         *     possible object is
         *     {@link EVRNUnitStayRQ.UnitStay.CancelPenalties }
         *     
         */
        public EVRNUnitStayRQ.UnitStay.CancelPenalties getCancelPenalties() {
            return cancelPenalties;
        }

        /**
         * Sets the value of the cancelPenalties property.
         * 
         * @param value
         *     allowed object is
         *     {@link EVRNUnitStayRQ.UnitStay.CancelPenalties }
         *     
         */
        public void setCancelPenalties(EVRNUnitStayRQ.UnitStay.CancelPenalties value) {
            this.cancelPenalties = value;
        }

        /**
         * Gets the value of the basicUnitInfo property.
         * 
         * @return
         *     possible object is
         *     {@link EVRNUnitStayRQ.UnitStay.BasicUnitInfo }
         *     
         */
        public EVRNUnitStayRQ.UnitStay.BasicUnitInfo getBasicUnitInfo() {
            return basicUnitInfo;
        }

        /**
         * Sets the value of the basicUnitInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link EVRNUnitStayRQ.UnitStay.BasicUnitInfo }
         *     
         */
        public void setBasicUnitInfo(EVRNUnitStayRQ.UnitStay.BasicUnitInfo value) {
            this.basicUnitInfo = value;
        }

        /**
         * Gets the value of the rentalAgreement property.
         * 
         * @return
         *     possible object is
         *     {@link EVRNUnitStayRQ.UnitStay.RentalAgreement }
         *     
         */
        public EVRNUnitStayRQ.UnitStay.RentalAgreement getRentalAgreement() {
            return rentalAgreement;
        }

        /**
         * Sets the value of the rentalAgreement property.
         * 
         * @param value
         *     allowed object is
         *     {@link EVRNUnitStayRQ.UnitStay.RentalAgreement }
         *     
         */
        public void setRentalAgreement(EVRNUnitStayRQ.UnitStay.RentalAgreement value) {
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
         * Gets the value of the additionalCharges property.
         * 
         * @return
         *     possible object is
         *     {@link EVRNUnitStayRQ.UnitStay.AdditionalCharges }
         *     
         */
        public EVRNUnitStayRQ.UnitStay.AdditionalCharges getAdditionalCharges() {
            return additionalCharges;
        }

        /**
         * Sets the value of the additionalCharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link EVRNUnitStayRQ.UnitStay.AdditionalCharges }
         *     
         */
        public void setAdditionalCharges(EVRNUnitStayRQ.UnitStay.AdditionalCharges value) {
            this.additionalCharges = value;
        }

        /**
         * Gets the value of the discount property.
         * 
         * @return
         *     possible object is
         *     {@link DiscountType }
         *     
         */
        public DiscountType getDiscount() {
            return discount;
        }

        /**
         * Sets the value of the discount property.
         * 
         * @param value
         *     allowed object is
         *     {@link DiscountType }
         *     
         */
        public void setDiscount(DiscountType value) {
            this.discount = value;
        }

        /**
         * Gets the value of the overriddenUnitRates property.
         * 
         * @return
         *     possible object is
         *     {@link OverriddenUnitStayRateType }
         *     
         */
        public OverriddenUnitStayRateType getOverriddenUnitRates() {
            return overriddenUnitRates;
        }

        /**
         * Sets the value of the overriddenUnitRates property.
         * 
         * @param value
         *     allowed object is
         *     {@link OverriddenUnitStayRateType }
         *     
         */
        public void setOverriddenUnitRates(OverriddenUnitStayRateType value) {
            this.overriddenUnitRates = value;
        }

        /**
         * Gets the value of the availableOnlyIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAvailableOnlyIndicator() {
            return availableOnlyIndicator;
        }

        /**
         * Sets the value of the availableOnlyIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAvailableOnlyIndicator(Boolean value) {
            this.availableOnlyIndicator = value;
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
         * Gets the value of the sourceCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceCategory() {
            return sourceCategory;
        }

        /**
         * Sets the value of the sourceCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceCategory(String value) {
            this.sourceCategory = value;
        }

        /**
         * Gets the value of the sourceSubCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceSubCategory() {
            return sourceSubCategory;
        }

        /**
         * Sets the value of the sourceSubCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceSubCategory(String value) {
            this.sourceSubCategory = value;
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
         *         &lt;element name="AdditionalCharge" type="{http://www.escapia.com/EVRN/2007/02}AdditionalChargeType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="OptionalChargesIndicator">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="IncludeAll"/>
         *             &lt;enumeration value="ExcludeAll"/>
         *             &lt;enumeration value="IncludeSpecified"/>
         *             &lt;enumeration value="IncludeDefault"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
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
            protected List<AdditionalChargeType> additionalCharge;
            @XmlAttribute(name = "OptionalChargesIndicator")
            protected String optionalChargesIndicator;

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
             * {@link AdditionalChargeType }
             * 
             * 
             */
            public List<AdditionalChargeType> getAdditionalCharge() {
                if (additionalCharge == null) {
                    additionalCharge = new ArrayList<AdditionalChargeType>();
                }
                return this.additionalCharge;
            }

            /**
             * Gets the value of the optionalChargesIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOptionalChargesIndicator() {
                return optionalChargesIndicator;
            }

            /**
             * Sets the value of the optionalChargesIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOptionalChargesIndicator(String value) {
                this.optionalChargesIndicator = value;
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
         *       &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class BasicUnitInfo {

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
            public Boolean isSendData() {
                return sendData;
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
         *       &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CancelPenalties {

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
            public Boolean isSendData() {
                return sendData;
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
         *       &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DepositPayments {

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
            public Boolean isSendData() {
                return sendData;
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
         *       &lt;attribute name="SendData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RentalAgreement {

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
            public Boolean isSendData() {
                return sendData;
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
         *       &lt;attribute name="PropertyManagerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="UnitName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="InternalUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="UnitHeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PropertyURL" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UnitRef {

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

        }

    }

}
