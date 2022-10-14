package com.ibm.org.model.paymentorder;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.paymentorder.InitiatePaymentOrderProcedureRequestPaymentOrderProcedure;
import com.ibm.org.model.paymentorder.RetrieveOrderConfirmationResponseOrderConfirmation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveOrderConfirmationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:44.903Z[GMT]")

public class RetrieveOrderConfirmationResponse   {
  @JsonProperty("PaymentOrderProcedure")
  private InitiatePaymentOrderProcedureRequestPaymentOrderProcedure paymentOrderProcedure;

  @JsonProperty("OrderConfirmation")
  private RetrieveOrderConfirmationResponseOrderConfirmation orderConfirmation;

  public RetrieveOrderConfirmationResponse paymentOrderProcedure(InitiatePaymentOrderProcedureRequestPaymentOrderProcedure paymentOrderProcedure) {
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

  public RetrieveOrderConfirmationResponse orderConfirmation(RetrieveOrderConfirmationResponseOrderConfirmation orderConfirmation) {
    this.orderConfirmation = orderConfirmation;
    return this;
  }

  /**
   * Get orderConfirmation
   * @return orderConfirmation
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveOrderConfirmationResponseOrderConfirmation getOrderConfirmation() {
    return orderConfirmation;
  }

  public void setOrderConfirmation(RetrieveOrderConfirmationResponseOrderConfirmation orderConfirmation) {
    this.orderConfirmation = orderConfirmation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveOrderConfirmationResponse retrieveOrderConfirmationResponse = (RetrieveOrderConfirmationResponse) o;
    return Objects.equals(this.paymentOrderProcedure, retrieveOrderConfirmationResponse.paymentOrderProcedure) &&
        Objects.equals(this.orderConfirmation, retrieveOrderConfirmationResponse.orderConfirmation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentOrderProcedure, orderConfirmation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveOrderConfirmationResponse {\n");
    
    sb.append("    paymentOrderProcedure: ").append(toIndentedString(paymentOrderProcedure)).append("\n");
    sb.append("    orderConfirmation: ").append(toIndentedString(orderConfirmation)).append("\n");
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

