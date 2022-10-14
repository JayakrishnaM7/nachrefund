package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class InitiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure   {
  @JsonProperty("SessionStartOrEndTime")
  private String sessionStartOrEndTime;

  @JsonProperty("SessionDialogueRecord")
  private String sessionDialogueRecord;

  @JsonProperty("SessionDialogueType")
  private String sessionDialogueType;

  @JsonProperty("SessionDialogueScript")
  private String sessionDialogueScript;

  @JsonProperty("SessionDialogueLogReference")
  private Object sessionDialogueLogReference;

  @JsonProperty("SessionDialogueResult")
  private String sessionDialogueResult;

  public InitiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure sessionStartOrEndTime(String sessionStartOrEndTime) {
    this.sessionStartOrEndTime = sessionStartOrEndTime;
    return this;
  }

  /**
   * Get sessionStartOrEndTime
   * @return sessionStartOrEndTime
  */
  @ApiModelProperty(value = "")


  public String getSessionStartOrEndTime() {
    return sessionStartOrEndTime;
  }

  public void setSessionStartOrEndTime(String sessionStartOrEndTime) {
    this.sessionStartOrEndTime = sessionStartOrEndTime;
  }

  public InitiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure sessionDialogueRecord(String sessionDialogueRecord) {
    this.sessionDialogueRecord = sessionDialogueRecord;
    return this;
  }

  /**
   * Get sessionDialogueRecord
   * @return sessionDialogueRecord
  */
  @ApiModelProperty(value = "")


  public String getSessionDialogueRecord() {
    return sessionDialogueRecord;
  }

  public void setSessionDialogueRecord(String sessionDialogueRecord) {
    this.sessionDialogueRecord = sessionDialogueRecord;
  }

  public InitiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure sessionDialogueType(String sessionDialogueType) {
    this.sessionDialogueType = sessionDialogueType;
    return this;
  }

  /**
   * Get sessionDialogueType
   * @return sessionDialogueType
  */
  @ApiModelProperty(value = "")


  public String getSessionDialogueType() {
    return sessionDialogueType;
  }

  public void setSessionDialogueType(String sessionDialogueType) {
    this.sessionDialogueType = sessionDialogueType;
  }

  public InitiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure sessionDialogueScript(String sessionDialogueScript) {
    this.sessionDialogueScript = sessionDialogueScript;
    return this;
  }

  /**
   * Get sessionDialogueScript
   * @return sessionDialogueScript
  */
  @ApiModelProperty(value = "")


  public String getSessionDialogueScript() {
    return sessionDialogueScript;
  }

  public void setSessionDialogueScript(String sessionDialogueScript) {
    this.sessionDialogueScript = sessionDialogueScript;
  }

  public InitiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure sessionDialogueLogReference(Object sessionDialogueLogReference) {
    this.sessionDialogueLogReference = sessionDialogueLogReference;
    return this;
  }

  /**
   * Get sessionDialogueLogReference
   * @return sessionDialogueLogReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSessionDialogueLogReference() {
    return sessionDialogueLogReference;
  }

  public void setSessionDialogueLogReference(Object sessionDialogueLogReference) {
    this.sessionDialogueLogReference = sessionDialogueLogReference;
  }

  public InitiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure sessionDialogueResult(String sessionDialogueResult) {
    this.sessionDialogueResult = sessionDialogueResult;
    return this;
  }

  /**
   * Get sessionDialogueResult
   * @return sessionDialogueResult
  */
  @ApiModelProperty(value = "")


  public String getSessionDialogueResult() {
    return sessionDialogueResult;
  }

  public void setSessionDialogueResult(String sessionDialogueResult) {
    this.sessionDialogueResult = sessionDialogueResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure initiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure = (InitiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure) o;
    return Objects.equals(this.sessionStartOrEndTime, initiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure.sessionStartOrEndTime) &&
        Objects.equals(this.sessionDialogueRecord, initiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure.sessionDialogueRecord) &&
        Objects.equals(this.sessionDialogueType, initiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure.sessionDialogueType) &&
        Objects.equals(this.sessionDialogueScript, initiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure.sessionDialogueScript) &&
        Objects.equals(this.sessionDialogueLogReference, initiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure.sessionDialogueLogReference) &&
        Objects.equals(this.sessionDialogueResult, initiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure.sessionDialogueResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionStartOrEndTime, sessionDialogueRecord, sessionDialogueType, sessionDialogueScript, sessionDialogueLogReference, sessionDialogueResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerContactSessionProcedureResponseCustomerContactSessionProcedure {\n");
    
    sb.append("    sessionStartOrEndTime: ").append(toIndentedString(sessionStartOrEndTime)).append("\n");
    sb.append("    sessionDialogueRecord: ").append(toIndentedString(sessionDialogueRecord)).append("\n");
    sb.append("    sessionDialogueType: ").append(toIndentedString(sessionDialogueType)).append("\n");
    sb.append("    sessionDialogueScript: ").append(toIndentedString(sessionDialogueScript)).append("\n");
    sb.append("    sessionDialogueLogReference: ").append(toIndentedString(sessionDialogueLogReference)).append("\n");
    sb.append("    sessionDialogueResult: ").append(toIndentedString(sessionDialogueResult)).append("\n");
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

