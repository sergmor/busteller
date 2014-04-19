//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package models.uk.org.siri.siri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Visit of a vehicle to a stop monitoring point. May provide information about the arrival, the departure or both.
 * 
 * <p>Java class for MonitoredStopVisitStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitoredStopVisitStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractIdentifiedItemStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopVisitReferenceGroup" minOccurs="0"/>
 *         &lt;element name="MonitoredVehicleJourney" type="{http://www.siri.org.uk/siri}MonitoredVehicleJourneyStructure"/>
 *         &lt;element name="StopVisitNote" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StopFacility" type="{http://www.siri.org.uk/siri}FacilityRefStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredStopVisitStructure", propOrder = {
    "monitoringRef",
    "clearDownRef",
    "monitoredVehicleJourney",
    "stopVisitNote",
    "stopFacility",
    "extensions"
})
public class MonitoredStopVisitStructure
    extends AbstractIdentifiedItemStructure
{

    @XmlElement(name = "MonitoringRef")
    protected MonitoringRefStructure monitoringRef;
    @XmlElement(name = "ClearDownRef")
    protected ClearDownRefStructure clearDownRef;
    @XmlElement(name = "MonitoredVehicleJourney", required = true)
    protected MonitoredVehicleJourneyStructure monitoredVehicleJourney;
    @XmlElement(name = "StopVisitNote")
    protected List<NaturalLanguageStringStructure> stopVisitNote;
    @XmlElement(name = "StopFacility")
    protected FacilityRefStructure stopFacility;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the monitoringRef property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringRefStructure }
     *     
     */
    public MonitoringRefStructure getMonitoringRef() {
        return monitoringRef;
    }

    /**
     * Sets the value of the monitoringRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringRefStructure }
     *     
     */
    public void setMonitoringRef(MonitoringRefStructure value) {
        this.monitoringRef = value;
    }

    /**
     * Gets the value of the clearDownRef property.
     * 
     * @return
     *     possible object is
     *     {@link ClearDownRefStructure }
     *     
     */
    public ClearDownRefStructure getClearDownRef() {
        return clearDownRef;
    }

    /**
     * Sets the value of the clearDownRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearDownRefStructure }
     *     
     */
    public void setClearDownRef(ClearDownRefStructure value) {
        this.clearDownRef = value;
    }

    /**
     * Gets the value of the monitoredVehicleJourney property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoredVehicleJourneyStructure }
     *     
     */
    public MonitoredVehicleJourneyStructure getMonitoredVehicleJourney() {
        return monitoredVehicleJourney;
    }

    /**
     * Sets the value of the monitoredVehicleJourney property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoredVehicleJourneyStructure }
     *     
     */
    public void setMonitoredVehicleJourney(MonitoredVehicleJourneyStructure value) {
        this.monitoredVehicleJourney = value;
    }

    /**
     * Gets the value of the stopVisitNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopVisitNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopVisitNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getStopVisitNote() {
        if (stopVisitNote == null) {
            stopVisitNote = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.stopVisitNote;
    }

    /**
     * Gets the value of the stopFacility property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityRefStructure }
     *     
     */
    public FacilityRefStructure getStopFacility() {
        return stopFacility;
    }

    /**
     * Sets the value of the stopFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityRefStructure }
     *     
     */
    public void setStopFacility(FacilityRefStructure value) {
        this.stopFacility = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

}
