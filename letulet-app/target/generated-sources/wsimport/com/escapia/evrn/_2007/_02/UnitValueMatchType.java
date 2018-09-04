
package com.escapia.evrn._2007._02;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitValueMatchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitValueMatchType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}BasicUnitInfoType">
 *       &lt;sequence>
 *         &lt;element name="RateRange" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
 *                 &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="RateInfoNotAvailableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="CommissionPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="MinCommissionPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="MaxCommissionPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LastMinuteDiscountRange" type="{http://www.escapia.com/EVRN/2007/02}LastMinuteDiscountRangeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SameCountryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AvailabilityStatus" type="{http://www.escapia.com/EVRN/2007/02}RateIndicatorType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitValueMatchType", propOrder = {
    "rateRange",
    "lastMinuteDiscountRange"
})
public class UnitValueMatchType
    extends BasicUnitInfoType
{

    @XmlElement(name = "RateRange")
    protected UnitValueMatchType.RateRange rateRange;
    @XmlElement(name = "LastMinuteDiscountRange")
    protected LastMinuteDiscountRangeType lastMinuteDiscountRange;
    @XmlAttribute(name = "MoreDataEchoToken")
    protected String moreDataEchoToken;
    @XmlAttribute(name = "SameCountryInd")
    protected Boolean sameCountryInd;
    @XmlAttribute(name = "AvailabilityStatus")
    protected RateIndicatorType availabilityStatus;

    /**
     * Gets the value of the rateRange property.
     * 
     * @return
     *     possible object is
     *     {@link UnitValueMatchType.RateRange }
     *     
     */
    public UnitValueMatchType.RateRange getRateRange() {
        return rateRange;
    }

    /**
     * Sets the value of the rateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitValueMatchType.RateRange }
     *     
     */
    public void setRateRange(UnitValueMatchType.RateRange value) {
        this.rateRange = value;
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
     * Gets the value of the moreDataEchoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreDataEchoToken() {
        return moreDataEchoToken;
    }

    /**
     * Sets the value of the moreDataEchoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreDataEchoToken(String value) {
        this.moreDataEchoToken = value;
    }

    /**
     * Gets the value of the sameCountryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSameCountryInd() {
        return sameCountryInd;
    }

    /**
     * Sets the value of the sameCountryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSameCountryInd(Boolean value) {
        this.sameCountryInd = value;
    }

    /**
     * Gets the value of the availabilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RateIndicatorType }
     *     
     */
    public RateIndicatorType getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * Sets the value of the availabilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateIndicatorType }
     *     
     */
    public void setAvailabilityStatus(RateIndicatorType value) {
        this.availabilityStatus = value;
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
     *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="RateInfoNotAvailableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="CommissionPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="MinCommissionPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="MaxCommissionPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
        @XmlAttribute(name = "InfoSource")
        protected String infoSource;
        @XmlAttribute(name = "TaxRate")
        protected BigDecimal taxRate;
        @XmlAttribute(name = "RateInfoNotAvailableInd")
        protected Boolean rateInfoNotAvailableInd;
        @XmlAttribute(name = "CommissionPercent")
        protected BigDecimal commissionPercent;
        @XmlAttribute(name = "MinCommissionPercent")
        protected BigDecimal minCommissionPercent;
        @XmlAttribute(name = "MaxCommissionPercent")
        protected BigDecimal maxCommissionPercent;

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
         * Gets the value of the taxRate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTaxRate() {
            return taxRate;
        }

        /**
         * Sets the value of the taxRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTaxRate(BigDecimal value) {
            this.taxRate = value;
        }

        /**
         * Gets the value of the rateInfoNotAvailableInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRateInfoNotAvailableInd() {
            return rateInfoNotAvailableInd;
        }

        /**
         * Sets the value of the rateInfoNotAvailableInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRateInfoNotAvailableInd(Boolean value) {
            this.rateInfoNotAvailableInd = value;
        }

        /**
         * Gets the value of the commissionPercent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCommissionPercent() {
            return commissionPercent;
        }

        /**
         * Sets the value of the commissionPercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCommissionPercent(BigDecimal value) {
            this.commissionPercent = value;
        }

        /**
         * Gets the value of the minCommissionPercent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMinCommissionPercent() {
            return minCommissionPercent;
        }

        /**
         * Sets the value of the minCommissionPercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMinCommissionPercent(BigDecimal value) {
            this.minCommissionPercent = value;
        }

        /**
         * Gets the value of the maxCommissionPercent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxCommissionPercent() {
            return maxCommissionPercent;
        }

        /**
         * Sets the value of the maxCommissionPercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxCommissionPercent(BigDecimal value) {
            this.maxCommissionPercent = value;
        }

    }

}
