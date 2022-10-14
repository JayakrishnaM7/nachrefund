package com.ibm.org.model.currentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.currentaccount.UpdateAccountLienRequestAccountLien;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateAccountLienRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class UpdateAccountLienRequest   {
  @JsonProperty("AccountLien")
  private UpdateAccountLienRequestAccountLien accountLien;

  public UpdateAccountLienRequest accountLien(UpdateAccountLienRequestAccountLien accountLien) {
    this.accountLien = accountLien;
    return this;
  }

  /**
   * Get accountLien
   * @return accountLien
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateAccountLienRequestAccountLien getAccountLien() {
    return accountLien;
  }

  public void setAccountLien(UpdateAccountLienRequestAccountLien accountLien) {
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
    UpdateAccountLienRequest updateAccountLienRequest = (UpdateAccountLienRequest) o;
    return Objects.equals(this.accountLien, updateAccountLienRequest.accountLien);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountLien);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAccountLienRequest {\n");
    
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

