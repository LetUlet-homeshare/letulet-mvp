
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="InquiryRequests" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfInquiryRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inquiryRequests"
})
@XmlRootElement(name = "EVRN_UnitInquiryRQ")
public class EVRNUnitInquiryRQ
    extends EVRNBaseRQType
{

    @XmlElement(name = "InquiryRequests")
    protected ArrayOfInquiryRequestType inquiryRequests;

    /**
     * Gets the value of the inquiryRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInquiryRequestType }
     *     
     */
    public ArrayOfInquiryRequestType getInquiryRequests() {
        return inquiryRequests;
    }

    /**
     * Sets the value of the inquiryRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInquiryRequestType }
     *     
     */
    public void setInquiryRequests(ArrayOfInquiryRequestType value) {
        this.inquiryRequests = value;
    }

}
