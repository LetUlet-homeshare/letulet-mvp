
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CabinType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="First"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Economy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CabinType")
@XmlEnum
public enum CabinType {

    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Economy")
    ECONOMY("Economy");
    private final String value;

    CabinType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CabinType fromValue(String v) {
        for (CabinType c: CabinType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
