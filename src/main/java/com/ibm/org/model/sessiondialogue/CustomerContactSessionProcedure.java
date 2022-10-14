package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerContactSessionProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class CustomerContactSessionProcedure   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("EmployeeReference")
  private Object employeeReference;

  @JsonProperty("ServicingPositionReference")
  private Object servicingPositionReference;

  @JsonProperty("SessionMechanism")
  private String sessionMechanism;

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

  @JsonProperty("SessionDialogueLog")
  private String sessionDialogueLog;

  @JsonProperty("SessionDialogueResult")
  private String sessionDialogueResult;

  public CustomerContactSessionProcedure customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public CustomerContactSessionProcedure employeeReference(Object employeeReference) {
    this.employeeReference = employeeReference;
    return this;
  }

  /**
   * Get employeeReference
   * @return employeeReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeeReference() {
    return employeeReference;
  }

  public void setEmployeeReference(Object employeeReference) {
    this.employeeReference = employeeReference;
  }

  public CustomerContactSessionProcedure servicingPositionReference(Object servicingPositionReference) {
    this.servicingPositionReference = servicingPositionReference;
    return this;
  }

  /**
   * Get servicingPositionReference
   * @return servicingPositionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getServicingPositionReference() {
    return servicingPositionReference;
  }

  public void setServicingPositionReference(Object servicingPositionReference) {
    this.servicingPositionReference = servicingPositionReference;
  }

  public CustomerContactSessionProcedure sessionMechanism(String sessionMechanism) {
    this.sessionMechanism = sessionMechanism;
    return this;
  }

  /**
   * Get sessionMechanism
   * @return sessionMechanism
  */
  @ApiModelProperty(value = "")


  public String getSessionMechanism() {
    return sessionMechanism;
  }

  public void setSessionMechanism(String sessionMechanism) {
    this.sessionMechanism = sessionMechanism;
  }

  public CustomerContactSessionProcedure sessionStartOrEndTime(String sessionStartOrEndTime) {
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

  public CustomerContactSessionProcedure sessionDialogueRecord(String sessionDialogueRecord) {
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

  public CustomerContactSessionProcedure sessionDialogueType(String sessionDialogueType) {
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

  public CustomerContactSessionProcedure sessionDialogueScript(String sessionDialogueScript) {
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

  public CustomerContactSessionProcedure sessionDialogueLogReference(Object sessionDialogueLogReference) {
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

  public CustomerContactSessionProcedure sessionDialogueLog(String sessionDialogueLog) {
    this.sessionDialogueLog = sessionDialogueLog;
    return this;
  }

  /**
   * Get sessionDialogueLog
   * @return sessionDialogueLog
  */
  @ApiModelProperty(value = "")


  public String getSessionDialogueLog() {
    return sessionDialogueLog;
  }

  public void setSessionDialogueLog(String sessionDialogueLog) {
    this.sessionDialogueLog = sessionDialogueLog;
  }

  public CustomerContactSessionProcedure sessionDialogueResult(String sessionDialogueResult) {
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
    CustomerContactSessionProcedure customerContactSessionProcedure = (CustomerContactSessionProcedure) o;
    return Objects.equals(this.customerReference, customerContactSessionProcedure.customerReference) &&
        Objects.equals(this.employeeReference, customerContactSessionProcedure.employeeReference) &&
        Objects.equals(this.servicingPositionReference, customerContactSessionProcedure.servicingPositionReference) &&
        Objects.equals(this.sessionMechanism, customerContactSessionProcedure.sessionMechanism) &&
        Objects.equals(this.sessionStartOrEndTime, customerContactSessionProcedure.sessionStartOrEndTime) &&
        Objects.equals(this.sessionDialogueRecord, customerContactSessionProcedure.sessionDialogueRecord) &&
        Objects.equals(this.sessionDialogueType, customerContactSessionProcedure.sessionDialogueType) &&
        Objects.equals(this.sessionDialogueScript, customerContactSessionProcedure.sessionDialogueScript) &&
        Objects.equals(this.sessionDialogueLogReference, customerContactSessionProcedure.sessionDialogueLogReference) &&
        Objects.equals(this.sessionDialogueLog, customerContactSessionProcedure.sessionDialogueLog) &&
        Objects.equals(this.sessionDialogueResult, customerContactSessionProcedure.sessionDialogueResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, employeeReference, servicingPositionReference, sessionMechanism, sessionStartOrEndTime, sessionDialogueRecord, sessionDialogueType, sessionDialogueScript, sessionDialogueLogReference, sessionDialogueLog, sessionDialogueResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerContactSessionProcedure {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    employeeReference: ").append(toIndentedString(employeeReference)).append("\n");
    sb.append("    servicingPositionReference: ").append(toIndentedString(servicingPositionReference)).append("\n");
    sb.append("    sessionMechanism: ").append(toIndentedString(sessionMechanism)).append("\n");
    sb.append("    sessionStartOrEndTime: ").append(toIndentedString(sessionStartOrEndTime)).append("\n");
    sb.append("    sessionDialogueRecord: ").append(toIndentedString(sessionDialogueRecord)).append("\n");
    sb.append("    sessionDialogueType: ").append(toIndentedString(sessionDialogueType)).append("\n");
    sb.append("    sessionDialogueScript: ").append(toIndentedString(sessionDialogueScript)).append("\n");
    sb.append("    sessionDialogueLogReference: ").append(toIndentedString(sessionDialogueLogReference)).append("\n");
    sb.append("    sessionDialogueLog: ").append(toIndentedString(sessionDialogueLog)).append("\n");
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

