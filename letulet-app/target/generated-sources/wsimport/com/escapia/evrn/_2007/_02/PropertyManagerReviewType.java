
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyManagerReviewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyManagerReviewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AverageReviewScore" type="{http://www.escapia.com/EVRN/2007/02}ReviewScoreType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReviewCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyManagerReviewType", propOrder = {
    "averageReviewScore"
})
public class PropertyManagerReviewType {

    @XmlElement(name = "AverageReviewScore")
    protected List<ReviewScoreType> averageReviewScore;
    @XmlAttribute(name = "ReviewCount")
    protected Integer reviewCount;

    /**
     * Gets the value of the averageReviewScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the averageReviewScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAverageReviewScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReviewScoreType }
     * 
     * 
     */
    public List<ReviewScoreType> getAverageReviewScore() {
        if (averageReviewScore == null) {
            averageReviewScore = new ArrayList<ReviewScoreType>();
        }
        return this.averageReviewScore;
    }

    /**
     * Gets the value of the reviewCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReviewCount() {
        return reviewCount;
    }

    /**
     * Sets the value of the reviewCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReviewCount(Integer value) {
        this.reviewCount = value;
    }

}
