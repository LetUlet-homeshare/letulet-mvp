
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "unitCode",
    "agentID",
    "reservationID",
    "reservationNumber"
})
@XmlRootElement(name = "EVRN_ReservationCancelRQ")
public class EVRNReservationCancelRQ
    extends EVRNBaseRQType
{

    @XmlElement(name = "UnitCode")
    protected String unitCode;
    @XmlElement(name = "AgentID")
    protected String agentID;
    @XmlElement(name = "ReservationID")
    protected String reservationID;
    @XmlElement(name = "ReservationNumber")
    protected String reservationNumber;

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
     * Gets the value of the agentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentID() {
        return agentID;
    }

    /**
     * Sets the value of the agentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentID(String value) {
        this.agentID = value;
    }

    /**
     * Gets the value of the reservationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationID() {
        return reservationID;
    }

    /**
     * Sets the value of the reservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationID(String value) {
        this.reservationID = value;
    }

    /**
     * Gets the value of the reservationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationNumber() {
        return reservationNumber;
    }

    /**
     * Sets the value of the reservationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationNumber(String value) {
        this.reservationNumber = value;
    }

}
