package com.ibm.org.model.paymentorder;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePaymentOrderProcedureResponsePaymentOrderProcedure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:44.903Z[GMT]")

public class InitiatePaymentOrderProcedureResponsePaymentOrderProcedure   {
  @JsonProperty("PaymentMechanismType")
  private String paymentMechanismType;

  public InitiatePaymentOrderProcedureResponsePaymentOrderProcedure paymentMechanismType(String paymentMechanismType) {
    this.paymentMechanismType = paymentMechanismType;
    return this;
  }

  /**
   * Get paymentMechanismType
   * @return paymentMechanismType
  */
  @ApiModelProperty(value = "")


  public String getPaymentMechanismType() {
    return paymentMechanismType;
  }

  public void setPaymentMechanismType(String paymentMechanismType) {
    this.paymentMechanismType = paymentMechanismType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentOrderProcedureResponsePaymentOrderProcedure initiatePaymentOrderProcedureResponsePaymentOrderProcedure = (InitiatePaymentOrderProcedureResponsePaymentOrderProcedure) o;
    return Objects.equals(this.paymentMechanismType, initiatePaymentOrderProcedureResponsePaymentOrderProcedure.paymentMechanismType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMechanismType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentOrderProcedureResponsePaymentOrderProcedure {\n");
    
    sb.append("    paymentMechanismType: ").append(toIndentedString(paymentMechanismType)).append("\n");
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

