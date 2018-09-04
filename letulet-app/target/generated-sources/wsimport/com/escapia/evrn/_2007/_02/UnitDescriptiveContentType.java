
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitDescriptiveContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitDescriptiveContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitInfo" type="{http://www.escapia.com/EVRN/2007/02}UnitInfoType" minOccurs="0"/>
 *         &lt;element name="Policies" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfEVRN_PoliciesTypePolicy" minOccurs="0"/>
 *         &lt;element name="UnitReviews" type="{http://www.escapia.com/EVRN/2007/02}UnitReviewsType" minOccurs="0"/>
 *         &lt;element name="Promotions" type="{http://www.escapia.com/EVRN/2007/02}PromotionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PropertyManagerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnitName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InternalUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnitHeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PropertyURL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitDescriptiveContentType", propOrder = {
    "unitInfo",
    "policies",
    "unitReviews",
    "promotions"
})
public class UnitDescriptiveContentType {

    @XmlElement(name = "UnitInfo")
    protected UnitInfoType unitInfo;
    @XmlElement(name = "Policies")
    protected ArrayOfEVRNPoliciesTypePolicy policies;
    @XmlElement(name = "UnitReviews")
    protected UnitReviewsType unitReviews;
    @XmlElement(name = "Promotions")
    protected PromotionsType promotions;
    @XmlAttribute(name = "PropertyManagerCode")
    protected String propertyManagerCode;
    @XmlAttribute(name = "UnitCode")
    protected String unitCode;
    @XmlAttribute(name = "UnitName")
    protected String unitName;
    @XmlAttribute(name = "InfoSource")
    protected String infoSource;
    @XmlAttribute(name = "InternalUnitCode")
    protected String internalUnitCode;
    @XmlAttribute(name = "UnitHeadline")
    protected String unitHeadline;
    @XmlAttribute(name = "PropertyURL")
    protected String propertyURL;

    /**
     * Gets the value of the unitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UnitInfoType }
     *     
     */
    public UnitInfoType getUnitInfo() {
        return unitInfo;
    }

    /**
     * Sets the value of the unitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitInfoType }
     *     
     */
    public void setUnitInfo(UnitInfoType value) {
        this.unitInfo = value;
    }

    /**
     * Gets the value of the policies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEVRNPoliciesTypePolicy }
     *     
     */
    public ArrayOfEVRNPoliciesTypePolicy getPolicies() {
        return policies;
    }

    /**
     * Sets the value of the policies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEVRNPoliciesTypePolicy }
     *     
     */
    public void setPolicies(ArrayOfEVRNPoliciesTypePolicy value) {
        this.policies = value;
    }

    /**
     * Gets the value of the unitReviews property.
     * 
     * @return
     *     possible object is
     *     {@link UnitReviewsType }
     *     
     */
    public UnitReviewsType getUnitReviews() {
        return unitReviews;
    }

    /**
     * Sets the value of the unitReviews property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitReviewsType }
     *     
     */
    public void setUnitReviews(UnitReviewsType value) {
        this.unitReviews = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionsType }
     *     
     */
    public PromotionsType getPromotions() {
        return promotions;
    }

    /**
     * Sets the value of the promotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionsType }
     *     
     */
    public void setPromotions(PromotionsType value) {
        this.promotions = value;
    }

    /**
     * Gets the value of the propertyManagerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyManagerCode() {
        return propertyManagerCode;
    }

    /**
     * Sets the value of the propertyManagerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyManagerCode(String value) {
        this.propertyManagerCode = value;
    }

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
     * Gets the value of the unitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * Sets the value of the unitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitName(String value) {
        this.unitName = value;
    }

    /**
     * Gets the value of the infoSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoSource() {
        return infoSource;
    }

    /**
     * Sets the value of the infoSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoSource(String value) {
        this.infoSource = value;
    }

    /**
     * Gets the value of the internalUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalUnitCode() {
        return internalUnitCode;
    }

    /**
     * Sets the value of the internalUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalUnitCode(String value) {
        this.internalUnitCode = value;
    }

    /**
     * Gets the value of the unitHeadline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitHeadline() {
        return unitHeadline;
    }

    /**
     * Sets the value of the unitHeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitHeadline(String value) {
        this.unitHeadline = value;
    }

    /**
     * Gets the value of the propertyURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyURL() {
        return propertyURL;
    }

    /**
     * Sets the value of the propertyURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyURL(String value) {
        this.propertyURL = value;
    }

}
