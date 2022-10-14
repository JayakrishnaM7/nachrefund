package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateQueryRequestCustomerContactSessionProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class UpdateQueryRequestCustomerContactSessionProcedure   {
  @JsonProperty("SessionDialogueRecord")
  private String sessionDialogueRecord;

  @JsonProperty("SessionDialogueLog")
  private String sessionDialogueLog;

  @JsonProperty("SessionDialogueResult")
  private String sessionDialogueResult;

  public UpdateQueryRequestCustomerContactSessionProcedure sessionDialogueRecord(String sessionDialogueRecord) {
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

  public UpdateQueryRequestCustomerContactSessionProcedure sessionDialogueLog(String sessionDialogueLog) {
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

  public UpdateQueryRequestCustomerContactSessionProcedure sessionDialogueResult(String sessionDialogueResult) {
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
    UpdateQueryRequestCustomerContactSessionProcedure updateQueryRequestCustomerContactSessionProcedure = (UpdateQueryRequestCustomerContactSessionProcedure) o;
    return Objects.equals(this.sessionDialogueRecord, updateQueryRequestCustomerContactSessionProcedure.sessionDialogueRecord) &&
        Objects.equals(this.sessionDialogueLog, updateQueryRequestCustomerContactSessionProcedure.sessionDialogueLog) &&
        Objects.equals(this.sessionDialogueResult, updateQueryRequestCustomerContactSessionProcedure.sessionDialogueResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionDialogueRecord, sessionDialogueLog, sessionDialogueResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateQueryRequestCustomerContactSessionProcedure {\n");
    
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

