
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResCommonDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResCommonDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestCounts" type="{http://www.escapia.com/EVRN/2007/02}GuestCountType" minOccurs="0"/>
 *         &lt;element name="TimeSpan" type="{http://www.escapia.com/EVRN/2007/02}DateTimeSpanType" minOccurs="0"/>
 *         &lt;element name="ResGuestRPHs" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfResGuestRPHsTypeResGuestRPH" minOccurs="0"/>
 *         &lt;element name="Memberships" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfMembershipTypeMembership" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfCommentTypeComment" minOccurs="0"/>
 *         &lt;element name="SpecialRequests" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfSpecialRequestTypeSpecialRequest" minOccurs="0"/>
 *         &lt;element name="Guarantee" type="{http://www.escapia.com/EVRN/2007/02}GuaranteeType" minOccurs="0"/>
 *         &lt;element name="DepositPayments" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/>
 *         &lt;element name="CancelPenalties" type="{http://www.escapia.com/EVRN/2007/02}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="Fees" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfFeeType" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.escapia.com/EVRN/2007/02}TotalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResCommonDetailType", propOrder = {
    "guestCounts",
    "timeSpan",
    "resGuestRPHs",
    "memberships",
    "comments",
    "specialRequests",
    "guarantee",
    "depositPayments",
    "cancelPenalties",
    "fees",
    "total"
})
@XmlSeeAlso({
    EVRNResGlobalInfoType.class,
    ResGlobalInfoType.class
})
public class ResCommonDetailType {

    @XmlElement(name = "GuestCounts")
    protected GuestCountType guestCounts;
    @XmlElement(name = "TimeSpan")
    protected DateTimeSpanType timeSpan;
    @XmlElement(name = "ResGuestRPHs")
    protected ArrayOfResGuestRPHsTypeResGuestRPH resGuestRPHs;
    @XmlElement(name = "Memberships")
    protected ArrayOfMembershipTypeMembership memberships;
    @XmlElement(name = "Comments")
    protected ArrayOfCommentTypeComment comments;
    @XmlElement(name = "SpecialRequests")
    protected ArrayOfSpecialRequestTypeSpecialRequest specialRequests;
    @XmlElement(name = "Guarantee")
    protected GuaranteeType guarantee;
    @XmlElement(name = "DepositPayments")
    protected ArrayOfRequiredPaymentsTypeGuaranteePayment depositPayments;
    @XmlElement(name = "CancelPenalties")
    protected CancelPenaltiesType cancelPenalties;
    @XmlElement(name = "Fees")
    protected ArrayOfFeeType fees;
    @XmlElement(name = "Total")
    protected TotalType total;

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
     * Gets the value of the resGuestRPHs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResGuestRPHsTypeResGuestRPH }
     *     
     */
    public ArrayOfResGuestRPHsTypeResGuestRPH getResGuestRPHs() {
        return resGuestRPHs;
    }

    /**
     * Sets the value of the resGuestRPHs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResGuestRPHsTypeResGuestRPH }
     *     
     */
    public void setResGuestRPHs(ArrayOfResGuestRPHsTypeResGuestRPH value) {
        this.resGuestRPHs = value;
    }

    /**
     * Gets the value of the memberships property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMembershipTypeMembership }
     *     
     */
    public ArrayOfMembershipTypeMembership getMemberships() {
        return memberships;
    }

    /**
     * Sets the value of the memberships property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMembershipTypeMembership }
     *     
     */
    public void setMemberships(ArrayOfMembershipTypeMembership value) {
        this.memberships = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommentTypeComment }
     *     
     */
    public ArrayOfCommentTypeComment getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommentTypeComment }
     *     
     */
    public void setComments(ArrayOfCommentTypeComment value) {
        this.comments = value;
    }

    /**
     * Gets the value of the specialRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialRequestTypeSpecialRequest }
     *     
     */
    public ArrayOfSpecialRequestTypeSpecialRequest getSpecialRequests() {
        return specialRequests;
    }

    /**
     * Sets the value of the specialRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialRequestTypeSpecialRequest }
     *     
     */
    public void setSpecialRequests(ArrayOfSpecialRequestTypeSpecialRequest value) {
        this.specialRequests = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeType }
     *     
     */
    public GuaranteeType getGuarantee() {
        return guarantee;
    }

    /**
     * Sets the value of the guarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeType }
     *     
     */
    public void setGuarantee(GuaranteeType value) {
        this.guarantee = value;
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

}
