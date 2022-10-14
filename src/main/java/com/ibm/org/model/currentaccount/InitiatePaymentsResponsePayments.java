package com.ibm.org.model.currentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePaymentsResponsePayments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class InitiatePaymentsResponsePayments   {
  @JsonProperty("PaymentDefinition")
  private String paymentDefinition;

  @JsonProperty("PaymentProcessingOptionDefinition")
  private String paymentProcessingOptionDefinition;

  public InitiatePaymentsResponsePayments paymentDefinition(String paymentDefinition) {
    this.paymentDefinition = paymentDefinition;
    return this;
  }

  /**
   * Get paymentDefinition
   * @return paymentDefinition
  */
  @ApiModelProperty(value = "")


  public String getPaymentDefinition() {
    return paymentDefinition;
  }

  public void setPaymentDefinition(String paymentDefinition) {
    this.paymentDefinition = paymentDefinition;
  }

  public InitiatePaymentsResponsePayments paymentProcessingOptionDefinition(String paymentProcessingOptionDefinition) {
    this.paymentProcessingOptionDefinition = paymentProcessingOptionDefinition;
    return this;
  }

  /**
   * Get paymentProcessingOptionDefinition
   * @return paymentProcessingOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getPaymentProcessingOptionDefinition() {
    return paymentProcessingOptionDefinition;
  }

  public void setPaymentProcessingOptionDefinition(String paymentProcessingOptionDefinition) {
    this.paymentProcessingOptionDefinition = paymentProcessingOptionDefinition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentsResponsePayments initiatePaymentsResponsePayments = (InitiatePaymentsResponsePayments) o;
    return Objects.equals(this.paymentDefinition, initiatePaymentsResponsePayments.paymentDefinition) &&
        Objects.equals(this.paymentProcessingOptionDefinition, initiatePaymentsResponsePayments.paymentProcessingOptionDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentDefinition, paymentProcessingOptionDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentsResponsePayments {\n");
    
    sb.append("    paymentDefinition: ").append(toIndentedString(paymentDefinition)).append("\n");
    sb.append("    paymentProcessingOptionDefinition: ").append(toIndentedString(paymentProcessingOptionDefinition)).append("\n");
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

