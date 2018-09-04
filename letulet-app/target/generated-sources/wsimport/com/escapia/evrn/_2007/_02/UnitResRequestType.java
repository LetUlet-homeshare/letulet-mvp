
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitResRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitResRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}EVRN_BaseRQType">
 *       &lt;sequence>
 *         &lt;element name="UniqueID" type="{http://www.escapia.com/EVRN/2007/02}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnitReservations" type="{http://www.escapia.com/EVRN/2007/02}UnitReservationsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ResStatus" type="{http://www.escapia.com/EVRN/2007/02}TransactionActionType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitResRequestType", propOrder = {
    "uniqueID",
    "unitReservations"
})
public class UnitResRequestType
    extends EVRNBaseRQType
{

    @XmlElement(name = "UniqueID")
    protected List<UniqueIDType> uniqueID;
    @XmlElement(name = "UnitReservations")
    protected UnitReservationsType unitReservations;
    @XmlAttribute(name = "ResStatus")
    protected TransactionActionType resStatus;

    /**
     * Gets the value of the uniqueID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniqueID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniqueID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIDType }
     * 
     * 
     */
    public List<UniqueIDType> getUniqueID() {
        if (uniqueID == null) {
            uniqueID = new ArrayList<UniqueIDType>();
        }
        return this.uniqueID;
    }

    /**
     * Gets the value of the unitReservations property.
     * 
     * @return
     *     possible object is
     *     {@link UnitReservationsType }
     *     
     */
    public UnitReservationsType getUnitReservations() {
        return unitReservations;
    }

    /**
     * Sets the value of the unitReservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitReservationsType }
     *     
     */
    public void setUnitReservations(UnitReservationsType value) {
        this.unitReservations = value;
    }

    /**
     * Gets the value of the resStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionActionType }
     *     
     */
    public TransactionActionType getResStatus() {
        return resStatus;
    }

    /**
     * Sets the value of the resStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionActionType }
     *     
     */
    public void setResStatus(TransactionActionType value) {
        this.resStatus = value;
    }

}
