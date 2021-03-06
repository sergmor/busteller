//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package models.uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TramSubmodesOfTransportEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TramSubmodesOfTransportEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti6_0"/>
 *     &lt;enumeration value="loc12_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti6_1"/>
 *     &lt;enumeration value="loc12_1"/>
 *     &lt;enumeration value="cityTram"/>
 *     &lt;enumeration value="pti6_2"/>
 *     &lt;enumeration value="localTramService"/>
 *     &lt;enumeration value="pti6_3"/>
 *     &lt;enumeration value="regionalTram"/>
 *     &lt;enumeration value="pti6_4"/>
 *     &lt;enumeration value="loc12_2"/>
 *     &lt;enumeration value="sightseeingTram"/>
 *     &lt;enumeration value="pti6_5"/>
 *     &lt;enumeration value="shuttleTram"/>
 *     &lt;enumeration value="pti6_6"/>
 *     &lt;enumeration value="allTramServices"/>
 *     &lt;enumeration value="pti6_255"/>
 *     &lt;enumeration value="loc12_255"/>
 *     &lt;enumeration value="undefinedTramService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TramSubmodesOfTransportEnumeration")
@XmlEnum
public enum TramSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti6_0")
    PTI_6_0("pti6_0"),
    @XmlEnumValue("loc12_0")
    LOC_12_0("loc12_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti6_1")
    PTI_6_1("pti6_1"),
    @XmlEnumValue("loc12_1")
    LOC_12_1("loc12_1"),
    @XmlEnumValue("cityTram")
    CITY_TRAM("cityTram"),
    @XmlEnumValue("pti6_2")
    PTI_6_2("pti6_2"),
    @XmlEnumValue("localTramService")
    LOCAL_TRAM_SERVICE("localTramService"),
    @XmlEnumValue("pti6_3")
    PTI_6_3("pti6_3"),
    @XmlEnumValue("regionalTram")
    REGIONAL_TRAM("regionalTram"),
    @XmlEnumValue("pti6_4")
    PTI_6_4("pti6_4"),
    @XmlEnumValue("loc12_2")
    LOC_12_2("loc12_2"),
    @XmlEnumValue("sightseeingTram")
    SIGHTSEEING_TRAM("sightseeingTram"),
    @XmlEnumValue("pti6_5")
    PTI_6_5("pti6_5"),
    @XmlEnumValue("shuttleTram")
    SHUTTLE_TRAM("shuttleTram"),
    @XmlEnumValue("pti6_6")
    PTI_6_6("pti6_6"),
    @XmlEnumValue("allTramServices")
    ALL_TRAM_SERVICES("allTramServices"),
    @XmlEnumValue("pti6_255")
    PTI_6_255("pti6_255"),
    @XmlEnumValue("loc12_255")
    LOC_12_255("loc12_255"),
    @XmlEnumValue("undefinedTramService")
    UNDEFINED_TRAM_SERVICE("undefinedTramService");
    private final String value;

    TramSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TramSubmodesOfTransportEnumeration fromValue(String v) {
        for (TramSubmodesOfTransportEnumeration c: TramSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
