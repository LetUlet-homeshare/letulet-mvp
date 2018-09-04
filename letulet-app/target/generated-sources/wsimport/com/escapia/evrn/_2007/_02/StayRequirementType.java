
package com.escapia.evrn._2007._02;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StayRequirementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StayRequirementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.escapia.com/EVRN/2007/02}ParagraphType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="StayContext">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Checkin"/>
 *             &lt;enumeration value="Checkout"/>
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
@XmlType(name = "StayRequirementType", propOrder = {
    "description"
})
public class StayRequirementType {

    @XmlElement(name = "Description")
    protected ParagraphType description;
    @XmlAttribute(name = "Mon")
    protected Boolean mon;
    @XmlAttribute(name = "Tue")
    protected Boolean tue;
    @XmlAttribute(name = "Weds")
    protected Boolean weds;
    @XmlAttribute(name = "Thur")
    protected Boolean thur;
    @XmlAttribute(name = "Fri")
    protected Boolean fri;
    @XmlAttribute(name = "Sat")
    protected Boolean sat;
    @XmlAttribute(name = "Sun")
    protected Boolean sun;
    @XmlAttribute(name = "MinLOS")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minLOS;
    @XmlAttribute(name = "MaxLOS")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxLOS;
    @XmlAttribute(name = "StayContext")
    protected String stayContext;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setDescription(ParagraphType value) {
        this.description = value;
    }

    /**
     * Gets the value of the mon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMon() {
        return mon;
    }

    /**
     * Sets the value of the mon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMon(Boolean value) {
        this.mon = value;
    }

    /**
     * Gets the value of the tue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTue() {
        return tue;
    }

    /**
     * Sets the value of the tue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTue(Boolean value) {
        this.tue = value;
    }

    /**
     * Gets the value of the weds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeds() {
        return weds;
    }

    /**
     * Sets the value of the weds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeds(Boolean value) {
        this.weds = value;
    }

    /**
     * Gets the value of the thur property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThur() {
        return thur;
    }

    /**
     * Sets the value of the thur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThur(Boolean value) {
        this.thur = value;
    }

    /**
     * Gets the value of the fri property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFri() {
        return fri;
    }

    /**
     * Sets the value of the fri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFri(Boolean value) {
        this.fri = value;
    }

    /**
     * Gets the value of the sat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSat() {
        return sat;
    }

    /**
     * Sets the value of the sat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSat(Boolean value) {
        this.sat = value;
    }

    /**
     * Gets the value of the sun property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSun() {
        return sun;
    }

    /**
     * Sets the value of the sun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSun(Boolean value) {
        this.sun = value;
    }

    /**
     * Gets the value of the minLOS property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinLOS() {
        return minLOS;
    }

    /**
     * Sets the value of the minLOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinLOS(BigInteger value) {
        this.minLOS = value;
    }

    /**
     * Gets the value of the maxLOS property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxLOS() {
        return maxLOS;
    }

    /**
     * Sets the value of the maxLOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxLOS(BigInteger value) {
        this.maxLOS = value;
    }

    /**
     * Gets the value of the stayContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStayContext() {
        return stayContext;
    }

    /**
     * Sets the value of the stayContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStayContext(String value) {
        this.stayContext = value;
    }

}
