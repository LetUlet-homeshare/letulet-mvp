
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}EVRN_BaseRSType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Warnings" type="{http://www.escapia.com/EVRN/2007/02}WarningsType" minOccurs="0"/>
 *           &lt;element name="TPA_Extensions" type="{http://www.escapia.com/EVRN/2007/02}TPA_Extensions_Type" minOccurs="0"/>
 *           &lt;element name="Errors" type="{http://www.escapia.com/EVRN/2007/02}ErrorsType" minOccurs="0"/>
 *           &lt;element name="Campaigns" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Campaign" type="{http://www.escapia.com/EVRN/2007/02}CampaignType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Success" type="{http://www.escapia.com/EVRN/2007/02}SuccessType" minOccurs="0"/>
 *         &lt;/choice>
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
    "warningsOrTPAExtensionsOrErrors"
})
@XmlRootElement(name = "EVRN_CampaignRS")
public class EVRNCampaignRS
    extends EVRNBaseRSType
{

    @XmlElements({
        @XmlElement(name = "Warnings", type = WarningsType.class),
        @XmlElement(name = "TPA_Extensions", type = TPAExtensionsType.class),
        @XmlElement(name = "Errors", type = ErrorsType.class),
        @XmlElement(name = "Campaigns", type = EVRNCampaignRS.Campaigns.class),
        @XmlElement(name = "Success", type = SuccessType.class)
    })
    protected List<Object> warningsOrTPAExtensionsOrErrors;

    /**
     * Gets the value of the warningsOrTPAExtensionsOrErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningsOrTPAExtensionsOrErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningsOrTPAExtensionsOrErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningsType }
     * {@link TPAExtensionsType }
     * {@link ErrorsType }
     * {@link EVRNCampaignRS.Campaigns }
     * {@link SuccessType }
     * 
     * 
     */
    public List<Object> getWarningsOrTPAExtensionsOrErrors() {
        if (warningsOrTPAExtensionsOrErrors == null) {
            warningsOrTPAExtensionsOrErrors = new ArrayList<Object>();
        }
        return this.warningsOrTPAExtensionsOrErrors;
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
     *         &lt;element name="Campaign" type="{http://www.escapia.com/EVRN/2007/02}CampaignType" maxOccurs="unbounded" minOccurs="0"/>
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
        "campaign"
    })
    public static class Campaigns {

        @XmlElement(name = "Campaign")
        protected List<CampaignType> campaign;

        /**
         * Gets the value of the campaign property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the campaign property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCampaign().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CampaignType }
         * 
         * 
         */
        public List<CampaignType> getCampaign() {
            if (campaign == null) {
                campaign = new ArrayList<CampaignType>();
            }
            return this.campaign;
        }

    }

}
