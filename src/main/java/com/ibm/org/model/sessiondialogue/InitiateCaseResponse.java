package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.sessiondialogue.ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure;
import com.ibm.org.model.sessiondialogue.InitiateCaseResponseCase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCaseResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class InitiateCaseResponse   {
  @JsonProperty("CustomerContactSessionProcedure")
  private ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure customerContactSessionProcedure;

  @JsonProperty("Case")
  private InitiateCaseResponseCase _case;

  public InitiateCaseResponse customerContactSessionProcedure(ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure customerContactSessionProcedure) {
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

  public InitiateCaseResponse _case(InitiateCaseResponseCase _case) {
    this._case = _case;
    return this;
  }

  /**
   * Get _case
   * @return _case
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCaseResponseCase getCase() {
    return _case;
  }

  public void setCase(InitiateCaseResponseCase _case) {
    this._case = _case;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCaseResponse initiateCaseResponse = (InitiateCaseResponse) o;
    return Objects.equals(this.customerContactSessionProcedure, initiateCaseResponse.customerContactSessionProcedure) &&
        Objects.equals(this._case, initiateCaseResponse._case);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactSessionProcedure, _case);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCaseResponse {\n");
    
    sb.append("    customerContactSessionProcedure: ").append(toIndentedString(customerContactSessionProcedure)).append("\n");
    sb.append("    _case: ").append(toIndentedString(_case)).append("\n");
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

