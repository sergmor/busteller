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
 * <p>Java class for MeasuredOrDerivedDataTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasuredOrDerivedDataTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="humidityInformation"/>
 *     &lt;enumeration value="pollutionInformation"/>
 *     &lt;enumeration value="precipitationInformation"/>
 *     &lt;enumeration value="pressureInformation"/>
 *     &lt;enumeration value="radiationInformation"/>
 *     &lt;enumeration value="roadSurfaceConditionInformation"/>
 *     &lt;enumeration value="temperatureInformation"/>
 *     &lt;enumeration value="visibilityInformation"/>
 *     &lt;enumeration value="windInformation"/>
 *     &lt;enumeration value="individualVehicleMeasurements"/>
 *     &lt;enumeration value="trafficConcentration"/>
 *     &lt;enumeration value="trafficFlow"/>
 *     &lt;enumeration value="trafficHeadway"/>
 *     &lt;enumeration value="trafficSpeed"/>
 *     &lt;enumeration value="trafficStatusInformation"/>
 *     &lt;enumeration value="travelTimeInformation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeasuredOrDerivedDataTypeEnum")
@XmlEnum
public enum MeasuredOrDerivedDataTypeEnum {


    /**
     * Measured or derived humidity information.
     * 
     */
    @XmlEnumValue("humidityInformation")
    HUMIDITY_INFORMATION("humidityInformation"),

    /**
     * Measured or derived pollution information.
     * 
     */
    @XmlEnumValue("pollutionInformation")
    POLLUTION_INFORMATION("pollutionInformation"),

    /**
     * Measured or derived precipitation information.
     * 
     */
    @XmlEnumValue("precipitationInformation")
    PRECIPITATION_INFORMATION("precipitationInformation"),

    /**
     * Measured or derived pressure information.
     * 
     */
    @XmlEnumValue("pressureInformation")
    PRESSURE_INFORMATION("pressureInformation"),

    /**
     * Measured or derived radiation information.
     * 
     */
    @XmlEnumValue("radiationInformation")
    RADIATION_INFORMATION("radiationInformation"),

    /**
     * Measured or derived road surface conditions information.
     * 
     */
    @XmlEnumValue("roadSurfaceConditionInformation")
    ROAD_SURFACE_CONDITION_INFORMATION("roadSurfaceConditionInformation"),

    /**
     * Measured or derived temperature information.
     * 
     */
    @XmlEnumValue("temperatureInformation")
    TEMPERATURE_INFORMATION("temperatureInformation"),

    /**
     * Measured or derived visibility information.
     * 
     */
    @XmlEnumValue("visibilityInformation")
    VISIBILITY_INFORMATION("visibilityInformation"),

    /**
     * Measured or derived wind information.
     * 
     */
    @XmlEnumValue("windInformation")
    WIND_INFORMATION("windInformation"),

    /**
     * Measured or derived individual vehicle measurements.
     * 
     */
    @XmlEnumValue("individualVehicleMeasurements")
    INDIVIDUAL_VEHICLE_MEASUREMENTS("individualVehicleMeasurements"),

    /**
     * Measured or derived traffic concentration information.
     * 
     */
    @XmlEnumValue("trafficConcentration")
    TRAFFIC_CONCENTRATION("trafficConcentration"),

    /**
     * Measured or derived traffic flow information.
     * 
     */
    @XmlEnumValue("trafficFlow")
    TRAFFIC_FLOW("trafficFlow"),

    /**
     * Measured or derived traffic headway information.
     * 
     */
    @XmlEnumValue("trafficHeadway")
    TRAFFIC_HEADWAY("trafficHeadway"),

    /**
     * Measured or derived traffic speed information.
     * 
     */
    @XmlEnumValue("trafficSpeed")
    TRAFFIC_SPEED("trafficSpeed"),

    /**
     * Measured or derived traffic status information.
     * 
     */
    @XmlEnumValue("trafficStatusInformation")
    TRAFFIC_STATUS_INFORMATION("trafficStatusInformation"),

    /**
     * Measured or derived travel time information.
     * 
     */
    @XmlEnumValue("travelTimeInformation")
    TRAVEL_TIME_INFORMATION("travelTimeInformation");
    private final String value;

    MeasuredOrDerivedDataTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasuredOrDerivedDataTypeEnum fromValue(String v) {
        for (MeasuredOrDerivedDataTypeEnum c: MeasuredOrDerivedDataTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
