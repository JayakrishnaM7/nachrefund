package com.ibm.org.model.corporatecurrentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.corporatecurrentaccount.InitiateAccountLienRequestAccountLien;
import com.ibm.org.model.corporatecurrentaccount.InitiateAccountLienRequestCorporateCurrentAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAccountLienRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class InitiateAccountLienRequest   {
  @JsonProperty("CorporateCurrentAccountFacility")
  private InitiateAccountLienRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility;

  @JsonProperty("AccountLien")
  private InitiateAccountLienRequestAccountLien accountLien;

  public InitiateAccountLienRequest corporateCurrentAccountFacility(InitiateAccountLienRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
    return this;
  }

  /**
   * Get corporateCurrentAccountFacility
   * @return corporateCurrentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAccountLienRequestCorporateCurrentAccountFacility getCorporateCurrentAccountFacility() {
    return corporateCurrentAccountFacility;
  }

  public void setCorporateCurrentAccountFacility(InitiateAccountLienRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
  }

  public InitiateAccountLienRequest accountLien(InitiateAccountLienRequestAccountLien accountLien) {
    this.accountLien = accountLien;
    return this;
  }

  /**
   * Get accountLien
   * @return accountLien
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAccountLienRequestAccountLien getAccountLien() {
    return accountLien;
  }

  public void setAccountLien(InitiateAccountLienRequestAccountLien accountLien) {
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
    InitiateAccountLienRequest initiateAccountLienRequest = (InitiateAccountLienRequest) o;
    return Objects.equals(this.corporateCurrentAccountFacility, initiateAccountLienRequest.corporateCurrentAccountFacility) &&
        Objects.equals(this.accountLien, initiateAccountLienRequest.accountLien);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateCurrentAccountFacility, accountLien);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAccountLienRequest {\n");
    
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

