package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateSalesRequestSales
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class UpdateSalesRequestSales   {
  @JsonProperty("ProductandServiceType")
  private String productandServiceType;

  @JsonProperty("ProductandServiceProperties")
  private String productandServiceProperties;

  @JsonProperty("SalesTaskResult")
  private String salesTaskResult;

  public UpdateSalesRequestSales productandServiceType(String productandServiceType) {
    this.productandServiceType = productandServiceType;
    return this;
  }

  /**
   * Get productandServiceType
   * @return productandServiceType
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceType() {
    return productandServiceType;
  }

  public void setProductandServiceType(String productandServiceType) {
    this.productandServiceType = productandServiceType;
  }

  public UpdateSalesRequestSales productandServiceProperties(String productandServiceProperties) {
    this.productandServiceProperties = productandServiceProperties;
    return this;
  }

  /**
   * Get productandServiceProperties
   * @return productandServiceProperties
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceProperties() {
    return productandServiceProperties;
  }

  public void setProductandServiceProperties(String productandServiceProperties) {
    this.productandServiceProperties = productandServiceProperties;
  }

  public UpdateSalesRequestSales salesTaskResult(String salesTaskResult) {
    this.salesTaskResult = salesTaskResult;
    return this;
  }

  /**
   * Get salesTaskResult
   * @return salesTaskResult
  */
  @ApiModelProperty(value = "")


  public String getSalesTaskResult() {
    return salesTaskResult;
  }

  public void setSalesTaskResult(String salesTaskResult) {
    this.salesTaskResult = salesTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSalesRequestSales updateSalesRequestSales = (UpdateSalesRequestSales) o;
    return Objects.equals(this.productandServiceType, updateSalesRequestSales.productandServiceType) &&
        Objects.equals(this.productandServiceProperties, updateSalesRequestSales.productandServiceProperties) &&
        Objects.equals(this.salesTaskResult, updateSalesRequestSales.salesTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productandServiceType, productandServiceProperties, salesTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSalesRequestSales {\n");
    
    sb.append("    productandServiceType: ").append(toIndentedString(productandServiceType)).append("\n");
    sb.append("    productandServiceProperties: ").append(toIndentedString(productandServiceProperties)).append("\n");
    sb.append("    salesTaskResult: ").append(toIndentedString(salesTaskResult)).append("\n");
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

