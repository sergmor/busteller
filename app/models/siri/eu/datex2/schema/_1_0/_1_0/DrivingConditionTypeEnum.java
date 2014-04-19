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
 * <p>Java class for DrivingConditionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DrivingConditionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="impossible"/>
 *     &lt;enumeration value="hazardous"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="passableWithCare"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="veryHazardous"/>
 *     &lt;enumeration value="winterConditions"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DrivingConditionTypeEnum")
@XmlEnum
public enum DrivingConditionTypeEnum {


    /**
     * Current conditions are making driving impossible.
     * 
     */
    @XmlEnumValue("impossible")
    IMPOSSIBLE("impossible"),

    /**
     * Driving conditions are hazardous due to environmental conditions.
     * 
     */
    @XmlEnumValue("hazardous")
    HAZARDOUS("hazardous"),

    /**
     * Driving conditions are normal.
     * 
     */
    @XmlEnumValue("normal")
    NORMAL("normal"),

    /**
     * The roadway is passable to vehicles with driver care.
     * 
     */
    @XmlEnumValue("passableWithCare")
    PASSABLE_WITH_CARE("passableWithCare"),

    /**
     * Driving conditions are unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Driving conditions are very hazardous due to environmental conditions.
     * 
     */
    @XmlEnumValue("veryHazardous")
    VERY_HAZARDOUS("veryHazardous"),

    /**
     * Driving conditions are consistent with those expected in winter.
     * 
     */
    @XmlEnumValue("winterConditions")
    WINTER_CONDITIONS("winterConditions"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    DrivingConditionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DrivingConditionTypeEnum fromValue(String v) {
        for (DrivingConditionTypeEnum c: DrivingConditionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
