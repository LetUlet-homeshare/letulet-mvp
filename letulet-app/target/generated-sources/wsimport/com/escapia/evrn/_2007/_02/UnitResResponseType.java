
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitResResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitResResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}EVRN_BaseRSType">
 *       &lt;sequence>
 *         &lt;element name="POS" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfSourceType" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="UnitReservations" type="{http://www.escapia.com/EVRN/2007/02}UnitReservationsType" minOccurs="0"/>
 *           &lt;element name="Errors" type="{http://www.escapia.com/EVRN/2007/02}ErrorsType" minOccurs="0"/>
 *           &lt;element name="Success" type="{http://www.escapia.com/EVRN/2007/02}SuccessType" minOccurs="0"/>
 *           &lt;element name="Warnings" type="{http://www.escapia.com/EVRN/2007/02}WarningsType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ResResponseType" type="{http://www.escapia.com/EVRN/2007/02}TransactionStatusType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitResResponseType", propOrder = {
    "pos",
    "unitReservationsOrErrorsOrSuccess"
})
public class UnitResResponseType
    extends EVRNBaseRSType
{

    @XmlElement(name = "POS")
    protected ArrayOfSourceType pos;
    @XmlElements({
        @XmlElement(name = "UnitReservations", type = UnitReservationsType.class),
        @XmlElement(name = "Errors", type = ErrorsType.class),
        @XmlElement(name = "Success", type = SuccessType.class),
        @XmlElement(name = "Warnings", type = WarningsType.class)
    })
    protected List<Object> unitReservationsOrErrorsOrSuccess;
    @XmlAttribute(name = "ResResponseType")
    protected TransactionStatusType resResponseType;

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSourceType }
     *     
     */
    public ArrayOfSourceType getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSourceType }
     *     
     */
    public void setPOS(ArrayOfSourceType value) {
        this.pos = value;
    }

    /**
     * Gets the value of the unitReservationsOrErrorsOrSuccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitReservationsOrErrorsOrSuccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitReservationsOrErrorsOrSuccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitReservationsType }
     * {@link ErrorsType }
     * {@link SuccessType }
     * {@link WarningsType }
     * 
     * 
     */
    public List<Object> getUnitReservationsOrErrorsOrSuccess() {
        if (unitReservationsOrErrorsOrSuccess == null) {
            unitReservationsOrErrorsOrSuccess = new ArrayList<Object>();
        }
        return this.unitReservationsOrErrorsOrSuccess;
    }

    /**
     * Gets the value of the resResponseType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatusType }
     *     
     */
    public TransactionStatusType getResResponseType() {
        return resResponseType;
    }

    /**
     * Sets the value of the resResponseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatusType }
     *     
     */
    public void setResResponseType(TransactionStatusType value) {
        this.resResponseType = value;
    }

}
