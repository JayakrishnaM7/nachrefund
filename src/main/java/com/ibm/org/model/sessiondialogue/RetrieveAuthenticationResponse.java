package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.sessiondialogue.RetrieveAuthenticationResponseCustomerContactSessionProcedure;
import com.ibm.org.model.sessiondialogue.UpdateAuthenticationRequestAuthentication;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveAuthenticationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class RetrieveAuthenticationResponse   {
  @JsonProperty("CustomerContactSessionProcedure")
  private RetrieveAuthenticationResponseCustomerContactSessionProcedure customerContactSessionProcedure;

  @JsonProperty("Authentication")
  private UpdateAuthenticationRequestAuthentication authentication;

  public RetrieveAuthenticationResponse customerContactSessionProcedure(RetrieveAuthenticationResponseCustomerContactSessionProcedure customerContactSessionProcedure) {
    this.customerContactSessionProcedure = customerContactSessionProcedure;
    return this;
  }

  /**
   * Get customerContactSessionProcedure
   * @return customerContactSessionProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveAuthenticationResponseCustomerContactSessionProcedure getCustomerContactSessionProcedure() {
    return customerContactSessionProcedure;
  }

  public void setCustomerContactSessionProcedure(RetrieveAuthenticationResponseCustomerContactSessionProcedure customerContactSessionProcedure) {
    this.customerContactSessionProcedure = customerContactSessionProcedure;
  }

  public RetrieveAuthenticationResponse authentication(UpdateAuthenticationRequestAuthentication authentication) {
    this.authentication = authentication;
    return this;
  }

  /**
   * Get authentication
   * @return authentication
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateAuthenticationRequestAuthentication getAuthentication() {
    return authentication;
  }

  public void setAuthentication(UpdateAuthenticationRequestAuthentication authentication) {
    this.authentication = authentication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAuthenticationResponse retrieveAuthenticationResponse = (RetrieveAuthenticationResponse) o;
    return Objects.equals(this.customerContactSessionProcedure, retrieveAuthenticationResponse.customerContactSessionProcedure) &&
        Objects.equals(this.authentication, retrieveAuthenticationResponse.authentication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactSessionProcedure, authentication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAuthenticationResponse {\n");
    
    sb.append("    customerContactSessionProcedure: ").append(toIndentedString(customerContactSessionProcedure)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
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

