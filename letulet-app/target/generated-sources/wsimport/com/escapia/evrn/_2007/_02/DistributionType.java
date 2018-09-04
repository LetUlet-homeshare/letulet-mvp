
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Settings" type="{http://www.escapia.com/EVRN/2007/02}SettingsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionType", propOrder = {
    "settings"
})
public class DistributionType {

    @XmlElement(name = "Settings")
    protected SettingsType settings;

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link SettingsType }
     *     
     */
    public SettingsType getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettingsType }
     *     
     */
    public void setSettings(SettingsType value) {
        this.settings = value;
    }

}
