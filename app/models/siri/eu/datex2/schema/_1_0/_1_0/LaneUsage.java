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
 * Supplementary lane usage advice.
 * 
 * <p>Java class for LaneUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LaneUsage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Advice">
 *       &lt;sequence>
 *         &lt;element name="laneUsageAdvice" type="{http://datex2.eu/schema/1_0/1_0}LaneUsageEnum"/>
 *         &lt;element name="laneUsageExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaneUsage", propOrder = {
    "laneUsageAdvice",
    "laneUsageExtension"
})
public class LaneUsage
    extends Advice
{

    @XmlElement(required = true)
    protected LaneUsageEnum laneUsageAdvice;
    protected ExtensionType laneUsageExtension;

    /**
     * Gets the value of the laneUsageAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link LaneUsageEnum }
     *     
     */
    public LaneUsageEnum getLaneUsageAdvice() {
        return laneUsageAdvice;
    }

    /**
     * Sets the value of the laneUsageAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaneUsageEnum }
     *     
     */
    public void setLaneUsageAdvice(LaneUsageEnum value) {
        this.laneUsageAdvice = value;
    }

    /**
     * Gets the value of the laneUsageExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLaneUsageExtension() {
        return laneUsageExtension;
    }

    /**
     * Sets the value of the laneUsageExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLaneUsageExtension(ExtensionType value) {
        this.laneUsageExtension = value;
    }

}
