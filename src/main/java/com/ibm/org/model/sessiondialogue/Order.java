package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class Order   {
  @JsonProperty("OrderType")
  private String orderType;

  @JsonProperty("OrderTaskRecord")
  private String orderTaskRecord;

  @JsonProperty("OrderTaskWorkProducts")
  private String orderTaskWorkProducts;

  @JsonProperty("OrderTaskWorkResult")
  private String orderTaskWorkResult;

  public Order orderType(String orderType) {
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

  public Order orderTaskRecord(String orderTaskRecord) {
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

  public Order orderTaskWorkProducts(String orderTaskWorkProducts) {
    this.orderTaskWorkProducts = orderTaskWorkProducts;
    return this;
  }

  /**
   * Get orderTaskWorkProducts
   * @return orderTaskWorkProducts
  */
  @ApiModelProperty(value = "")


  public String getOrderTaskWorkProducts() {
    return orderTaskWorkProducts;
  }

  public void setOrderTaskWorkProducts(String orderTaskWorkProducts) {
    this.orderTaskWorkProducts = orderTaskWorkProducts;
  }

  public Order orderTaskWorkResult(String orderTaskWorkResult) {
    this.orderTaskWorkResult = orderTaskWorkResult;
    return this;
  }

  /**
   * Get orderTaskWorkResult
   * @return orderTaskWorkResult
  */
  @ApiModelProperty(value = "")


  public String getOrderTaskWorkResult() {
    return orderTaskWorkResult;
  }

  public void setOrderTaskWorkResult(String orderTaskWorkResult) {
    this.orderTaskWorkResult = orderTaskWorkResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.orderType, order.orderType) &&
        Objects.equals(this.orderTaskRecord, order.orderTaskRecord) &&
        Objects.equals(this.orderTaskWorkProducts, order.orderTaskWorkProducts) &&
        Objects.equals(this.orderTaskWorkResult, order.orderTaskWorkResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderType, orderTaskRecord, orderTaskWorkProducts, orderTaskWorkResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    orderTaskRecord: ").append(toIndentedString(orderTaskRecord)).append("\n");
    sb.append("    orderTaskWorkProducts: ").append(toIndentedString(orderTaskWorkProducts)).append("\n");
    sb.append("    orderTaskWorkResult: ").append(toIndentedString(orderTaskWorkResult)).append("\n");
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

