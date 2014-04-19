//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package models.uk.org.siri.siri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


/**
 * Type for loggable Entry.
 * 
 * <p>Java class for SituationElementStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituationElementStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSituationElementStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationInfoGroup"/>
 *         &lt;element name="VersionedAtTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationElementStructure", propOrder = {
    "references",
    "source",
    "versionedAtTime"
})
@XmlSeeAlso({
    PtSituationElementStructure.class,
    RoadSituationElementStructure.class
})
public class SituationElementStructure
    extends AbstractSituationElementStructure
{

    @XmlElement(name = "References")
    protected ReferencesStructure references;
    @XmlElement(name = "Source", required = true)
    protected SituationSourceStructure source;
    @XmlElement(name = "VersionedAtTime")
    @XmlSchemaType(name = "dateTime")
    protected Date versionedAtTime;

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencesStructure }
     *     
     */
    public ReferencesStructure getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencesStructure }
     *     
     */
    public void setReferences(ReferencesStructure value) {
        this.references = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SituationSourceStructure }
     *     
     */
    public SituationSourceStructure getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationSourceStructure }
     *     
     */
    public void setSource(SituationSourceStructure value) {
        this.source = value;
    }

    /**
     * Gets the value of the versionedAtTime property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getVersionedAtTime() {
        return versionedAtTime;
    }

    /**
     * Sets the value of the versionedAtTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setVersionedAtTime(Date value) {
        this.versionedAtTime = value;
    }

}
