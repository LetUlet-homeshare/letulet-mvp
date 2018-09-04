
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
 * <p>Java class for EmployerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName" type="{http://www.escapia.com/EVRN/2007/02}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="RelatedEmployer" type="{http://www.escapia.com/EVRN/2007/02}CompanyNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmployeeInfo" type="{http://www.escapia.com/EVRN/2007/02}EmployeeInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InternalRefNmbr" type="{http://www.escapia.com/EVRN/2007/02}FreeTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TravelArranger" type="{http://www.escapia.com/EVRN/2007/02}TravelArrangerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LoyaltyProgram" type="{http://www.escapia.com/EVRN/2007/02}LoyaltyProgramType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DefaultInd" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OfficeType" type="{http://www.escapia.com/EVRN/2007/02}OfficeLocationType" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployerType", propOrder = {
    "companyName",
    "relatedEmployer",
    "employeeInfo",
    "internalRefNmbr",
    "travelArranger",
    "loyaltyProgram"
})
public class EmployerType {

    @XmlElement(name = "CompanyName")
    protected CompanyNameType companyName;
    @XmlElement(name = "RelatedEmployer")
    protected List<CompanyNameType> relatedEmployer;
    @XmlElement(name = "EmployeeInfo")
    protected List<EmployeeInfoType> employeeInfo;
    @XmlElement(name = "InternalRefNmbr")
    protected List<FreeTextType> internalRefNmbr;
    @XmlElement(name = "TravelArranger")
    protected List<TravelArrangerType> travelArranger;
    @XmlElement(name = "LoyaltyProgram")
    protected List<LoyaltyProgramType> loyaltyProgram;
    @XmlAttribute(name = "DefaultInd")
    protected Boolean defaultInd;
    @XmlAttribute(name = "OfficeType")
    protected OfficeLocationType officeType;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setCompanyName(CompanyNameType value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the relatedEmployer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedEmployer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedEmployer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNameType }
     * 
     * 
     */
    public List<CompanyNameType> getRelatedEmployer() {
        if (relatedEmployer == null) {
            relatedEmployer = new ArrayList<CompanyNameType>();
        }
        return this.relatedEmployer;
    }

    /**
     * Gets the value of the employeeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeInfoType }
     * 
     * 
     */
    public List<EmployeeInfoType> getEmployeeInfo() {
        if (employeeInfo == null) {
            employeeInfo = new ArrayList<EmployeeInfoType>();
        }
        return this.employeeInfo;
    }

    /**
     * Gets the value of the internalRefNmbr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalRefNmbr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalRefNmbr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeTextType }
     * 
     * 
     */
    public List<FreeTextType> getInternalRefNmbr() {
        if (internalRefNmbr == null) {
            internalRefNmbr = new ArrayList<FreeTextType>();
        }
        return this.internalRefNmbr;
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
     * Gets the value of the loyaltyProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyProgramType }
     * 
     * 
     */
    public List<LoyaltyProgramType> getLoyaltyProgram() {
        if (loyaltyProgram == null) {
            loyaltyProgram = new ArrayList<LoyaltyProgramType>();
        }
        return this.loyaltyProgram;
    }

    /**
     * Gets the value of the defaultInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDefaultInd() {
        if (defaultInd == null) {
            return false;
        } else {
            return defaultInd;
        }
    }

    /**
     * Sets the value of the defaultInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultInd(Boolean value) {
        this.defaultInd = value;
    }

    /**
     * Gets the value of the officeType property.
     * 
     * @return
     *     possible object is
     *     {@link OfficeLocationType }
     *     
     */
    public OfficeLocationType getOfficeType() {
        return officeType;
    }

    /**
     * Sets the value of the officeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficeLocationType }
     *     
     */
    public void setOfficeType(OfficeLocationType value) {
        this.officeType = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

}
