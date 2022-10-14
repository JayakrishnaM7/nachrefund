package com.ibm.org.model.corporatecurrentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.corporatecurrentaccount.InitiatePaymentsResponseCorporateCurrentAccountFacility;
import com.ibm.org.model.corporatecurrentaccount.InitiatePaymentsResponsePayments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePaymentsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class InitiatePaymentsResponse   {
  @JsonProperty("CorporateCurrentAccountFacility")
  private InitiatePaymentsResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility;

  @JsonProperty("Payments")
  private InitiatePaymentsResponsePayments payments;

  public InitiatePaymentsResponse corporateCurrentAccountFacility(InitiatePaymentsResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
    return this;
  }

  /**
   * Get corporateCurrentAccountFacility
   * @return corporateCurrentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePaymentsResponseCorporateCurrentAccountFacility getCorporateCurrentAccountFacility() {
    return corporateCurrentAccountFacility;
  }

  public void setCorporateCurrentAccountFacility(InitiatePaymentsResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
  }

  public InitiatePaymentsResponse payments(InitiatePaymentsResponsePayments payments) {
    this.payments = payments;
    return this;
  }

  /**
   * Get payments
   * @return payments
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePaymentsResponsePayments getPayments() {
    return payments;
  }

  public void setPayments(InitiatePaymentsResponsePayments payments) {
    this.payments = payments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentsResponse initiatePaymentsResponse = (InitiatePaymentsResponse) o;
    return Objects.equals(this.corporateCurrentAccountFacility, initiatePaymentsResponse.corporateCurrentAccountFacility) &&
        Objects.equals(this.payments, initiatePaymentsResponse.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateCurrentAccountFacility, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentsResponse {\n");
    
    sb.append("    corporateCurrentAccountFacility: ").append(toIndentedString(corporateCurrentAccountFacility)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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

