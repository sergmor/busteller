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
 * <p>Java class for OperatorActionOriginEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorActionOriginEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="external"/>
 *     &lt;enumeration value="internal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatorActionOriginEnum")
@XmlEnum
public enum OperatorActionOriginEnum {


    /**
     * Operator action originated externally to the authority which is taking the action.
     * 
     */
    @XmlEnumValue("external")
    EXTERNAL("external"),

    /**
     * Operator action originated within the authority which is taking the action.
     * 
     */
    @XmlEnumValue("internal")
    INTERNAL("internal");
    private final String value;

    OperatorActionOriginEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatorActionOriginEnum fromValue(String v) {
        for (OperatorActionOriginEnum c: OperatorActionOriginEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
