package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveAuthenticationResponseCustomerContactSessionProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class RetrieveAuthenticationResponseCustomerContactSessionProcedure   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("SessionDialogueRecord")
  private String sessionDialogueRecord;

  @JsonProperty("SessionDialogueLog")
  private String sessionDialogueLog;

  @JsonProperty("SessionDialogueResult")
  private String sessionDialogueResult;

  public RetrieveAuthenticationResponseCustomerContactSessionProcedure customerReference(Object customerReference) {
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

  public RetrieveAuthenticationResponseCustomerContactSessionProcedure sessionDialogueRecord(String sessionDialogueRecord) {
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

  public RetrieveAuthenticationResponseCustomerContactSessionProcedure sessionDialogueLog(String sessionDialogueLog) {
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

  public RetrieveAuthenticationResponseCustomerContactSessionProcedure sessionDialogueResult(String sessionDialogueResult) {
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
    RetrieveAuthenticationResponseCustomerContactSessionProcedure retrieveAuthenticationResponseCustomerContactSessionProcedure = (RetrieveAuthenticationResponseCustomerContactSessionProcedure) o;
    return Objects.equals(this.customerReference, retrieveAuthenticationResponseCustomerContactSessionProcedure.customerReference) &&
        Objects.equals(this.sessionDialogueRecord, retrieveAuthenticationResponseCustomerContactSessionProcedure.sessionDialogueRecord) &&
        Objects.equals(this.sessionDialogueLog, retrieveAuthenticationResponseCustomerContactSessionProcedure.sessionDialogueLog) &&
        Objects.equals(this.sessionDialogueResult, retrieveAuthenticationResponseCustomerContactSessionProcedure.sessionDialogueResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, sessionDialogueRecord, sessionDialogueLog, sessionDialogueResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAuthenticationResponseCustomerContactSessionProcedure {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    sessionDialogueRecord: ").append(toIndentedString(sessionDialogueRecord)).append("\n");
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

