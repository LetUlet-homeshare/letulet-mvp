
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
 * <p>Java class for GuaranteeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuaranteeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuaranteesAccepted" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfGuaranteeTypeGuaranteeAccepted" minOccurs="0"/>
 *         &lt;element name="Deadline" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OffsetTimeUnit" type="{http://www.escapia.com/EVRN/2007/02}TimeUnitType" />
 *                 &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="OffsetDropTime">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="BeforeArrival"/>
 *                       &lt;enumeration value="AfterBooking"/>
 *                       &lt;enumeration value="AfterConfirmation"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Comments" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfCommentTypeComment" minOccurs="0"/>
 *         &lt;element name="GuaranteeDescription" type="{http://www.escapia.com/EVRN/2007/02}ParagraphType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RetributionType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ResAutoCancelled"/>
 *             &lt;enumeration value="ResNotGuaranteed"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="GuaranteeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GuaranteeType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="GuaranteeRequired"/>
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="CC/DC/Voucher"/>
 *             &lt;enumeration value="Profile"/>
 *             &lt;enumeration value="Deposit"/>
 *             &lt;enumeration value="PrePay"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="HoldTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteeType", propOrder = {
    "guaranteesAccepted",
    "deadline",
    "comments",
    "guaranteeDescription"
})
public class GuaranteeType {

    @XmlElement(name = "GuaranteesAccepted")
    protected ArrayOfGuaranteeTypeGuaranteeAccepted guaranteesAccepted;
    @XmlElement(name = "Deadline")
    protected GuaranteeType.Deadline deadline;
    @XmlElement(name = "Comments")
    protected ArrayOfCommentTypeComment comments;
    @XmlElement(name = "GuaranteeDescription")
    protected List<ParagraphType> guaranteeDescription;
    @XmlAttribute(name = "RetributionType")
    protected String retributionType;
    @XmlAttribute(name = "GuaranteeCode")
    protected String guaranteeCode;
    @XmlAttribute(name = "GuaranteeType")
    protected String guaranteeType;
    @XmlAttribute(name = "HoldTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar holdTime;

    /**
     * Gets the value of the guaranteesAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuaranteeTypeGuaranteeAccepted }
     *     
     */
    public ArrayOfGuaranteeTypeGuaranteeAccepted getGuaranteesAccepted() {
        return guaranteesAccepted;
    }

    /**
     * Sets the value of the guaranteesAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuaranteeTypeGuaranteeAccepted }
     *     
     */
    public void setGuaranteesAccepted(ArrayOfGuaranteeTypeGuaranteeAccepted value) {
        this.guaranteesAccepted = value;
    }

    /**
     * Gets the value of the deadline property.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeType.Deadline }
     *     
     */
    public GuaranteeType.Deadline getDeadline() {
        return deadline;
    }

    /**
     * Sets the value of the deadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeType.Deadline }
     *     
     */
    public void setDeadline(GuaranteeType.Deadline value) {
        this.deadline = value;
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
     * Gets the value of the guaranteeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuaranteeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getGuaranteeDescription() {
        if (guaranteeDescription == null) {
            guaranteeDescription = new ArrayList<ParagraphType>();
        }
        return this.guaranteeDescription;
    }

    /**
     * Gets the value of the retributionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetributionType() {
        return retributionType;
    }

    /**
     * Sets the value of the retributionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetributionType(String value) {
        this.retributionType = value;
    }

    /**
     * Gets the value of the guaranteeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeCode() {
        return guaranteeCode;
    }

    /**
     * Sets the value of the guaranteeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeCode(String value) {
        this.guaranteeCode = value;
    }

    /**
     * Gets the value of the guaranteeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeType() {
        return guaranteeType;
    }

    /**
     * Sets the value of the guaranteeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeType(String value) {
        this.guaranteeType = value;
    }

    /**
     * Gets the value of the holdTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoldTime() {
        return holdTime;
    }

    /**
     * Sets the value of the holdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoldTime(XMLGregorianCalendar value) {
        this.holdTime = value;
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
     *       &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OffsetTimeUnit" type="{http://www.escapia.com/EVRN/2007/02}TimeUnitType" />
     *       &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="OffsetDropTime">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="BeforeArrival"/>
     *             &lt;enumeration value="AfterBooking"/>
     *             &lt;enumeration value="AfterConfirmation"/>
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
    @XmlType(name = "")
    public static class Deadline {

        @XmlAttribute(name = "AbsoluteDeadline")
        protected String absoluteDeadline;
        @XmlAttribute(name = "OffsetTimeUnit")
        protected TimeUnitType offsetTimeUnit;
        @XmlAttribute(name = "OffsetUnitMultiplier")
        protected BigInteger offsetUnitMultiplier;
        @XmlAttribute(name = "OffsetDropTime")
        protected String offsetDropTime;

        /**
         * Gets the value of the absoluteDeadline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbsoluteDeadline() {
            return absoluteDeadline;
        }

        /**
         * Sets the value of the absoluteDeadline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbsoluteDeadline(String value) {
            this.absoluteDeadline = value;
        }

        /**
         * Gets the value of the offsetTimeUnit property.
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getOffsetTimeUnit() {
            return offsetTimeUnit;
        }

        /**
         * Sets the value of the offsetTimeUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setOffsetTimeUnit(TimeUnitType value) {
            this.offsetTimeUnit = value;
        }

        /**
         * Gets the value of the offsetUnitMultiplier property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOffsetUnitMultiplier() {
            return offsetUnitMultiplier;
        }

        /**
         * Sets the value of the offsetUnitMultiplier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOffsetUnitMultiplier(BigInteger value) {
            this.offsetUnitMultiplier = value;
        }

        /**
         * Gets the value of the offsetDropTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetDropTime() {
            return offsetDropTime;
        }

        /**
         * Sets the value of the offsetDropTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetDropTime(String value) {
            this.offsetDropTime = value;
        }

    }

}
