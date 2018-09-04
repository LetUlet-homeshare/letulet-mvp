
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchAreaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}AreaType">
 *       &lt;sequence>
 *         &lt;element name="UnitCount" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ZipList">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="MinDiscount" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="MaxDiscount" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchAreaType", propOrder = {
    "unitCount"
})
public class SearchAreaType
    extends AreaType
{

    @XmlElement(name = "UnitCount")
    protected List<SearchAreaType.UnitCount> unitCount;
    @XmlAttribute(name = "ZipList")
    protected List<String> zipList;
    @XmlAttribute(name = "MinDiscount")
    protected Double minDiscount;
    @XmlAttribute(name = "MaxDiscount")
    protected Double maxDiscount;
    @XmlAttribute(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;

    /**
     * Gets the value of the unitCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchAreaType.UnitCount }
     * 
     * 
     */
    public List<SearchAreaType.UnitCount> getUnitCount() {
        if (unitCount == null) {
            unitCount = new ArrayList<SearchAreaType.UnitCount>();
        }
        return this.unitCount;
    }

    /**
     * Gets the value of the zipList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zipList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZipList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getZipList() {
        if (zipList == null) {
            zipList = new ArrayList<String>();
        }
        return this.zipList;
    }

    /**
     * Gets the value of the minDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinDiscount() {
        return minDiscount;
    }

    /**
     * Sets the value of the minDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinDiscount(Double value) {
        this.minDiscount = value;
    }

    /**
     * Gets the value of the maxDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxDiscount() {
        return maxDiscount;
    }

    /**
     * Sets the value of the maxDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxDiscount(Double value) {
        this.maxDiscount = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
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
     *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UnitCount {

        @XmlAttribute(name = "InfoSource")
        protected String infoSource;
        @XmlAttribute(name = "Count")
        protected Integer count;

        /**
         * Gets the value of the infoSource property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfoSource() {
            return infoSource;
        }

        /**
         * Sets the value of the infoSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfoSource(String value) {
            this.infoSource = value;
        }

        /**
         * Gets the value of the count property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCount() {
            return count;
        }

        /**
         * Sets the value of the count property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCount(Integer value) {
            this.count = value;
        }

    }

}
