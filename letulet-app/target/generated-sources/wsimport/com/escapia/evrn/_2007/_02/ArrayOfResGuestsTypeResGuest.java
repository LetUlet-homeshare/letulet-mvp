
package com.escapia.evrn._2007._02;

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
 * <p>Java class for ArrayOfResGuestsTypeResGuest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResGuestsTypeResGuest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResGuest" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Profiles" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfProfilesTypeProfileInfo" minOccurs="0"/>
 *                   &lt;element name="SpecialRequests" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfSpecialRequestTypeSpecialRequest" minOccurs="0"/>
 *                   &lt;element name="Comments" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfCommentTypeComment" minOccurs="0"/>
 *                   &lt;element name="ServiceRPHs" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/>
 *                   &lt;element name="ProfileRPHs" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfResGuestsTypeResGuestProfileRPH" minOccurs="0"/>
 *                   &lt;element name="ArrivalTransport" type="{http://www.escapia.com/EVRN/2007/02}TransportInfoType" minOccurs="0"/>
 *                   &lt;element name="DepartureTransport" type="{http://www.escapia.com/EVRN/2007/02}TransportInfoType" minOccurs="0"/>
 *                   &lt;element name="GuestCounts" type="{http://www.escapia.com/EVRN/2007/02}GuestCountType" minOccurs="0"/>
 *                   &lt;element name="InHouseTimeSpan" type="{http://www.escapia.com/EVRN/2007/02}DateTimeSpanType" minOccurs="0"/>
 *                   &lt;element name="TPA_Extensions" type="{http://www.escapia.com/EVRN/2007/02}TPA_Extensions_Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ResGuestRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                 &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                 &lt;attribute name="GroupEventCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="VIP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ArrayOfResGuestsTypeResGuest", propOrder = {
    "resGuest"
})
public class ArrayOfResGuestsTypeResGuest {

    @XmlElement(name = "ResGuest")
    protected List<ArrayOfResGuestsTypeResGuest.ResGuest> resGuest;

    /**
     * Gets the value of the resGuest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resGuest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResGuest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfResGuestsTypeResGuest.ResGuest }
     * 
     * 
     */
    public List<ArrayOfResGuestsTypeResGuest.ResGuest> getResGuest() {
        if (resGuest == null) {
            resGuest = new ArrayList<ArrayOfResGuestsTypeResGuest.ResGuest>();
        }
        return this.resGuest;
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
     *         &lt;element name="Profiles" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfProfilesTypeProfileInfo" minOccurs="0"/>
     *         &lt;element name="SpecialRequests" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfSpecialRequestTypeSpecialRequest" minOccurs="0"/>
     *         &lt;element name="Comments" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfCommentTypeComment" minOccurs="0"/>
     *         &lt;element name="ServiceRPHs" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/>
     *         &lt;element name="ProfileRPHs" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfResGuestsTypeResGuestProfileRPH" minOccurs="0"/>
     *         &lt;element name="ArrivalTransport" type="{http://www.escapia.com/EVRN/2007/02}TransportInfoType" minOccurs="0"/>
     *         &lt;element name="DepartureTransport" type="{http://www.escapia.com/EVRN/2007/02}TransportInfoType" minOccurs="0"/>
     *         &lt;element name="GuestCounts" type="{http://www.escapia.com/EVRN/2007/02}GuestCountType" minOccurs="0"/>
     *         &lt;element name="InHouseTimeSpan" type="{http://www.escapia.com/EVRN/2007/02}DateTimeSpanType" minOccurs="0"/>
     *         &lt;element name="TPA_Extensions" type="{http://www.escapia.com/EVRN/2007/02}TPA_Extensions_Type" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ResGuestRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" />
     *       &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}time" />
     *       &lt;attribute name="GroupEventCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="VIP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "profiles",
        "specialRequests",
        "comments",
        "serviceRPHs",
        "profileRPHs",
        "arrivalTransport",
        "departureTransport",
        "guestCounts",
        "inHouseTimeSpan",
        "tpaExtensions"
    })
    public static class ResGuest {

        @XmlElement(name = "Profiles")
        protected ArrayOfProfilesTypeProfileInfo profiles;
        @XmlElement(name = "SpecialRequests")
        protected ArrayOfSpecialRequestTypeSpecialRequest specialRequests;
        @XmlElement(name = "Comments")
        protected ArrayOfCommentTypeComment comments;
        @XmlElement(name = "ServiceRPHs")
        protected ArrayOfServiceRPHsTypeServiceRPH serviceRPHs;
        @XmlElement(name = "ProfileRPHs")
        protected ArrayOfResGuestsTypeResGuestProfileRPH profileRPHs;
        @XmlElement(name = "ArrivalTransport")
        protected TransportInfoType arrivalTransport;
        @XmlElement(name = "DepartureTransport")
        protected TransportInfoType departureTransport;
        @XmlElement(name = "GuestCounts")
        protected GuestCountType guestCounts;
        @XmlElement(name = "InHouseTimeSpan")
        protected DateTimeSpanType inHouseTimeSpan;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "ResGuestRPH")
        protected String resGuestRPH;
        @XmlAttribute(name = "AgeQualifyingCode")
        protected String ageQualifyingCode;
        @XmlAttribute(name = "ArrivalTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar arrivalTime;
        @XmlAttribute(name = "DepartureTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar departureTime;
        @XmlAttribute(name = "GroupEventCode")
        protected String groupEventCode;
        @XmlAttribute(name = "VIP")
        protected Boolean vip;

        /**
         * Gets the value of the profiles property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfProfilesTypeProfileInfo }
         *     
         */
        public ArrayOfProfilesTypeProfileInfo getProfiles() {
            return profiles;
        }

        /**
         * Sets the value of the profiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfProfilesTypeProfileInfo }
         *     
         */
        public void setProfiles(ArrayOfProfilesTypeProfileInfo value) {
            this.profiles = value;
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
         * Gets the value of the profileRPHs property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfResGuestsTypeResGuestProfileRPH }
         *     
         */
        public ArrayOfResGuestsTypeResGuestProfileRPH getProfileRPHs() {
            return profileRPHs;
        }

        /**
         * Sets the value of the profileRPHs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfResGuestsTypeResGuestProfileRPH }
         *     
         */
        public void setProfileRPHs(ArrayOfResGuestsTypeResGuestProfileRPH value) {
            this.profileRPHs = value;
        }

        /**
         * Gets the value of the arrivalTransport property.
         * 
         * @return
         *     possible object is
         *     {@link TransportInfoType }
         *     
         */
        public TransportInfoType getArrivalTransport() {
            return arrivalTransport;
        }

        /**
         * Sets the value of the arrivalTransport property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransportInfoType }
         *     
         */
        public void setArrivalTransport(TransportInfoType value) {
            this.arrivalTransport = value;
        }

        /**
         * Gets the value of the departureTransport property.
         * 
         * @return
         *     possible object is
         *     {@link TransportInfoType }
         *     
         */
        public TransportInfoType getDepartureTransport() {
            return departureTransport;
        }

        /**
         * Sets the value of the departureTransport property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransportInfoType }
         *     
         */
        public void setDepartureTransport(TransportInfoType value) {
            this.departureTransport = value;
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
         * Gets the value of the inHouseTimeSpan property.
         * 
         * @return
         *     possible object is
         *     {@link DateTimeSpanType }
         *     
         */
        public DateTimeSpanType getInHouseTimeSpan() {
            return inHouseTimeSpan;
        }

        /**
         * Sets the value of the inHouseTimeSpan property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimeSpanType }
         *     
         */
        public void setInHouseTimeSpan(DateTimeSpanType value) {
            this.inHouseTimeSpan = value;
        }

        /**
         * Gets the value of the tpaExtensions property.
         * 
         * @return
         *     possible object is
         *     {@link TPAExtensionsType }
         *     
         */
        public TPAExtensionsType getTPAExtensions() {
            return tpaExtensions;
        }

        /**
         * Sets the value of the tpaExtensions property.
         * 
         * @param value
         *     allowed object is
         *     {@link TPAExtensionsType }
         *     
         */
        public void setTPAExtensions(TPAExtensionsType value) {
            this.tpaExtensions = value;
        }

        /**
         * Gets the value of the resGuestRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResGuestRPH() {
            return resGuestRPH;
        }

        /**
         * Sets the value of the resGuestRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResGuestRPH(String value) {
            this.resGuestRPH = value;
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
         * Gets the value of the arrivalTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getArrivalTime() {
            return arrivalTime;
        }

        /**
         * Sets the value of the arrivalTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setArrivalTime(XMLGregorianCalendar value) {
            this.arrivalTime = value;
        }

        /**
         * Gets the value of the departureTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDepartureTime() {
            return departureTime;
        }

        /**
         * Sets the value of the departureTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDepartureTime(XMLGregorianCalendar value) {
            this.departureTime = value;
        }

        /**
         * Gets the value of the groupEventCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupEventCode() {
            return groupEventCode;
        }

        /**
         * Sets the value of the groupEventCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupEventCode(String value) {
            this.groupEventCode = value;
        }

        /**
         * Gets the value of the vip property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVIP() {
            return vip;
        }

        /**
         * Sets the value of the vip property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVIP(Boolean value) {
            this.vip = value;
        }

    }

}
