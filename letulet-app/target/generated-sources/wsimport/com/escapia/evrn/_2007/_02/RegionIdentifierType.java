
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegionIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="RegionCode" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="RegionName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RegionFriendlyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionIdentifierType")
@XmlSeeAlso({
    RegionType.class
})
public class RegionIdentifierType {

    @XmlAttribute(name = "RegionCode")
    protected Integer regionCode;
    @XmlAttribute(name = "RegionName")
    protected String regionName;
    @XmlAttribute(name = "RegionFriendlyName")
    protected String regionFriendlyName;

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegionCode(Integer value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the regionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the value of the regionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

    /**
     * Gets the value of the regionFriendlyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionFriendlyName() {
        return regionFriendlyName;
    }

    /**
     * Sets the value of the regionFriendlyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionFriendlyName(String value) {
        this.regionFriendlyName = value;
    }

}
