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
 * <p>Java class for DelayCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DelayCodeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="delayBetweenOneHourAndThreeHours"/>
 *     &lt;enumeration value="delayBetweenThirtyMinutesAndOneHour"/>
 *     &lt;enumeration value="delayBetweenThreeHoursAndSixHours"/>
 *     &lt;enumeration value="delayLessThanThirtyMinutes"/>
 *     &lt;enumeration value="delayLongerThanSixHours"/>
 *     &lt;enumeration value="negligible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DelayCodeEnum")
@XmlEnum
public enum DelayCodeEnum {


    /**
     * Delay between one hour and three hours.
     * 
     */
    @XmlEnumValue("delayBetweenOneHourAndThreeHours")
    DELAY_BETWEEN_ONE_HOUR_AND_THREE_HOURS("delayBetweenOneHourAndThreeHours"),

    /**
     * Delay between thirty minutes and one hour.
     * 
     */
    @XmlEnumValue("delayBetweenThirtyMinutesAndOneHour")
    DELAY_BETWEEN_THIRTY_MINUTES_AND_ONE_HOUR("delayBetweenThirtyMinutesAndOneHour"),

    /**
     * Delay between three hours and six hours.
     * 
     */
    @XmlEnumValue("delayBetweenThreeHoursAndSixHours")
    DELAY_BETWEEN_THREE_HOURS_AND_SIX_HOURS("delayBetweenThreeHoursAndSixHours"),

    /**
     * Delay less than thirty minutes.
     * 
     */
    @XmlEnumValue("delayLessThanThirtyMinutes")
    DELAY_LESS_THAN_THIRTY_MINUTES("delayLessThanThirtyMinutes"),

    /**
     * Delay longer than six hours.
     * 
     */
    @XmlEnumValue("delayLongerThanSixHours")
    DELAY_LONGER_THAN_SIX_HOURS("delayLongerThanSixHours"),

    /**
     * Negligible delay.
     * 
     */
    @XmlEnumValue("negligible")
    NEGLIGIBLE("negligible");
    private final String value;

    DelayCodeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DelayCodeEnum fromValue(String v) {
        for (DelayCodeEnum c: DelayCodeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
