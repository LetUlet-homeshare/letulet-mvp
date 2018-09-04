
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
 * <p>Java class for ArrayOfUnitStaysTypeUnitStay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnitStaysTypeUnitStay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitStay" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.escapia.com/EVRN/2007/02}UnitStayType">
 *                 &lt;sequence>
 *                   &lt;element name="ResGuestRPHs" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfResGuestRPHsTypeResGuestRPH" minOccurs="0"/>
 *                   &lt;element name="Comments" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfCommentTypeComment" minOccurs="0"/>
 *                   &lt;element name="SpecialRequests" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfSpecialRequestTypeSpecialRequest" minOccurs="0"/>
 *                   &lt;element name="ServiceRPHs" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/>
 *                   &lt;element name="Reference" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.escapia.com/EVRN/2007/02}UniqueID_Type">
 *                           &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OverriddenUnitRates" type="{http://www.escapia.com/EVRN/2007/02}OverriddenUnitStayRateType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="IndexNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "ArrayOfUnitStaysTypeUnitStay", propOrder = {
    "unitStay"
})
public class ArrayOfUnitStaysTypeUnitStay {

    @XmlElement(name = "UnitStay")
    protected List<ArrayOfUnitStaysTypeUnitStay.UnitStay> unitStay;

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
     * {@link ArrayOfUnitStaysTypeUnitStay.UnitStay }
     * 
     * 
     */
    public List<ArrayOfUnitStaysTypeUnitStay.UnitStay> getUnitStay() {
        if (unitStay == null) {
            unitStay = new ArrayList<ArrayOfUnitStaysTypeUnitStay.UnitStay>();
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
     *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}UnitStayType">
     *       &lt;sequence>
     *         &lt;element name="ResGuestRPHs" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfResGuestRPHsTypeResGuestRPH" minOccurs="0"/>
     *         &lt;element name="Comments" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfCommentTypeComment" minOccurs="0"/>
     *         &lt;element name="SpecialRequests" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfSpecialRequestTypeSpecialRequest" minOccurs="0"/>
     *         &lt;element name="ServiceRPHs" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/>
     *         &lt;element name="Reference" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.escapia.com/EVRN/2007/02}UniqueID_Type">
     *                 &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OverriddenUnitRates" type="{http://www.escapia.com/EVRN/2007/02}OverriddenUnitStayRateType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="IndexNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resGuestRPHs",
        "comments",
        "specialRequests",
        "serviceRPHs",
        "reference",
        "overriddenUnitRates"
    })
    public static class UnitStay
        extends UnitStayType
    {

        @XmlElement(name = "ResGuestRPHs")
        protected ArrayOfResGuestRPHsTypeResGuestRPH resGuestRPHs;
        @XmlElement(name = "Comments")
        protected ArrayOfCommentTypeComment comments;
        @XmlElement(name = "SpecialRequests")
        protected ArrayOfSpecialRequestTypeSpecialRequest specialRequests;
        @XmlElement(name = "ServiceRPHs")
        protected ArrayOfServiceRPHsTypeServiceRPH serviceRPHs;
        @XmlElement(name = "Reference")
        protected ArrayOfUnitStaysTypeUnitStay.UnitStay.Reference reference;
        @XmlElement(name = "OverriddenUnitRates")
        protected OverriddenUnitStayRateType overriddenUnitRates;
        @XmlAttribute(name = "IndexNumber")
        protected BigInteger indexNumber;

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
         * Gets the value of the serviceRPHs property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfServiceRPHsTypeServiceRPH }
         *     
         */
        public ArrayOfServiceRPHsTypeServiceRPH getServiceRPHs() {
            return serviceRPHs;
        }

        /**
         * Sets the value of the serviceRPHs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfServiceRPHsTypeServiceRPH }
         *     
         */
        public void setServiceRPHs(ArrayOfServiceRPHsTypeServiceRPH value) {
            this.serviceRPHs = value;
        }

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfUnitStaysTypeUnitStay.UnitStay.Reference }
         *     
         */
        public ArrayOfUnitStaysTypeUnitStay.UnitStay.Reference getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfUnitStaysTypeUnitStay.UnitStay.Reference }
         *     
         */
        public void setReference(ArrayOfUnitStaysTypeUnitStay.UnitStay.Reference value) {
            this.reference = value;
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
         * Gets the value of the indexNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndexNumber() {
            return indexNumber;
        }

        /**
         * Sets the value of the indexNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndexNumber(BigInteger value) {
            this.indexNumber = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}UniqueID_Type">
         *       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Reference
            extends UniqueIDType
        {

            @XmlAttribute(name = "DateTime")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar dateTime;

            /**
             * Gets the value of the dateTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateTime() {
                return dateTime;
            }

            /**
             * Sets the value of the dateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateTime(XMLGregorianCalendar value) {
                this.dateTime = value;
            }

        }

    }

}
