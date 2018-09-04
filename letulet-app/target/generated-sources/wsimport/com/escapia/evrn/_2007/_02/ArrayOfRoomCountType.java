
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRoomCountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRoomCountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomCount" type="{http://www.escapia.com/EVRN/2007/02}RoomCountType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoomCountType", propOrder = {
    "roomCount"
})
public class ArrayOfRoomCountType {

    @XmlElement(name = "RoomCount")
    protected List<RoomCountType> roomCount;

    /**
     * Gets the value of the roomCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomCountType }
     * 
     * 
     */
    public List<RoomCountType> getRoomCount() {
        if (roomCount == null) {
            roomCount = new ArrayList<RoomCountType>();
        }
        return this.roomCount;
    }

}
