package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateOrderRequestOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class InitiateOrderRequestOrder   {
  @JsonProperty("OrderType")
  private String orderType;

  @JsonProperty("OrderTaskRecord")
  private String orderTaskRecord;

  public InitiateOrderRequestOrder orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

  /**
   * Get orderType
   * @return orderType
  */
  @ApiModelProperty(value = "")


  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public InitiateOrderRequestOrder orderTaskRecord(String orderTaskRecord) {
    this.orderTaskRecord = orderTaskRecord;
    return this;
  }

  /**
   * Get orderTaskRecord
   * @return orderTaskRecord
  */
  @ApiModelProperty(value = "")


  public String getOrderTaskRecord() {
    return orderTaskRecord;
  }

  public void setOrderTaskRecord(String orderTaskRecord) {
    this.orderTaskRecord = orderTaskRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateOrderRequestOrder initiateOrderRequestOrder = (InitiateOrderRequestOrder) o;
    return Objects.equals(this.orderType, initiateOrderRequestOrder.orderType) &&
        Objects.equals(this.orderTaskRecord, initiateOrderRequestOrder.orderTaskRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderType, orderTaskRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateOrderRequestOrder {\n");
    
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    orderTaskRecord: ").append(toIndentedString(orderTaskRecord)).append("\n");
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

