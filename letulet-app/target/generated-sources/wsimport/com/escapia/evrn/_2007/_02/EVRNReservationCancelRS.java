
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}EVRN_BaseRSType">
 *       &lt;sequence>
 *         &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationStatusTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Warnings" type="{http://www.escapia.com/EVRN/2007/02}WarningsType" minOccurs="0"/>
 *           &lt;element name="Success" type="{http://www.escapia.com/EVRN/2007/02}SuccessType" minOccurs="0"/>
 *           &lt;element name="Errors" type="{http://www.escapia.com/EVRN/2007/02}ErrorsType" minOccurs="0"/>
 *           &lt;element name="TPA_Extensions" type="{http://www.escapia.com/EVRN/2007/02}TPA_Extensions_Type" minOccurs="0"/>
 *         &lt;/choice>
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
    "reservationID",
    "reservationStatusTypes",
    "message",
    "warningsOrSuccessOrErrors"
})
@XmlRootElement(name = "EVRN_ReservationCancelRS")
public class EVRNReservationCancelRS
    extends EVRNBaseRSType
{

    @XmlElement(name = "ReservationID")
    protected String reservationID;
    @XmlElement(name = "ReservationStatusTypes")
    protected String reservationStatusTypes;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElements({
        @XmlElement(name = "Warnings", type = WarningsType.class),
        @XmlElement(name = "Success", type = SuccessType.class),
        @XmlElement(name = "Errors", type = ErrorsType.class),
        @XmlElement(name = "TPA_Extensions", type = TPAExtensionsType.class)
    })
    protected List<Object> warningsOrSuccessOrErrors;

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
     * Gets the value of the reservationStatusTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationStatusTypes() {
        return reservationStatusTypes;
    }

    /**
     * Sets the value of the reservationStatusTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationStatusTypes(String value) {
        this.reservationStatusTypes = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the warningsOrSuccessOrErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningsOrSuccessOrErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningsOrSuccessOrErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningsType }
     * {@link SuccessType }
     * {@link ErrorsType }
     * {@link TPAExtensionsType }
     * 
     * 
     */
    public List<Object> getWarningsOrSuccessOrErrors() {
        if (warningsOrSuccessOrErrors == null) {
            warningsOrSuccessOrErrors = new ArrayList<Object>();
        }
        return this.warningsOrSuccessOrErrors;
    }

}
