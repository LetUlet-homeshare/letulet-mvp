
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PMS_ResStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PMS_ResStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Reserved"/>
 *     &lt;enumeration value="Requested"/>
 *     &lt;enumeration value="Request denied"/>
 *     &lt;enumeration value="No-show"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="In-house"/>
 *     &lt;enumeration value="Checked out"/>
 *     &lt;enumeration value="Waitlisted"/>
 *     &lt;enumeration value="Cancelled By Owner"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PMS_ResStatusType")
@XmlEnum
public enum PMSResStatusType {

    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),
    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("Request denied")
    REQUEST_DENIED("Request denied"),
    @XmlEnumValue("No-show")
    NO_SHOW("No-show"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("In-house")
    IN_HOUSE("In-house"),
    @XmlEnumValue("Checked out")
    CHECKED_OUT("Checked out"),
    @XmlEnumValue("Waitlisted")
    WAITLISTED("Waitlisted"),
    @XmlEnumValue("Cancelled By Owner")
    CANCELLED_BY_OWNER("Cancelled By Owner");
    private final String value;

    PMSResStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PMSResStatusType fromValue(String v) {
        for (PMSResStatusType c: PMSResStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
