
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrefCollection" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CommonPref" type="{http://www.escapia.com/EVRN/2007/02}CommonPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="VehicleRentalPref" type="{http://www.escapia.com/EVRN/2007/02}VehicleProfileRentalPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="AirlinePref" type="{http://www.escapia.com/EVRN/2007/02}AirlinePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="HotelPref" type="{http://www.escapia.com/EVRN/2007/02}HotelPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="OtherSrvcPref" type="{http://www.escapia.com/EVRN/2007/02}OtherSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="TPA_Extensions" type="{http://www.escapia.com/EVRN/2007/02}TPA_Extensions_Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ShareSynchInd">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Yes"/>
 *                       &lt;enumeration value="No"/>
 *                       &lt;enumeration value="Inherit"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ShareMarketInd">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Yes"/>
 *                       &lt;enumeration value="No"/>
 *                       &lt;enumeration value="Inherit"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="TravelPurpose" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ShareMarketInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
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
@XmlType(name = "PreferencesType", propOrder = {
    "prefCollection"
})
public class PreferencesType {

    @XmlElement(name = "PrefCollection")
    protected List<PreferencesType.PrefCollection> prefCollection;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;

    /**
     * Gets the value of the prefCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreferencesType.PrefCollection }
     * 
     * 
     */
    public List<PreferencesType.PrefCollection> getPrefCollection() {
        if (prefCollection == null) {
            prefCollection = new ArrayList<PreferencesType.PrefCollection>();
        }
        return this.prefCollection;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
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
     *         &lt;element name="CommonPref" type="{http://www.escapia.com/EVRN/2007/02}CommonPrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="VehicleRentalPref" type="{http://www.escapia.com/EVRN/2007/02}VehicleProfileRentalPrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="AirlinePref" type="{http://www.escapia.com/EVRN/2007/02}AirlinePrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="HotelPref" type="{http://www.escapia.com/EVRN/2007/02}HotelPrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="OtherSrvcPref" type="{http://www.escapia.com/EVRN/2007/02}OtherSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="TPA_Extensions" type="{http://www.escapia.com/EVRN/2007/02}TPA_Extensions_Type" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ShareSynchInd">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Yes"/>
     *             &lt;enumeration value="No"/>
     *             &lt;enumeration value="Inherit"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ShareMarketInd">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Yes"/>
     *             &lt;enumeration value="No"/>
     *             &lt;enumeration value="Inherit"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="TravelPurpose" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "commonPref",
        "vehicleRentalPref",
        "airlinePref",
        "hotelPref",
        "otherSrvcPref",
        "tpaExtensions"
    })
    public static class PrefCollection {

        @XmlElement(name = "CommonPref")
        protected List<CommonPrefType> commonPref;
        @XmlElement(name = "VehicleRentalPref")
        protected List<VehicleProfileRentalPrefType> vehicleRentalPref;
        @XmlElement(name = "AirlinePref")
        protected List<AirlinePrefType> airlinePref;
        @XmlElement(name = "HotelPref")
        protected List<HotelPrefType> hotelPref;
        @XmlElement(name = "OtherSrvcPref")
        protected List<OtherSrvcPrefType> otherSrvcPref;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "ShareSynchInd")
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        protected String shareMarketInd;
        @XmlAttribute(name = "TravelPurpose")
        protected String travelPurpose;

        /**
         * Gets the value of the commonPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commonPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCommonPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CommonPrefType }
         * 
         * 
         */
        public List<CommonPrefType> getCommonPref() {
            if (commonPref == null) {
                commonPref = new ArrayList<CommonPrefType>();
            }
            return this.commonPref;
        }

        /**
         * Gets the value of the vehicleRentalPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleRentalPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleRentalPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleProfileRentalPrefType }
         * 
         * 
         */
        public List<VehicleProfileRentalPrefType> getVehicleRentalPref() {
            if (vehicleRentalPref == null) {
                vehicleRentalPref = new ArrayList<VehicleProfileRentalPrefType>();
            }
            return this.vehicleRentalPref;
        }

        /**
         * Gets the value of the airlinePref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlinePref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlinePref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirlinePrefType }
         * 
         * 
         */
        public List<AirlinePrefType> getAirlinePref() {
            if (airlinePref == null) {
                airlinePref = new ArrayList<AirlinePrefType>();
            }
            return this.airlinePref;
        }

        /**
         * Gets the value of the hotelPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotelPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotelPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelPrefType }
         * 
         * 
         */
        public List<HotelPrefType> getHotelPref() {
            if (hotelPref == null) {
                hotelPref = new ArrayList<HotelPrefType>();
            }
            return this.hotelPref;
        }

        /**
         * Gets the value of the otherSrvcPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherSrvcPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherSrvcPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OtherSrvcPrefType }
         * 
         * 
         */
        public List<OtherSrvcPrefType> getOtherSrvcPref() {
            if (otherSrvcPref == null) {
                otherSrvcPref = new ArrayList<OtherSrvcPrefType>();
            }
            return this.otherSrvcPref;
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
         * Gets the value of the shareSynchInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareSynchInd() {
            return shareSynchInd;
        }

        /**
         * Sets the value of the shareSynchInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareSynchInd(String value) {
            this.shareSynchInd = value;
        }

        /**
         * Gets the value of the shareMarketInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareMarketInd() {
            return shareMarketInd;
        }

        /**
         * Sets the value of the shareMarketInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareMarketInd(String value) {
            this.shareMarketInd = value;
        }

        /**
         * Gets the value of the travelPurpose property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelPurpose() {
            return travelPurpose;
        }

        /**
         * Sets the value of the travelPurpose property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelPurpose(String value) {
            this.travelPurpose = value;
        }

    }

}
