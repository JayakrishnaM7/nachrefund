package com.ibm.org.model.correspondentbankoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CorrespondentBankOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:01.907Z[GMT]")

public class CorrespondentBankOperatingSession   {
  @JsonProperty("CorrespondentBankFacilityReference")
  private Object correspondentBankFacilityReference;

  @JsonProperty("CorrespondentBankFacility")
  private String correspondentBankFacility;

  @JsonProperty("CorrespondentBankServicingSchedule")
  private String correspondentBankServicingSchedule;

  @JsonProperty("HolidayOrTimezoneSchedule")
  private String holidayOrTimezoneSchedule;

  @JsonProperty("VostroAccountReference")
  private Object vostroAccountReference;

  @JsonProperty("NostroMirrorAccountReference")
  private Object nostroMirrorAccountReference;

  public CorrespondentBankOperatingSession correspondentBankFacilityReference(Object correspondentBankFacilityReference) {
    this.correspondentBankFacilityReference = correspondentBankFacilityReference;
    return this;
  }

  /**
   * Get correspondentBankFacilityReference
   * @return correspondentBankFacilityReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCorrespondentBankFacilityReference() {
    return correspondentBankFacilityReference;
  }

  public void setCorrespondentBankFacilityReference(Object correspondentBankFacilityReference) {
    this.correspondentBankFacilityReference = correspondentBankFacilityReference;
  }

  public CorrespondentBankOperatingSession correspondentBankFacility(String correspondentBankFacility) {
    this.correspondentBankFacility = correspondentBankFacility;
    return this;
  }

  /**
   * Get correspondentBankFacility
   * @return correspondentBankFacility
  */
  @ApiModelProperty(value = "")


  public String getCorrespondentBankFacility() {
    return correspondentBankFacility;
  }

  public void setCorrespondentBankFacility(String correspondentBankFacility) {
    this.correspondentBankFacility = correspondentBankFacility;
  }

  public CorrespondentBankOperatingSession correspondentBankServicingSchedule(String correspondentBankServicingSchedule) {
    this.correspondentBankServicingSchedule = correspondentBankServicingSchedule;
    return this;
  }

  /**
   * Get correspondentBankServicingSchedule
   * @return correspondentBankServicingSchedule
  */
  @ApiModelProperty(value = "")


  public String getCorrespondentBankServicingSchedule() {
    return correspondentBankServicingSchedule;
  }

  public void setCorrespondentBankServicingSchedule(String correspondentBankServicingSchedule) {
    this.correspondentBankServicingSchedule = correspondentBankServicingSchedule;
  }

  public CorrespondentBankOperatingSession holidayOrTimezoneSchedule(String holidayOrTimezoneSchedule) {
    this.holidayOrTimezoneSchedule = holidayOrTimezoneSchedule;
    return this;
  }

  /**
   * Get holidayOrTimezoneSchedule
   * @return holidayOrTimezoneSchedule
  */
  @ApiModelProperty(value = "")


  public String getHolidayOrTimezoneSchedule() {
    return holidayOrTimezoneSchedule;
  }

  public void setHolidayOrTimezoneSchedule(String holidayOrTimezoneSchedule) {
    this.holidayOrTimezoneSchedule = holidayOrTimezoneSchedule;
  }

  public CorrespondentBankOperatingSession vostroAccountReference(Object vostroAccountReference) {
    this.vostroAccountReference = vostroAccountReference;
    return this;
  }

  /**
   * Get vostroAccountReference
   * @return vostroAccountReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getVostroAccountReference() {
    return vostroAccountReference;
  }

  public void setVostroAccountReference(Object vostroAccountReference) {
    this.vostroAccountReference = vostroAccountReference;
  }

  public CorrespondentBankOperatingSession nostroMirrorAccountReference(Object nostroMirrorAccountReference) {
    this.nostroMirrorAccountReference = nostroMirrorAccountReference;
    return this;
  }

  /**
   * Get nostroMirrorAccountReference
   * @return nostroMirrorAccountReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getNostroMirrorAccountReference() {
    return nostroMirrorAccountReference;
  }

  public void setNostroMirrorAccountReference(Object nostroMirrorAccountReference) {
    this.nostroMirrorAccountReference = nostroMirrorAccountReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorrespondentBankOperatingSession correspondentBankOperatingSession = (CorrespondentBankOperatingSession) o;
    return Objects.equals(this.correspondentBankFacilityReference, correspondentBankOperatingSession.correspondentBankFacilityReference) &&
        Objects.equals(this.correspondentBankFacility, correspondentBankOperatingSession.correspondentBankFacility) &&
        Objects.equals(this.correspondentBankServicingSchedule, correspondentBankOperatingSession.correspondentBankServicingSchedule) &&
        Objects.equals(this.holidayOrTimezoneSchedule, correspondentBankOperatingSession.holidayOrTimezoneSchedule) &&
        Objects.equals(this.vostroAccountReference, correspondentBankOperatingSession.vostroAccountReference) &&
        Objects.equals(this.nostroMirrorAccountReference, correspondentBankOperatingSession.nostroMirrorAccountReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondentBankFacilityReference, correspondentBankFacility, correspondentBankServicingSchedule, holidayOrTimezoneSchedule, vostroAccountReference, nostroMirrorAccountReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrespondentBankOperatingSession {\n");
    
    sb.append("    correspondentBankFacilityReference: ").append(toIndentedString(correspondentBankFacilityReference)).append("\n");
    sb.append("    correspondentBankFacility: ").append(toIndentedString(correspondentBankFacility)).append("\n");
    sb.append("    correspondentBankServicingSchedule: ").append(toIndentedString(correspondentBankServicingSchedule)).append("\n");
    sb.append("    holidayOrTimezoneSchedule: ").append(toIndentedString(holidayOrTimezoneSchedule)).append("\n");
    sb.append("    vostroAccountReference: ").append(toIndentedString(vostroAccountReference)).append("\n");
    sb.append("    nostroMirrorAccountReference: ").append(toIndentedString(nostroMirrorAccountReference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

