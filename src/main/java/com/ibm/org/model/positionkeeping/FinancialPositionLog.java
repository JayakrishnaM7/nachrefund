package com.ibm.org.model.positionkeeping;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FinancialPositionLog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:34.102Z[GMT]")

public class FinancialPositionLog   {
  @JsonProperty("TransactionLogType")
  private String transactionLogType;

  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("CounterpartyReference")
  private Object counterpartyReference;

  @JsonProperty("BaseCurrency")
  private String baseCurrency;

  @JsonProperty("InterestApplicationRecord")
  private String interestApplicationRecord;

  @JsonProperty("InterestTransaction")
  private String interestTransaction;

  @JsonProperty("TransactionDescription")
  private String transactionDescription;

  @JsonProperty("TransactionRateType")
  private String transactionRateType;

  @JsonProperty("TransactionInterestCharge")
  private String transactionInterestCharge;

  @JsonProperty("ManagedPositionLimits")
  private String managedPositionLimits;

  @JsonProperty("PositionLimitType")
  private String positionLimitType;

  @JsonProperty("PositionLimitSettings")
  private String positionLimitSettings;

  @JsonProperty("PositionLimitValue")
  private String positionLimitValue;

  @JsonProperty("AmountBlock")
  private String amountBlock;

  @JsonProperty("AmountBlockType")
  private String amountBlockType;

  @JsonProperty("Priority")
  private String priority;

  @JsonProperty("Amount")
  private String amount;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("Date")
  private String date;

  @JsonProperty("InitiationDate")
  private String initiationDate;

  @JsonProperty("Status")
  private String status;

  public FinancialPositionLog transactionLogType(String transactionLogType) {
    this.transactionLogType = transactionLogType;
    return this;
  }

  /**
   * Get transactionLogType
   * @return transactionLogType
  */
  @ApiModelProperty(value = "")


  public String getTransactionLogType() {
    return transactionLogType;
  }

  public void setTransactionLogType(String transactionLogType) {
    this.transactionLogType = transactionLogType;
  }

  public FinancialPositionLog productInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

  /**
   * Get productInstanceReference
   * @return productInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public FinancialPositionLog customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public FinancialPositionLog counterpartyReference(Object counterpartyReference) {
    this.counterpartyReference = counterpartyReference;
    return this;
  }

  /**
   * Get counterpartyReference
   * @return counterpartyReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCounterpartyReference() {
    return counterpartyReference;
  }

  public void setCounterpartyReference(Object counterpartyReference) {
    this.counterpartyReference = counterpartyReference;
  }

  public FinancialPositionLog baseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
    return this;
  }

  /**
   * Get baseCurrency
   * @return baseCurrency
  */
  @ApiModelProperty(value = "")


  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  public FinancialPositionLog interestApplicationRecord(String interestApplicationRecord) {
    this.interestApplicationRecord = interestApplicationRecord;
    return this;
  }

  /**
   * Get interestApplicationRecord
   * @return interestApplicationRecord
  */
  @ApiModelProperty(value = "")


  public String getInterestApplicationRecord() {
    return interestApplicationRecord;
  }

  public void setInterestApplicationRecord(String interestApplicationRecord) {
    this.interestApplicationRecord = interestApplicationRecord;
  }

  public FinancialPositionLog interestTransaction(String interestTransaction) {
    this.interestTransaction = interestTransaction;
    return this;
  }

  /**
   * Get interestTransaction
   * @return interestTransaction
  */
  @ApiModelProperty(value = "")


  public String getInterestTransaction() {
    return interestTransaction;
  }

  public void setInterestTransaction(String interestTransaction) {
    this.interestTransaction = interestTransaction;
  }

  public FinancialPositionLog transactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
    return this;
  }

  /**
   * Get transactionDescription
   * @return transactionDescription
  */
  @ApiModelProperty(value = "")


  public String getTransactionDescription() {
    return transactionDescription;
  }

  public void setTransactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
  }

  public FinancialPositionLog transactionRateType(String transactionRateType) {
    this.transactionRateType = transactionRateType;
    return this;
  }

  /**
   * Get transactionRateType
   * @return transactionRateType
  */
  @ApiModelProperty(value = "")


  public String getTransactionRateType() {
    return transactionRateType;
  }

  public void setTransactionRateType(String transactionRateType) {
    this.transactionRateType = transactionRateType;
  }

  public FinancialPositionLog transactionInterestCharge(String transactionInterestCharge) {
    this.transactionInterestCharge = transactionInterestCharge;
    return this;
  }

  /**
   * Get transactionInterestCharge
   * @return transactionInterestCharge
  */
  @ApiModelProperty(value = "")


  public String getTransactionInterestCharge() {
    return transactionInterestCharge;
  }

  public void setTransactionInterestCharge(String transactionInterestCharge) {
    this.transactionInterestCharge = transactionInterestCharge;
  }

  public FinancialPositionLog managedPositionLimits(String managedPositionLimits) {
    this.managedPositionLimits = managedPositionLimits;
    return this;
  }

  /**
   * Get managedPositionLimits
   * @return managedPositionLimits
  */
  @ApiModelProperty(value = "")


  public String getManagedPositionLimits() {
    return managedPositionLimits;
  }

  public void setManagedPositionLimits(String managedPositionLimits) {
    this.managedPositionLimits = managedPositionLimits;
  }

  public FinancialPositionLog positionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
    return this;
  }

  /**
   * Get positionLimitType
   * @return positionLimitType
  */
  @ApiModelProperty(value = "")


  public String getPositionLimitType() {
    return positionLimitType;
  }

  public void setPositionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
  }

  public FinancialPositionLog positionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
    return this;
  }

  /**
   * Get positionLimitSettings
   * @return positionLimitSettings
  */
  @ApiModelProperty(value = "")


  public String getPositionLimitSettings() {
    return positionLimitSettings;
  }

  public void setPositionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
  }

  public FinancialPositionLog positionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
    return this;
  }

  /**
   * Get positionLimitValue
   * @return positionLimitValue
  */
  @ApiModelProperty(value = "")


  public String getPositionLimitValue() {
    return positionLimitValue;
  }

  public void setPositionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
  }

  public FinancialPositionLog amountBlock(String amountBlock) {
    this.amountBlock = amountBlock;
    return this;
  }

  /**
   * Get amountBlock
   * @return amountBlock
  */
  @ApiModelProperty(value = "")


  public String getAmountBlock() {
    return amountBlock;
  }

  public void setAmountBlock(String amountBlock) {
    this.amountBlock = amountBlock;
  }

  public FinancialPositionLog amountBlockType(String amountBlockType) {
    this.amountBlockType = amountBlockType;
    return this;
  }

  /**
   * Get amountBlockType
   * @return amountBlockType
  */
  @ApiModelProperty(value = "")


  public String getAmountBlockType() {
    return amountBlockType;
  }

  public void setAmountBlockType(String amountBlockType) {
    this.amountBlockType = amountBlockType;
  }

  public FinancialPositionLog priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  */
  @ApiModelProperty(value = "")


  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public FinancialPositionLog amount(String amount) {
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

  public FinancialPositionLog dateType(String dateType) {
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

  public FinancialPositionLog date(String date) {
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

  public FinancialPositionLog initiationDate(String initiationDate) {
    this.initiationDate = initiationDate;
    return this;
  }

  /**
   * Get initiationDate
   * @return initiationDate
  */
  @ApiModelProperty(value = "")


  public String getInitiationDate() {
    return initiationDate;
  }

  public void setInitiationDate(String initiationDate) {
    this.initiationDate = initiationDate;
  }

  public FinancialPositionLog status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialPositionLog financialPositionLog = (FinancialPositionLog) o;
    return Objects.equals(this.transactionLogType, financialPositionLog.transactionLogType) &&
        Objects.equals(this.productInstanceReference, financialPositionLog.productInstanceReference) &&
        Objects.equals(this.customerReference, financialPositionLog.customerReference) &&
        Objects.equals(this.counterpartyReference, financialPositionLog.counterpartyReference) &&
        Objects.equals(this.baseCurrency, financialPositionLog.baseCurrency) &&
        Objects.equals(this.interestApplicationRecord, financialPositionLog.interestApplicationRecord) &&
        Objects.equals(this.interestTransaction, financialPositionLog.interestTransaction) &&
        Objects.equals(this.transactionDescription, financialPositionLog.transactionDescription) &&
        Objects.equals(this.transactionRateType, financialPositionLog.transactionRateType) &&
        Objects.equals(this.transactionInterestCharge, financialPositionLog.transactionInterestCharge) &&
        Objects.equals(this.managedPositionLimits, financialPositionLog.managedPositionLimits) &&
        Objects.equals(this.positionLimitType, financialPositionLog.positionLimitType) &&
        Objects.equals(this.positionLimitSettings, financialPositionLog.positionLimitSettings) &&
        Objects.equals(this.positionLimitValue, financialPositionLog.positionLimitValue) &&
        Objects.equals(this.amountBlock, financialPositionLog.amountBlock) &&
        Objects.equals(this.amountBlockType, financialPositionLog.amountBlockType) &&
        Objects.equals(this.priority, financialPositionLog.priority) &&
        Objects.equals(this.amount, financialPositionLog.amount) &&
        Objects.equals(this.dateType, financialPositionLog.dateType) &&
        Objects.equals(this.date, financialPositionLog.date) &&
        Objects.equals(this.initiationDate, financialPositionLog.initiationDate) &&
        Objects.equals(this.status, financialPositionLog.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionLogType, productInstanceReference, customerReference, counterpartyReference, baseCurrency, interestApplicationRecord, interestTransaction, transactionDescription, transactionRateType, transactionInterestCharge, managedPositionLimits, positionLimitType, positionLimitSettings, positionLimitValue, amountBlock, amountBlockType, priority, amount, dateType, date, initiationDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialPositionLog {\n");
    
    sb.append("    transactionLogType: ").append(toIndentedString(transactionLogType)).append("\n");
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    counterpartyReference: ").append(toIndentedString(counterpartyReference)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
    sb.append("    interestApplicationRecord: ").append(toIndentedString(interestApplicationRecord)).append("\n");
    sb.append("    interestTransaction: ").append(toIndentedString(interestTransaction)).append("\n");
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
    sb.append("    transactionRateType: ").append(toIndentedString(transactionRateType)).append("\n");
    sb.append("    transactionInterestCharge: ").append(toIndentedString(transactionInterestCharge)).append("\n");
    sb.append("    managedPositionLimits: ").append(toIndentedString(managedPositionLimits)).append("\n");
    sb.append("    positionLimitType: ").append(toIndentedString(positionLimitType)).append("\n");
    sb.append("    positionLimitSettings: ").append(toIndentedString(positionLimitSettings)).append("\n");
    sb.append("    positionLimitValue: ").append(toIndentedString(positionLimitValue)).append("\n");
    sb.append("    amountBlock: ").append(toIndentedString(amountBlock)).append("\n");
    sb.append("    amountBlockType: ").append(toIndentedString(amountBlockType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    initiationDate: ").append(toIndentedString(initiationDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

