//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package models.uk.org.siri.siri;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


/**
 * Type for Real time connection at a stop.
 * 
 * <p>Java class for MonitoredFeederArrivalStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitoredFeederArrivalStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFeederItemStructure">
 *       &lt;sequence>
 *         &lt;element name="ClearDownRef" type="{http://www.siri.org.uk/siri}ClearDownRefStructure" minOccurs="0"/>
 *         &lt;element name="FeederJourney" type="{http://www.siri.org.uk/siri}InterchangeJourneyStructure"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}VehicleAtStop" minOccurs="0"/>
 *         &lt;element name="NumberOfTransferPassengers" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="ExpectedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "MonitoredFeederArrivalStructure", propOrder = {
    "clearDownRef",
    "feederJourney",
    "vehicleAtStop",
    "numberOfTransferPassengers",
    "expectedArrivalTime",
    "extensions"
})
public class MonitoredFeederArrivalStructure
    extends AbstractFeederItemStructure
{

    @XmlElement(name = "ClearDownRef")
    protected ClearDownRefStructure clearDownRef;
    @XmlElement(name = "FeederJourney", required = true)
    protected InterchangeJourneyStructure feederJourney;
    @XmlElement(name = "VehicleAtStop")
    protected Boolean vehicleAtStop;
    @XmlElement(name = "NumberOfTransferPassengers")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfTransferPassengers;
    @XmlElement(name = "ExpectedArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected Date expectedArrivalTime;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

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
     * Gets the value of the feederJourney property.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeJourneyStructure }
     *     
     */
    public InterchangeJourneyStructure getFeederJourney() {
        return feederJourney;
    }

    /**
     * Sets the value of the feederJourney property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeJourneyStructure }
     *     
     */
    public void setFeederJourney(InterchangeJourneyStructure value) {
        this.feederJourney = value;
    }

    /**
     * Gets the value of the vehicleAtStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleAtStop() {
        return vehicleAtStop;
    }

    /**
     * Sets the value of the vehicleAtStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleAtStop(Boolean value) {
        this.vehicleAtStop = value;
    }

    /**
     * Gets the value of the numberOfTransferPassengers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfTransferPassengers() {
        return numberOfTransferPassengers;
    }

    /**
     * Sets the value of the numberOfTransferPassengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfTransferPassengers(BigInteger value) {
        this.numberOfTransferPassengers = value;
    }

    /**
     * Gets the value of the expectedArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    /**
     * Sets the value of the expectedArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setExpectedArrivalTime(Date value) {
        this.expectedArrivalTime = value;
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