package com.ibm.org.model.correspondentbankoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OutboundPayments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:01.907Z[GMT]")

public class OutboundPayments   {
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

  @JsonProperty("Date")
  private String date;

  public OutboundPayments correspondentTransactionRecord(String correspondentTransactionRecord) {
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

  public OutboundPayments swIFTTransactionReference(Object swIFTTransactionReference) {
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

  public OutboundPayments payerBankReference(Object payerBankReference) {
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

  public OutboundPayments payerReference(Object payerReference) {
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

  public OutboundPayments correspondedBankReference(Object correspondedBankReference) {
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

  public OutboundPayments payerProductInstanceReference(Object payerProductInstanceReference) {
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

  public OutboundPayments payeeReference(Object payeeReference) {
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

  public OutboundPayments payeeProductInstanceReference(Object payeeProductInstanceReference) {
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

  public OutboundPayments payeeBankReference(Object payeeBankReference) {
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

  public OutboundPayments specialInstructions(String specialInstructions) {
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

  public OutboundPayments amount(String amount) {
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

  public OutboundPayments currency(String currency) {
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

  public OutboundPayments dateType(String dateType) {
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

  public OutboundPayments date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundPayments outboundPayments = (OutboundPayments) o;
    return Objects.equals(this.correspondentTransactionRecord, outboundPayments.correspondentTransactionRecord) &&
        Objects.equals(this.swIFTTransactionReference, outboundPayments.swIFTTransactionReference) &&
        Objects.equals(this.payerBankReference, outboundPayments.payerBankReference) &&
        Objects.equals(this.payerReference, outboundPayments.payerReference) &&
        Objects.equals(this.correspondedBankReference, outboundPayments.correspondedBankReference) &&
        Objects.equals(this.payerProductInstanceReference, outboundPayments.payerProductInstanceReference) &&
        Objects.equals(this.payeeReference, outboundPayments.payeeReference) &&
        Objects.equals(this.payeeProductInstanceReference, outboundPayments.payeeProductInstanceReference) &&
        Objects.equals(this.payeeBankReference, outboundPayments.payeeBankReference) &&
        Objects.equals(this.specialInstructions, outboundPayments.specialInstructions) &&
        Objects.equals(this.amount, outboundPayments.amount) &&
        Objects.equals(this.currency, outboundPayments.currency) &&
        Objects.equals(this.dateType, outboundPayments.dateType) &&
        Objects.equals(this.date, outboundPayments.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondentTransactionRecord, swIFTTransactionReference, payerBankReference, payerReference, correspondedBankReference, payerProductInstanceReference, payeeReference, payeeProductInstanceReference, payeeBankReference, specialInstructions, amount, currency, dateType, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundPayments {\n");
    
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
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

