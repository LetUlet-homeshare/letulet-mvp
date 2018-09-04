
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}EVRN_BaseRSType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Success" type="{http://www.escapia.com/EVRN/2007/02}SuccessType" minOccurs="0"/>
 *           &lt;element name="Errors" type="{http://www.escapia.com/EVRN/2007/02}ErrorsType" minOccurs="0"/>
 *           &lt;element name="PropertyManagers" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="PropertyManager" type="{http://www.escapia.com/EVRN/2007/02}PropertyManagerType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="TPA_Extensions" type="{http://www.escapia.com/EVRN/2007/02}TPA_Extensions_Type" minOccurs="0"/>
 *           &lt;element name="Warnings" type="{http://www.escapia.com/EVRN/2007/02}WarningsType" minOccurs="0"/>
 *         &lt;/choice>
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
    "successOrErrorsOrPropertyManagers"
})
@XmlRootElement(name = "EVRN_PropertyManagerRS")
public class EVRNPropertyManagerRS
    extends EVRNBaseRSType
{

    @XmlElements({
        @XmlElement(name = "Success", type = SuccessType.class),
        @XmlElement(name = "Errors", type = ErrorsType.class),
        @XmlElement(name = "PropertyManagers", type = EVRNPropertyManagerRS.PropertyManagers.class),
        @XmlElement(name = "TPA_Extensions", type = TPAExtensionsType.class),
        @XmlElement(name = "Warnings", type = WarningsType.class)
    })
    protected List<Object> successOrErrorsOrPropertyManagers;

    /**
     * Gets the value of the successOrErrorsOrPropertyManagers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the successOrErrorsOrPropertyManagers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccessOrErrorsOrPropertyManagers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuccessType }
     * {@link ErrorsType }
     * {@link EVRNPropertyManagerRS.PropertyManagers }
     * {@link TPAExtensionsType }
     * {@link WarningsType }
     * 
     * 
     */
    public List<Object> getSuccessOrErrorsOrPropertyManagers() {
        if (successOrErrorsOrPropertyManagers == null) {
            successOrErrorsOrPropertyManagers = new ArrayList<Object>();
        }
        return this.successOrErrorsOrPropertyManagers;
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
     *         &lt;element name="PropertyManager" type="{http://www.escapia.com/EVRN/2007/02}PropertyManagerType" maxOccurs="unbounded" minOccurs="0"/>
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
        "propertyManager"
    })
    public static class PropertyManagers {

        @XmlElement(name = "PropertyManager")
        protected List<PropertyManagerType> propertyManager;

        /**
         * Gets the value of the propertyManager property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the propertyManager property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPropertyManager().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PropertyManagerType }
         * 
         * 
         */
        public List<PropertyManagerType> getPropertyManager() {
            if (propertyManager == null) {
                propertyManager = new ArrayList<PropertyManagerType>();
            }
            return this.propertyManager;
        }

    }

}
