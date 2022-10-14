package com.ibm.org.model.corporatecurrentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.corporatecurrentaccount.InitiateServiceFeesResponseCorporateCurrentAccountFacility;
import com.ibm.org.model.corporatecurrentaccount.InitiateServiceFeesResponseServiceFees;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateServiceFeesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class InitiateServiceFeesResponse   {
  @JsonProperty("CorporateCurrentAccountFacility")
  private InitiateServiceFeesResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility;

  @JsonProperty("ServiceFees")
  private InitiateServiceFeesResponseServiceFees serviceFees;

  public InitiateServiceFeesResponse corporateCurrentAccountFacility(InitiateServiceFeesResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
    return this;
  }

  /**
   * Get corporateCurrentAccountFacility
   * @return corporateCurrentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateServiceFeesResponseCorporateCurrentAccountFacility getCorporateCurrentAccountFacility() {
    return corporateCurrentAccountFacility;
  }

  public void setCorporateCurrentAccountFacility(InitiateServiceFeesResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
  }

  public InitiateServiceFeesResponse serviceFees(InitiateServiceFeesResponseServiceFees serviceFees) {
    this.serviceFees = serviceFees;
    return this;
  }

  /**
   * Get serviceFees
   * @return serviceFees
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateServiceFeesResponseServiceFees getServiceFees() {
    return serviceFees;
  }

  public void setServiceFees(InitiateServiceFeesResponseServiceFees serviceFees) {
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
    InitiateServiceFeesResponse initiateServiceFeesResponse = (InitiateServiceFeesResponse) o;
    return Objects.equals(this.corporateCurrentAccountFacility, initiateServiceFeesResponse.corporateCurrentAccountFacility) &&
        Objects.equals(this.serviceFees, initiateServiceFeesResponse.serviceFees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateCurrentAccountFacility, serviceFees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateServiceFeesResponse {\n");
    
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

