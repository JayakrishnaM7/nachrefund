package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.sessiondialogue.UpdateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure;
import com.ibm.org.model.sessiondialogue.UpdateProductorServiceRequestProductorService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveProductorServiceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class RetrieveProductorServiceResponse   {
  @JsonProperty("CustomerContactSessionProcedure")
  private UpdateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure customerContactSessionProcedure;

  @JsonProperty("ProductorService")
  private UpdateProductorServiceRequestProductorService productorService;

  public RetrieveProductorServiceResponse customerContactSessionProcedure(UpdateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure customerContactSessionProcedure) {
    this.customerContactSessionProcedure = customerContactSessionProcedure;
    return this;
  }

  /**
   * Get customerContactSessionProcedure
   * @return customerContactSessionProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure getCustomerContactSessionProcedure() {
    return customerContactSessionProcedure;
  }

  public void setCustomerContactSessionProcedure(UpdateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure customerContactSessionProcedure) {
    this.customerContactSessionProcedure = customerContactSessionProcedure;
  }

  public RetrieveProductorServiceResponse productorService(UpdateProductorServiceRequestProductorService productorService) {
    this.productorService = productorService;
    return this;
  }

  /**
   * Get productorService
   * @return productorService
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateProductorServiceRequestProductorService getProductorService() {
    return productorService;
  }

  public void setProductorService(UpdateProductorServiceRequestProductorService productorService) {
    this.productorService = productorService;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveProductorServiceResponse retrieveProductorServiceResponse = (RetrieveProductorServiceResponse) o;
    return Objects.equals(this.customerContactSessionProcedure, retrieveProductorServiceResponse.customerContactSessionProcedure) &&
        Objects.equals(this.productorService, retrieveProductorServiceResponse.productorService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactSessionProcedure, productorService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveProductorServiceResponse {\n");
    
    sb.append("    customerContactSessionProcedure: ").append(toIndentedString(customerContactSessionProcedure)).append("\n");
    sb.append("    productorService: ").append(toIndentedString(productorService)).append("\n");
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

