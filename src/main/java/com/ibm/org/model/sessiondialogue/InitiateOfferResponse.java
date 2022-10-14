package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.sessiondialogue.ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure;
import com.ibm.org.model.sessiondialogue.InitiateOfferResponseOffer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateOfferResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class InitiateOfferResponse   {
  @JsonProperty("CustomerContactSessionProcedure")
  private ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure customerContactSessionProcedure;

  @JsonProperty("Offer")
  private InitiateOfferResponseOffer offer;

  public InitiateOfferResponse customerContactSessionProcedure(ExecuteCustomerContactSessionProcedureResponseCustomerContactSessionProcedure customerContactSessionProcedure) {
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

  public InitiateOfferResponse offer(InitiateOfferResponseOffer offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOfferResponseOffer getOffer() {
    return offer;
  }

  public void setOffer(InitiateOfferResponseOffer offer) {
    this.offer = offer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateOfferResponse initiateOfferResponse = (InitiateOfferResponse) o;
    return Objects.equals(this.customerContactSessionProcedure, initiateOfferResponse.customerContactSessionProcedure) &&
        Objects.equals(this.offer, initiateOfferResponse.offer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactSessionProcedure, offer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateOfferResponse {\n");
    
    sb.append("    customerContactSessionProcedure: ").append(toIndentedString(customerContactSessionProcedure)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
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

