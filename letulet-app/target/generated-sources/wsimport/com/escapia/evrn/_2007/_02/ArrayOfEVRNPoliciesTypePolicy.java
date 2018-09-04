
package com.escapia.evrn._2007._02;

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
 * <p>Java class for ArrayOfEVRN_PoliciesTypePolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEVRN_PoliciesTypePolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Policy" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PolicyInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Description" type="{http://www.escapia.com/EVRN/2007/02}ParagraphType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CheckOutTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                           &lt;attribute name="TotalGuestCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PetsPolicies" type="{http://www.escapia.com/EVRN/2007/02}PetsPoliciesType" minOccurs="0"/>
 *                   &lt;element name="StayRequirements" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfStayRequirementType" minOccurs="0"/>
 *                   &lt;element name="CommissionPolicies" type="{http://www.escapia.com/EVRN/2007/02}CommissionPoliciesType" minOccurs="0"/>
 *                   &lt;element name="CancelPolicy" type="{http://www.escapia.com/EVRN/2007/02}CancelPenaltiesType" minOccurs="0"/>
 *                   &lt;element name="RentalAgreement" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfParagraphType" minOccurs="0"/>
 *                   &lt;element name="GuaranteePaymentPolicy" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="DefaultValidBookingMinOffset" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Release" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEVRN_PoliciesTypePolicy", propOrder = {
    "policy"
})
public class ArrayOfEVRNPoliciesTypePolicy {

    @XmlElement(name = "Policy")
    protected List<ArrayOfEVRNPoliciesTypePolicy.Policy> policy;

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfEVRNPoliciesTypePolicy.Policy }
     * 
     * 
     */
    public List<ArrayOfEVRNPoliciesTypePolicy.Policy> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<ArrayOfEVRNPoliciesTypePolicy.Policy>();
        }
        return this.policy;
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
     *         &lt;element name="PolicyInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Description" type="{http://www.escapia.com/EVRN/2007/02}ParagraphType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CheckOutTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                 &lt;attribute name="TotalGuestCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PetsPolicies" type="{http://www.escapia.com/EVRN/2007/02}PetsPoliciesType" minOccurs="0"/>
     *         &lt;element name="StayRequirements" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfStayRequirementType" minOccurs="0"/>
     *         &lt;element name="CommissionPolicies" type="{http://www.escapia.com/EVRN/2007/02}CommissionPoliciesType" minOccurs="0"/>
     *         &lt;element name="CancelPolicy" type="{http://www.escapia.com/EVRN/2007/02}CancelPenaltiesType" minOccurs="0"/>
     *         &lt;element name="RentalAgreement" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfParagraphType" minOccurs="0"/>
     *         &lt;element name="GuaranteePaymentPolicy" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="DefaultValidBookingMinOffset" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Release" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
    @XmlType(name = "", propOrder = {
        "policyInfo",
        "petsPolicies",
        "stayRequirements",
        "commissionPolicies",
        "cancelPolicy",
        "rentalAgreement",
        "guaranteePaymentPolicy"
    })
    public static class Policy {

        @XmlElement(name = "PolicyInfo")
        protected ArrayOfEVRNPoliciesTypePolicy.Policy.PolicyInfo policyInfo;
        @XmlElement(name = "PetsPolicies")
        protected PetsPoliciesType petsPolicies;
        @XmlElement(name = "StayRequirements")
        protected ArrayOfStayRequirementType stayRequirements;
        @XmlElement(name = "CommissionPolicies")
        protected CommissionPoliciesType commissionPolicies;
        @XmlElement(name = "CancelPolicy")
        protected CancelPenaltiesType cancelPolicy;
        @XmlElement(name = "RentalAgreement")
        protected ArrayOfParagraphType rentalAgreement;
        @XmlElement(name = "GuaranteePaymentPolicy")
        protected ArrayOfRequiredPaymentsTypeGuaranteePayment guaranteePaymentPolicy;
        @XmlAttribute(name = "DefaultValidBookingMinOffset")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger defaultValidBookingMinOffset;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "Release")
        protected String release;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "LastUpdated")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdated;
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
         * Gets the value of the policyInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfEVRNPoliciesTypePolicy.Policy.PolicyInfo }
         *     
         */
        public ArrayOfEVRNPoliciesTypePolicy.Policy.PolicyInfo getPolicyInfo() {
            return policyInfo;
        }

        /**
         * Sets the value of the policyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfEVRNPoliciesTypePolicy.Policy.PolicyInfo }
         *     
         */
        public void setPolicyInfo(ArrayOfEVRNPoliciesTypePolicy.Policy.PolicyInfo value) {
            this.policyInfo = value;
        }

        /**
         * Gets the value of the petsPolicies property.
         * 
         * @return
         *     possible object is
         *     {@link PetsPoliciesType }
         *     
         */
        public PetsPoliciesType getPetsPolicies() {
            return petsPolicies;
        }

        /**
         * Sets the value of the petsPolicies property.
         * 
         * @param value
         *     allowed object is
         *     {@link PetsPoliciesType }
         *     
         */
        public void setPetsPolicies(PetsPoliciesType value) {
            this.petsPolicies = value;
        }

        /**
         * Gets the value of the stayRequirements property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfStayRequirementType }
         *     
         */
        public ArrayOfStayRequirementType getStayRequirements() {
            return stayRequirements;
        }

        /**
         * Sets the value of the stayRequirements property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfStayRequirementType }
         *     
         */
        public void setStayRequirements(ArrayOfStayRequirementType value) {
            this.stayRequirements = value;
        }

        /**
         * Gets the value of the commissionPolicies property.
         * 
         * @return
         *     possible object is
         *     {@link CommissionPoliciesType }
         *     
         */
        public CommissionPoliciesType getCommissionPolicies() {
            return commissionPolicies;
        }

        /**
         * Sets the value of the commissionPolicies property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommissionPoliciesType }
         *     
         */
        public void setCommissionPolicies(CommissionPoliciesType value) {
            this.commissionPolicies = value;
        }

        /**
         * Gets the value of the cancelPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public CancelPenaltiesType getCancelPolicy() {
            return cancelPolicy;
        }

        /**
         * Sets the value of the cancelPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link CancelPenaltiesType }
         *     
         */
        public void setCancelPolicy(CancelPenaltiesType value) {
            this.cancelPolicy = value;
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
         * Gets the value of the guaranteePaymentPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
         *     
         */
        public ArrayOfRequiredPaymentsTypeGuaranteePayment getGuaranteePaymentPolicy() {
            return guaranteePaymentPolicy;
        }

        /**
         * Sets the value of the guaranteePaymentPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
         *     
         */
        public void setGuaranteePaymentPolicy(ArrayOfRequiredPaymentsTypeGuaranteePayment value) {
            this.guaranteePaymentPolicy = value;
        }

        /**
         * Gets the value of the defaultValidBookingMinOffset property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDefaultValidBookingMinOffset() {
            return defaultValidBookingMinOffset;
        }

        /**
         * Sets the value of the defaultValidBookingMinOffset property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDefaultValidBookingMinOffset(BigInteger value) {
            this.defaultValidBookingMinOffset = value;
        }

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
         * Gets the value of the codeDetail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeDetail() {
            return codeDetail;
        }

        /**
         * Sets the value of the codeDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        /**
         * Gets the value of the lastUpdated property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * Sets the value of the lastUpdated property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
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
         *         &lt;element name="Description" type="{http://www.escapia.com/EVRN/2007/02}ParagraphType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CheckOutTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="TotalGuestCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "description"
        })
        public static class PolicyInfo {

            @XmlElement(name = "Description")
            protected ParagraphType description;
            @XmlAttribute(name = "CheckInTime")
            protected String checkInTime;
            @XmlAttribute(name = "CheckOutTime")
            protected String checkOutTime;
            @XmlAttribute(name = "SmokingAllowed")
            protected Boolean smokingAllowed;
            @XmlAttribute(name = "TotalGuestCount")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger totalGuestCount;

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link ParagraphType }
             *     
             */
            public ParagraphType getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link ParagraphType }
             *     
             */
            public void setDescription(ParagraphType value) {
                this.description = value;
            }

            /**
             * Gets the value of the checkInTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckInTime() {
                return checkInTime;
            }

            /**
             * Sets the value of the checkInTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckInTime(String value) {
                this.checkInTime = value;
            }

            /**
             * Gets the value of the checkOutTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckOutTime() {
                return checkOutTime;
            }

            /**
             * Sets the value of the checkOutTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckOutTime(String value) {
                this.checkOutTime = value;
            }

            /**
             * Gets the value of the smokingAllowed property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isSmokingAllowed() {
                if (smokingAllowed == null) {
                    return false;
                } else {
                    return smokingAllowed;
                }
            }

            /**
             * Sets the value of the smokingAllowed property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSmokingAllowed(Boolean value) {
                this.smokingAllowed = value;
            }

            /**
             * Gets the value of the totalGuestCount property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotalGuestCount() {
                return totalGuestCount;
            }

            /**
             * Sets the value of the totalGuestCount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotalGuestCount(BigInteger value) {
                this.totalGuestCount = value;
            }

        }

    }

}
