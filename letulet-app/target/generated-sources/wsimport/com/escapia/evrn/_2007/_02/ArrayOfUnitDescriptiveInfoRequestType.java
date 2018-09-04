
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUnitDescriptiveInfoRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnitDescriptiveInfoRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitDescriptiveInfo" type="{http://www.escapia.com/EVRN/2007/02}UnitDescriptiveInfoRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUnitDescriptiveInfoRequestType", propOrder = {
    "unitDescriptiveInfo"
})
public class ArrayOfUnitDescriptiveInfoRequestType {

    @XmlElement(name = "UnitDescriptiveInfo")
    protected List<UnitDescriptiveInfoRequestType> unitDescriptiveInfo;

    /**
     * Gets the value of the unitDescriptiveInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitDescriptiveInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitDescriptiveInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitDescriptiveInfoRequestType }
     * 
     * 
     */
    public List<UnitDescriptiveInfoRequestType> getUnitDescriptiveInfo() {
        if (unitDescriptiveInfo == null) {
            unitDescriptiveInfo = new ArrayList<UnitDescriptiveInfoRequestType>();
        }
        return this.unitDescriptiveInfo;
    }

}
