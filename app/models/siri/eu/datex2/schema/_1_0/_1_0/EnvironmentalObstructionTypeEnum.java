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
 * <p>Java class for EnvironmentalObstructionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnvironmentalObstructionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="avalanches"/>
 *     &lt;enumeration value="earthquakeDamage"/>
 *     &lt;enumeration value="fallenTrees"/>
 *     &lt;enumeration value="flashFloods"/>
 *     &lt;enumeration value="flooding"/>
 *     &lt;enumeration value="grassFire"/>
 *     &lt;enumeration value="landslips"/>
 *     &lt;enumeration value="mudSlide"/>
 *     &lt;enumeration value="rockfalls"/>
 *     &lt;enumeration value="seriousFire"/>
 *     &lt;enumeration value="sewerOverflow"/>
 *     &lt;enumeration value="stormDamage"/>
 *     &lt;enumeration value="subsidence"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnvironmentalObstructionTypeEnum")
@XmlEnum
public enum EnvironmentalObstructionTypeEnum {


    /**
     * The road may be obstructed or partially obstructed due to snowslides.
     * 
     */
    @XmlEnumValue("avalanches")
    AVALANCHES("avalanches"),

    /**
     * The road may be obstructed or partially obstructed because of damage caused by an earthquake.
     * 
     */
    @XmlEnumValue("earthquakeDamage")
    EARTHQUAKE_DAMAGE("earthquakeDamage"),

    /**
     * The road is obstructed or partially obstructed by one or more fallen trees.
     * 
     */
    @XmlEnumValue("fallenTrees")
    FALLEN_TREES("fallenTrees"),

    /**
     * The road may become quickly inundated by powerful floodwaters due to heavy rain nearby.
     * 
     */
    @XmlEnumValue("flashFloods")
    FLASH_FLOODS("flashFloods"),

    /**
     * The road is obstructed or partially obstructed by flood water.
     * 
     */
    @XmlEnumValue("flooding")
    FLOODING("flooding"),

    /**
     * Traffic may be disrupted due to a grass fire adjacent to the roadway.
     * 
     */
    @XmlEnumValue("grassFire")
    GRASS_FIRE("grassFire"),

    /**
     * The road may be obstructed or partially obstructed due to landslides.
     * 
     */
    @XmlEnumValue("landslips")
    LANDSLIPS("landslips"),

    /**
     * The road may be obstructed or partially obstructed due to mudslides.
     * 
     */
    @XmlEnumValue("mudSlide")
    MUD_SLIDE("mudSlide"),

    /**
     * The road may be obstructed or partially obstructed due to fallen rocks.
     * 
     */
    @XmlEnumValue("rockfalls")
    ROCKFALLS("rockfalls"),

    /**
     * Traffic may be disrupted due to a fire (other than a vehicle fire) adjacent to the roadway.
     * 
     */
    @XmlEnumValue("seriousFire")
    SERIOUS_FIRE("seriousFire"),

    /**
     * The road is obstructed or partially obstructed by overflows from one or more sewers.
     * 
     */
    @XmlEnumValue("sewerOverflow")
    SEWER_OVERFLOW("sewerOverflow"),

    /**
     * The road may be obstructed or partially obstructed by debris caused by strong winds.
     * 
     */
    @XmlEnumValue("stormDamage")
    STORM_DAMAGE("stormDamage"),

    /**
     * The road surface has sunken or collapsed in places.
     * 
     */
    @XmlEnumValue("subsidence")
    SUBSIDENCE("subsidence"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EnvironmentalObstructionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnvironmentalObstructionTypeEnum fromValue(String v) {
        for (EnvironmentalObstructionTypeEnum c: EnvironmentalObstructionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
