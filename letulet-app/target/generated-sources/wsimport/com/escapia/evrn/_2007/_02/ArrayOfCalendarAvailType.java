
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCalendarAvailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCalendarAvailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalendarAvail" type="{http://www.escapia.com/EVRN/2007/02}CalendarAvailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCalendarAvailType", propOrder = {
    "calendarAvail"
})
public class ArrayOfCalendarAvailType {

    @XmlElement(name = "CalendarAvail")
    protected List<CalendarAvailType> calendarAvail;

    /**
     * Gets the value of the calendarAvail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calendarAvail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalendarAvail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalendarAvailType }
     * 
     * 
     */
    public List<CalendarAvailType> getCalendarAvail() {
        if (calendarAvail == null) {
            calendarAvail = new ArrayList<CalendarAvailType>();
        }
        return this.calendarAvail;
    }

}
