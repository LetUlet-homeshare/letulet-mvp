
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BedCountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BedCountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Min" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="Fixed" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BedCountType")
public class BedCountType {

    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Min")
    @XmlSchemaType(name = "unsignedByte")
    protected Short min;
    @XmlAttribute(name = "Max")
    @XmlSchemaType(name = "unsignedByte")
    protected Short max;
    @XmlAttribute(name = "Fixed")
    @XmlSchemaType(name = "unsignedByte")
    protected Short fixed;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMin(Short value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMax(Short value) {
        this.max = value;
    }

    /**
     * Gets the value of the fixed property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFixed() {
        return fixed;
    }

    /**
     * Sets the value of the fixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFixed(Short value) {
        this.fixed = value;
    }

}
