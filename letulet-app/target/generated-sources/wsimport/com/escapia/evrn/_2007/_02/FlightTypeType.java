
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nonstop"/>
 *     &lt;enumeration value="Direct"/>
 *     &lt;enumeration value="Connection"/>
 *     &lt;enumeration value="SingleConnection"/>
 *     &lt;enumeration value="DoubleConnection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlightTypeType")
@XmlEnum
public enum FlightTypeType {

    @XmlEnumValue("Nonstop")
    NONSTOP("Nonstop"),
    @XmlEnumValue("Direct")
    DIRECT("Direct"),
    @XmlEnumValue("Connection")
    CONNECTION("Connection"),
    @XmlEnumValue("SingleConnection")
    SINGLE_CONNECTION("SingleConnection"),
    @XmlEnumValue("DoubleConnection")
    DOUBLE_CONNECTION("DoubleConnection");
    private final String value;

    FlightTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightTypeType fromValue(String v) {
        for (FlightTypeType c: FlightTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
