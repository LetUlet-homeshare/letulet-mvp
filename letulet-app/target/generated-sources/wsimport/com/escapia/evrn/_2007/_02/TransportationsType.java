
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transportations" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfTransportationTypeTransportation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportationsType", propOrder = {
    "transportations"
})
@XmlSeeAlso({
    RelativePositionType.class
})
public class TransportationsType {

    @XmlElement(name = "Transportations")
    protected ArrayOfTransportationTypeTransportation transportations;

    /**
     * Gets the value of the transportations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransportationTypeTransportation }
     *     
     */
    public ArrayOfTransportationTypeTransportation getTransportations() {
        return transportations;
    }

    /**
     * Sets the value of the transportations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransportationTypeTransportation }
     *     
     */
    public void setTransportations(ArrayOfTransportationTypeTransportation value) {
        this.transportations = value;
    }

}
