//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package models.siri.eu.datex2.schema._1_0._1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Overview of people involved in the event and their injury status.
 * 
 * <p>Java class for PeopleInvolved complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeopleInvolved">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfPeople" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="injuryStatus" type="{http://datex2.eu/schema/1_0/1_0}InjuryStatusTypeEnum" minOccurs="0"/>
 *         &lt;element name="involvementRole" type="{http://datex2.eu/schema/1_0/1_0}InvolvementRolesEnum" minOccurs="0"/>
 *         &lt;element name="typeOfPeopleInvolved" type="{http://datex2.eu/schema/1_0/1_0}PersonCategoryEnum" minOccurs="0"/>
 *         &lt;element name="peopleInvolvedExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeopleInvolved", propOrder = {
    "numberOfPeople",
    "injuryStatus",
    "involvementRole",
    "typeOfPeopleInvolved",
    "peopleInvolvedExtension"
})
public class PeopleInvolved {

    protected BigInteger numberOfPeople;
    protected InjuryStatusTypeEnum injuryStatus;
    protected InvolvementRolesEnum involvementRole;
    protected PersonCategoryEnum typeOfPeopleInvolved;
    protected ExtensionType peopleInvolvedExtension;

    /**
     * Gets the value of the numberOfPeople property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPeople() {
        return numberOfPeople;
    }

    /**
     * Sets the value of the numberOfPeople property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPeople(BigInteger value) {
        this.numberOfPeople = value;
    }

    /**
     * Gets the value of the injuryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InjuryStatusTypeEnum }
     *     
     */
    public InjuryStatusTypeEnum getInjuryStatus() {
        return injuryStatus;
    }

    /**
     * Sets the value of the injuryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InjuryStatusTypeEnum }
     *     
     */
    public void setInjuryStatus(InjuryStatusTypeEnum value) {
        this.injuryStatus = value;
    }

    /**
     * Gets the value of the involvementRole property.
     * 
     * @return
     *     possible object is
     *     {@link InvolvementRolesEnum }
     *     
     */
    public InvolvementRolesEnum getInvolvementRole() {
        return involvementRole;
    }

    /**
     * Sets the value of the involvementRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvolvementRolesEnum }
     *     
     */
    public void setInvolvementRole(InvolvementRolesEnum value) {
        this.involvementRole = value;
    }

    /**
     * Gets the value of the typeOfPeopleInvolved property.
     * 
     * @return
     *     possible object is
     *     {@link PersonCategoryEnum }
     *     
     */
    public PersonCategoryEnum getTypeOfPeopleInvolved() {
        return typeOfPeopleInvolved;
    }

    /**
     * Sets the value of the typeOfPeopleInvolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonCategoryEnum }
     *     
     */
    public void setTypeOfPeopleInvolved(PersonCategoryEnum value) {
        this.typeOfPeopleInvolved = value;
    }

    /**
     * Gets the value of the peopleInvolvedExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPeopleInvolvedExtension() {
        return peopleInvolvedExtension;
    }

    /**
     * Sets the value of the peopleInvolvedExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPeopleInvolvedExtension(ExtensionType value) {
        this.peopleInvolvedExtension = value;
    }

}
