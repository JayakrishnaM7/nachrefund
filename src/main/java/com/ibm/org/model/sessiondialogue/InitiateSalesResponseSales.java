package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateSalesResponseSales
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class InitiateSalesResponseSales   {
  @JsonProperty("SalesTaskResult")
  private String salesTaskResult;

  public InitiateSalesResponseSales salesTaskResult(String salesTaskResult) {
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
    InitiateSalesResponseSales initiateSalesResponseSales = (InitiateSalesResponseSales) o;
    return Objects.equals(this.salesTaskResult, initiateSalesResponseSales.salesTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateSalesResponseSales {\n");
    
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

