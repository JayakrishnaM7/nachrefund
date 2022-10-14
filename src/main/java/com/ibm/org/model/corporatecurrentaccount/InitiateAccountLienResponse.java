package com.ibm.org.model.corporatecurrentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.corporatecurrentaccount.InitiateAccountLienResponseAccountLien;
import com.ibm.org.model.corporatecurrentaccount.InitiateAccountLienResponseCorporateCurrentAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAccountLienResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class InitiateAccountLienResponse   {
  @JsonProperty("CorporateCurrentAccountFacility")
  private InitiateAccountLienResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility;

  @JsonProperty("AccountLien")
  private InitiateAccountLienResponseAccountLien accountLien;

  public InitiateAccountLienResponse corporateCurrentAccountFacility(InitiateAccountLienResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
    return this;
  }

  /**
   * Get corporateCurrentAccountFacility
   * @return corporateCurrentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAccountLienResponseCorporateCurrentAccountFacility getCorporateCurrentAccountFacility() {
    return corporateCurrentAccountFacility;
  }

  public void setCorporateCurrentAccountFacility(InitiateAccountLienResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
  }

  public InitiateAccountLienResponse accountLien(InitiateAccountLienResponseAccountLien accountLien) {
    this.accountLien = accountLien;
    return this;
  }

  /**
   * Get accountLien
   * @return accountLien
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAccountLienResponseAccountLien getAccountLien() {
    return accountLien;
  }

  public void setAccountLien(InitiateAccountLienResponseAccountLien accountLien) {
    this.accountLien = accountLien;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateAccountLienResponse initiateAccountLienResponse = (InitiateAccountLienResponse) o;
    return Objects.equals(this.corporateCurrentAccountFacility, initiateAccountLienResponse.corporateCurrentAccountFacility) &&
        Objects.equals(this.accountLien, initiateAccountLienResponse.accountLien);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateCurrentAccountFacility, accountLien);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAccountLienResponse {\n");
    
    sb.append("    corporateCurrentAccountFacility: ").append(toIndentedString(corporateCurrentAccountFacility)).append("\n");
    sb.append("    accountLien: ").append(toIndentedString(accountLien)).append("\n");
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

