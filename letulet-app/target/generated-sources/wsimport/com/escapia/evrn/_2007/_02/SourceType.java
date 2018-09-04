
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestorID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MessagePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BookingChannel" type="{http://www.escapia.com/EVRN/2007/02}BookingChannelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceType", propOrder = {
    "requestorID",
    "bookingChannel"
})
public class SourceType {

    @XmlElement(name = "RequestorID")
    protected SourceType.RequestorID requestorID;
    @XmlElement(name = "BookingChannel")
    protected BookingChannelType bookingChannel;

    /**
     * Gets the value of the requestorID property.
     * 
     * @return
     *     possible object is
     *     {@link SourceType.RequestorID }
     *     
     */
    public SourceType.RequestorID getRequestorID() {
        return requestorID;
    }

    /**
     * Sets the value of the requestorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType.RequestorID }
     *     
     */
    public void setRequestorID(SourceType.RequestorID value) {
        this.requestorID = value;
    }

    /**
     * Gets the value of the bookingChannel property.
     * 
     * @return
     *     possible object is
     *     {@link BookingChannelType }
     *     
     */
    public BookingChannelType getBookingChannel() {
        return bookingChannel;
    }

    /**
     * Sets the value of the bookingChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingChannelType }
     *     
     */
    public void setBookingChannel(BookingChannelType value) {
        this.bookingChannel = value;
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
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MessagePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RequestorID {

        @XmlAttribute(name = "ID")
        protected String id;
        @XmlAttribute(name = "MessagePassword")
        protected String messagePassword;

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

        /**
         * Gets the value of the messagePassword property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessagePassword() {
            return messagePassword;
        }

        /**
         * Sets the value of the messagePassword property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessagePassword(String value) {
            this.messagePassword = value;
        }

    }

}
