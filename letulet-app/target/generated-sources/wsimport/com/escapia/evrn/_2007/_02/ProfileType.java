
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accesses" type="{http://www.escapia.com/EVRN/2007/02}AccessesType" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://www.escapia.com/EVRN/2007/02}CustomerType" minOccurs="0"/>
 *         &lt;element name="PrefCollections" type="{http://www.escapia.com/EVRN/2007/02}PreferencesType" minOccurs="0"/>
 *         &lt;element name="CompanyInfo" type="{http://www.escapia.com/EVRN/2007/02}CompanyInfoType" minOccurs="0"/>
 *         &lt;element name="Affiliations" type="{http://www.escapia.com/EVRN/2007/02}AffiliationsType" minOccurs="0"/>
 *         &lt;element name="Agreements" type="{http://www.escapia.com/EVRN/2007/02}AgreementsType" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.escapia.com/EVRN/2007/02}TPA_Extensions_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareAllSynchInd" type="{http://www.escapia.com/EVRN/2007/02}YesNoType" default="No" />
 *       &lt;attribute name="ShareAllMarketInd" type="{http://www.escapia.com/EVRN/2007/02}YesNoType" default="No" />
 *       &lt;attribute name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileType", propOrder = {
    "accesses",
    "customer",
    "prefCollections",
    "companyInfo",
    "affiliations",
    "agreements",
    "tpaExtensions"
})
@XmlSeeAlso({
    PropertyManagerType.class
})
public class ProfileType {

    @XmlElement(name = "Accesses")
    protected AccessesType accesses;
    @XmlElement(name = "Customer")
    protected CustomerType customer;
    @XmlElement(name = "PrefCollections")
    protected PreferencesType prefCollections;
    @XmlElement(name = "CompanyInfo")
    protected CompanyInfoType companyInfo;
    @XmlElement(name = "Affiliations")
    protected AffiliationsType affiliations;
    @XmlElement(name = "Agreements")
    protected AgreementsType agreements;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ShareAllSynchInd")
    protected YesNoType shareAllSynchInd;
    @XmlAttribute(name = "ShareAllMarketInd")
    protected YesNoType shareAllMarketInd;
    @XmlAttribute(name = "ProfileType")
    protected String profileType;
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
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * Gets the value of the accesses property.
     * 
     * @return
     *     possible object is
     *     {@link AccessesType }
     *     
     */
    public AccessesType getAccesses() {
        return accesses;
    }

    /**
     * Sets the value of the accesses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessesType }
     *     
     */
    public void setAccesses(AccessesType value) {
        this.accesses = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType }
     *     
     */
    public CustomerType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *     
     */
    public void setCustomer(CustomerType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the prefCollections property.
     * 
     * @return
     *     possible object is
     *     {@link PreferencesType }
     *     
     */
    public PreferencesType getPrefCollections() {
        return prefCollections;
    }

    /**
     * Sets the value of the prefCollections property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferencesType }
     *     
     */
    public void setPrefCollections(PreferencesType value) {
        this.prefCollections = value;
    }

    /**
     * Gets the value of the companyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInfoType }
     *     
     */
    public CompanyInfoType getCompanyInfo() {
        return companyInfo;
    }

    /**
     * Sets the value of the companyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInfoType }
     *     
     */
    public void setCompanyInfo(CompanyInfoType value) {
        this.companyInfo = value;
    }

    /**
     * Gets the value of the affiliations property.
     * 
     * @return
     *     possible object is
     *     {@link AffiliationsType }
     *     
     */
    public AffiliationsType getAffiliations() {
        return affiliations;
    }

    /**
     * Sets the value of the affiliations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationsType }
     *     
     */
    public void setAffiliations(AffiliationsType value) {
        this.affiliations = value;
    }

    /**
     * Gets the value of the agreements property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementsType }
     *     
     */
    public AgreementsType getAgreements() {
        return agreements;
    }

    /**
     * Sets the value of the agreements property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementsType }
     *     
     */
    public void setAgreements(AgreementsType value) {
        this.agreements = value;
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
     * Gets the value of the shareAllSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getShareAllSynchInd() {
        if (shareAllSynchInd == null) {
            return YesNoType.NO;
        } else {
            return shareAllSynchInd;
        }
    }

    /**
     * Sets the value of the shareAllSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setShareAllSynchInd(YesNoType value) {
        this.shareAllSynchInd = value;
    }

    /**
     * Gets the value of the shareAllMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getShareAllMarketInd() {
        if (shareAllMarketInd == null) {
            return YesNoType.NO;
        } else {
            return shareAllMarketInd;
        }
    }

    /**
     * Sets the value of the shareAllMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setShareAllMarketInd(YesNoType value) {
        this.shareAllMarketInd = value;
    }

    /**
     * Gets the value of the profileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileType() {
        return profileType;
    }

    /**
     * Sets the value of the profileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileType(String value) {
        this.profileType = value;
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
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

}
