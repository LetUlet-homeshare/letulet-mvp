
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="UnitDescriptiveInfos" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfUnitDescriptiveInfoRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SummaryOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "unitDescriptiveInfos"
})
@XmlRootElement(name = "EVRN_UnitDescriptiveInfoRQ")
public class EVRNUnitDescriptiveInfoRQ
    extends EVRNBaseRQType
{

    @XmlElement(name = "UnitDescriptiveInfos")
    protected ArrayOfUnitDescriptiveInfoRequestType unitDescriptiveInfos;
    @XmlAttribute(name = "SummaryOnly")
    protected Boolean summaryOnly;

    /**
     * Gets the value of the unitDescriptiveInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnitDescriptiveInfoRequestType }
     *     
     */
    public ArrayOfUnitDescriptiveInfoRequestType getUnitDescriptiveInfos() {
        return unitDescriptiveInfos;
    }

    /**
     * Sets the value of the unitDescriptiveInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnitDescriptiveInfoRequestType }
     *     
     */
    public void setUnitDescriptiveInfos(ArrayOfUnitDescriptiveInfoRequestType value) {
        this.unitDescriptiveInfos = value;
    }

    /**
     * Gets the value of the summaryOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSummaryOnly() {
        if (summaryOnly == null) {
            return false;
        } else {
            return summaryOnly;
        }
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

}
