package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class InitiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure   {
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

  public InitiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure customerReference(Object customerReference) {
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

  public InitiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure employeeReference(Object employeeReference) {
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

  public InitiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure servicingPositionReference(Object servicingPositionReference) {
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

  public InitiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure sessionMechanism(String sessionMechanism) {
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

  public InitiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure sessionStartOrEndTime(String sessionStartOrEndTime) {
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

  public InitiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure sessionDialogueRecord(String sessionDialogueRecord) {
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

  public InitiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure sessionDialogueType(String sessionDialogueType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure initiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure = (InitiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure) o;
    return Objects.equals(this.customerReference, initiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure.customerReference) &&
        Objects.equals(this.employeeReference, initiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure.employeeReference) &&
        Objects.equals(this.servicingPositionReference, initiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure.servicingPositionReference) &&
        Objects.equals(this.sessionMechanism, initiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure.sessionMechanism) &&
        Objects.equals(this.sessionStartOrEndTime, initiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure.sessionStartOrEndTime) &&
        Objects.equals(this.sessionDialogueRecord, initiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure.sessionDialogueRecord) &&
        Objects.equals(this.sessionDialogueType, initiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure.sessionDialogueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, employeeReference, servicingPositionReference, sessionMechanism, sessionStartOrEndTime, sessionDialogueRecord, sessionDialogueType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    employeeReference: ").append(toIndentedString(employeeReference)).append("\n");
    sb.append("    servicingPositionReference: ").append(toIndentedString(servicingPositionReference)).append("\n");
    sb.append("    sessionMechanism: ").append(toIndentedString(sessionMechanism)).append("\n");
    sb.append("    sessionStartOrEndTime: ").append(toIndentedString(sessionStartOrEndTime)).append("\n");
    sb.append("    sessionDialogueRecord: ").append(toIndentedString(sessionDialogueRecord)).append("\n");
    sb.append("    sessionDialogueType: ").append(toIndentedString(sessionDialogueType)).append("\n");
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

