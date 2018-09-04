
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}EVRN_BaseRQType">
 *       &lt;sequence>
 *         &lt;element name="PropertyManagerRequests" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PropertyManagerRequest" type="{http://www.escapia.com/EVRN/2007/02}PropertyManagerRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "propertyManagerRequests"
})
@XmlRootElement(name = "EVRN_PropertyManagerRQ")
public class EVRNPropertyManagerRQ
    extends EVRNBaseRQType
{

    @XmlElement(name = "PropertyManagerRequests")
    protected EVRNPropertyManagerRQ.PropertyManagerRequests propertyManagerRequests;

    /**
     * Gets the value of the propertyManagerRequests property.
     * 
     * @return
     *     possible object is
     *     {@link EVRNPropertyManagerRQ.PropertyManagerRequests }
     *     
     */
    public EVRNPropertyManagerRQ.PropertyManagerRequests getPropertyManagerRequests() {
        return propertyManagerRequests;
    }

    /**
     * Sets the value of the propertyManagerRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link EVRNPropertyManagerRQ.PropertyManagerRequests }
     *     
     */
    public void setPropertyManagerRequests(EVRNPropertyManagerRQ.PropertyManagerRequests value) {
        this.propertyManagerRequests = value;
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
     *         &lt;element name="PropertyManagerRequest" type="{http://www.escapia.com/EVRN/2007/02}PropertyManagerRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
        "propertyManagerRequest"
    })
    public static class PropertyManagerRequests {

        @XmlElement(name = "PropertyManagerRequest")
        protected List<PropertyManagerRequestType> propertyManagerRequest;

        /**
         * Gets the value of the propertyManagerRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the propertyManagerRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPropertyManagerRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PropertyManagerRequestType }
         * 
         * 
         */
        public List<PropertyManagerRequestType> getPropertyManagerRequest() {
            if (propertyManagerRequest == null) {
                propertyManagerRequest = new ArrayList<PropertyManagerRequestType>();
            }
            return this.propertyManagerRequest;
        }

    }

}
