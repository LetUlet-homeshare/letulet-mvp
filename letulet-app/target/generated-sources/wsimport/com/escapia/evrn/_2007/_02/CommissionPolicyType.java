
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for CommissionPolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommissionPolicyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}FeeType">
 *       &lt;attribute name="MinAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="MaxAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionPolicyType")
public class CommissionPolicyType
    extends FeeType
{

    @XmlAttribute(name = "MinAdvanceBookingOffset")
    protected Duration minAdvanceBookingOffset;
    @XmlAttribute(name = "MaxAdvanceBookingOffset")
    protected Duration maxAdvanceBookingOffset;

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

}
