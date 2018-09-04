
package com.escapia.evrn._2007._02;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverriddenUnitStayRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverriddenUnitStayRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelerOrderInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BaseRentAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverriddenUnitStayRateType", propOrder = {
    "travelerOrderInfo"
})
public class OverriddenUnitStayRateType {

    @XmlElement(name = "TravelerOrderInfo")
    protected String travelerOrderInfo;
    @XmlAttribute(name = "BaseRentAmount", required = true)
    protected BigDecimal baseRentAmount;

    /**
     * Gets the value of the travelerOrderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerOrderInfo() {
        return travelerOrderInfo;
    }

    /**
     * Sets the value of the travelerOrderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerOrderInfo(String value) {
        this.travelerOrderInfo = value;
    }

    /**
     * Gets the value of the baseRentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseRentAmount() {
        return baseRentAmount;
    }

    /**
     * Sets the value of the baseRentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseRentAmount(BigDecimal value) {
        this.baseRentAmount = value;
    }

}
