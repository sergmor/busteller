//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package models.siri.eu.datex2.schema._1_0._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Supplementary warning advice.
 * 
 * <p>Java class for Warnings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Warnings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Advice">
 *       &lt;sequence>
 *         &lt;element name="warningAdvice" type="{http://datex2.eu/schema/1_0/1_0}WarningAdviceEnum"/>
 *         &lt;element name="warningsExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Warnings", propOrder = {
    "warningAdvice",
    "warningsExtension"
})
public class Warnings
    extends Advice
{

    @XmlElement(required = true)
    protected WarningAdviceEnum warningAdvice;
    protected ExtensionType warningsExtension;

    /**
     * Gets the value of the warningAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link WarningAdviceEnum }
     *     
     */
    public WarningAdviceEnum getWarningAdvice() {
        return warningAdvice;
    }

    /**
     * Sets the value of the warningAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningAdviceEnum }
     *     
     */
    public void setWarningAdvice(WarningAdviceEnum value) {
        this.warningAdvice = value;
    }

    /**
     * Gets the value of the warningsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWarningsExtension() {
        return warningsExtension;
    }

    /**
     * Sets the value of the warningsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWarningsExtension(ExtensionType value) {
        this.warningsExtension = value;
    }

}