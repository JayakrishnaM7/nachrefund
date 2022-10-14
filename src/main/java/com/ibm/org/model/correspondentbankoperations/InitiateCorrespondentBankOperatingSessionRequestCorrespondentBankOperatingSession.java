package com.ibm.org.model.correspondentbankoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCorrespondentBankOperatingSessionRequestCorrespondentBankOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:01.907Z[GMT]")

public class InitiateCorrespondentBankOperatingSessionRequestCorrespondentBankOperatingSession   {
  @JsonProperty("CorrespondentBankServicingSchedule")
  private String correspondentBankServicingSchedule;

  @JsonProperty("HolidayOrTimezoneSchedule")
  private String holidayOrTimezoneSchedule;

  @JsonProperty("VostroAccountReference")
  private Object vostroAccountReference;

  @JsonProperty("NostroMirrorAccountReference")
  private Object nostroMirrorAccountReference;

  public InitiateCorrespondentBankOperatingSessionRequestCorrespondentBankOperatingSession correspondentBankServicingSchedule(String correspondentBankServicingSchedule) {
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

  public InitiateCorrespondentBankOperatingSessionRequestCorrespondentBankOperatingSession holidayOrTimezoneSchedule(String holidayOrTimezoneSchedule) {
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

  public InitiateCorrespondentBankOperatingSessionRequestCorrespondentBankOperatingSession vostroAccountReference(Object vostroAccountReference) {
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

  public InitiateCorrespondentBankOperatingSessionRequestCorrespondentBankOperatingSession nostroMirrorAccountReference(Object nostroMirrorAccountReference) {
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
    InitiateCorrespondentBankOperatingSessionRequestCorrespondentBankOperatingSession initiateCorrespondentBankOperatingSessionRequestCorrespondentBankOperatingSession = (InitiateCorrespondentBankOperatingSessionRequestCorrespondentBankOperatingSession) o;
    return Objects.equals(this.correspondentBankServicingSchedule, initiateCorrespondentBankOperatingSessionRequestCorrespondentBankOperatingSession.correspondentBankServicingSchedule) &&
        Objects.equals(this.holidayOrTimezoneSchedule, initiateCorrespondentBankOperatingSessionRequestCorrespondentBankOperatingSession.holidayOrTimezoneSchedule) &&
        Objects.equals(this.vostroAccountReference, initiateCorrespondentBankOperatingSessionRequestCorrespondentBankOperatingSession.vostroAccountReference) &&
        Objects.equals(this.nostroMirrorAccountReference, initiateCorrespondentBankOperatingSessionRequestCorrespondentBankOperatingSession.nostroMirrorAccountReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondentBankServicingSchedule, holidayOrTimezoneSchedule, vostroAccountReference, nostroMirrorAccountReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCorrespondentBankOperatingSessionRequestCorrespondentBankOperatingSession {\n");
    
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

