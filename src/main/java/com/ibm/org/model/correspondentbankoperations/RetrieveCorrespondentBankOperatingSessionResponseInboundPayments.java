package com.ibm.org.model.correspondentbankoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveCorrespondentBankOperatingSessionResponseInboundPayments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:01.907Z[GMT]")

public class RetrieveCorrespondentBankOperatingSessionResponseInboundPayments   {
  @JsonProperty("PayerBankReference")
  private Object payerBankReference;

  @JsonProperty("PayerReference")
  private Object payerReference;

  @JsonProperty("CorrespondedBankReference")
  private Object correspondedBankReference;

  @JsonProperty("PayeeReference")
  private Object payeeReference;

  @JsonProperty("PayeeProductInstanceReference")
  private Object payeeProductInstanceReference;

  @JsonProperty("PayeeBankReference")
  private Object payeeBankReference;

  @JsonProperty("SpecialInstructions")
  private String specialInstructions;

  @JsonProperty("Currency")
  private String currency;

  @JsonProperty("DateType")
  private String dateType;

  public RetrieveCorrespondentBankOperatingSessionResponseInboundPayments payerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
    return this;
  }

  /**
   * Get payerBankReference
   * @return payerBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
  }

  public RetrieveCorrespondentBankOperatingSessionResponseInboundPayments payerReference(Object payerReference) {
    this.payerReference = payerReference;
    return this;
  }

  /**
   * Get payerReference
   * @return payerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerReference() {
    return payerReference;
  }

  public void setPayerReference(Object payerReference) {
    this.payerReference = payerReference;
  }

  public RetrieveCorrespondentBankOperatingSessionResponseInboundPayments correspondedBankReference(Object correspondedBankReference) {
    this.correspondedBankReference = correspondedBankReference;
    return this;
  }

  /**
   * Get correspondedBankReference
   * @return correspondedBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCorrespondedBankReference() {
    return correspondedBankReference;
  }

  public void setCorrespondedBankReference(Object correspondedBankReference) {
    this.correspondedBankReference = correspondedBankReference;
  }

  public RetrieveCorrespondentBankOperatingSessionResponseInboundPayments payeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
    return this;
  }

  /**
   * Get payeeReference
   * @return payeeReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
  }

  public RetrieveCorrespondentBankOperatingSessionResponseInboundPayments payeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
    return this;
  }

  /**
   * Get payeeProductInstanceReference
   * @return payeeProductInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }

  public RetrieveCorrespondentBankOperatingSessionResponseInboundPayments payeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
    return this;
  }

  /**
   * Get payeeBankReference
   * @return payeeBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }

  public RetrieveCorrespondentBankOperatingSessionResponseInboundPayments specialInstructions(String specialInstructions) {
    this.specialInstructions = specialInstructions;
    return this;
  }

  /**
   * Get specialInstructions
   * @return specialInstructions
  */
  @ApiModelProperty(value = "")


  public String getSpecialInstructions() {
    return specialInstructions;
  }

  public void setSpecialInstructions(String specialInstructions) {
    this.specialInstructions = specialInstructions;
  }

  public RetrieveCorrespondentBankOperatingSessionResponseInboundPayments currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public RetrieveCorrespondentBankOperatingSessionResponseInboundPayments dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")


  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveCorrespondentBankOperatingSessionResponseInboundPayments retrieveCorrespondentBankOperatingSessionResponseInboundPayments = (RetrieveCorrespondentBankOperatingSessionResponseInboundPayments) o;
    return Objects.equals(this.payerBankReference, retrieveCorrespondentBankOperatingSessionResponseInboundPayments.payerBankReference) &&
        Objects.equals(this.payerReference, retrieveCorrespondentBankOperatingSessionResponseInboundPayments.payerReference) &&
        Objects.equals(this.correspondedBankReference, retrieveCorrespondentBankOperatingSessionResponseInboundPayments.correspondedBankReference) &&
        Objects.equals(this.payeeReference, retrieveCorrespondentBankOperatingSessionResponseInboundPayments.payeeReference) &&
        Objects.equals(this.payeeProductInstanceReference, retrieveCorrespondentBankOperatingSessionResponseInboundPayments.payeeProductInstanceReference) &&
        Objects.equals(this.payeeBankReference, retrieveCorrespondentBankOperatingSessionResponseInboundPayments.payeeBankReference) &&
        Objects.equals(this.specialInstructions, retrieveCorrespondentBankOperatingSessionResponseInboundPayments.specialInstructions) &&
        Objects.equals(this.currency, retrieveCorrespondentBankOperatingSessionResponseInboundPayments.currency) &&
        Objects.equals(this.dateType, retrieveCorrespondentBankOperatingSessionResponseInboundPayments.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payerBankReference, payerReference, correspondedBankReference, payeeReference, payeeProductInstanceReference, payeeBankReference, specialInstructions, currency, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveCorrespondentBankOperatingSessionResponseInboundPayments {\n");
    
    sb.append("    payerBankReference: ").append(toIndentedString(payerBankReference)).append("\n");
    sb.append("    payerReference: ").append(toIndentedString(payerReference)).append("\n");
    sb.append("    correspondedBankReference: ").append(toIndentedString(correspondedBankReference)).append("\n");
    sb.append("    payeeReference: ").append(toIndentedString(payeeReference)).append("\n");
    sb.append("    payeeProductInstanceReference: ").append(toIndentedString(payeeProductInstanceReference)).append("\n");
    sb.append("    payeeBankReference: ").append(toIndentedString(payeeBankReference)).append("\n");
    sb.append("    specialInstructions: ").append(toIndentedString(specialInstructions)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
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

