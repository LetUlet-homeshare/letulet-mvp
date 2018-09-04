
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
 * <p>Java class for UnitReviewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitReviewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReviewScore" type="{http://www.escapia.com/EVRN/2007/02}ReviewScoreType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReviewComment" type="{http://www.escapia.com/EVRN/2007/02}ReviewCommentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ManagerResponse" type="{http://www.escapia.com/EVRN/2007/02}ManagerResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReviewedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ReviewerID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReviewerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReviewerCity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReviewerState" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReviewerCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReviewerEmail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="PropertyManagerRejected" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ReservationNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitReviewType", propOrder = {
    "reviewScore",
    "reviewComment",
    "managerResponse"
})
public class UnitReviewType {

    @XmlElement(name = "ReviewScore")
    protected List<ReviewScoreType> reviewScore;
    @XmlElement(name = "ReviewComment")
    protected List<ReviewCommentType> reviewComment;
    @XmlElement(name = "ManagerResponse")
    protected List<ManagerResponseType> managerResponse;
    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "ReviewedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reviewedDate;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;
    @XmlAttribute(name = "ReviewerID")
    protected String reviewerID;
    @XmlAttribute(name = "ReviewerName")
    protected String reviewerName;
    @XmlAttribute(name = "ReviewerCity")
    protected String reviewerCity;
    @XmlAttribute(name = "ReviewerState")
    protected String reviewerState;
    @XmlAttribute(name = "ReviewerCountry")
    protected String reviewerCountry;
    @XmlAttribute(name = "ReviewerEmail")
    protected String reviewerEmail;
    @XmlAttribute(name = "CheckIn")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkIn;
    @XmlAttribute(name = "CheckOut")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkOut;
    @XmlAttribute(name = "PropertyManagerRejected")
    protected Boolean propertyManagerRejected;
    @XmlAttribute(name = "ReservationNumber")
    protected String reservationNumber;

    /**
     * Gets the value of the reviewScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reviewScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReviewScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReviewScoreType }
     * 
     * 
     */
    public List<ReviewScoreType> getReviewScore() {
        if (reviewScore == null) {
            reviewScore = new ArrayList<ReviewScoreType>();
        }
        return this.reviewScore;
    }

    /**
     * Gets the value of the reviewComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reviewComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReviewComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReviewCommentType }
     * 
     * 
     */
    public List<ReviewCommentType> getReviewComment() {
        if (reviewComment == null) {
            reviewComment = new ArrayList<ReviewCommentType>();
        }
        return this.reviewComment;
    }

    /**
     * Gets the value of the managerResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managerResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagerResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagerResponseType }
     * 
     * 
     */
    public List<ManagerResponseType> getManagerResponse() {
        if (managerResponse == null) {
            managerResponse = new ArrayList<ManagerResponseType>();
        }
        return this.managerResponse;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the reviewedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReviewedDate() {
        return reviewedDate;
    }

    /**
     * Sets the value of the reviewedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReviewedDate(XMLGregorianCalendar value) {
        this.reviewedDate = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the reviewerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewerID() {
        return reviewerID;
    }

    /**
     * Sets the value of the reviewerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewerID(String value) {
        this.reviewerID = value;
    }

    /**
     * Gets the value of the reviewerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewerName() {
        return reviewerName;
    }

    /**
     * Sets the value of the reviewerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewerName(String value) {
        this.reviewerName = value;
    }

    /**
     * Gets the value of the reviewerCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewerCity() {
        return reviewerCity;
    }

    /**
     * Sets the value of the reviewerCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewerCity(String value) {
        this.reviewerCity = value;
    }

    /**
     * Gets the value of the reviewerState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewerState() {
        return reviewerState;
    }

    /**
     * Sets the value of the reviewerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewerState(String value) {
        this.reviewerState = value;
    }

    /**
     * Gets the value of the reviewerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewerCountry() {
        return reviewerCountry;
    }

    /**
     * Sets the value of the reviewerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewerCountry(String value) {
        this.reviewerCountry = value;
    }

    /**
     * Gets the value of the reviewerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewerEmail() {
        return reviewerEmail;
    }

    /**
     * Sets the value of the reviewerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewerEmail(String value) {
        this.reviewerEmail = value;
    }

    /**
     * Gets the value of the checkIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckIn() {
        return checkIn;
    }

    /**
     * Sets the value of the checkIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckIn(XMLGregorianCalendar value) {
        this.checkIn = value;
    }

    /**
     * Gets the value of the checkOut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckOut() {
        return checkOut;
    }

    /**
     * Sets the value of the checkOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckOut(XMLGregorianCalendar value) {
        this.checkOut = value;
    }

    /**
     * Gets the value of the propertyManagerRejected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPropertyManagerRejected() {
        return propertyManagerRejected;
    }

    /**
     * Sets the value of the propertyManagerRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPropertyManagerRejected(Boolean value) {
        this.propertyManagerRejected = value;
    }

    /**
     * Gets the value of the reservationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationNumber() {
        return reservationNumber;
    }

    /**
     * Sets the value of the reservationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationNumber(String value) {
        this.reservationNumber = value;
    }

}
