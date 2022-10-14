package com.ibm.org.model.currentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.currentaccount.InitiateServiceFeesRequestCorporateCurrentAccountFacility;
import com.ibm.org.model.currentaccount.InitiateServiceFeesRequestServiceFees;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateServiceFeesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class InitiateServiceFeesRequest   {
  @JsonProperty("CorporateCurrentAccountFacility")
  private InitiateServiceFeesRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility;

  @JsonProperty("ServiceFees")
  private InitiateServiceFeesRequestServiceFees serviceFees;

  public InitiateServiceFeesRequest corporateCurrentAccountFacility(InitiateServiceFeesRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
    return this;
  }

  /**
   * Get corporateCurrentAccountFacility
   * @return corporateCurrentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateServiceFeesRequestCorporateCurrentAccountFacility getCorporateCurrentAccountFacility() {
    return corporateCurrentAccountFacility;
  }

  public void setCorporateCurrentAccountFacility(InitiateServiceFeesRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
  }

  public InitiateServiceFeesRequest serviceFees(InitiateServiceFeesRequestServiceFees serviceFees) {
    this.serviceFees = serviceFees;
    return this;
  }

  /**
   * Get serviceFees
   * @return serviceFees
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateServiceFeesRequestServiceFees getServiceFees() {
    return serviceFees;
  }

  public void setServiceFees(InitiateServiceFeesRequestServiceFees serviceFees) {
    this.serviceFees = serviceFees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateServiceFeesRequest initiateServiceFeesRequest = (InitiateServiceFeesRequest) o;
    return Objects.equals(this.corporateCurrentAccountFacility, initiateServiceFeesRequest.corporateCurrentAccountFacility) &&
        Objects.equals(this.serviceFees, initiateServiceFeesRequest.serviceFees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateCurrentAccountFacility, serviceFees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateServiceFeesRequest {\n");
    
    sb.append("    corporateCurrentAccountFacility: ").append(toIndentedString(corporateCurrentAccountFacility)).append("\n");
    sb.append("    serviceFees: ").append(toIndentedString(serviceFees)).append("\n");
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

