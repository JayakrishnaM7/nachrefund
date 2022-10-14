package com.ibm.org.model.achoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateInboundACHResponseInboundACH
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:17.996Z[GMT]")

public class InitiateInboundACHResponseInboundACH   {
  @JsonProperty("InboundACHTransactionBatchReference")
  private Object inboundACHTransactionBatchReference;

  @JsonProperty("DateType")
  private String dateType;

  public InitiateInboundACHResponseInboundACH inboundACHTransactionBatchReference(Object inboundACHTransactionBatchReference) {
    this.inboundACHTransactionBatchReference = inboundACHTransactionBatchReference;
    return this;
  }

  /**
   * Get inboundACHTransactionBatchReference
   * @return inboundACHTransactionBatchReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInboundACHTransactionBatchReference() {
    return inboundACHTransactionBatchReference;
  }

  public void setInboundACHTransactionBatchReference(Object inboundACHTransactionBatchReference) {
    this.inboundACHTransactionBatchReference = inboundACHTransactionBatchReference;
  }

  public InitiateInboundACHResponseInboundACH dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")


  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateInboundACHResponseInboundACH initiateInboundACHResponseInboundACH = (InitiateInboundACHResponseInboundACH) o;
    return Objects.equals(this.inboundACHTransactionBatchReference, initiateInboundACHResponseInboundACH.inboundACHTransactionBatchReference) &&
        Objects.equals(this.dateType, initiateInboundACHResponseInboundACH.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundACHTransactionBatchReference, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateInboundACHResponseInboundACH {\n");
    
    sb.append("    inboundACHTransactionBatchReference: ").append(toIndentedString(inboundACHTransactionBatchReference)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
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

