package com.ibm.org.model.currentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.currentaccount.InitiateDepositsandWithdrawalsRequestCorporateCurrentAccountFacility;
import com.ibm.org.model.currentaccount.InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateDepositsandWithdrawalsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class InitiateDepositsandWithdrawalsRequest   {
  @JsonProperty("CorporateCurrentAccountFacility")
  private InitiateDepositsandWithdrawalsRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility;

  @JsonProperty("DepositsandWithdrawals")
  private InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals;

  public InitiateDepositsandWithdrawalsRequest corporateCurrentAccountFacility(InitiateDepositsandWithdrawalsRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
    return this;
  }

  /**
   * Get corporateCurrentAccountFacility
   * @return corporateCurrentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateDepositsandWithdrawalsRequestCorporateCurrentAccountFacility getCorporateCurrentAccountFacility() {
    return corporateCurrentAccountFacility;
  }

  public void setCorporateCurrentAccountFacility(InitiateDepositsandWithdrawalsRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
  }

  public InitiateDepositsandWithdrawalsRequest depositsandWithdrawals(InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals) {
    this.depositsandWithdrawals = depositsandWithdrawals;
    return this;
  }

  /**
   * Get depositsandWithdrawals
   * @return depositsandWithdrawals
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals getDepositsandWithdrawals() {
    return depositsandWithdrawals;
  }

  public void setDepositsandWithdrawals(InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals) {
    this.depositsandWithdrawals = depositsandWithdrawals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateDepositsandWithdrawalsRequest initiateDepositsandWithdrawalsRequest = (InitiateDepositsandWithdrawalsRequest) o;
    return Objects.equals(this.corporateCurrentAccountFacility, initiateDepositsandWithdrawalsRequest.corporateCurrentAccountFacility) &&
        Objects.equals(this.depositsandWithdrawals, initiateDepositsandWithdrawalsRequest.depositsandWithdrawals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateCurrentAccountFacility, depositsandWithdrawals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateDepositsandWithdrawalsRequest {\n");
    
    sb.append("    corporateCurrentAccountFacility: ").append(toIndentedString(corporateCurrentAccountFacility)).append("\n");
    sb.append("    depositsandWithdrawals: ").append(toIndentedString(depositsandWithdrawals)).append("\n");
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

