
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
 *           &lt;element name="TPA_Extensions" type="{http://www.escapia.com/EVRN/2007/02}TPA_Extensions_Type" minOccurs="0"/>
 *           &lt;element name="UnitHolds" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="UnitHold" type="{http://www.escapia.com/EVRN/2007/02}UnitHolds" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Warnings" type="{http://www.escapia.com/EVRN/2007/02}WarningsType" minOccurs="0"/>
 *           &lt;element name="Errors" type="{http://www.escapia.com/EVRN/2007/02}ErrorsType" minOccurs="0"/>
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
    "successOrTPAExtensionsOrUnitHolds"
})
@XmlRootElement(name = "EVRN_UnitHoldRS")
public class EVRNUnitHoldRS
    extends EVRNBaseRSType
{

    @XmlElements({
        @XmlElement(name = "Success", type = SuccessType.class),
        @XmlElement(name = "TPA_Extensions", type = TPAExtensionsType.class),
        @XmlElement(name = "UnitHolds", type = EVRNUnitHoldRS.UnitHolds.class),
        @XmlElement(name = "Warnings", type = WarningsType.class),
        @XmlElement(name = "Errors", type = ErrorsType.class)
    })
    protected List<Object> successOrTPAExtensionsOrUnitHolds;

    /**
     * Gets the value of the successOrTPAExtensionsOrUnitHolds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the successOrTPAExtensionsOrUnitHolds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccessOrTPAExtensionsOrUnitHolds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuccessType }
     * {@link TPAExtensionsType }
     * {@link EVRNUnitHoldRS.UnitHolds }
     * {@link WarningsType }
     * {@link ErrorsType }
     * 
     * 
     */
    public List<Object> getSuccessOrTPAExtensionsOrUnitHolds() {
        if (successOrTPAExtensionsOrUnitHolds == null) {
            successOrTPAExtensionsOrUnitHolds = new ArrayList<Object>();
        }
        return this.successOrTPAExtensionsOrUnitHolds;
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
     *         &lt;element name="UnitHold" type="{http://www.escapia.com/EVRN/2007/02}UnitHolds" maxOccurs="unbounded" minOccurs="0"/>
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
        "unitHold"
    })
    public static class UnitHolds {

        @XmlElement(name = "UnitHold")
        protected List<com.escapia.evrn._2007._02.UnitHolds> unitHold;

        /**
         * Gets the value of the unitHold property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the unitHold property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUnitHold().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link com.escapia.evrn._2007._02.UnitHolds }
         * 
         * 
         */
        public List<com.escapia.evrn._2007._02.UnitHolds> getUnitHold() {
            if (unitHold == null) {
                unitHold = new ArrayList<com.escapia.evrn._2007._02.UnitHolds>();
            }
            return this.unitHold;
        }

    }

}
