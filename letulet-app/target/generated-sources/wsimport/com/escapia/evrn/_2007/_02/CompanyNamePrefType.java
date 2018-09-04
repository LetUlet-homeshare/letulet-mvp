
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyNamePrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyNamePrefType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.escapia.com/EVRN/2007/02>CompanyNameType">
 *       &lt;attribute name="PreferLevel" type="{http://www.escapia.com/EVRN/2007/02}PreferLevelType" default="Preferred" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyNamePrefType")
public class CompanyNamePrefType
    extends CompanyNameType
{

    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getPreferLevel() {
        if (preferLevel == null) {
            return PreferLevelType.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

}
