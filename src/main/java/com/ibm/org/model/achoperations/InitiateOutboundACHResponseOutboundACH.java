package com.ibm.org.model.achoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateOutboundACHResponseOutboundACH
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:17.996Z[GMT]")

public class InitiateOutboundACHResponseOutboundACH   {
  @JsonProperty("OutboundACHTransactionBatchReference")
  private Object outboundACHTransactionBatchReference;

  public InitiateOutboundACHResponseOutboundACH outboundACHTransactionBatchReference(Object outboundACHTransactionBatchReference) {
    this.outboundACHTransactionBatchReference = outboundACHTransactionBatchReference;
    return this;
  }

  /**
   * Get outboundACHTransactionBatchReference
   * @return outboundACHTransactionBatchReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getOutboundACHTransactionBatchReference() {
    return outboundACHTransactionBatchReference;
  }

  public void setOutboundACHTransactionBatchReference(Object outboundACHTransactionBatchReference) {
    this.outboundACHTransactionBatchReference = outboundACHTransactionBatchReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateOutboundACHResponseOutboundACH initiateOutboundACHResponseOutboundACH = (InitiateOutboundACHResponseOutboundACH) o;
    return Objects.equals(this.outboundACHTransactionBatchReference, initiateOutboundACHResponseOutboundACH.outboundACHTransactionBatchReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outboundACHTransactionBatchReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateOutboundACHResponseOutboundACH {\n");
    
    sb.append("    outboundACHTransactionBatchReference: ").append(toIndentedString(outboundACHTransactionBatchReference)).append("\n");
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

