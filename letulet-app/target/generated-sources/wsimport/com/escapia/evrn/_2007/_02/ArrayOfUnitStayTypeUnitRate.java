
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUnitStayTypeUnitRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnitStayTypeUnitRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitRate" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Rates" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfEVRN_AmountType" minOccurs="0"/>
 *                   &lt;element name="UnitRateDescription" type="{http://www.escapia.com/EVRN/2007/02}ParagraphType" minOccurs="0"/>
 *                   &lt;element name="Total" type="{http://www.escapia.com/EVRN/2007/02}TotalType" minOccurs="0"/>
 *                 &lt;/sequence>
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
@XmlType(name = "ArrayOfUnitStayTypeUnitRate", propOrder = {
    "unitRate"
})
public class ArrayOfUnitStayTypeUnitRate {

    @XmlElement(name = "UnitRate")
    protected List<ArrayOfUnitStayTypeUnitRate.UnitRate> unitRate;

    /**
     * Gets the value of the unitRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfUnitStayTypeUnitRate.UnitRate }
     * 
     * 
     */
    public List<ArrayOfUnitStayTypeUnitRate.UnitRate> getUnitRate() {
        if (unitRate == null) {
            unitRate = new ArrayList<ArrayOfUnitStayTypeUnitRate.UnitRate>();
        }
        return this.unitRate;
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
     *         &lt;element name="Rates" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfEVRN_AmountType" minOccurs="0"/>
     *         &lt;element name="UnitRateDescription" type="{http://www.escapia.com/EVRN/2007/02}ParagraphType" minOccurs="0"/>
     *         &lt;element name="Total" type="{http://www.escapia.com/EVRN/2007/02}TotalType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rates",
        "unitRateDescription",
        "total"
    })
    public static class UnitRate {

        @XmlElement(name = "Rates")
        protected ArrayOfEVRNAmountType rates;
        @XmlElement(name = "UnitRateDescription")
        protected ParagraphType unitRateDescription;
        @XmlElement(name = "Total")
        protected TotalType total;

        /**
         * Gets the value of the rates property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfEVRNAmountType }
         *     
         */
        public ArrayOfEVRNAmountType getRates() {
            return rates;
        }

        /**
         * Sets the value of the rates property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfEVRNAmountType }
         *     
         */
        public void setRates(ArrayOfEVRNAmountType value) {
            this.rates = value;
        }

        /**
         * Gets the value of the unitRateDescription property.
         * 
         * @return
         *     possible object is
         *     {@link ParagraphType }
         *     
         */
        public ParagraphType getUnitRateDescription() {
            return unitRateDescription;
        }

        /**
         * Sets the value of the unitRateDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link ParagraphType }
         *     
         */
        public void setUnitRateDescription(ParagraphType value) {
            this.unitRateDescription = value;
        }

        /**
         * Gets the value of the total property.
         * 
         * @return
         *     possible object is
         *     {@link TotalType }
         *     
         */
        public TotalType getTotal() {
            return total;
        }

        /**
         * Sets the value of the total property.
         * 
         * @param value
         *     allowed object is
         *     {@link TotalType }
         *     
         */
        public void setTotal(TotalType value) {
            this.total = value;
        }

    }

}
