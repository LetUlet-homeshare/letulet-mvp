
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
 * <p>Java class for AccessesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Access" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccessPerson" type="{http://www.escapia.com/EVRN/2007/02}PersonNameType" minOccurs="0"/>
 *                   &lt;element name="AccessComment" type="{http://www.escapia.com/EVRN/2007/02}FreeTextType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ActionType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Create"/>
 *                       &lt;enumeration value="Read"/>
 *                       &lt;enumeration value="Update"/>
 *                       &lt;enumeration value="Delete"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ActionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessesType", propOrder = {
    "access"
})
public class AccessesType {

    @XmlElement(name = "Access")
    protected List<AccessesType.Access> access;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;

    /**
     * Gets the value of the access property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the access property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessesType.Access }
     * 
     * 
     */
    public List<AccessesType.Access> getAccess() {
        if (access == null) {
            access = new ArrayList<AccessesType.Access>();
        }
        return this.access;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AccessPerson" type="{http://www.escapia.com/EVRN/2007/02}PersonNameType" minOccurs="0"/>
     *         &lt;element name="AccessComment" type="{http://www.escapia.com/EVRN/2007/02}FreeTextType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ActionType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Create"/>
     *             &lt;enumeration value="Read"/>
     *             &lt;enumeration value="Update"/>
     *             &lt;enumeration value="Delete"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ActionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accessPerson",
        "accessComment"
    })
    public static class Access {

        @XmlElement(name = "AccessPerson")
        protected PersonNameType accessPerson;
        @XmlElement(name = "AccessComment")
        protected FreeTextType accessComment;
        @XmlAttribute(name = "ActionType")
        protected String actionType;
        @XmlAttribute(name = "ActionDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar actionDateTime;
        @XmlAttribute(name = "ID")
        protected String id;

        /**
         * Gets the value of the accessPerson property.
         * 
         * @return
         *     possible object is
         *     {@link PersonNameType }
         *     
         */
        public PersonNameType getAccessPerson() {
            return accessPerson;
        }

        /**
         * Sets the value of the accessPerson property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonNameType }
         *     
         */
        public void setAccessPerson(PersonNameType value) {
            this.accessPerson = value;
        }

        /**
         * Gets the value of the accessComment property.
         * 
         * @return
         *     possible object is
         *     {@link FreeTextType }
         *     
         */
        public FreeTextType getAccessComment() {
            return accessComment;
        }

        /**
         * Sets the value of the accessComment property.
         * 
         * @param value
         *     allowed object is
         *     {@link FreeTextType }
         *     
         */
        public void setAccessComment(FreeTextType value) {
            this.accessComment = value;
        }

        /**
         * Gets the value of the actionType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionType() {
            return actionType;
        }

        /**
         * Sets the value of the actionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionType(String value) {
            this.actionType = value;
        }

        /**
         * Gets the value of the actionDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getActionDateTime() {
            return actionDateTime;
        }

        /**
         * Sets the value of the actionDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setActionDateTime(XMLGregorianCalendar value) {
            this.actionDateTime = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

    }

}
