package com.ibm.org.model.currentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.currentaccount.InitiateAccountSweepRequestAccountSweep;
import com.ibm.org.model.currentaccount.InitiateAccountSweepRequestCorporateCurrentAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAccountSweepRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class InitiateAccountSweepRequest   {
  @JsonProperty("CorporateCurrentAccountFacility")
  private InitiateAccountSweepRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility;

  @JsonProperty("AccountSweep")
  private InitiateAccountSweepRequestAccountSweep accountSweep;

  public InitiateAccountSweepRequest corporateCurrentAccountFacility(InitiateAccountSweepRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
    return this;
  }

  /**
   * Get corporateCurrentAccountFacility
   * @return corporateCurrentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAccountSweepRequestCorporateCurrentAccountFacility getCorporateCurrentAccountFacility() {
    return corporateCurrentAccountFacility;
  }

  public void setCorporateCurrentAccountFacility(InitiateAccountSweepRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
  }

  public InitiateAccountSweepRequest accountSweep(InitiateAccountSweepRequestAccountSweep accountSweep) {
    this.accountSweep = accountSweep;
    return this;
  }

  /**
   * Get accountSweep
   * @return accountSweep
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAccountSweepRequestAccountSweep getAccountSweep() {
    return accountSweep;
  }

  public void setAccountSweep(InitiateAccountSweepRequestAccountSweep accountSweep) {
    this.accountSweep = accountSweep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateAccountSweepRequest initiateAccountSweepRequest = (InitiateAccountSweepRequest) o;
    return Objects.equals(this.corporateCurrentAccountFacility, initiateAccountSweepRequest.corporateCurrentAccountFacility) &&
        Objects.equals(this.accountSweep, initiateAccountSweepRequest.accountSweep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateCurrentAccountFacility, accountSweep);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAccountSweepRequest {\n");
    
    sb.append("    corporateCurrentAccountFacility: ").append(toIndentedString(corporateCurrentAccountFacility)).append("\n");
    sb.append("    accountSweep: ").append(toIndentedString(accountSweep)).append("\n");
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

