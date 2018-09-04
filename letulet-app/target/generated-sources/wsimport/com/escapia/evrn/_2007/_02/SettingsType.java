
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShowExactLocation" type="{http://www.escapia.com/EVRN/2007/02}ShowExactLocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettingsType", propOrder = {
    "showExactLocation"
})
public class SettingsType {

    @XmlElement(name = "ShowExactLocation")
    protected ShowExactLocationType showExactLocation;

    /**
     * Gets the value of the showExactLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ShowExactLocationType }
     *     
     */
    public ShowExactLocationType getShowExactLocation() {
        return showExactLocation;
    }

    /**
     * Sets the value of the showExactLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowExactLocationType }
     *     
     */
    public void setShowExactLocation(ShowExactLocationType value) {
        this.showExactLocation = value;
    }

}
