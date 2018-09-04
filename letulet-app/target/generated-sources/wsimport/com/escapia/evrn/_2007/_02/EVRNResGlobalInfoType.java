
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EVRN_ResGlobalInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EVRN_ResGlobalInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}ResCommonDetailType">
 *       &lt;sequence>
 *         &lt;element name="UnitReservationIDs" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfUnitReservationIDsTypeUnitReservationID" minOccurs="0"/>
 *         &lt;element name="RoutingHops" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfRoutingHopTypeRoutingHop" minOccurs="0"/>
 *         &lt;element name="Profiles" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfProfilesTypeProfileInfo" minOccurs="0"/>
 *         &lt;element name="ServiceFee" type="{http://www.escapia.com/EVRN/2007/02}ServiceFeeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EVRN_ResGlobalInfoType", propOrder = {
    "unitReservationIDs",
    "routingHops",
    "profiles",
    "serviceFee"
})
public class EVRNResGlobalInfoType
    extends ResCommonDetailType
{

    @XmlElement(name = "UnitReservationIDs")
    protected ArrayOfUnitReservationIDsTypeUnitReservationID unitReservationIDs;
    @XmlElement(name = "RoutingHops")
    protected ArrayOfRoutingHopTypeRoutingHop routingHops;
    @XmlElement(name = "Profiles")
    protected ArrayOfProfilesTypeProfileInfo profiles;
    @XmlElement(name = "ServiceFee")
    protected ServiceFeeType serviceFee;

    /**
     * Gets the value of the unitReservationIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnitReservationIDsTypeUnitReservationID }
     *     
     */
    public ArrayOfUnitReservationIDsTypeUnitReservationID getUnitReservationIDs() {
        return unitReservationIDs;
    }

    /**
     * Sets the value of the unitReservationIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnitReservationIDsTypeUnitReservationID }
     *     
     */
    public void setUnitReservationIDs(ArrayOfUnitReservationIDsTypeUnitReservationID value) {
        this.unitReservationIDs = value;
    }

    /**
     * Gets the value of the routingHops property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoutingHopTypeRoutingHop }
     *     
     */
    public ArrayOfRoutingHopTypeRoutingHop getRoutingHops() {
        return routingHops;
    }

    /**
     * Sets the value of the routingHops property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoutingHopTypeRoutingHop }
     *     
     */
    public void setRoutingHops(ArrayOfRoutingHopTypeRoutingHop value) {
        this.routingHops = value;
    }

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
     * Gets the value of the serviceFee property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeeType }
     *     
     */
    public ServiceFeeType getServiceFee() {
        return serviceFee;
    }

    /**
     * Sets the value of the serviceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeeType }
     *     
     */
    public void setServiceFee(ServiceFeeType value) {
        this.serviceFee = value;
    }

}
