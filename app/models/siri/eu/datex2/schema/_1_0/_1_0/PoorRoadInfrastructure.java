//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package models.siri.eu.datex2.schema._1_0._1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Failures or malfunctions of road infrastructure or related equipment that may be of interest or concern to travellers.
 * 
 * <p>Java class for PoorRoadInfrastructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoorRoadInfrastructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TrafficElement">
 *       &lt;sequence>
 *         &lt;element name="poorRoadInfrastructureType" type="{http://datex2.eu/schema/1_0/1_0}PoorRoadInfrastructureEnum"/>
 *         &lt;element name="malfunctioningTrafficControls" type="{http://datex2.eu/schema/1_0/1_0}MalfunctioningTrafficControls" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="poorRoadInfrastructureExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoorRoadInfrastructure", propOrder = {
    "poorRoadInfrastructureType",
    "malfunctioningTrafficControls",
    "poorRoadInfrastructureExtension"
})
public class PoorRoadInfrastructure
    extends TrafficElement
{

    @XmlElement(required = true)
    protected PoorRoadInfrastructureEnum poorRoadInfrastructureType;
    protected List<MalfunctioningTrafficControls> malfunctioningTrafficControls;
    protected ExtensionType poorRoadInfrastructureExtension;

    /**
     * Gets the value of the poorRoadInfrastructureType property.
     * 
     * @return
     *     possible object is
     *     {@link PoorRoadInfrastructureEnum }
     *     
     */
    public PoorRoadInfrastructureEnum getPoorRoadInfrastructureType() {
        return poorRoadInfrastructureType;
    }

    /**
     * Sets the value of the poorRoadInfrastructureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoorRoadInfrastructureEnum }
     *     
     */
    public void setPoorRoadInfrastructureType(PoorRoadInfrastructureEnum value) {
        this.poorRoadInfrastructureType = value;
    }

    /**
     * Gets the value of the malfunctioningTrafficControls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the malfunctioningTrafficControls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMalfunctioningTrafficControls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MalfunctioningTrafficControls }
     * 
     * 
     */
    public List<MalfunctioningTrafficControls> getMalfunctioningTrafficControls() {
        if (malfunctioningTrafficControls == null) {
            malfunctioningTrafficControls = new ArrayList<MalfunctioningTrafficControls>();
        }
        return this.malfunctioningTrafficControls;
    }

    /**
     * Gets the value of the poorRoadInfrastructureExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPoorRoadInfrastructureExtension() {
        return poorRoadInfrastructureExtension;
    }

    /**
     * Sets the value of the poorRoadInfrastructureExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPoorRoadInfrastructureExtension(ExtensionType value) {
        this.poorRoadInfrastructureExtension = value;
    }

}
