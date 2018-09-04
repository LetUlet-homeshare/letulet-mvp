
package com.escapia.evrn._2007._02;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StayRequirement" type="{http://www.escapia.com/EVRN/2007/02}StayRequirementType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Release" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RateType" type="{http://www.escapia.com/EVRN/2007/02}RateTypeType" />
 *       &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="FullRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="RateTimeUnit" type="{http://www.escapia.com/EVRN/2007/02}TimeUnitType" />
 *       &lt;attribute name="MinRent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="MaxRent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="FixedRent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="FullRent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="MinFees" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="MaxFees" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="FixedFees" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="FullFees" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="MinTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="MaxTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="FixedTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="FullTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="SeasonName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateRangeType", propOrder = {
    "stayRequirement"
})
public class RateRangeType {

    @XmlElement(name = "StayRequirement")
    protected StayRequirementType stayRequirement;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "Release")
    protected String release;
    @XmlAttribute(name = "RateType")
    protected RateTypeType rateType;
    @XmlAttribute(name = "MinRate")
    protected BigDecimal minRate;
    @XmlAttribute(name = "MaxRate")
    protected BigDecimal maxRate;
    @XmlAttribute(name = "FixedRate")
    protected BigDecimal fixedRate;
    @XmlAttribute(name = "FullRate")
    protected BigDecimal fullRate;
    @XmlAttribute(name = "RateTimeUnit")
    protected TimeUnitType rateTimeUnit;
    @XmlAttribute(name = "MinRent")
    protected BigDecimal minRent;
    @XmlAttribute(name = "MaxRent")
    protected BigDecimal maxRent;
    @XmlAttribute(name = "FixedRent")
    protected BigDecimal fixedRent;
    @XmlAttribute(name = "FullRent")
    protected BigDecimal fullRent;
    @XmlAttribute(name = "MinFees")
    protected BigDecimal minFees;
    @XmlAttribute(name = "MaxFees")
    protected BigDecimal maxFees;
    @XmlAttribute(name = "FixedFees")
    protected BigDecimal fixedFees;
    @XmlAttribute(name = "FullFees")
    protected BigDecimal fullFees;
    @XmlAttribute(name = "MinTax")
    protected BigDecimal minTax;
    @XmlAttribute(name = "MaxTax")
    protected BigDecimal maxTax;
    @XmlAttribute(name = "FixedTax")
    protected BigDecimal fixedTax;
    @XmlAttribute(name = "FullTax")
    protected BigDecimal fullTax;
    @XmlAttribute(name = "SeasonName")
    protected String seasonName;

    /**
     * Gets the value of the stayRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link StayRequirementType }
     *     
     */
    public StayRequirementType getStayRequirement() {
        return stayRequirement;
    }

    /**
     * Sets the value of the stayRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link StayRequirementType }
     *     
     */
    public void setStayRequirement(StayRequirementType value) {
        this.stayRequirement = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelease() {
        return release;
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelease(String value) {
        this.release = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeType }
     *     
     */
    public RateTypeType getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeType }
     *     
     */
    public void setRateType(RateTypeType value) {
        this.rateType = value;
    }

    /**
     * Gets the value of the minRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinRate() {
        return minRate;
    }

    /**
     * Sets the value of the minRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinRate(BigDecimal value) {
        this.minRate = value;
    }

    /**
     * Gets the value of the maxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxRate() {
        return maxRate;
    }

    /**
     * Sets the value of the maxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxRate(BigDecimal value) {
        this.maxRate = value;
    }

    /**
     * Gets the value of the fixedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedRate() {
        return fixedRate;
    }

    /**
     * Sets the value of the fixedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedRate(BigDecimal value) {
        this.fixedRate = value;
    }

    /**
     * Gets the value of the fullRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFullRate() {
        return fullRate;
    }

    /**
     * Sets the value of the fullRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFullRate(BigDecimal value) {
        this.fullRate = value;
    }

    /**
     * Gets the value of the rateTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnitType }
     *     
     */
    public TimeUnitType getRateTimeUnit() {
        return rateTimeUnit;
    }

    /**
     * Sets the value of the rateTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnitType }
     *     
     */
    public void setRateTimeUnit(TimeUnitType value) {
        this.rateTimeUnit = value;
    }

    /**
     * Gets the value of the minRent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinRent() {
        return minRent;
    }

    /**
     * Sets the value of the minRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinRent(BigDecimal value) {
        this.minRent = value;
    }

    /**
     * Gets the value of the maxRent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxRent() {
        return maxRent;
    }

    /**
     * Sets the value of the maxRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxRent(BigDecimal value) {
        this.maxRent = value;
    }

    /**
     * Gets the value of the fixedRent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedRent() {
        return fixedRent;
    }

    /**
     * Sets the value of the fixedRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedRent(BigDecimal value) {
        this.fixedRent = value;
    }

    /**
     * Gets the value of the fullRent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFullRent() {
        return fullRent;
    }

    /**
     * Sets the value of the fullRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFullRent(BigDecimal value) {
        this.fullRent = value;
    }

    /**
     * Gets the value of the minFees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinFees() {
        return minFees;
    }

    /**
     * Sets the value of the minFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinFees(BigDecimal value) {
        this.minFees = value;
    }

    /**
     * Gets the value of the maxFees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxFees() {
        return maxFees;
    }

    /**
     * Sets the value of the maxFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxFees(BigDecimal value) {
        this.maxFees = value;
    }

    /**
     * Gets the value of the fixedFees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedFees() {
        return fixedFees;
    }

    /**
     * Sets the value of the fixedFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedFees(BigDecimal value) {
        this.fixedFees = value;
    }

    /**
     * Gets the value of the fullFees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFullFees() {
        return fullFees;
    }

    /**
     * Sets the value of the fullFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFullFees(BigDecimal value) {
        this.fullFees = value;
    }

    /**
     * Gets the value of the minTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinTax() {
        return minTax;
    }

    /**
     * Sets the value of the minTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinTax(BigDecimal value) {
        this.minTax = value;
    }

    /**
     * Gets the value of the maxTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxTax() {
        return maxTax;
    }

    /**
     * Sets the value of the maxTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxTax(BigDecimal value) {
        this.maxTax = value;
    }

    /**
     * Gets the value of the fixedTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedTax() {
        return fixedTax;
    }

    /**
     * Sets the value of the fixedTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedTax(BigDecimal value) {
        this.fixedTax = value;
    }

    /**
     * Gets the value of the fullTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFullTax() {
        return fullTax;
    }

    /**
     * Sets the value of the fullTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFullTax(BigDecimal value) {
        this.fullTax = value;
    }

    /**
     * Gets the value of the seasonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasonName() {
        return seasonName;
    }

    /**
     * Sets the value of the seasonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasonName(String value) {
        this.seasonName = value;
    }

}
