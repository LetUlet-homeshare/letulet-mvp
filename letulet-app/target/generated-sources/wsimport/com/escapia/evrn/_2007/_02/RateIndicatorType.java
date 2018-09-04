
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ChangeDuringStay"/>
 *     &lt;enumeration value="MultipleNights"/>
 *     &lt;enumeration value="Exclusive"/>
 *     &lt;enumeration value="OnRequest"/>
 *     &lt;enumeration value="LimitedAvailability"/>
 *     &lt;enumeration value="AvailableForSale"/>
 *     &lt;enumeration value="ClosedOut"/>
 *     &lt;enumeration value="OtherAvailable"/>
 *     &lt;enumeration value="UnableToProcess"/>
 *     &lt;enumeration value="NoAvailability"/>
 *     &lt;enumeration value="RoomTypeClosed"/>
 *     &lt;enumeration value="RatePlanClosed"/>
 *     &lt;enumeration value="LOS_Restricted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateIndicatorType")
@XmlEnum
public enum RateIndicatorType {

    @XmlEnumValue("ChangeDuringStay")
    CHANGE_DURING_STAY("ChangeDuringStay"),
    @XmlEnumValue("MultipleNights")
    MULTIPLE_NIGHTS("MultipleNights"),
    @XmlEnumValue("Exclusive")
    EXCLUSIVE("Exclusive"),
    @XmlEnumValue("OnRequest")
    ON_REQUEST("OnRequest"),
    @XmlEnumValue("LimitedAvailability")
    LIMITED_AVAILABILITY("LimitedAvailability"),
    @XmlEnumValue("AvailableForSale")
    AVAILABLE_FOR_SALE("AvailableForSale"),
    @XmlEnumValue("ClosedOut")
    CLOSED_OUT("ClosedOut"),
    @XmlEnumValue("OtherAvailable")
    OTHER_AVAILABLE("OtherAvailable"),
    @XmlEnumValue("UnableToProcess")
    UNABLE_TO_PROCESS("UnableToProcess"),
    @XmlEnumValue("NoAvailability")
    NO_AVAILABILITY("NoAvailability"),
    @XmlEnumValue("RoomTypeClosed")
    ROOM_TYPE_CLOSED("RoomTypeClosed"),
    @XmlEnumValue("RatePlanClosed")
    RATE_PLAN_CLOSED("RatePlanClosed"),
    @XmlEnumValue("LOS_Restricted")
    LOS_RESTRICTED("LOS_Restricted");
    private final String value;

    RateIndicatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RateIndicatorType fromValue(String v) {
        for (RateIndicatorType c: RateIndicatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
