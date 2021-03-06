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
 * <p>Java class for RelatedToEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelatedToEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="cause"/>
 *     &lt;enumeration value="effect"/>
 *     &lt;enumeration value="update"/>
 *     &lt;enumeration value="supercedes"/>
 *     &lt;enumeration value="supercededBy"/>
 *     &lt;enumeration value="associated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelatedToEnumeration")
@XmlEnum
public enum RelatedToEnumeration {

    @XmlEnumValue("cause")
    CAUSE("cause"),
    @XmlEnumValue("effect")
    EFFECT("effect"),
    @XmlEnumValue("update")
    UPDATE("update"),
    @XmlEnumValue("supercedes")
    SUPERCEDES("supercedes"),
    @XmlEnumValue("supercededBy")
    SUPERCEDED_BY("supercededBy"),
    @XmlEnumValue("associated")
    ASSOCIATED("associated");
    private final String value;

    RelatedToEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelatedToEnumeration fromValue(String v) {
        for (RelatedToEnumeration c: RelatedToEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
