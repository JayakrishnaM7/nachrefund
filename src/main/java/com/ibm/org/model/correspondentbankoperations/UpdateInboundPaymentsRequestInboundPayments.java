package com.ibm.org.model.correspondentbankoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateInboundPaymentsRequestInboundPayments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:01.907Z[GMT]")

public class UpdateInboundPaymentsRequestInboundPayments   {
  @JsonProperty("CorrespondentTransactionRecord")
  private String correspondentTransactionRecord;

  @JsonProperty("SWIFTTransactionReference")
  private Object swIFTTransactionReference;

  @JsonProperty("PayerBankReference")
  private Object payerBankReference;

  @JsonProperty("PayerReference")
  private Object payerReference;

  @JsonProperty("CorrespondedBankReference")
  private Object correspondedBankReference;

  @JsonProperty("PayerProductInstanceReference")
  private Object payerProductInstanceReference;

  @JsonProperty("PayeeReference")
  private Object payeeReference;

  @JsonProperty("PayeeProductInstanceReference")
  private Object payeeProductInstanceReference;

  @JsonProperty("PayeeBankReference")
  private Object payeeBankReference;

  @JsonProperty("SpecialInstructions")
  private String specialInstructions;

  @JsonProperty("Amount")
  private String amount;

  @JsonProperty("Currency")
  private String currency;

  @JsonProperty("DateType")
  private String dateType;

  public UpdateInboundPaymentsRequestInboundPayments correspondentTransactionRecord(String correspondentTransactionRecord) {
    this.correspondentTransactionRecord = correspondentTransactionRecord;
    return this;
  }

  /**
   * Get correspondentTransactionRecord
   * @return correspondentTransactionRecord
  */
  @ApiModelProperty(value = "")


  public String getCorrespondentTransactionRecord() {
    return correspondentTransactionRecord;
  }

  public void setCorrespondentTransactionRecord(String correspondentTransactionRecord) {
    this.correspondentTransactionRecord = correspondentTransactionRecord;
  }

  public UpdateInboundPaymentsRequestInboundPayments swIFTTransactionReference(Object swIFTTransactionReference) {
    this.swIFTTransactionReference = swIFTTransactionReference;
    return this;
  }

  /**
   * Get swIFTTransactionReference
   * @return swIFTTransactionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSwIFTTransactionReference() {
    return swIFTTransactionReference;
  }

  public void setSwIFTTransactionReference(Object swIFTTransactionReference) {
    this.swIFTTransactionReference = swIFTTransactionReference;
  }

  public UpdateInboundPaymentsRequestInboundPayments payerBankReference(Object payerBankReference) {
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

  public UpdateInboundPaymentsRequestInboundPayments payerReference(Object payerReference) {
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

  public UpdateInboundPaymentsRequestInboundPayments correspondedBankReference(Object correspondedBankReference) {
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

  public UpdateInboundPaymentsRequestInboundPayments payerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
    return this;
  }

  /**
   * Get payerProductInstanceReference
   * @return payerProductInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerProductInstanceReference() {
    return payerProductInstanceReference;
  }

  public void setPayerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
  }

  public UpdateInboundPaymentsRequestInboundPayments payeeReference(Object payeeReference) {
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

  public UpdateInboundPaymentsRequestInboundPayments payeeProductInstanceReference(Object payeeProductInstanceReference) {
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

  public UpdateInboundPaymentsRequestInboundPayments payeeBankReference(Object payeeBankReference) {
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

  public UpdateInboundPaymentsRequestInboundPayments specialInstructions(String specialInstructions) {
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

  public UpdateInboundPaymentsRequestInboundPayments amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public UpdateInboundPaymentsRequestInboundPayments currency(String currency) {
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

  public UpdateInboundPaymentsRequestInboundPayments dateType(String dateType) {
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
    UpdateInboundPaymentsRequestInboundPayments updateInboundPaymentsRequestInboundPayments = (UpdateInboundPaymentsRequestInboundPayments) o;
    return Objects.equals(this.correspondentTransactionRecord, updateInboundPaymentsRequestInboundPayments.correspondentTransactionRecord) &&
        Objects.equals(this.swIFTTransactionReference, updateInboundPaymentsRequestInboundPayments.swIFTTransactionReference) &&
        Objects.equals(this.payerBankReference, updateInboundPaymentsRequestInboundPayments.payerBankReference) &&
        Objects.equals(this.payerReference, updateInboundPaymentsRequestInboundPayments.payerReference) &&
        Objects.equals(this.correspondedBankReference, updateInboundPaymentsRequestInboundPayments.correspondedBankReference) &&
        Objects.equals(this.payerProductInstanceReference, updateInboundPaymentsRequestInboundPayments.payerProductInstanceReference) &&
        Objects.equals(this.payeeReference, updateInboundPaymentsRequestInboundPayments.payeeReference) &&
        Objects.equals(this.payeeProductInstanceReference, updateInboundPaymentsRequestInboundPayments.payeeProductInstanceReference) &&
        Objects.equals(this.payeeBankReference, updateInboundPaymentsRequestInboundPayments.payeeBankReference) &&
        Objects.equals(this.specialInstructions, updateInboundPaymentsRequestInboundPayments.specialInstructions) &&
        Objects.equals(this.amount, updateInboundPaymentsRequestInboundPayments.amount) &&
        Objects.equals(this.currency, updateInboundPaymentsRequestInboundPayments.currency) &&
        Objects.equals(this.dateType, updateInboundPaymentsRequestInboundPayments.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondentTransactionRecord, swIFTTransactionReference, payerBankReference, payerReference, correspondedBankReference, payerProductInstanceReference, payeeReference, payeeProductInstanceReference, payeeBankReference, specialInstructions, amount, currency, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInboundPaymentsRequestInboundPayments {\n");
    
    sb.append("    correspondentTransactionRecord: ").append(toIndentedString(correspondentTransactionRecord)).append("\n");
    sb.append("    swIFTTransactionReference: ").append(toIndentedString(swIFTTransactionReference)).append("\n");
    sb.append("    payerBankReference: ").append(toIndentedString(payerBankReference)).append("\n");
    sb.append("    payerReference: ").append(toIndentedString(payerReference)).append("\n");
    sb.append("    correspondedBankReference: ").append(toIndentedString(correspondedBankReference)).append("\n");
    sb.append("    payerProductInstanceReference: ").append(toIndentedString(payerProductInstanceReference)).append("\n");
    sb.append("    payeeReference: ").append(toIndentedString(payeeReference)).append("\n");
    sb.append("    payeeProductInstanceReference: ").append(toIndentedString(payeeProductInstanceReference)).append("\n");
    sb.append("    payeeBankReference: ").append(toIndentedString(payeeBankReference)).append("\n");
    sb.append("    specialInstructions: ").append(toIndentedString(specialInstructions)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

