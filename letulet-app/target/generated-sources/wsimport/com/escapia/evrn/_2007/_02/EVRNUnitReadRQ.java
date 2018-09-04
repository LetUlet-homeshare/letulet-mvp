
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}EVRN_BaseRQType">
 *       &lt;sequence>
 *         &lt;element name="UniqueID" type="{http://www.escapia.com/EVRN/2007/02}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="ReadRequests" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="ReadRequest" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="UniqueID" type="{http://www.escapia.com/EVRN/2007/02}UniqueID_Type" minOccurs="0"/>
 *                               &lt;element name="Verification" type="{http://www.escapia.com/EVRN/2007/02}VerificationType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="HistoryRequestedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                             &lt;attribute name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                             &lt;attribute name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                             &lt;attribute name="requestDateType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="summaryOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                             &lt;attribute name="maxResults" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="GlobalReservationReadRequest" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="TravelerName" type="{http://www.escapia.com/EVRN/2007/02}PersonNameType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="Release" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ReqRespVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReservationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReturnListIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "uniqueID",
    "readRequests"
})
@XmlRootElement(name = "EVRN_UnitReadRQ")
public class EVRNUnitReadRQ
    extends EVRNBaseRQType
{

    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "ReadRequests")
    protected EVRNUnitReadRQ.ReadRequests readRequests;
    @XmlAttribute(name = "ReqRespVersion")
    protected String reqRespVersion;
    @XmlAttribute(name = "ReservationType")
    protected String reservationType;
    @XmlAttribute(name = "ReturnListIndicator")
    protected Boolean returnListIndicator;
    @XmlAttribute(name = "MoreIndicator")
    protected Boolean moreIndicator;
    @XmlAttribute(name = "MoreDataEchoToken")
    protected String moreDataEchoToken;

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
     * Gets the value of the readRequests property.
     * 
     * @return
     *     possible object is
     *     {@link EVRNUnitReadRQ.ReadRequests }
     *     
     */
    public EVRNUnitReadRQ.ReadRequests getReadRequests() {
        return readRequests;
    }

    /**
     * Sets the value of the readRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link EVRNUnitReadRQ.ReadRequests }
     *     
     */
    public void setReadRequests(EVRNUnitReadRQ.ReadRequests value) {
        this.readRequests = value;
    }

    /**
     * Gets the value of the reqRespVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqRespVersion() {
        return reqRespVersion;
    }

    /**
     * Sets the value of the reqRespVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqRespVersion(String value) {
        this.reqRespVersion = value;
    }

    /**
     * Gets the value of the reservationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationType() {
        return reservationType;
    }

    /**
     * Sets the value of the reservationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationType(String value) {
        this.reservationType = value;
    }

    /**
     * Gets the value of the returnListIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnListIndicator() {
        return returnListIndicator;
    }

    /**
     * Sets the value of the returnListIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnListIndicator(Boolean value) {
        this.returnListIndicator = value;
    }

    /**
     * Gets the value of the moreIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreIndicator() {
        return moreIndicator;
    }

    /**
     * Sets the value of the moreIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreIndicator(Boolean value) {
        this.moreIndicator = value;
    }

    /**
     * Gets the value of the moreDataEchoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreDataEchoToken() {
        return moreDataEchoToken;
    }

    /**
     * Sets the value of the moreDataEchoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreDataEchoToken(String value) {
        this.moreDataEchoToken = value;
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
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="ReadRequest" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="UniqueID" type="{http://www.escapia.com/EVRN/2007/02}UniqueID_Type" minOccurs="0"/>
     *                     &lt;element name="Verification" type="{http://www.escapia.com/EVRN/2007/02}VerificationType" minOccurs="0"/>
     *                   &lt;/sequence>
     *                   &lt;attribute name="HistoryRequestedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                   &lt;attribute name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                   &lt;attribute name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                   &lt;attribute name="requestDateType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="summaryOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                   &lt;attribute name="maxResults" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="GlobalReservationReadRequest" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="TravelerName" type="{http://www.escapia.com/EVRN/2007/02}PersonNameType" minOccurs="0"/>
     *                   &lt;/sequence>
     *                   &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="Release" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "readRequestOrGlobalReservationReadRequest"
    })
    public static class ReadRequests {

        @XmlElements({
            @XmlElement(name = "ReadRequest", type = EVRNUnitReadRQ.ReadRequests.ReadRequest.class),
            @XmlElement(name = "GlobalReservationReadRequest", type = EVRNUnitReadRQ.ReadRequests.GlobalReservationReadRequest.class)
        })
        protected List<Object> readRequestOrGlobalReservationReadRequest;

        /**
         * Gets the value of the readRequestOrGlobalReservationReadRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the readRequestOrGlobalReservationReadRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReadRequestOrGlobalReservationReadRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EVRNUnitReadRQ.ReadRequests.ReadRequest }
         * {@link EVRNUnitReadRQ.ReadRequests.GlobalReservationReadRequest }
         * 
         * 
         */
        public List<Object> getReadRequestOrGlobalReservationReadRequest() {
            if (readRequestOrGlobalReservationReadRequest == null) {
                readRequestOrGlobalReservationReadRequest = new ArrayList<Object>();
            }
            return this.readRequestOrGlobalReservationReadRequest;
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
         *         &lt;element name="TravelerName" type="{http://www.escapia.com/EVRN/2007/02}PersonNameType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Release" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "travelerName"
        })
        public static class GlobalReservationReadRequest {

            @XmlElement(name = "TravelerName")
            protected PersonNameType travelerName;
            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected String duration;
            @XmlAttribute(name = "End")
            protected String end;
            @XmlAttribute(name = "Release")
            protected String release;

            /**
             * Gets the value of the travelerName property.
             * 
             * @return
             *     possible object is
             *     {@link PersonNameType }
             *     
             */
            public PersonNameType getTravelerName() {
                return travelerName;
            }

            /**
             * Sets the value of the travelerName property.
             * 
             * @param value
             *     allowed object is
             *     {@link PersonNameType }
             *     
             */
            public void setTravelerName(PersonNameType value) {
                this.travelerName = value;
            }

            /**
             * Gets the value of the start property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStart() {
                return start;
            }

            /**
             * Sets the value of the start property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStart(String value) {
                this.start = value;
            }

            /**
             * Gets the value of the duration property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDuration() {
                return duration;
            }

            /**
             * Sets the value of the duration property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDuration(String value) {
                this.duration = value;
            }

            /**
             * Gets the value of the end property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnd() {
                return end;
            }

            /**
             * Sets the value of the end property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnd(String value) {
                this.end = value;
            }

            /**
             * Gets the value of the release property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelease() {
                return release;
            }

            /**
             * Sets the value of the release property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelease(String value) {
                this.release = value;
            }

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
         *         &lt;element name="UniqueID" type="{http://www.escapia.com/EVRN/2007/02}UniqueID_Type" minOccurs="0"/>
         *         &lt;element name="Verification" type="{http://www.escapia.com/EVRN/2007/02}VerificationType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="HistoryRequestedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="requestDateType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="summaryOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="maxResults" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "uniqueID",
            "verification"
        })
        public static class ReadRequest {

            @XmlElement(name = "UniqueID")
            protected UniqueIDType uniqueID;
            @XmlElement(name = "Verification")
            protected VerificationType verification;
            @XmlAttribute(name = "HistoryRequestedInd")
            protected Boolean historyRequestedInd;
            @XmlAttribute(name = "startDate")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar startDate;
            @XmlAttribute(name = "endDate")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar endDate;
            @XmlAttribute(name = "requestDateType")
            protected String requestDateType;
            @XmlAttribute(name = "summaryOnly")
            protected Boolean summaryOnly;
            @XmlAttribute(name = "maxResults")
            protected Integer maxResults;

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
             * Gets the value of the verification property.
             * 
             * @return
             *     possible object is
             *     {@link VerificationType }
             *     
             */
            public VerificationType getVerification() {
                return verification;
            }

            /**
             * Sets the value of the verification property.
             * 
             * @param value
             *     allowed object is
             *     {@link VerificationType }
             *     
             */
            public void setVerification(VerificationType value) {
                this.verification = value;
            }

            /**
             * Gets the value of the historyRequestedInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isHistoryRequestedInd() {
                return historyRequestedInd;
            }

            /**
             * Sets the value of the historyRequestedInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setHistoryRequestedInd(Boolean value) {
                this.historyRequestedInd = value;
            }

            /**
             * Gets the value of the startDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getStartDate() {
                return startDate;
            }

            /**
             * Sets the value of the startDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setStartDate(XMLGregorianCalendar value) {
                this.startDate = value;
            }

            /**
             * Gets the value of the endDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEndDate() {
                return endDate;
            }

            /**
             * Sets the value of the endDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEndDate(XMLGregorianCalendar value) {
                this.endDate = value;
            }

            /**
             * Gets the value of the requestDateType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestDateType() {
                return requestDateType;
            }

            /**
             * Sets the value of the requestDateType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestDateType(String value) {
                this.requestDateType = value;
            }

            /**
             * Gets the value of the summaryOnly property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSummaryOnly() {
                return summaryOnly;
            }

            /**
             * Sets the value of the summaryOnly property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSummaryOnly(Boolean value) {
                this.summaryOnly = value;
            }

            /**
             * Gets the value of the maxResults property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxResults() {
                return maxResults;
            }

            /**
             * Sets the value of the maxResults property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxResults(Integer value) {
                this.maxResults = value;
            }

        }

    }

}
