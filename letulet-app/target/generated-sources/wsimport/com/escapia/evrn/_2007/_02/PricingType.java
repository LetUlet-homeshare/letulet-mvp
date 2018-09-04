
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PricingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Per stay"/>
 *     &lt;enumeration value="Per person"/>
 *     &lt;enumeration value="Per night"/>
 *     &lt;enumeration value="Per person per night"/>
 *     &lt;enumeration value="Per use"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PricingType")
@XmlEnum
public enum PricingType {

    @XmlEnumValue("Per stay")
    PER_STAY("Per stay"),
    @XmlEnumValue("Per person")
    PER_PERSON("Per person"),
    @XmlEnumValue("Per night")
    PER_NIGHT("Per night"),
    @XmlEnumValue("Per person per night")
    PER_PERSON_PER_NIGHT("Per person per night"),
    @XmlEnumValue("Per use")
    PER_USE("Per use");
    private final String value;

    PricingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PricingType fromValue(String v) {
        for (PricingType c: PricingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
