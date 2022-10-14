package com.ibm.org.model.currentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.currentaccount.InitiatePaymentsRequestCorporateCurrentAccountFacility;
import com.ibm.org.model.currentaccount.InitiatePaymentsRequestPayments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePaymentsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class InitiatePaymentsRequest   {
  @JsonProperty("CorporateCurrentAccountFacility")
  private InitiatePaymentsRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility;

  @JsonProperty("Payments")
  private InitiatePaymentsRequestPayments payments;

  public InitiatePaymentsRequest corporateCurrentAccountFacility(InitiatePaymentsRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
    return this;
  }

  /**
   * Get corporateCurrentAccountFacility
   * @return corporateCurrentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePaymentsRequestCorporateCurrentAccountFacility getCorporateCurrentAccountFacility() {
    return corporateCurrentAccountFacility;
  }

  public void setCorporateCurrentAccountFacility(InitiatePaymentsRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
  }

  public InitiatePaymentsRequest payments(InitiatePaymentsRequestPayments payments) {
    this.payments = payments;
    return this;
  }

  /**
   * Get payments
   * @return payments
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePaymentsRequestPayments getPayments() {
    return payments;
  }

  public void setPayments(InitiatePaymentsRequestPayments payments) {
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
    InitiatePaymentsRequest initiatePaymentsRequest = (InitiatePaymentsRequest) o;
    return Objects.equals(this.corporateCurrentAccountFacility, initiatePaymentsRequest.corporateCurrentAccountFacility) &&
        Objects.equals(this.payments, initiatePaymentsRequest.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateCurrentAccountFacility, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentsRequest {\n");
    
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

