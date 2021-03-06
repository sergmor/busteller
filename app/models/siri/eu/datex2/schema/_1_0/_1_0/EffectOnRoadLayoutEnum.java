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
 * <p>Java class for EffectOnRoadLayoutEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EffectOnRoadLayoutEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="carriagewayClosures"/>
 *     &lt;enumeration value="contraflow"/>
 *     &lt;enumeration value="laneClosures"/>
 *     &lt;enumeration value="lanesDeviated"/>
 *     &lt;enumeration value="narrowLanes"/>
 *     &lt;enumeration value="newRoadworksLayout"/>
 *     &lt;enumeration value="obstacleSignalling"/>
 *     &lt;enumeration value="roadLayoutUnchanged"/>
 *     &lt;enumeration value="temporaryTrafficLights"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EffectOnRoadLayoutEnum")
@XmlEnum
public enum EffectOnRoadLayoutEnum {


    /**
     * Roadworks are resulting in carriageway closures at the specified location.
     * 
     */
    @XmlEnumValue("carriagewayClosures")
    CARRIAGEWAY_CLOSURES("carriagewayClosures"),

    /**
     * Roadworks are resulting in contraflow of traffic at the specified location.
     * 
     */
    @XmlEnumValue("contraflow")
    CONTRAFLOW("contraflow"),

    /**
     * Roadworks are resulting in lane closures at the specified location.
     * 
     */
    @XmlEnumValue("laneClosures")
    LANE_CLOSURES("laneClosures"),

    /**
     * Roadworks are resulting in lane deviations at the specified location.
     * 
     */
    @XmlEnumValue("lanesDeviated")
    LANES_DEVIATED("lanesDeviated"),

    /**
     * Roadworks are resulting in narrow lanes at the specified location.
     * 
     */
    @XmlEnumValue("narrowLanes")
    NARROW_LANES("narrowLanes"),

    /**
     * A new layout of lanes/carriageway has been implemeted associated with the roadworks.
     * 
     */
    @XmlEnumValue("newRoadworksLayout")
    NEW_ROADWORKS_LAYOUT("newRoadworksLayout"),

    /**
     * Signs are being put out before or around an obstacle to protect drivers.
     * 
     */
    @XmlEnumValue("obstacleSignalling")
    OBSTACLE_SIGNALLING("obstacleSignalling"),

    /**
     * The existing road layout is unchanged during the period of roadworks.
     * 
     */
    @XmlEnumValue("roadLayoutUnchanged")
    ROAD_LAYOUT_UNCHANGED("roadLayoutUnchanged"),

    /**
     * Traffic is being controlled by temporary traffic lights (red-yellow-green or red-green).
     * 
     */
    @XmlEnumValue("temporaryTrafficLights")
    TEMPORARY_TRAFFIC_LIGHTS("temporaryTrafficLights");
    private final String value;

    EffectOnRoadLayoutEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EffectOnRoadLayoutEnum fromValue(String v) {
        for (EffectOnRoadLayoutEnum c: EffectOnRoadLayoutEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
