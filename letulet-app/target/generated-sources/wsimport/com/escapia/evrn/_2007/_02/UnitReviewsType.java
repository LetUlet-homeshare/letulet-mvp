
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitReviewsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitReviewsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitReview" type="{http://www.escapia.com/EVRN/2007/02}UnitReviewType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyManagerReview" type="{http://www.escapia.com/EVRN/2007/02}PropertyManagerReviewType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitReviewsType", propOrder = {
    "unitReview",
    "propertyManagerReview"
})
public class UnitReviewsType {

    @XmlElement(name = "UnitReview")
    protected List<UnitReviewType> unitReview;
    @XmlElement(name = "PropertyManagerReview")
    protected PropertyManagerReviewType propertyManagerReview;

    /**
     * Gets the value of the unitReview property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitReview property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitReview().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitReviewType }
     * 
     * 
     */
    public List<UnitReviewType> getUnitReview() {
        if (unitReview == null) {
            unitReview = new ArrayList<UnitReviewType>();
        }
        return this.unitReview;
    }

    /**
     * Gets the value of the propertyManagerReview property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyManagerReviewType }
     *     
     */
    public PropertyManagerReviewType getPropertyManagerReview() {
        return propertyManagerReview;
    }

    /**
     * Sets the value of the propertyManagerReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyManagerReviewType }
     *     
     */
    public void setPropertyManagerReview(PropertyManagerReviewType value) {
        this.propertyManagerReview = value;
    }

}
