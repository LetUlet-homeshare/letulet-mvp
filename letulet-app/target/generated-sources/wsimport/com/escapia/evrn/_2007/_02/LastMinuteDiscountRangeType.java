
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for LastMinuteDiscountRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LastMinuteDiscountRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MinAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="MaxAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="MinDiscountPercent" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="MaxDiscountPercent" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LastMinuteDiscountRangeType")
public class LastMinuteDiscountRangeType {

    @XmlAttribute(name = "MinAdvanceBookingOffset")
    protected Duration minAdvanceBookingOffset;
    @XmlAttribute(name = "MaxAdvanceBookingOffset")
    protected Duration maxAdvanceBookingOffset;
    @XmlAttribute(name = "MinDiscountPercent")
    protected Double minDiscountPercent;
    @XmlAttribute(name = "MaxDiscountPercent")
    protected Double maxDiscountPercent;

    /**
     * Gets the value of the minAdvanceBookingOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinAdvanceBookingOffset() {
        return minAdvanceBookingOffset;
    }

    /**
     * Sets the value of the minAdvanceBookingOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinAdvanceBookingOffset(Duration value) {
        this.minAdvanceBookingOffset = value;
    }

    /**
     * Gets the value of the maxAdvanceBookingOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaxAdvanceBookingOffset() {
        return maxAdvanceBookingOffset;
    }

    /**
     * Sets the value of the maxAdvanceBookingOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaxAdvanceBookingOffset(Duration value) {
        this.maxAdvanceBookingOffset = value;
    }

    /**
     * Gets the value of the minDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinDiscountPercent() {
        return minDiscountPercent;
    }

    /**
     * Sets the value of the minDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinDiscountPercent(Double value) {
        this.minDiscountPercent = value;
    }

    /**
     * Gets the value of the maxDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxDiscountPercent() {
        return maxDiscountPercent;
    }

    /**
     * Sets the value of the maxDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxDiscountPercent(Double value) {
        this.maxDiscountPercent = value;
    }

}
