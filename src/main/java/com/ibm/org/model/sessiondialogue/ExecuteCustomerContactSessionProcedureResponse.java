package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.sessiondialogue.ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteCustomerContactSessionProcedureResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class ExecuteCustomerContactSessionProcedureResponse   {
  @JsonProperty("CustomerContactSessionProcedure")
  private ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure customerContactSessionProcedure;

  public ExecuteCustomerContactSessionProcedureResponse customerContactSessionProcedure(ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure customerContactSessionProcedure) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteCustomerContactSessionProcedureResponse executeCustomerContactSessionProcedureResponse = (ExecuteCustomerContactSessionProcedureResponse) o;
    return Objects.equals(this.customerContactSessionProcedure, executeCustomerContactSessionProcedureResponse.customerContactSessionProcedure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactSessionProcedure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteCustomerContactSessionProcedureResponse {\n");
    
    sb.append("    customerContactSessionProcedure: ").append(toIndentedString(customerContactSessionProcedure)).append("\n");
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

