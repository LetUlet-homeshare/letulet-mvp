
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGuaranteeTypeGuaranteeAccepted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGuaranteeTypeGuaranteeAccepted">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuaranteeAccepted" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.escapia.com/EVRN/2007/02}PaymentFormType">
 *                 &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NoCardHolderInfoReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NameReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AddressReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PhoneReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="InterbankNbrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="BookingSourceAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="CorpDiscountNbrAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="GuaranteeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="GuaranteeID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
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
@XmlType(name = "ArrayOfGuaranteeTypeGuaranteeAccepted", propOrder = {
    "guaranteeAccepted"
})
public class ArrayOfGuaranteeTypeGuaranteeAccepted {

    @XmlElement(name = "GuaranteeAccepted")
    protected List<ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted> guaranteeAccepted;

    /**
     * Gets the value of the guaranteeAccepted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteeAccepted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuaranteeAccepted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted }
     * 
     * 
     */
    public List<ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted> getGuaranteeAccepted() {
        if (guaranteeAccepted == null) {
            guaranteeAccepted = new ArrayList<ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted>();
        }
        return this.guaranteeAccepted;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}PaymentFormType">
     *       &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NoCardHolderInfoReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NameReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AddressReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PhoneReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="InterbankNbrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="BookingSourceAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="CorpDiscountNbrAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="GuaranteeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GuaranteeID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GuaranteeAccepted
        extends PaymentFormType
    {

        @XmlAttribute(name = "Default")
        protected Boolean _default;
        @XmlAttribute(name = "NoCardHolderInfoReqInd")
        protected Boolean noCardHolderInfoReqInd;
        @XmlAttribute(name = "NameReqInd")
        protected Boolean nameReqInd;
        @XmlAttribute(name = "AddressReqInd")
        protected Boolean addressReqInd;
        @XmlAttribute(name = "PhoneReqInd")
        protected Boolean phoneReqInd;
        @XmlAttribute(name = "InterbankNbrReqInd")
        protected Boolean interbankNbrReqInd;
        @XmlAttribute(name = "BookingSourceAllowedInd")
        protected Boolean bookingSourceAllowedInd;
        @XmlAttribute(name = "CorpDiscountNbrAllowedInd")
        protected Boolean corpDiscountNbrAllowedInd;
        @XmlAttribute(name = "GuaranteeTypeCode")
        protected String guaranteeTypeCode;
        @XmlAttribute(name = "GuaranteeID")
        protected String guaranteeID;

        /**
         * Gets the value of the default property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDefault() {
            return _default;
        }

        /**
         * Sets the value of the default property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefault(Boolean value) {
            this._default = value;
        }

        /**
         * Gets the value of the noCardHolderInfoReqInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoCardHolderInfoReqInd() {
            return noCardHolderInfoReqInd;
        }

        /**
         * Sets the value of the noCardHolderInfoReqInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoCardHolderInfoReqInd(Boolean value) {
            this.noCardHolderInfoReqInd = value;
        }

        /**
         * Gets the value of the nameReqInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNameReqInd() {
            return nameReqInd;
        }

        /**
         * Sets the value of the nameReqInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNameReqInd(Boolean value) {
            this.nameReqInd = value;
        }

        /**
         * Gets the value of the addressReqInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAddressReqInd() {
            return addressReqInd;
        }

        /**
         * Sets the value of the addressReqInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAddressReqInd(Boolean value) {
            this.addressReqInd = value;
        }

        /**
         * Gets the value of the phoneReqInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPhoneReqInd() {
            return phoneReqInd;
        }

        /**
         * Sets the value of the phoneReqInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPhoneReqInd(Boolean value) {
            this.phoneReqInd = value;
        }

        /**
         * Gets the value of the interbankNbrReqInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInterbankNbrReqInd() {
            return interbankNbrReqInd;
        }

        /**
         * Sets the value of the interbankNbrReqInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInterbankNbrReqInd(Boolean value) {
            this.interbankNbrReqInd = value;
        }

        /**
         * Gets the value of the bookingSourceAllowedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBookingSourceAllowedInd() {
            return bookingSourceAllowedInd;
        }

        /**
         * Sets the value of the bookingSourceAllowedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBookingSourceAllowedInd(Boolean value) {
            this.bookingSourceAllowedInd = value;
        }

        /**
         * Gets the value of the corpDiscountNbrAllowedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCorpDiscountNbrAllowedInd() {
            return corpDiscountNbrAllowedInd;
        }

        /**
         * Sets the value of the corpDiscountNbrAllowedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCorpDiscountNbrAllowedInd(Boolean value) {
            this.corpDiscountNbrAllowedInd = value;
        }

        /**
         * Gets the value of the guaranteeTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuaranteeTypeCode() {
            return guaranteeTypeCode;
        }

        /**
         * Sets the value of the guaranteeTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuaranteeTypeCode(String value) {
            this.guaranteeTypeCode = value;
        }

        /**
         * Gets the value of the guaranteeID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuaranteeID() {
            return guaranteeID;
        }

        /**
         * Sets the value of the guaranteeID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuaranteeID(String value) {
            this.guaranteeID = value;
        }

    }

}
