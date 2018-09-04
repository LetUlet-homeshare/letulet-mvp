
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
 * <p>Java class for ArrayOfFeaturesTypeFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFeaturesTypeFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Feature" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Charge" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MultimediaDescriptions" type="{http://www.escapia.com/EVRN/2007/02}MultimediaDescriptionsType" minOccurs="0"/>
 *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AccessibleCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFeaturesTypeFeature", propOrder = {
    "feature"
})
public class ArrayOfFeaturesTypeFeature {

    @XmlElement(name = "Feature")
    protected List<ArrayOfFeaturesTypeFeature.Feature> feature;

    /**
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfFeaturesTypeFeature.Feature }
     * 
     * 
     */
    public List<ArrayOfFeaturesTypeFeature.Feature> getFeature() {
        if (feature == null) {
            feature = new ArrayList<ArrayOfFeaturesTypeFeature.Feature>();
        }
        return this.feature;
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
     *       &lt;sequence>
     *         &lt;element name="Charge" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MultimediaDescriptions" type="{http://www.escapia.com/EVRN/2007/02}MultimediaDescriptionsType" minOccurs="0"/>
     *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AccessibleCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "charge",
        "multimediaDescriptions",
        "descriptiveText"
    })
    public static class Feature {

        @XmlElement(name = "Charge")
        protected ArrayOfFeaturesTypeFeature.Feature.Charge charge;
        @XmlElement(name = "MultimediaDescriptions")
        protected MultimediaDescriptionsType multimediaDescriptions;
        @XmlElement(name = "DescriptiveText")
        protected String descriptiveText;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "AccessibleCode")
        protected String accessibleCode;
        @XmlAttribute(name = "SecurityCode")
        protected String securityCode;
        @XmlAttribute(name = "ExistsCode")
        protected String existsCode;
        @XmlAttribute(name = "ProximityCode")
        protected String proximityCode;

        /**
         * Gets the value of the charge property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfFeaturesTypeFeature.Feature.Charge }
         *     
         */
        public ArrayOfFeaturesTypeFeature.Feature.Charge getCharge() {
            return charge;
        }

        /**
         * Sets the value of the charge property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfFeaturesTypeFeature.Feature.Charge }
         *     
         */
        public void setCharge(ArrayOfFeaturesTypeFeature.Feature.Charge value) {
            this.charge = value;
        }

        /**
         * Gets the value of the multimediaDescriptions property.
         * 
         * @return
         *     possible object is
         *     {@link MultimediaDescriptionsType }
         *     
         */
        public MultimediaDescriptionsType getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        /**
         * Sets the value of the multimediaDescriptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultimediaDescriptionsType }
         *     
         */
        public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
            this.multimediaDescriptions = value;
        }

        /**
         * Gets the value of the descriptiveText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescriptiveText() {
            return descriptiveText;
        }

        /**
         * Sets the value of the descriptiveText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescriptiveText(String value) {
            this.descriptiveText = value;
        }

        /**
         * Gets the value of the codeDetail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeDetail() {
            return codeDetail;
        }

        /**
         * Sets the value of the codeDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        /**
         * Gets the value of the accessibleCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccessibleCode() {
            return accessibleCode;
        }

        /**
         * Sets the value of the accessibleCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccessibleCode(String value) {
            this.accessibleCode = value;
        }

        /**
         * Gets the value of the securityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecurityCode() {
            return securityCode;
        }

        /**
         * Sets the value of the securityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecurityCode(String value) {
            this.securityCode = value;
        }

        /**
         * Gets the value of the existsCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExistsCode() {
            return existsCode;
        }

        /**
         * Sets the value of the existsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExistsCode(String value) {
            this.existsCode = value;
        }

        /**
         * Gets the value of the proximityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProximityCode() {
            return proximityCode;
        }

        /**
         * Sets the value of the proximityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProximityCode(String value) {
            this.proximityCode = value;
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
         *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Charge {

            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
            }

        }

    }

}
