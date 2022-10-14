package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.sessiondialogue.ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure;
import com.ibm.org.model.sessiondialogue.InitiateSalesResponseSales;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateSalesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class InitiateSalesResponse   {
  @JsonProperty("CustomerContactSessionProcedure")
  private ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure customerContactSessionProcedure;

  @JsonProperty("Sales")
  private InitiateSalesResponseSales sales;

  public InitiateSalesResponse customerContactSessionProcedure(ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure customerContactSessionProcedure) {
    this.customerContactSessionProcedure = customerContactSessionProcedure;
    return this;
  }

  /**
   * Get customerContactSessionProcedure
   * @return customerContactSessionProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure getCustomerContactSessionProcedure() {
    return customerContactSessionProcedure;
  }

  public void setCustomerContactSessionProcedure(ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure customerContactSessionProcedure) {
    this.customerContactSessionProcedure = customerContactSessionProcedure;
  }

  public InitiateSalesResponse sales(InitiateSalesResponseSales sales) {
    this.sales = sales;
    return this;
  }

  /**
   * Get sales
   * @return sales
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateSalesResponseSales getSales() {
    return sales;
  }

  public void setSales(InitiateSalesResponseSales sales) {
    this.sales = sales;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateSalesResponse initiateSalesResponse = (InitiateSalesResponse) o;
    return Objects.equals(this.customerContactSessionProcedure, initiateSalesResponse.customerContactSessionProcedure) &&
        Objects.equals(this.sales, initiateSalesResponse.sales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactSessionProcedure, sales);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateSalesResponse {\n");
    
    sb.append("    customerContactSessionProcedure: ").append(toIndentedString(customerContactSessionProcedure)).append("\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
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

