package com.ibm.org.model.paymentorder;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.paymentorder.InitiatePaymentOrderProcedureRequestPaymentOrderProcedure;
import com.ibm.org.model.paymentorder.RetrieveExecutionInitiationResponseExecutionInitiation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveExecutionInitiationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:44.903Z[GMT]")

public class RetrieveExecutionInitiationResponse   {
  @JsonProperty("PaymentOrderProcedure")
  private InitiatePaymentOrderProcedureRequestPaymentOrderProcedure paymentOrderProcedure;

  @JsonProperty("ExecutionInitiation")
  private RetrieveExecutionInitiationResponseExecutionInitiation executionInitiation;

  public RetrieveExecutionInitiationResponse paymentOrderProcedure(InitiatePaymentOrderProcedureRequestPaymentOrderProcedure paymentOrderProcedure) {
    this.paymentOrderProcedure = paymentOrderProcedure;
    return this;
  }

  /**
   * Get paymentOrderProcedure
   * @return paymentOrderProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePaymentOrderProcedureRequestPaymentOrderProcedure getPaymentOrderProcedure() {
    return paymentOrderProcedure;
  }

  public void setPaymentOrderProcedure(InitiatePaymentOrderProcedureRequestPaymentOrderProcedure paymentOrderProcedure) {
    this.paymentOrderProcedure = paymentOrderProcedure;
  }

  public RetrieveExecutionInitiationResponse executionInitiation(RetrieveExecutionInitiationResponseExecutionInitiation executionInitiation) {
    this.executionInitiation = executionInitiation;
    return this;
  }

  /**
   * Get executionInitiation
   * @return executionInitiation
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveExecutionInitiationResponseExecutionInitiation getExecutionInitiation() {
    return executionInitiation;
  }

  public void setExecutionInitiation(RetrieveExecutionInitiationResponseExecutionInitiation executionInitiation) {
    this.executionInitiation = executionInitiation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveExecutionInitiationResponse retrieveExecutionInitiationResponse = (RetrieveExecutionInitiationResponse) o;
    return Objects.equals(this.paymentOrderProcedure, retrieveExecutionInitiationResponse.paymentOrderProcedure) &&
        Objects.equals(this.executionInitiation, retrieveExecutionInitiationResponse.executionInitiation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentOrderProcedure, executionInitiation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveExecutionInitiationResponse {\n");
    
    sb.append("    paymentOrderProcedure: ").append(toIndentedString(paymentOrderProcedure)).append("\n");
    sb.append("    executionInitiation: ").append(toIndentedString(executionInitiation)).append("\n");
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

