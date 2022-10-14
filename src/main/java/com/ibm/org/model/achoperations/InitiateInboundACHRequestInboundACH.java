package com.ibm.org.model.achoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateInboundACHRequestInboundACH
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:17.996Z[GMT]")

public class InitiateInboundACHRequestInboundACH   {
  @JsonProperty("ACHPaymentTransactionReference")
  private Object acHPaymentTransactionReference;

  @JsonProperty("ACHPaymentTransactionRecord")
  private String acHPaymentTransactionRecord;

  @JsonProperty("PaymentTransactionInitiatorReference")
  private Object paymentTransactionInitiatorReference;

  @JsonProperty("PayerReference")
  private Object payerReference;

  @JsonProperty("PayerBankReference")
  private Object payerBankReference;

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

  public InitiateInboundACHRequestInboundACH acHPaymentTransactionReference(Object acHPaymentTransactionReference) {
    this.acHPaymentTransactionReference = acHPaymentTransactionReference;
    return this;
  }

  /**
   * Get acHPaymentTransactionReference
   * @return acHPaymentTransactionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getAcHPaymentTransactionReference() {
    return acHPaymentTransactionReference;
  }

  public void setAcHPaymentTransactionReference(Object acHPaymentTransactionReference) {
    this.acHPaymentTransactionReference = acHPaymentTransactionReference;
  }

  public InitiateInboundACHRequestInboundACH acHPaymentTransactionRecord(String acHPaymentTransactionRecord) {
    this.acHPaymentTransactionRecord = acHPaymentTransactionRecord;
    return this;
  }

  /**
   * Get acHPaymentTransactionRecord
   * @return acHPaymentTransactionRecord
  */
  @ApiModelProperty(value = "")


  public String getAcHPaymentTransactionRecord() {
    return acHPaymentTransactionRecord;
  }

  public void setAcHPaymentTransactionRecord(String acHPaymentTransactionRecord) {
    this.acHPaymentTransactionRecord = acHPaymentTransactionRecord;
  }

  public InitiateInboundACHRequestInboundACH paymentTransactionInitiatorReference(Object paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
    return this;
  }

  /**
   * Get paymentTransactionInitiatorReference
   * @return paymentTransactionInitiatorReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentTransactionInitiatorReference() {
    return paymentTransactionInitiatorReference;
  }

  public void setPaymentTransactionInitiatorReference(Object paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
  }

  public InitiateInboundACHRequestInboundACH payerReference(Object payerReference) {
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

  public InitiateInboundACHRequestInboundACH payerBankReference(Object payerBankReference) {
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

  public InitiateInboundACHRequestInboundACH payerProductInstanceReference(Object payerProductInstanceReference) {
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

  public InitiateInboundACHRequestInboundACH payeeReference(Object payeeReference) {
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

  public InitiateInboundACHRequestInboundACH payeeProductInstanceReference(Object payeeProductInstanceReference) {
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

  public InitiateInboundACHRequestInboundACH payeeBankReference(Object payeeBankReference) {
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

  public InitiateInboundACHRequestInboundACH specialInstructions(String specialInstructions) {
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

  public InitiateInboundACHRequestInboundACH amount(String amount) {
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

  public InitiateInboundACHRequestInboundACH currency(String currency) {
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

  public InitiateInboundACHRequestInboundACH dateType(String dateType) {
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
    InitiateInboundACHRequestInboundACH initiateInboundACHRequestInboundACH = (InitiateInboundACHRequestInboundACH) o;
    return Objects.equals(this.acHPaymentTransactionReference, initiateInboundACHRequestInboundACH.acHPaymentTransactionReference) &&
        Objects.equals(this.acHPaymentTransactionRecord, initiateInboundACHRequestInboundACH.acHPaymentTransactionRecord) &&
        Objects.equals(this.paymentTransactionInitiatorReference, initiateInboundACHRequestInboundACH.paymentTransactionInitiatorReference) &&
        Objects.equals(this.payerReference, initiateInboundACHRequestInboundACH.payerReference) &&
        Objects.equals(this.payerBankReference, initiateInboundACHRequestInboundACH.payerBankReference) &&
        Objects.equals(this.payerProductInstanceReference, initiateInboundACHRequestInboundACH.payerProductInstanceReference) &&
        Objects.equals(this.payeeReference, initiateInboundACHRequestInboundACH.payeeReference) &&
        Objects.equals(this.payeeProductInstanceReference, initiateInboundACHRequestInboundACH.payeeProductInstanceReference) &&
        Objects.equals(this.payeeBankReference, initiateInboundACHRequestInboundACH.payeeBankReference) &&
        Objects.equals(this.specialInstructions, initiateInboundACHRequestInboundACH.specialInstructions) &&
        Objects.equals(this.amount, initiateInboundACHRequestInboundACH.amount) &&
        Objects.equals(this.currency, initiateInboundACHRequestInboundACH.currency) &&
        Objects.equals(this.dateType, initiateInboundACHRequestInboundACH.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acHPaymentTransactionReference, acHPaymentTransactionRecord, paymentTransactionInitiatorReference, payerReference, payerBankReference, payerProductInstanceReference, payeeReference, payeeProductInstanceReference, payeeBankReference, specialInstructions, amount, currency, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateInboundACHRequestInboundACH {\n");
    
    sb.append("    acHPaymentTransactionReference: ").append(toIndentedString(acHPaymentTransactionReference)).append("\n");
    sb.append("    acHPaymentTransactionRecord: ").append(toIndentedString(acHPaymentTransactionRecord)).append("\n");
    sb.append("    paymentTransactionInitiatorReference: ").append(toIndentedString(paymentTransactionInitiatorReference)).append("\n");
    sb.append("    payerReference: ").append(toIndentedString(payerReference)).append("\n");
    sb.append("    payerBankReference: ").append(toIndentedString(payerBankReference)).append("\n");
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

