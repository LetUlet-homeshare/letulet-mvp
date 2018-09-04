
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
 * <p>Java class for CommissionPoliciesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommissionPoliciesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommissionPolicy" type="{http://www.escapia.com/EVRN/2007/02}CommissionPolicyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
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
@XmlType(name = "CommissionPoliciesType", propOrder = {
    "commissionPolicy"
})
public class CommissionPoliciesType {

    @XmlElement(name = "CommissionPolicy")
    protected List<CommissionPolicyType> commissionPolicy;
    @XmlAttribute(name = "MinCommissionPercent")
    protected BigDecimal minCommissionPercent;
    @XmlAttribute(name = "MaxCommissionPercent")
    protected BigDecimal maxCommissionPercent;

    /**
     * Gets the value of the commissionPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commissionPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommissionPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionPolicyType }
     * 
     * 
     */
    public List<CommissionPolicyType> getCommissionPolicy() {
        if (commissionPolicy == null) {
            commissionPolicy = new ArrayList<CommissionPolicyType>();
        }
        return this.commissionPolicy;
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
