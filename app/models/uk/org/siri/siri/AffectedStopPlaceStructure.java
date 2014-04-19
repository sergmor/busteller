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

import models.uk.org.ifopt.ifopt.NavigationPathRefStructure;
import models.uk.org.ifopt.ifopt.StopPlaceRefStructure;
import models.uk.org.ifopt.ifopt.StopPlaceTypeEnumeration;


/**
 * Type for information about the Stop Places affected by an Situation
 * 
 * <p>Java class for AffectedStopPlaceStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedStopPlaceStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AffectedStopPlaceElementStructure">
 *       &lt;sequence>
 *         &lt;element name="StopPlaceRef" type="{http://www.ifopt.org.uk/ifopt}StopPlaceRefStructure"/>
 *         &lt;element name="PlaceName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="StopPlaceType" type="{http://www.ifopt.org.uk/ifopt}StopPlaceTypeEnumeration" minOccurs="0"/>
 *         &lt;element name="AffectedComponents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedComponent" type="{http://www.siri.org.uk/siri}AffectedStopPlaceComponentStructure" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AffectedNavigationPaths" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NavigationPathRef" type="{http://www.ifopt.org.uk/ifopt}NavigationPathRefStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "AffectedStopPlaceStructure", propOrder = {
    "stopPlaceRef",
    "placeName",
    "stopPlaceType",
    "affectedComponents",
    "affectedNavigationPaths",
    "extensions"
})
public class AffectedStopPlaceStructure
    extends AffectedStopPlaceElementStructure
{

    @XmlElement(name = "StopPlaceRef", required = true)
    protected StopPlaceRefStructure stopPlaceRef;
    @XmlElement(name = "PlaceName")
    protected NaturalLanguageStringStructure placeName;
    @XmlElement(name = "StopPlaceType")
    protected StopPlaceTypeEnumeration stopPlaceType;
    @XmlElement(name = "AffectedComponents")
    protected AffectedStopPlaceStructure.AffectedComponents affectedComponents;
    @XmlElement(name = "AffectedNavigationPaths")
    protected AffectedStopPlaceStructure.AffectedNavigationPaths affectedNavigationPaths;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the stopPlaceRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public StopPlaceRefStructure getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Sets the value of the stopPlaceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public void setStopPlaceRef(StopPlaceRefStructure value) {
        this.stopPlaceRef = value;
    }

    /**
     * Gets the value of the placeName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setPlaceName(NaturalLanguageStringStructure value) {
        this.placeName = value;
    }

    /**
     * Gets the value of the stopPlaceType property.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceTypeEnumeration }
     *     
     */
    public StopPlaceTypeEnumeration getStopPlaceType() {
        return stopPlaceType;
    }

    /**
     * Sets the value of the stopPlaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceTypeEnumeration }
     *     
     */
    public void setStopPlaceType(StopPlaceTypeEnumeration value) {
        this.stopPlaceType = value;
    }

    /**
     * Gets the value of the affectedComponents property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedStopPlaceStructure.AffectedComponents }
     *     
     */
    public AffectedStopPlaceStructure.AffectedComponents getAffectedComponents() {
        return affectedComponents;
    }

    /**
     * Sets the value of the affectedComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedStopPlaceStructure.AffectedComponents }
     *     
     */
    public void setAffectedComponents(AffectedStopPlaceStructure.AffectedComponents value) {
        this.affectedComponents = value;
    }

    /**
     * Gets the value of the affectedNavigationPaths property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedStopPlaceStructure.AffectedNavigationPaths }
     *     
     */
    public AffectedStopPlaceStructure.AffectedNavigationPaths getAffectedNavigationPaths() {
        return affectedNavigationPaths;
    }

    /**
     * Sets the value of the affectedNavigationPaths property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedStopPlaceStructure.AffectedNavigationPaths }
     *     
     */
    public void setAffectedNavigationPaths(AffectedStopPlaceStructure.AffectedNavigationPaths value) {
        this.affectedNavigationPaths = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AffectedComponent" type="{http://www.siri.org.uk/siri}AffectedStopPlaceComponentStructure" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affectedComponent"
    })
    public static class AffectedComponents {

        @XmlElement(name = "AffectedComponent")
        protected List<AffectedStopPlaceComponentStructure> affectedComponent;

        /**
         * Gets the value of the affectedComponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedComponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedStopPlaceComponentStructure }
         * 
         * 
         */
        public List<AffectedStopPlaceComponentStructure> getAffectedComponent() {
            if (affectedComponent == null) {
                affectedComponent = new ArrayList<AffectedStopPlaceComponentStructure>();
            }
            return this.affectedComponent;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="NavigationPathRef" type="{http://www.ifopt.org.uk/ifopt}NavigationPathRefStructure" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "navigationPathRef"
    })
    public static class AffectedNavigationPaths {

        @XmlElement(name = "NavigationPathRef", required = true)
        protected List<NavigationPathRefStructure> navigationPathRef;

        /**
         * Gets the value of the navigationPathRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the navigationPathRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNavigationPathRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NavigationPathRefStructure }
         * 
         * 
         */
        public List<NavigationPathRefStructure> getNavigationPathRef() {
            if (navigationPathRef == null) {
                navigationPathRef = new ArrayList<NavigationPathRefStructure>();
            }
            return this.navigationPathRef;
        }

    }

}
