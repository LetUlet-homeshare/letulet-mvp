
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaDescription" type="{http://www.escapia.com/EVRN/2007/02}ParagraphType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AreaID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="City" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StateProv" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StateProvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaType", propOrder = {
    "areaDescription"
})
@XmlSeeAlso({
    SearchAreaType.class
})
public class AreaType {

    @XmlElement(name = "AreaDescription")
    protected ParagraphType areaDescription;
    @XmlAttribute(name = "AreaID")
    protected String areaID;
    @XmlAttribute(name = "City")
    protected String city;
    @XmlAttribute(name = "CityCode")
    protected String cityCode;
    @XmlAttribute(name = "StateProv")
    protected String stateProv;
    @XmlAttribute(name = "StateProvCode")
    protected String stateProvCode;
    @XmlAttribute(name = "CountryCode")
    protected String countryCode;

    /**
     * Gets the value of the areaDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getAreaDescription() {
        return areaDescription;
    }

    /**
     * Sets the value of the areaDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setAreaDescription(ParagraphType value) {
        this.areaDescription = value;
    }

    /**
     * Gets the value of the areaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaID() {
        return areaID;
    }

    /**
     * Sets the value of the areaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaID(String value) {
        this.areaID = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the stateProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProv() {
        return stateProv;
    }

    /**
     * Sets the value of the stateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProv(String value) {
        this.stateProv = value;
    }

    /**
     * Gets the value of the stateProvCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvCode() {
        return stateProvCode;
    }

    /**
     * Sets the value of the stateProvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvCode(String value) {
        this.stateProvCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

}
