//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package models.uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckPointProcessEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckPointProcessEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="ticketPurchase"/>
 *     &lt;enumeration value="ticketCollection"/>
 *     &lt;enumeration value="ticketValidation"/>
 *     &lt;enumeration value="baggageCheckIn"/>
 *     &lt;enumeration value="oversizeBaggageCheckIn"/>
 *     &lt;enumeration value="oversizeBaggageReclaim"/>
 *     &lt;enumeration value="baggageReclaim"/>
 *     &lt;enumeration value="leftLuggageDeposit"/>
 *     &lt;enumeration value="leftLuggageReclaim"/>
 *     &lt;enumeration value="firstclassCheckin"/>
 *     &lt;enumeration value="specialNeedsCheckin"/>
 *     &lt;enumeration value="baggageSecurityCheck"/>
 *     &lt;enumeration value="securityCheck"/>
 *     &lt;enumeration value="outgoingPassportControl"/>
 *     &lt;enumeration value="incomingPassportControl"/>
 *     &lt;enumeration value="fasttrackDepartures"/>
 *     &lt;enumeration value="fasttrackArrivals"/>
 *     &lt;enumeration value="incomingDutyFree"/>
 *     &lt;enumeration value="outgoingDutyFree"/>
 *     &lt;enumeration value="taxRefunds"/>
 *     &lt;enumeration value="outgoingCustoms"/>
 *     &lt;enumeration value="incomingCustoms"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CheckPointProcessEnumeration")
@XmlEnum
public enum CheckPointProcessEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("ticketPurchase")
    TICKET_PURCHASE("ticketPurchase"),
    @XmlEnumValue("ticketCollection")
    TICKET_COLLECTION("ticketCollection"),
    @XmlEnumValue("ticketValidation")
    TICKET_VALIDATION("ticketValidation"),
    @XmlEnumValue("baggageCheckIn")
    BAGGAGE_CHECK_IN("baggageCheckIn"),
    @XmlEnumValue("oversizeBaggageCheckIn")
    OVERSIZE_BAGGAGE_CHECK_IN("oversizeBaggageCheckIn"),
    @XmlEnumValue("oversizeBaggageReclaim")
    OVERSIZE_BAGGAGE_RECLAIM("oversizeBaggageReclaim"),
    @XmlEnumValue("baggageReclaim")
    BAGGAGE_RECLAIM("baggageReclaim"),
    @XmlEnumValue("leftLuggageDeposit")
    LEFT_LUGGAGE_DEPOSIT("leftLuggageDeposit"),
    @XmlEnumValue("leftLuggageReclaim")
    LEFT_LUGGAGE_RECLAIM("leftLuggageReclaim"),
    @XmlEnumValue("firstclassCheckin")
    FIRSTCLASS_CHECKIN("firstclassCheckin"),
    @XmlEnumValue("specialNeedsCheckin")
    SPECIAL_NEEDS_CHECKIN("specialNeedsCheckin"),
    @XmlEnumValue("baggageSecurityCheck")
    BAGGAGE_SECURITY_CHECK("baggageSecurityCheck"),
    @XmlEnumValue("securityCheck")
    SECURITY_CHECK("securityCheck"),
    @XmlEnumValue("outgoingPassportControl")
    OUTGOING_PASSPORT_CONTROL("outgoingPassportControl"),
    @XmlEnumValue("incomingPassportControl")
    INCOMING_PASSPORT_CONTROL("incomingPassportControl"),
    @XmlEnumValue("fasttrackDepartures")
    FASTTRACK_DEPARTURES("fasttrackDepartures"),
    @XmlEnumValue("fasttrackArrivals")
    FASTTRACK_ARRIVALS("fasttrackArrivals"),
    @XmlEnumValue("incomingDutyFree")
    INCOMING_DUTY_FREE("incomingDutyFree"),
    @XmlEnumValue("outgoingDutyFree")
    OUTGOING_DUTY_FREE("outgoingDutyFree"),
    @XmlEnumValue("taxRefunds")
    TAX_REFUNDS("taxRefunds"),
    @XmlEnumValue("outgoingCustoms")
    OUTGOING_CUSTOMS("outgoingCustoms"),
    @XmlEnumValue("incomingCustoms")
    INCOMING_CUSTOMS("incomingCustoms");
    private final String value;

    CheckPointProcessEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckPointProcessEnumeration fromValue(String v) {
        for (CheckPointProcessEnumeration c: CheckPointProcessEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
