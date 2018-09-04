
package com.escapia.evrn._2007._02;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UnitStayCandidateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitStayCandidateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomCounts" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfRoomCountType" minOccurs="0"/>
 *         &lt;element name="BedCounts" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfBedCountType" minOccurs="0"/>
 *         &lt;element name="GuestCounts" type="{http://www.escapia.com/EVRN/2007/02}GuestCountType" minOccurs="0"/>
 *         &lt;element name="PetsPolicies" type="{http://www.escapia.com/EVRN/2007/02}PetsPoliciesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NumberFloors" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="NonSmoking" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AreaSquareFeet" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="WhenBuilt" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitStayCandidateType", propOrder = {
    "roomCounts",
    "bedCounts",
    "guestCounts",
    "petsPolicies"
})
public class UnitStayCandidateType {

    @XmlElement(name = "RoomCounts")
    protected ArrayOfRoomCountType roomCounts;
    @XmlElement(name = "BedCounts")
    protected ArrayOfBedCountType bedCounts;
    @XmlElement(name = "GuestCounts")
    protected GuestCountType guestCounts;
    @XmlElement(name = "PetsPolicies")
    protected PetsPoliciesType petsPolicies;
    @XmlAttribute(name = "NumberFloors")
    protected BigInteger numberFloors;
    @XmlAttribute(name = "NonSmoking")
    protected Boolean nonSmoking;
    @XmlAttribute(name = "AreaSquareFeet")
    protected Integer areaSquareFeet;
    @XmlAttribute(name = "MaxOccupancy")
    protected Short maxOccupancy;
    @XmlAttribute(name = "WhenBuilt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar whenBuilt;

    /**
     * Gets the value of the roomCounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomCountType }
     *     
     */
    public ArrayOfRoomCountType getRoomCounts() {
        return roomCounts;
    }

    /**
     * Sets the value of the roomCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomCountType }
     *     
     */
    public void setRoomCounts(ArrayOfRoomCountType value) {
        this.roomCounts = value;
    }

    /**
     * Gets the value of the bedCounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBedCountType }
     *     
     */
    public ArrayOfBedCountType getBedCounts() {
        return bedCounts;
    }

    /**
     * Sets the value of the bedCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBedCountType }
     *     
     */
    public void setBedCounts(ArrayOfBedCountType value) {
        this.bedCounts = value;
    }

    /**
     * Gets the value of the guestCounts property.
     * 
     * @return
     *     possible object is
     *     {@link GuestCountType }
     *     
     */
    public GuestCountType getGuestCounts() {
        return guestCounts;
    }

    /**
     * Sets the value of the guestCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCountType }
     *     
     */
    public void setGuestCounts(GuestCountType value) {
        this.guestCounts = value;
    }

    /**
     * Gets the value of the petsPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link PetsPoliciesType }
     *     
     */
    public PetsPoliciesType getPetsPolicies() {
        return petsPolicies;
    }

    /**
     * Sets the value of the petsPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link PetsPoliciesType }
     *     
     */
    public void setPetsPolicies(PetsPoliciesType value) {
        this.petsPolicies = value;
    }

    /**
     * Gets the value of the numberFloors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberFloors() {
        return numberFloors;
    }

    /**
     * Sets the value of the numberFloors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberFloors(BigInteger value) {
        this.numberFloors = value;
    }

    /**
     * Gets the value of the nonSmoking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonSmoking() {
        return nonSmoking;
    }

    /**
     * Sets the value of the nonSmoking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonSmoking(Boolean value) {
        this.nonSmoking = value;
    }

    /**
     * Gets the value of the areaSquareFeet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAreaSquareFeet() {
        return areaSquareFeet;
    }

    /**
     * Sets the value of the areaSquareFeet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAreaSquareFeet(Integer value) {
        this.areaSquareFeet = value;
    }

    /**
     * Gets the value of the maxOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * Sets the value of the maxOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMaxOccupancy(Short value) {
        this.maxOccupancy = value;
    }

    /**
     * Gets the value of the whenBuilt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWhenBuilt() {
        return whenBuilt;
    }

    /**
     * Sets the value of the whenBuilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWhenBuilt(XMLGregorianCalendar value) {
        this.whenBuilt = value;
    }

}
