
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UnitReservationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueID" type="{http://www.escapia.com/EVRN/2007/02}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="UnitStays" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfUnitStaysTypeUnitStay" minOccurs="0"/>
 *         &lt;element name="Services" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfServicesTypeService" minOccurs="0"/>
 *         &lt;element name="ResGuests" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfResGuestsTypeResGuest" minOccurs="0"/>
 *         &lt;element name="ResGlobalInfo" type="{http://www.escapia.com/EVRN/2007/02}EVRN_ResGlobalInfoType" minOccurs="0"/>
 *         &lt;element name="WrittenConfInst" type="{http://www.escapia.com/EVRN/2007/02}WrittenConfInstType" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.escapia.com/EVRN/2007/02}TPA_Extensions_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RoomStayReservation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ResStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SourceCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SourceSubCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CampaignID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitReservationType", propOrder = {
    "uniqueID",
    "unitStays",
    "services",
    "resGuests",
    "resGlobalInfo",
    "writtenConfInst",
    "tpaExtensions"
})
public class UnitReservationType {

    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "UnitStays")
    protected ArrayOfUnitStaysTypeUnitStay unitStays;
    @XmlElement(name = "Services")
    protected ArrayOfServicesTypeService services;
    @XmlElement(name = "ResGuests")
    protected ArrayOfResGuestsTypeResGuest resGuests;
    @XmlElement(name = "ResGlobalInfo")
    protected EVRNResGlobalInfoType resGlobalInfo;
    @XmlElement(name = "WrittenConfInst")
    protected WrittenConfInstType writtenConfInst;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "RoomStayReservation")
    protected Boolean roomStayReservation;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;
    @XmlAttribute(name = "LastModifyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDateTime;
    @XmlAttribute(name = "LastModifierID")
    protected String lastModifierID;
    @XmlAttribute(name = "ResStatus")
    protected String resStatus;
    @XmlAttribute(name = "SourceCategory")
    protected String sourceCategory;
    @XmlAttribute(name = "SourceSubCategory")
    protected String sourceSubCategory;
    @XmlAttribute(name = "CampaignID")
    protected Integer campaignID;

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the unitStays property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnitStaysTypeUnitStay }
     *     
     */
    public ArrayOfUnitStaysTypeUnitStay getUnitStays() {
        return unitStays;
    }

    /**
     * Sets the value of the unitStays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnitStaysTypeUnitStay }
     *     
     */
    public void setUnitStays(ArrayOfUnitStaysTypeUnitStay value) {
        this.unitStays = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServicesTypeService }
     *     
     */
    public ArrayOfServicesTypeService getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServicesTypeService }
     *     
     */
    public void setServices(ArrayOfServicesTypeService value) {
        this.services = value;
    }

    /**
     * Gets the value of the resGuests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResGuestsTypeResGuest }
     *     
     */
    public ArrayOfResGuestsTypeResGuest getResGuests() {
        return resGuests;
    }

    /**
     * Sets the value of the resGuests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResGuestsTypeResGuest }
     *     
     */
    public void setResGuests(ArrayOfResGuestsTypeResGuest value) {
        this.resGuests = value;
    }

    /**
     * Gets the value of the resGlobalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EVRNResGlobalInfoType }
     *     
     */
    public EVRNResGlobalInfoType getResGlobalInfo() {
        return resGlobalInfo;
    }

    /**
     * Sets the value of the resGlobalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EVRNResGlobalInfoType }
     *     
     */
    public void setResGlobalInfo(EVRNResGlobalInfoType value) {
        this.resGlobalInfo = value;
    }

    /**
     * Gets the value of the writtenConfInst property.
     * 
     * @return
     *     possible object is
     *     {@link WrittenConfInstType }
     *     
     */
    public WrittenConfInstType getWrittenConfInst() {
        return writtenConfInst;
    }

    /**
     * Sets the value of the writtenConfInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link WrittenConfInstType }
     *     
     */
    public void setWrittenConfInst(WrittenConfInstType value) {
        this.writtenConfInst = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the roomStayReservation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoomStayReservation() {
        return roomStayReservation;
    }

    /**
     * Sets the value of the roomStayReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoomStayReservation(Boolean value) {
        this.roomStayReservation = value;
    }

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the creatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * Sets the value of the creatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

    /**
     * Gets the value of the lastModifyDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**
     * Sets the value of the lastModifyDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifyDateTime(XMLGregorianCalendar value) {
        this.lastModifyDateTime = value;
    }

    /**
     * Gets the value of the lastModifierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifierID() {
        return lastModifierID;
    }

    /**
     * Sets the value of the lastModifierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifierID(String value) {
        this.lastModifierID = value;
    }

    /**
     * Gets the value of the resStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResStatus() {
        return resStatus;
    }

    /**
     * Sets the value of the resStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResStatus(String value) {
        this.resStatus = value;
    }

    /**
     * Gets the value of the sourceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCategory() {
        return sourceCategory;
    }

    /**
     * Sets the value of the sourceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCategory(String value) {
        this.sourceCategory = value;
    }

    /**
     * Gets the value of the sourceSubCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSubCategory() {
        return sourceSubCategory;
    }

    /**
     * Sets the value of the sourceSubCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSubCategory(String value) {
        this.sourceSubCategory = value;
    }

    /**
     * Gets the value of the campaignID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCampaignID() {
        return campaignID;
    }

    /**
     * Sets the value of the campaignID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCampaignID(Integer value) {
        this.campaignID = value;
    }

}
