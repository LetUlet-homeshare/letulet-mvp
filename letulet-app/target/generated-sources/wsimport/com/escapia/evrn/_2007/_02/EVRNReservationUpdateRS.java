
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
 *           &lt;element name="Errors" type="{http://www.escapia.com/EVRN/2007/02}ErrorsType" minOccurs="0"/>
 *           &lt;element name="ReservationUpdate" type="{http://www.escapia.com/EVRN/2007/02}ReservationUpdate" minOccurs="0"/>
 *           &lt;element name="Warnings" type="{http://www.escapia.com/EVRN/2007/02}WarningsType" minOccurs="0"/>
 *           &lt;element name="Success" type="{http://www.escapia.com/EVRN/2007/02}SuccessType" minOccurs="0"/>
 *           &lt;element name="TPA_Extensions" type="{http://www.escapia.com/EVRN/2007/02}TPA_Extensions_Type" minOccurs="0"/>
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
    "errorsOrReservationUpdateOrWarnings"
})
@XmlRootElement(name = "EVRN_ReservationUpdateRS")
public class EVRNReservationUpdateRS
    extends EVRNBaseRSType
{

    @XmlElements({
        @XmlElement(name = "Errors", type = ErrorsType.class),
        @XmlElement(name = "ReservationUpdate", type = ReservationUpdate.class),
        @XmlElement(name = "Warnings", type = WarningsType.class),
        @XmlElement(name = "Success", type = SuccessType.class),
        @XmlElement(name = "TPA_Extensions", type = TPAExtensionsType.class)
    })
    protected List<Object> errorsOrReservationUpdateOrWarnings;

    /**
     * Gets the value of the errorsOrReservationUpdateOrWarnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorsOrReservationUpdateOrWarnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorsOrReservationUpdateOrWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorsType }
     * {@link ReservationUpdate }
     * {@link WarningsType }
     * {@link SuccessType }
     * {@link TPAExtensionsType }
     * 
     * 
     */
    public List<Object> getErrorsOrReservationUpdateOrWarnings() {
        if (errorsOrReservationUpdateOrWarnings == null) {
            errorsOrReservationUpdateOrWarnings = new ArrayList<Object>();
        }
        return this.errorsOrReservationUpdateOrWarnings;
    }

}
