package com.ibm.org.model.paymentorder;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveExecutionInitiationResponseExecutionInitiation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:44.903Z[GMT]")

public class RetrieveExecutionInitiationResponseExecutionInitiation   {
  @JsonProperty("PaymentExecutionProcedureInstanceReference")
  private Object paymentExecutionProcedureInstanceReference;

  @JsonProperty("PaymentExecutionProcedureInstanceStatus")
  private String paymentExecutionProcedureInstanceStatus;

  @JsonProperty("ExecutionInitiationTaskResult")
  private String executionInitiationTaskResult;

  public RetrieveExecutionInitiationResponseExecutionInitiation paymentExecutionProcedureInstanceReference(Object paymentExecutionProcedureInstanceReference) {
    this.paymentExecutionProcedureInstanceReference = paymentExecutionProcedureInstanceReference;
    return this;
  }

  /**
   * Get paymentExecutionProcedureInstanceReference
   * @return paymentExecutionProcedureInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentExecutionProcedureInstanceReference() {
    return paymentExecutionProcedureInstanceReference;
  }

  public void setPaymentExecutionProcedureInstanceReference(Object paymentExecutionProcedureInstanceReference) {
    this.paymentExecutionProcedureInstanceReference = paymentExecutionProcedureInstanceReference;
  }

  public RetrieveExecutionInitiationResponseExecutionInitiation paymentExecutionProcedureInstanceStatus(String paymentExecutionProcedureInstanceStatus) {
    this.paymentExecutionProcedureInstanceStatus = paymentExecutionProcedureInstanceStatus;
    return this;
  }

  /**
   * Get paymentExecutionProcedureInstanceStatus
   * @return paymentExecutionProcedureInstanceStatus
  */
  @ApiModelProperty(value = "")


  public String getPaymentExecutionProcedureInstanceStatus() {
    return paymentExecutionProcedureInstanceStatus;
  }

  public void setPaymentExecutionProcedureInstanceStatus(String paymentExecutionProcedureInstanceStatus) {
    this.paymentExecutionProcedureInstanceStatus = paymentExecutionProcedureInstanceStatus;
  }

  public RetrieveExecutionInitiationResponseExecutionInitiation executionInitiationTaskResult(String executionInitiationTaskResult) {
    this.executionInitiationTaskResult = executionInitiationTaskResult;
    return this;
  }

  /**
   * Get executionInitiationTaskResult
   * @return executionInitiationTaskResult
  */
  @ApiModelProperty(value = "")


  public String getExecutionInitiationTaskResult() {
    return executionInitiationTaskResult;
  }

  public void setExecutionInitiationTaskResult(String executionInitiationTaskResult) {
    this.executionInitiationTaskResult = executionInitiationTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveExecutionInitiationResponseExecutionInitiation retrieveExecutionInitiationResponseExecutionInitiation = (RetrieveExecutionInitiationResponseExecutionInitiation) o;
    return Objects.equals(this.paymentExecutionProcedureInstanceReference, retrieveExecutionInitiationResponseExecutionInitiation.paymentExecutionProcedureInstanceReference) &&
        Objects.equals(this.paymentExecutionProcedureInstanceStatus, retrieveExecutionInitiationResponseExecutionInitiation.paymentExecutionProcedureInstanceStatus) &&
        Objects.equals(this.executionInitiationTaskResult, retrieveExecutionInitiationResponseExecutionInitiation.executionInitiationTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentExecutionProcedureInstanceReference, paymentExecutionProcedureInstanceStatus, executionInitiationTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveExecutionInitiationResponseExecutionInitiation {\n");
    
    sb.append("    paymentExecutionProcedureInstanceReference: ").append(toIndentedString(paymentExecutionProcedureInstanceReference)).append("\n");
    sb.append("    paymentExecutionProcedureInstanceStatus: ").append(toIndentedString(paymentExecutionProcedureInstanceStatus)).append("\n");
    sb.append("    executionInitiationTaskResult: ").append(toIndentedString(executionInitiationTaskResult)).append("\n");
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

