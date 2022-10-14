package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateProductorServiceResponseProductorService
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class InitiateProductorServiceResponseProductorService   {
  @JsonProperty("ProductandServiceTaskResult")
  private String productandServiceTaskResult;

  public InitiateProductorServiceResponseProductorService productandServiceTaskResult(String productandServiceTaskResult) {
    this.productandServiceTaskResult = productandServiceTaskResult;
    return this;
  }

  /**
   * Get productandServiceTaskResult
   * @return productandServiceTaskResult
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceTaskResult() {
    return productandServiceTaskResult;
  }

  public void setProductandServiceTaskResult(String productandServiceTaskResult) {
    this.productandServiceTaskResult = productandServiceTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateProductorServiceResponseProductorService initiateProductorServiceResponseProductorService = (InitiateProductorServiceResponseProductorService) o;
    return Objects.equals(this.productandServiceTaskResult, initiateProductorServiceResponseProductorService.productandServiceTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productandServiceTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateProductorServiceResponseProductorService {\n");
    
    sb.append("    productandServiceTaskResult: ").append(toIndentedString(productandServiceTaskResult)).append("\n");
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

