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
 * <p>Java class for DirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DirectionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="anticlockwise"/>
 *     &lt;enumeration value="clockwise"/>
 *     &lt;enumeration value="northBound"/>
 *     &lt;enumeration value="northEastBound"/>
 *     &lt;enumeration value="eastBound"/>
 *     &lt;enumeration value="southEastBound"/>
 *     &lt;enumeration value="southBound"/>
 *     &lt;enumeration value="southWestBound"/>
 *     &lt;enumeration value="westBound"/>
 *     &lt;enumeration value="northWestBound"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectionEnum")
@XmlEnum
public enum DirectionEnum {


    /**
     * In the anticlockwise direction of travel on a ring road.
     * 
     */
    @XmlEnumValue("anticlockwise")
    ANTICLOCKWISE("anticlockwise"),

    /**
     * In the clockwise direction of travel on a ring road.
     * 
     */
    @XmlEnumValue("clockwise")
    CLOCKWISE("clockwise"),

    /**
     * In the north bound direction of travel.
     * 
     */
    @XmlEnumValue("northBound")
    NORTH_BOUND("northBound"),

    /**
     * In the north east bound direction of travel.
     * 
     */
    @XmlEnumValue("northEastBound")
    NORTH_EAST_BOUND("northEastBound"),

    /**
     * In the east bound direction of travel.
     * 
     */
    @XmlEnumValue("eastBound")
    EAST_BOUND("eastBound"),

    /**
     * In the south east bound direction of travel.
     * 
     */
    @XmlEnumValue("southEastBound")
    SOUTH_EAST_BOUND("southEastBound"),

    /**
     * In the south bound direction of travel.
     * 
     */
    @XmlEnumValue("southBound")
    SOUTH_BOUND("southBound"),

    /**
     * In the south west bound direction of travel.
     * 
     */
    @XmlEnumValue("southWestBound")
    SOUTH_WEST_BOUND("southWestBound"),

    /**
     * In the west bound direction of travel.
     * 
     */
    @XmlEnumValue("westBound")
    WEST_BOUND("westBound"),

    /**
     * In the north west bound direction of travel.
     * 
     */
    @XmlEnumValue("northWestBound")
    NORTH_WEST_BOUND("northWestBound");
    private final String value;

    DirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionEnum fromValue(String v) {
        for (DirectionEnum c: DirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
