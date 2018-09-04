
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
 *         &lt;element name="CampaignRequests" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfCampaignRequestType" minOccurs="0"/>
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
    "campaignRequests"
})
@XmlRootElement(name = "EVRN_CampaignRQ")
public class EVRNCampaignRQ
    extends EVRNBaseRQType
{

    @XmlElement(name = "CampaignRequests")
    protected ArrayOfCampaignRequestType campaignRequests;

    /**
     * Gets the value of the campaignRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampaignRequestType }
     *     
     */
    public ArrayOfCampaignRequestType getCampaignRequests() {
        return campaignRequests;
    }

    /**
     * Sets the value of the campaignRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampaignRequestType }
     *     
     */
    public void setCampaignRequests(ArrayOfCampaignRequestType value) {
        this.campaignRequests = value;
    }

}
