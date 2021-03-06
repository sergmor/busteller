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
 * <p>Java class for OperatorActionStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorActionStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="approved"/>
 *     &lt;enumeration value="implemented"/>
 *     &lt;enumeration value="inProgress"/>
 *     &lt;enumeration value="over"/>
 *     &lt;enumeration value="requested"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatorActionStatusEnum")
@XmlEnum
public enum OperatorActionStatusEnum {


    /**
     * Action is approved by the relevant authority.
     * 
     */
    @XmlEnumValue("approved")
    APPROVED("approved"),

    /**
     * Action has been implemented.
     * 
     */
    @XmlEnumValue("implemented")
    IMPLEMENTED("implemented"),

    /**
     * Action is in the process of being implemented.
     * 
     */
    @XmlEnumValue("inProgress")
    IN_PROGRESS("inProgress"),

    /**
     * Action has been completed and is now finished.
     * 
     */
    @XmlEnumValue("over")
    OVER("over"),

    /**
     * Permission is being requested of the relevant authority for the action.
     * 
     */
    @XmlEnumValue("requested")
    REQUESTED("requested");
    private final String value;

    OperatorActionStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatorActionStatusEnum fromValue(String v) {
        for (OperatorActionStatusEnum c: OperatorActionStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
