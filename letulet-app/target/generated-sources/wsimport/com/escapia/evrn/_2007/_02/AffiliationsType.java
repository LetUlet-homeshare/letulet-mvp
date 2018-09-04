
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AffiliationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffiliationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization" type="{http://www.escapia.com/EVRN/2007/02}OrganizationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Employer" type="{http://www.escapia.com/EVRN/2007/02}EmployerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TravelArranger" type="{http://www.escapia.com/EVRN/2007/02}TravelArrangerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TravelClub" type="{http://www.escapia.com/EVRN/2007/02}TravelClubType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Insurance" type="{http://www.escapia.com/EVRN/2007/02}InsuranceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.escapia.com/EVRN/2007/02}TPA_Extensions_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ShareMarketInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffiliationsType", propOrder = {
    "organization",
    "employer",
    "travelArranger",
    "travelClub",
    "insurance",
    "tpaExtensions"
})
public class AffiliationsType {

    @XmlElement(name = "Organization")
    protected List<OrganizationType> organization;
    @XmlElement(name = "Employer")
    protected List<EmployerType> employer;
    @XmlElement(name = "TravelArranger")
    protected List<TravelArrangerType> travelArranger;
    @XmlElement(name = "TravelClub")
    protected List<TravelClubType> travelClub;
    @XmlElement(name = "Insurance")
    protected List<InsuranceType> insurance;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;

    /**
     * Gets the value of the organization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationType }
     * 
     * 
     */
    public List<OrganizationType> getOrganization() {
        if (organization == null) {
            organization = new ArrayList<OrganizationType>();
        }
        return this.organization;
    }

    /**
     * Gets the value of the employer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployerType }
     * 
     * 
     */
    public List<EmployerType> getEmployer() {
        if (employer == null) {
            employer = new ArrayList<EmployerType>();
        }
        return this.employer;
    }

    /**
     * Gets the value of the travelArranger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelArranger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelArranger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelArrangerType }
     * 
     * 
     */
    public List<TravelArrangerType> getTravelArranger() {
        if (travelArranger == null) {
            travelArranger = new ArrayList<TravelArrangerType>();
        }
        return this.travelArranger;
    }

    /**
     * Gets the value of the travelClub property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelClub property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelClub().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelClubType }
     * 
     * 
     */
    public List<TravelClubType> getTravelClub() {
        if (travelClub == null) {
            travelClub = new ArrayList<TravelClubType>();
        }
        return this.travelClub;
    }

    /**
     * Gets the value of the insurance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insurance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsurance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceType }
     * 
     * 
     */
    public List<InsuranceType> getInsurance() {
        if (insurance == null) {
            insurance = new ArrayList<InsuranceType>();
        }
        return this.insurance;
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
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

}
