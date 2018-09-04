
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nightly"/>
 *     &lt;enumeration value="Weekly"/>
 *     &lt;enumeration value="Monthly"/>
 *     &lt;enumeration value="Weekend"/>
 *     &lt;enumeration value="Midweek"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateTypeType")
@XmlEnum
public enum RateTypeType {

    @XmlEnumValue("Nightly")
    NIGHTLY("Nightly"),
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("Weekend")
    WEEKEND("Weekend"),
    @XmlEnumValue("Midweek")
    MIDWEEK("Midweek");
    private final String value;

    RateTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RateTypeType fromValue(String v) {
        for (RateTypeType c: RateTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
