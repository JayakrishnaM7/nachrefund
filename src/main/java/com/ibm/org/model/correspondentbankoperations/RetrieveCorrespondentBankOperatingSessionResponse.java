package com.ibm.org.model.correspondentbankoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.correspondentbankoperations.InitiateCorrespondentBankOperatingSessionResponseCorrespondentBankOperatingSession;
import com.ibm.org.model.correspondentbankoperations.RetrieveCorrespondentBankOperatingSessionResponseInboundPayments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveCorrespondentBankOperatingSessionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:01.907Z[GMT]")

public class RetrieveCorrespondentBankOperatingSessionResponse   {
  @JsonProperty("CorrespondentBankOperatingSession")
  private InitiateCorrespondentBankOperatingSessionResponseCorrespondentBankOperatingSession correspondentBankOperatingSession;

  @JsonProperty("InboundPayments")
  private RetrieveCorrespondentBankOperatingSessionResponseInboundPayments inboundPayments;

  public RetrieveCorrespondentBankOperatingSessionResponse correspondentBankOperatingSession(InitiateCorrespondentBankOperatingSessionResponseCorrespondentBankOperatingSession correspondentBankOperatingSession) {
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

  public RetrieveCorrespondentBankOperatingSessionResponse inboundPayments(RetrieveCorrespondentBankOperatingSessionResponseInboundPayments inboundPayments) {
    this.inboundPayments = inboundPayments;
    return this;
  }

  /**
   * Get inboundPayments
   * @return inboundPayments
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveCorrespondentBankOperatingSessionResponseInboundPayments getInboundPayments() {
    return inboundPayments;
  }

  public void setInboundPayments(RetrieveCorrespondentBankOperatingSessionResponseInboundPayments inboundPayments) {
    this.inboundPayments = inboundPayments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveCorrespondentBankOperatingSessionResponse retrieveCorrespondentBankOperatingSessionResponse = (RetrieveCorrespondentBankOperatingSessionResponse) o;
    return Objects.equals(this.correspondentBankOperatingSession, retrieveCorrespondentBankOperatingSessionResponse.correspondentBankOperatingSession) &&
        Objects.equals(this.inboundPayments, retrieveCorrespondentBankOperatingSessionResponse.inboundPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondentBankOperatingSession, inboundPayments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveCorrespondentBankOperatingSessionResponse {\n");
    
    sb.append("    correspondentBankOperatingSession: ").append(toIndentedString(correspondentBankOperatingSession)).append("\n");
    sb.append("    inboundPayments: ").append(toIndentedString(inboundPayments)).append("\n");
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

