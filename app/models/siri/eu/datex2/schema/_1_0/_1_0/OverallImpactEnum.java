//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package models.siri.eu.datex2.schema._1_0._1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverallImpactEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OverallImpactEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="highest"/>
 *     &lt;enumeration value="high"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="low"/>
 *     &lt;enumeration value="lowest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OverallImpactEnum")
@XmlEnum
public enum OverallImpactEnum {


    /**
     * Perceived by supplier as being of the highest level.
     * 
     */
    @XmlEnumValue("highest")
    HIGHEST("highest"),

    /**
     * Perceived by supplier as being of a high level.
     * 
     */
    @XmlEnumValue("high")
    HIGH("high"),

    /**
     * Perceived by supplier as being of a normal level.
     * 
     */
    @XmlEnumValue("normal")
    NORMAL("normal"),

    /**
     * Perceived by supplier as being of a low level.
     * 
     */
    @XmlEnumValue("low")
    LOW("low"),

    /**
     * Perceived by supplier as being of the lowest level.
     * 
     */
    @XmlEnumValue("lowest")
    LOWEST("lowest");
    private final String value;

    OverallImpactEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OverallImpactEnum fromValue(String v) {
        for (OverallImpactEnum c: OverallImpactEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
