package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.sessiondialogue.ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure;
import com.ibm.org.model.sessiondialogue.InitiateIntelligenceResponseIntelligence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateIntelligenceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class InitiateIntelligenceResponse   {
  @JsonProperty("CustomerContactSessionProcedure")
  private ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure customerContactSessionProcedure;

  @JsonProperty("Intelligence")
  private InitiateIntelligenceResponseIntelligence intelligence;

  public InitiateIntelligenceResponse customerContactSessionProcedure(ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure customerContactSessionProcedure) {
    this.customerContactSessionProcedure = customerContactSessionProcedure;
    return this;
  }

  /**
   * Get customerContactSessionProcedure
   * @return customerContactSessionProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure getCustomerContactSessionProcedure() {
    return customerContactSessionProcedure;
  }

  public void setCustomerContactSessionProcedure(ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure customerContactSessionProcedure) {
    this.customerContactSessionProcedure = customerContactSessionProcedure;
  }

  public InitiateIntelligenceResponse intelligence(InitiateIntelligenceResponseIntelligence intelligence) {
    this.intelligence = intelligence;
    return this;
  }

  /**
   * Get intelligence
   * @return intelligence
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateIntelligenceResponseIntelligence getIntelligence() {
    return intelligence;
  }

  public void setIntelligence(InitiateIntelligenceResponseIntelligence intelligence) {
    this.intelligence = intelligence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateIntelligenceResponse initiateIntelligenceResponse = (InitiateIntelligenceResponse) o;
    return Objects.equals(this.customerContactSessionProcedure, initiateIntelligenceResponse.customerContactSessionProcedure) &&
        Objects.equals(this.intelligence, initiateIntelligenceResponse.intelligence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactSessionProcedure, intelligence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateIntelligenceResponse {\n");
    
    sb.append("    customerContactSessionProcedure: ").append(toIndentedString(customerContactSessionProcedure)).append("\n");
    sb.append("    intelligence: ").append(toIndentedString(intelligence)).append("\n");
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

