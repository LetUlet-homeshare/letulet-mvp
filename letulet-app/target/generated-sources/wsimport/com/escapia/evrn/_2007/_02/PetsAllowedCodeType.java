
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PetsAllowedCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PetsAllowedCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pets Allowed"/>
 *     &lt;enumeration value="Pets Not Allowed"/>
 *     &lt;enumeration value="Assistive Animals Only"/>
 *     &lt;enumeration value="Pets By Arrangements"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PetsAllowedCodeType")
@XmlEnum
public enum PetsAllowedCodeType {

    @XmlEnumValue("Pets Allowed")
    PETS_ALLOWED("Pets Allowed"),
    @XmlEnumValue("Pets Not Allowed")
    PETS_NOT_ALLOWED("Pets Not Allowed"),
    @XmlEnumValue("Assistive Animals Only")
    ASSISTIVE_ANIMALS_ONLY("Assistive Animals Only"),
    @XmlEnumValue("Pets By Arrangements")
    PETS_BY_ARRANGEMENTS("Pets By Arrangements");
    private final String value;

    PetsAllowedCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PetsAllowedCodeType fromValue(String v) {
        for (PetsAllowedCodeType c: PetsAllowedCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
