package com.ibm.org.model.corporatecurrentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.corporatecurrentaccount.InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCorporateCurrentAccountFacilityResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class InitiateCorporateCurrentAccountFacilityResponse   {
  @JsonProperty("CorporateCurrentAccountFacility")
  private InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility;

  public InitiateCorporateCurrentAccountFacilityResponse corporateCurrentAccountFacility(InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
    return this;
  }

  /**
   * Get corporateCurrentAccountFacility
   * @return corporateCurrentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility getCorporateCurrentAccountFacility() {
    return corporateCurrentAccountFacility;
  }

  public void setCorporateCurrentAccountFacility(InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCorporateCurrentAccountFacilityResponse initiateCorporateCurrentAccountFacilityResponse = (InitiateCorporateCurrentAccountFacilityResponse) o;
    return Objects.equals(this.corporateCurrentAccountFacility, initiateCorporateCurrentAccountFacilityResponse.corporateCurrentAccountFacility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateCurrentAccountFacility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCorporateCurrentAccountFacilityResponse {\n");
    
    sb.append("    corporateCurrentAccountFacility: ").append(toIndentedString(corporateCurrentAccountFacility)).append("\n");
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

