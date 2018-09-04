
package com.escapia.evrn._2007._02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitSearchCriterionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitSearchCriterionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}ItemSearchCriterionType">
 *       &lt;sequence>
 *         &lt;element name="UnitAmenity" type="{http://www.escapia.com/EVRN/2007/02}UnitAmenityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StayDateRange" type="{http://www.escapia.com/EVRN/2007/02}DateTimeSpanType" minOccurs="0"/>
 *         &lt;element name="RateRange" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RateType" type="{http://www.escapia.com/EVRN/2007/02}RateTypeType" />
 *                 &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="FullRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="RateTimeUnit" type="{http://www.escapia.com/EVRN/2007/02}TimeUnitType" />
 *                 &lt;attribute name="MinRent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="MaxRent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="FixedRent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="FullRent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="MinFees" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="MaxFees" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="FixedFees" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="FullFees" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="MinTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="MaxTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="FixedTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="FullTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UnitStayCandidate" type="{http://www.escapia.com/EVRN/2007/02}UnitStayCandidateType" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.escapia.com/EVRN/2007/02}TPA_Extensions_Type" minOccurs="0"/>
 *         &lt;element name="LastMinuteDiscountRange" type="{http://www.escapia.com/EVRN/2007/02}LastMinuteDiscountRangeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitSearchCriterionType", propOrder = {
    "unitAmenity",
    "stayDateRange",
    "rateRange",
    "unitStayCandidate",
    "tpaExtensions",
    "lastMinuteDiscountRange"
})
public class UnitSearchCriterionType
    extends ItemSearchCriterionType
{

    @XmlElement(name = "UnitAmenity")
    protected List<UnitAmenityType> unitAmenity;
    @XmlElement(name = "StayDateRange")
    protected DateTimeSpanType stayDateRange;
    @XmlElement(name = "RateRange")
    protected UnitSearchCriterionType.RateRange rateRange;
    @XmlElement(name = "UnitStayCandidate")
    protected UnitStayCandidateType unitStayCandidate;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlElement(name = "LastMinuteDiscountRange")
    protected LastMinuteDiscountRangeType lastMinuteDiscountRange;

    /**
     * Gets the value of the unitAmenity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitAmenity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitAmenity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitAmenityType }
     * 
     * 
     */
    public List<UnitAmenityType> getUnitAmenity() {
        if (unitAmenity == null) {
            unitAmenity = new ArrayList<UnitAmenityType>();
        }
        return this.unitAmenity;
    }

    /**
     * Gets the value of the stayDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType }
     *     
     */
    public DateTimeSpanType getStayDateRange() {
        return stayDateRange;
    }

    /**
     * Sets the value of the stayDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType }
     *     
     */
    public void setStayDateRange(DateTimeSpanType value) {
        this.stayDateRange = value;
    }

    /**
     * Gets the value of the rateRange property.
     * 
     * @return
     *     possible object is
     *     {@link UnitSearchCriterionType.RateRange }
     *     
     */
    public UnitSearchCriterionType.RateRange getRateRange() {
        return rateRange;
    }

    /**
     * Sets the value of the rateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitSearchCriterionType.RateRange }
     *     
     */
    public void setRateRange(UnitSearchCriterionType.RateRange value) {
        this.rateRange = value;
    }

    /**
     * Gets the value of the unitStayCandidate property.
     * 
     * @return
     *     possible object is
     *     {@link UnitStayCandidateType }
     *     
     */
    public UnitStayCandidateType getUnitStayCandidate() {
        return unitStayCandidate;
    }

    /**
     * Sets the value of the unitStayCandidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitStayCandidateType }
     *     
     */
    public void setUnitStayCandidate(UnitStayCandidateType value) {
        this.unitStayCandidate = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the lastMinuteDiscountRange property.
     * 
     * @return
     *     possible object is
     *     {@link LastMinuteDiscountRangeType }
     *     
     */
    public LastMinuteDiscountRangeType getLastMinuteDiscountRange() {
        return lastMinuteDiscountRange;
    }

    /**
     * Sets the value of the lastMinuteDiscountRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastMinuteDiscountRangeType }
     *     
     */
    public void setLastMinuteDiscountRange(LastMinuteDiscountRangeType value) {
        this.lastMinuteDiscountRange = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RateRange {

        @XmlAttribute(name = "RoomStayCandidateRPH")
        protected String roomStayCandidateRPH;
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

        /**
         * Gets the value of the roomStayCandidateRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomStayCandidateRPH() {
            return roomStayCandidateRPH;
        }

        /**
         * Sets the value of the roomStayCandidateRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomStayCandidateRPH(String value) {
            this.roomStayCandidateRPH = value;
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

    }

}
