package com.ibm.org.model.correspondentbankoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.correspondentbankoperations.InitiateCorrespondentBankOperatingSessionResponseCorrespondentBankOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteCorrespondentBankOperatingSessionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:01.907Z[GMT]")

public class ExecuteCorrespondentBankOperatingSessionRequest   {
  @JsonProperty("CorrespondentBankOperatingSession")
  private InitiateCorrespondentBankOperatingSessionResponseCorrespondentBankOperatingSession correspondentBankOperatingSession;

  public ExecuteCorrespondentBankOperatingSessionRequest correspondentBankOperatingSession(InitiateCorrespondentBankOperatingSessionResponseCorrespondentBankOperatingSession correspondentBankOperatingSession) {
    this.correspondentBankOperatingSession = correspondentBankOperatingSession;
    return this;
  }

  /**
   * Get correspondentBankOperatingSession
   * @return correspondentBankOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCorrespondentBankOperatingSessionResponseCorrespondentBankOperatingSession getCorrespondentBankOperatingSession() {
    return correspondentBankOperatingSession;
  }

  public void setCorrespondentBankOperatingSession(InitiateCorrespondentBankOperatingSessionResponseCorrespondentBankOperatingSession correspondentBankOperatingSession) {
    this.correspondentBankOperatingSession = correspondentBankOperatingSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteCorrespondentBankOperatingSessionRequest executeCorrespondentBankOperatingSessionRequest = (ExecuteCorrespondentBankOperatingSessionRequest) o;
    return Objects.equals(this.correspondentBankOperatingSession, executeCorrespondentBankOperatingSessionRequest.correspondentBankOperatingSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondentBankOperatingSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteCorrespondentBankOperatingSessionRequest {\n");
    
    sb.append("    correspondentBankOperatingSession: ").append(toIndentedString(correspondentBankOperatingSession)).append("\n");
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

