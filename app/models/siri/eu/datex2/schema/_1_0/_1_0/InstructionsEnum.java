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
 * <p>Java class for InstructionsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InstructionsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allowEmergencyVehiclesToPass"/>
 *     &lt;enumeration value="approachWithCare"/>
 *     &lt;enumeration value="clearALaneForEmergencyVehicles"/>
 *     &lt;enumeration value="clearALaneForSnowploughsAndGrittingVehicles"/>
 *     &lt;enumeration value="closeAllWindowsTurnOffHeaterAndVents"/>
 *     &lt;enumeration value="crossJunctionWithCare"/>
 *     &lt;enumeration value="doNotAllowUnnecessaryGaps"/>
 *     &lt;enumeration value="doNotDriveOnTheHardShoulder"/>
 *     &lt;enumeration value="doNotLeaveYourVehicle"/>
 *     &lt;enumeration value="doNotSlowdownUnnecessarily"/>
 *     &lt;enumeration value="doNotThrowOutAnyBurningObjects"/>
 *     &lt;enumeration value="driveCarefully"/>
 *     &lt;enumeration value="driveWithExtremeCaution"/>
 *     &lt;enumeration value="followTheVehicleInFrontSmoothly"/>
 *     &lt;enumeration value="increaseNormalFollowingDistance"/>
 *     &lt;enumeration value="inEmergencyWaitForPolicePatrol"/>
 *     &lt;enumeration value="keepYourDistance"/>
 *     &lt;enumeration value="leaveYourVehicleProceedToNextSafePlace"/>
 *     &lt;enumeration value="noNakedFlames"/>
 *     &lt;enumeration value="noOvertaking"/>
 *     &lt;enumeration value="noSmoking"/>
 *     &lt;enumeration value="observeSignals"/>
 *     &lt;enumeration value="observeSigns"/>
 *     &lt;enumeration value="onlyTravelIfAbsolutelyNecessary"/>
 *     &lt;enumeration value="overtakeWithCare"/>
 *     &lt;enumeration value="pleaseUseBusService"/>
 *     &lt;enumeration value="pleaseUseRailService"/>
 *     &lt;enumeration value="pleaseUseTramService"/>
 *     &lt;enumeration value="pleaseUseUndergroundService"/>
 *     &lt;enumeration value="pullOverToTheEdgeOfTheRoadway"/>
 *     &lt;enumeration value="stopAtNextSafePlace"/>
 *     &lt;enumeration value="stopAtNextServiceArea"/>
 *     &lt;enumeration value="switchOffEngine"/>
 *     &lt;enumeration value="switchOffMobilePhonesAndTwoWayRadios"/>
 *     &lt;enumeration value="testYourBrakes"/>
 *     &lt;enumeration value="useFogLights"/>
 *     &lt;enumeration value="useHardShoulderAsLane"/>
 *     &lt;enumeration value="useHazardWarningLights"/>
 *     &lt;enumeration value="useHeadlights"/>
 *     &lt;enumeration value="waitForEscortVehicle"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InstructionsEnum")
@XmlEnum
public enum InstructionsEnum {


    /**
     * Allow emergency vehicles to pass.
     * 
     */
    @XmlEnumValue("allowEmergencyVehiclesToPass")
    ALLOW_EMERGENCY_VEHICLES_TO_PASS("allowEmergencyVehiclesToPass"),

    /**
     * Approach with care.
     * 
     */
    @XmlEnumValue("approachWithCare")
    APPROACH_WITH_CARE("approachWithCare"),

    /**
     * Clear a lane for emergency vehicles.
     * 
     */
    @XmlEnumValue("clearALaneForEmergencyVehicles")
    CLEAR_A_LANE_FOR_EMERGENCY_VEHICLES("clearALaneForEmergencyVehicles"),

    /**
     * Clear a lane for snow ploughs and gritting vehicles.
     * 
     */
    @XmlEnumValue("clearALaneForSnowploughsAndGrittingVehicles")
    CLEAR_A_LANE_FOR_SNOWPLOUGHS_AND_GRITTING_VEHICLES("clearALaneForSnowploughsAndGrittingVehicles"),

    /**
     * Close all windows and turn off heater and vents.
     * 
     */
    @XmlEnumValue("closeAllWindowsTurnOffHeaterAndVents")
    CLOSE_ALL_WINDOWS_TURN_OFF_HEATER_AND_VENTS("closeAllWindowsTurnOffHeaterAndVents"),

    /**
     * Cross junction with care.
     * 
     */
    @XmlEnumValue("crossJunctionWithCare")
    CROSS_JUNCTION_WITH_CARE("crossJunctionWithCare"),

    /**
     * Do not allow unnecessary gaps.
     * 
     */
    @XmlEnumValue("doNotAllowUnnecessaryGaps")
    DO_NOT_ALLOW_UNNECESSARY_GAPS("doNotAllowUnnecessaryGaps"),

    /**
     * Do not drive on the hard shoulder.
     * 
     */
    @XmlEnumValue("doNotDriveOnTheHardShoulder")
    DO_NOT_DRIVE_ON_THE_HARD_SHOULDER("doNotDriveOnTheHardShoulder"),

    /**
     * Do not leave your vehicle.
     * 
     */
    @XmlEnumValue("doNotLeaveYourVehicle")
    DO_NOT_LEAVE_YOUR_VEHICLE("doNotLeaveYourVehicle"),

    /**
     * Do not slow down unnecessarily.
     * 
     */
    @XmlEnumValue("doNotSlowdownUnnecessarily")
    DO_NOT_SLOWDOWN_UNNECESSARILY("doNotSlowdownUnnecessarily"),

    /**
     * Do not throw out any burning objects.
     * 
     */
    @XmlEnumValue("doNotThrowOutAnyBurningObjects")
    DO_NOT_THROW_OUT_ANY_BURNING_OBJECTS("doNotThrowOutAnyBurningObjects"),

    /**
     * Drive carefully.
     * 
     */
    @XmlEnumValue("driveCarefully")
    DRIVE_CAREFULLY("driveCarefully"),

    /**
     * Drive with extreme caution.
     * 
     */
    @XmlEnumValue("driveWithExtremeCaution")
    DRIVE_WITH_EXTREME_CAUTION("driveWithExtremeCaution"),

    /**
     * Follow the vehicle in front, smoothly.
     * 
     */
    @XmlEnumValue("followTheVehicleInFrontSmoothly")
    FOLLOW_THE_VEHICLE_IN_FRONT_SMOOTHLY("followTheVehicleInFrontSmoothly"),

    /**
     * Increase normal following distance.
     * 
     */
    @XmlEnumValue("increaseNormalFollowingDistance")
    INCREASE_NORMAL_FOLLOWING_DISTANCE("increaseNormalFollowingDistance"),

    /**
     * In emergency, wait for police patrol.
     * 
     */
    @XmlEnumValue("inEmergencyWaitForPolicePatrol")
    IN_EMERGENCY_WAIT_FOR_POLICE_PATROL("inEmergencyWaitForPolicePatrol"),

    /**
     * Keep your distance.
     * 
     */
    @XmlEnumValue("keepYourDistance")
    KEEP_YOUR_DISTANCE("keepYourDistance"),

    /**
     * Leave your vehicle and proceed to next save place.
     * 
     */
    @XmlEnumValue("leaveYourVehicleProceedToNextSafePlace")
    LEAVE_YOUR_VEHICLE_PROCEED_TO_NEXT_SAFE_PLACE("leaveYourVehicleProceedToNextSafePlace"),

    /**
     * No naked flames.
     * 
     */
    @XmlEnumValue("noNakedFlames")
    NO_NAKED_FLAMES("noNakedFlames"),

    /**
     * No overtaking.
     * 
     */
    @XmlEnumValue("noOvertaking")
    NO_OVERTAKING("noOvertaking"),

    /**
     * No smoking.
     * 
     */
    @XmlEnumValue("noSmoking")
    NO_SMOKING("noSmoking"),

    /**
     * Observe signals.
     * 
     */
    @XmlEnumValue("observeSignals")
    OBSERVE_SIGNALS("observeSignals"),

    /**
     * Observe signs.
     * 
     */
    @XmlEnumValue("observeSigns")
    OBSERVE_SIGNS("observeSigns"),

    /**
     * Only travel if absolutely necessary.
     * 
     */
    @XmlEnumValue("onlyTravelIfAbsolutelyNecessary")
    ONLY_TRAVEL_IF_ABSOLUTELY_NECESSARY("onlyTravelIfAbsolutelyNecessary"),

    /**
     * Overtake with care.
     * 
     */
    @XmlEnumValue("overtakeWithCare")
    OVERTAKE_WITH_CARE("overtakeWithCare"),

    /**
     * Please use bus service.
     * 
     */
    @XmlEnumValue("pleaseUseBusService")
    PLEASE_USE_BUS_SERVICE("pleaseUseBusService"),

    /**
     * Please use rail service.
     * 
     */
    @XmlEnumValue("pleaseUseRailService")
    PLEASE_USE_RAIL_SERVICE("pleaseUseRailService"),

    /**
     * Please use tram service.
     * 
     */
    @XmlEnumValue("pleaseUseTramService")
    PLEASE_USE_TRAM_SERVICE("pleaseUseTramService"),

    /**
     * Please use underground service.
     * 
     */
    @XmlEnumValue("pleaseUseUndergroundService")
    PLEASE_USE_UNDERGROUND_SERVICE("pleaseUseUndergroundService"),

    /**
     * Pull over to the edge of the roadway.
     * 
     */
    @XmlEnumValue("pullOverToTheEdgeOfTheRoadway")
    PULL_OVER_TO_THE_EDGE_OF_THE_ROADWAY("pullOverToTheEdgeOfTheRoadway"),

    /**
     * Stop at next safe place.
     * 
     */
    @XmlEnumValue("stopAtNextSafePlace")
    STOP_AT_NEXT_SAFE_PLACE("stopAtNextSafePlace"),

    /**
     * Stop at next rest service area or car park.
     * 
     */
    @XmlEnumValue("stopAtNextServiceArea")
    STOP_AT_NEXT_SERVICE_AREA("stopAtNextServiceArea"),

    /**
     * Switch off engine.
     * 
     */
    @XmlEnumValue("switchOffEngine")
    SWITCH_OFF_ENGINE("switchOffEngine"),

    /**
     * Switch off mobile phones and two-way radios.
     * 
     */
    @XmlEnumValue("switchOffMobilePhonesAndTwoWayRadios")
    SWITCH_OFF_MOBILE_PHONES_AND_TWO_WAY_RADIOS("switchOffMobilePhonesAndTwoWayRadios"),

    /**
     * Test your brakes.
     * 
     */
    @XmlEnumValue("testYourBrakes")
    TEST_YOUR_BRAKES("testYourBrakes"),

    /**
     * Use fog lights.
     * 
     */
    @XmlEnumValue("useFogLights")
    USE_FOG_LIGHTS("useFogLights"),

    /**
     * Use hard shoulder as lane.
     * 
     */
    @XmlEnumValue("useHardShoulderAsLane")
    USE_HARD_SHOULDER_AS_LANE("useHardShoulderAsLane"),

    /**
     * Use hazard warning lights.
     * 
     */
    @XmlEnumValue("useHazardWarningLights")
    USE_HAZARD_WARNING_LIGHTS("useHazardWarningLights"),

    /**
     * Use headlights.
     * 
     */
    @XmlEnumValue("useHeadlights")
    USE_HEADLIGHTS("useHeadlights"),

    /**
     * Wait for escort vehicle.
     * 
     */
    @XmlEnumValue("waitForEscortVehicle")
    WAIT_FOR_ESCORT_VEHICLE("waitForEscortVehicle"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    InstructionsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstructionsEnum fromValue(String v) {
        for (InstructionsEnum c: InstructionsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}