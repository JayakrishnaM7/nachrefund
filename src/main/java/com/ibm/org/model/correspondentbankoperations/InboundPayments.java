package com.ibm.org.model.correspondentbankoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InboundPayments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:01.907Z[GMT]")

public class InboundPayments   {
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

  public InboundPayments correspondentTransactionRecord(String correspondentTransactionRecord) {
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

  public InboundPayments swIFTTransactionReference(Object swIFTTransactionReference) {
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

  public InboundPayments payerBankReference(Object payerBankReference) {
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

  public InboundPayments payerReference(Object payerReference) {
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

  public InboundPayments correspondedBankReference(Object correspondedBankReference) {
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

  public InboundPayments payerProductInstanceReference(Object payerProductInstanceReference) {
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

  public InboundPayments payeeReference(Object payeeReference) {
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

  public InboundPayments payeeProductInstanceReference(Object payeeProductInstanceReference) {
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

  public InboundPayments payeeBankReference(Object payeeBankReference) {
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

  public InboundPayments specialInstructions(String specialInstructions) {
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

  public InboundPayments amount(String amount) {
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

  public InboundPayments currency(String currency) {
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

  public InboundPayments dateType(String dateType) {
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

  public InboundPayments date(String date) {
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
    InboundPayments inboundPayments = (InboundPayments) o;
    return Objects.equals(this.correspondentTransactionRecord, inboundPayments.correspondentTransactionRecord) &&
        Objects.equals(this.swIFTTransactionReference, inboundPayments.swIFTTransactionReference) &&
        Objects.equals(this.payerBankReference, inboundPayments.payerBankReference) &&
        Objects.equals(this.payerReference, inboundPayments.payerReference) &&
        Objects.equals(this.correspondedBankReference, inboundPayments.correspondedBankReference) &&
        Objects.equals(this.payerProductInstanceReference, inboundPayments.payerProductInstanceReference) &&
        Objects.equals(this.payeeReference, inboundPayments.payeeReference) &&
        Objects.equals(this.payeeProductInstanceReference, inboundPayments.payeeProductInstanceReference) &&
        Objects.equals(this.payeeBankReference, inboundPayments.payeeBankReference) &&
        Objects.equals(this.specialInstructions, inboundPayments.specialInstructions) &&
        Objects.equals(this.amount, inboundPayments.amount) &&
        Objects.equals(this.currency, inboundPayments.currency) &&
        Objects.equals(this.dateType, inboundPayments.dateType) &&
        Objects.equals(this.date, inboundPayments.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondentTransactionRecord, swIFTTransactionReference, payerBankReference, payerReference, correspondedBankReference, payerProductInstanceReference, payeeReference, payeeProductInstanceReference, payeeBankReference, specialInstructions, amount, currency, dateType, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundPayments {\n");
    
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

