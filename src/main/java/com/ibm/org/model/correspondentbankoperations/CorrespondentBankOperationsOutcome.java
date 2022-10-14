package com.ibm.org.model.correspondentbankoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CorrespondentBankOperationsOutcome
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:01.907Z[GMT]")

public class CorrespondentBankOperationsOutcome   {
  @JsonProperty("CorrespondentBankOperationsIncident")
  private String correspondentBankOperationsIncident;

  @JsonProperty("CorrespondentBankOperationsProvision")
  private String correspondentBankOperationsProvision;

  public CorrespondentBankOperationsOutcome correspondentBankOperationsIncident(String correspondentBankOperationsIncident) {
    this.correspondentBankOperationsIncident = correspondentBankOperationsIncident;
    return this;
  }

  /**
   * Get correspondentBankOperationsIncident
   * @return correspondentBankOperationsIncident
  */
  @ApiModelProperty(value = "")


  public String getCorrespondentBankOperationsIncident() {
    return correspondentBankOperationsIncident;
  }

  public void setCorrespondentBankOperationsIncident(String correspondentBankOperationsIncident) {
    this.correspondentBankOperationsIncident = correspondentBankOperationsIncident;
  }

  public CorrespondentBankOperationsOutcome correspondentBankOperationsProvision(String correspondentBankOperationsProvision) {
    this.correspondentBankOperationsProvision = correspondentBankOperationsProvision;
    return this;
  }

  /**
   * Get correspondentBankOperationsProvision
   * @return correspondentBankOperationsProvision
  */
  @ApiModelProperty(value = "")


  public String getCorrespondentBankOperationsProvision() {
    return correspondentBankOperationsProvision;
  }

  public void setCorrespondentBankOperationsProvision(String correspondentBankOperationsProvision) {
    this.correspondentBankOperationsProvision = correspondentBankOperationsProvision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorrespondentBankOperationsOutcome correspondentBankOperationsOutcome = (CorrespondentBankOperationsOutcome) o;
    return Objects.equals(this.correspondentBankOperationsIncident, correspondentBankOperationsOutcome.correspondentBankOperationsIncident) &&
        Objects.equals(this.correspondentBankOperationsProvision, correspondentBankOperationsOutcome.correspondentBankOperationsProvision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondentBankOperationsIncident, correspondentBankOperationsProvision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrespondentBankOperationsOutcome {\n");
    
    sb.append("    correspondentBankOperationsIncident: ").append(toIndentedString(correspondentBankOperationsIncident)).append("\n");
    sb.append("    correspondentBankOperationsProvision: ").append(toIndentedString(correspondentBankOperationsProvision)).append("\n");
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

