
package com.escapia.evrn._2007._02;

import java.math.BigInteger;
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
 * <p>Java class for ArrayOfRoutingHopTypeRoutingHop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRoutingHopTypeRoutingHop">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoutingHop" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LocalRefID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Data" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoutingHopTypeRoutingHop", propOrder = {
    "routingHop"
})
public class ArrayOfRoutingHopTypeRoutingHop {

    @XmlElement(name = "RoutingHop")
    protected List<ArrayOfRoutingHopTypeRoutingHop.RoutingHop> routingHop;

    /**
     * Gets the value of the routingHop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingHop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingHop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRoutingHopTypeRoutingHop.RoutingHop }
     * 
     * 
     */
    public List<ArrayOfRoutingHopTypeRoutingHop.RoutingHop> getRoutingHop() {
        if (routingHop == null) {
            routingHop = new ArrayList<ArrayOfRoutingHopTypeRoutingHop.RoutingHop>();
        }
        return this.routingHop;
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
     *       &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LocalRefID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Data" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RoutingHop {

        @XmlAttribute(name = "SystemCode")
        protected String systemCode;
        @XmlAttribute(name = "LocalRefID")
        protected String localRefID;
        @XmlAttribute(name = "TimeStamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timeStamp;
        @XmlAttribute(name = "Comment")
        protected String comment;
        @XmlAttribute(name = "SequenceNmbr")
        protected BigInteger sequenceNmbr;
        @XmlAttribute(name = "Data")
        protected String data;

        /**
         * Gets the value of the systemCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSystemCode() {
            return systemCode;
        }

        /**
         * Sets the value of the systemCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSystemCode(String value) {
            this.systemCode = value;
        }

        /**
         * Gets the value of the localRefID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocalRefID() {
            return localRefID;
        }

        /**
         * Sets the value of the localRefID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocalRefID(String value) {
            this.localRefID = value;
        }

        /**
         * Gets the value of the timeStamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimeStamp() {
            return timeStamp;
        }

        /**
         * Sets the value of the timeStamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimeStamp(XMLGregorianCalendar value) {
            this.timeStamp = value;
        }

        /**
         * Gets the value of the comment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComment(String value) {
            this.comment = value;
        }

        /**
         * Gets the value of the sequenceNmbr property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequenceNmbr() {
            return sequenceNmbr;
        }

        /**
         * Sets the value of the sequenceNmbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequenceNmbr(BigInteger value) {
            this.sequenceNmbr = value;
        }

        /**
         * Gets the value of the data property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getData() {
            return data;
        }

        /**
         * Sets the value of the data property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setData(String value) {
            this.data = value;
        }

    }

}
