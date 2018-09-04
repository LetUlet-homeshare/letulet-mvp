
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PetsPoliciesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PetsPoliciesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PetsPolicy" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PetsAllowedCode" type="{http://www.escapia.com/EVRN/2007/02}PetsAllowedCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PetsPoliciesType", propOrder = {
    "petsPolicy"
})
public class PetsPoliciesType {

    @XmlElement(name = "PetsPolicy")
    protected List<PetsPoliciesType.PetsPolicy> petsPolicy;
    @XmlAttribute(name = "PetsAllowedCode")
    protected PetsAllowedCodeType petsAllowedCode;

    /**
     * Gets the value of the petsPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the petsPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPetsPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PetsPoliciesType.PetsPolicy }
     * 
     * 
     */
    public List<PetsPoliciesType.PetsPolicy> getPetsPolicy() {
        if (petsPolicy == null) {
            petsPolicy = new ArrayList<PetsPoliciesType.PetsPolicy>();
        }
        return this.petsPolicy;
    }

    /**
     * Gets the value of the petsAllowedCode property.
     * 
     * @return
     *     possible object is
     *     {@link PetsAllowedCodeType }
     *     
     */
    public PetsAllowedCodeType getPetsAllowedCode() {
        return petsAllowedCode;
    }

    /**
     * Sets the value of the petsAllowedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PetsAllowedCodeType }
     *     
     */
    public void setPetsAllowedCode(PetsAllowedCodeType value) {
        this.petsAllowedCode = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PetsPolicy {

        @XmlAttribute(name = "Code")
        protected String code;

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

    }

}
