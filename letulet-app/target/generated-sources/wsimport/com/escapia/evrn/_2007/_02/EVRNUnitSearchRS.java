
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *           &lt;element name="TPA_Extensions" type="{http://www.escapia.com/EVRN/2007/02}TPA_Extensions_Type" minOccurs="0"/>
 *           &lt;element name="Success" type="{http://www.escapia.com/EVRN/2007/02}SuccessType" minOccurs="0"/>
 *           &lt;element name="Areas" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Area" type="{http://www.escapia.com/EVRN/2007/02}SearchAreaType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="PlaceHolder" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Errors" type="{http://www.escapia.com/EVRN/2007/02}ErrorsType" minOccurs="0"/>
 *           &lt;element name="Warnings" type="{http://www.escapia.com/EVRN/2007/02}WarningsType" minOccurs="0"/>
 *           &lt;element name="Units" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.escapia.com/EVRN/2007/02}UnitsType">
 *                   &lt;attribute name="moredata" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Criteria" type="{http://www.escapia.com/EVRN/2007/02}UnitSearchCriteriaType" minOccurs="0"/>
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
    "tpaExtensionsOrSuccessOrAreas"
})
@XmlRootElement(name = "EVRN_UnitSearchRS")
public class EVRNUnitSearchRS
    extends EVRNBaseRSType
{

    @XmlElements({
        @XmlElement(name = "TPA_Extensions", type = TPAExtensionsType.class),
        @XmlElement(name = "Success", type = SuccessType.class),
        @XmlElement(name = "Areas", type = EVRNUnitSearchRS.Areas.class),
        @XmlElement(name = "Errors", type = ErrorsType.class),
        @XmlElement(name = "Warnings", type = WarningsType.class),
        @XmlElement(name = "Units", type = EVRNUnitSearchRS.Units.class),
        @XmlElement(name = "Criteria", type = UnitSearchCriteriaType.class)
    })
    protected List<Object> tpaExtensionsOrSuccessOrAreas;

    /**
     * Gets the value of the tpaExtensionsOrSuccessOrAreas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tpaExtensionsOrSuccessOrAreas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPAExtensionsOrSuccessOrAreas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPAExtensionsType }
     * {@link SuccessType }
     * {@link EVRNUnitSearchRS.Areas }
     * {@link ErrorsType }
     * {@link WarningsType }
     * {@link EVRNUnitSearchRS.Units }
     * {@link UnitSearchCriteriaType }
     * 
     * 
     */
    public List<Object> getTPAExtensionsOrSuccessOrAreas() {
        if (tpaExtensionsOrSuccessOrAreas == null) {
            tpaExtensionsOrSuccessOrAreas = new ArrayList<Object>();
        }
        return this.tpaExtensionsOrSuccessOrAreas;
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
     *         &lt;element name="Area" type="{http://www.escapia.com/EVRN/2007/02}SearchAreaType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="PlaceHolder" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "area"
    })
    public static class Areas {

        @XmlElement(name = "Area")
        protected List<SearchAreaType> area;
        @XmlAttribute(name = "PlaceHolder")
        protected Integer placeHolder;

        /**
         * Gets the value of the area property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the area property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArea().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchAreaType }
         * 
         * 
         */
        public List<SearchAreaType> getArea() {
            if (area == null) {
                area = new ArrayList<SearchAreaType>();
            }
            return this.area;
        }

        /**
         * Gets the value of the placeHolder property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPlaceHolder() {
            return placeHolder;
        }

        /**
         * Sets the value of the placeHolder property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPlaceHolder(Integer value) {
            this.placeHolder = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}UnitsType">
     *       &lt;attribute name="moredata" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Units
        extends UnitsType
    {

        @XmlAttribute(name = "moredata")
        protected Boolean moredata;

        /**
         * Gets the value of the moredata property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMoredata() {
            return moredata;
        }

        /**
         * Sets the value of the moredata property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMoredata(Boolean value) {
            this.moredata = value;
        }

    }

}
