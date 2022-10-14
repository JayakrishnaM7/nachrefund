package com.ibm.org.model.positionkeeping;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveFinancialPositionLogResponseFinancialPositionLog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:34.102Z[GMT]")

public class RetrieveFinancialPositionLogResponseFinancialPositionLog   {
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

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("InitiationDate")
  private String initiationDate;

  @JsonProperty("Status")
  private String status;

  public RetrieveFinancialPositionLogResponseFinancialPositionLog transactionLogType(String transactionLogType) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog productInstanceReference(Object productInstanceReference) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog customerReference(Object customerReference) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog counterpartyReference(Object counterpartyReference) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog baseCurrency(String baseCurrency) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog interestApplicationRecord(String interestApplicationRecord) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog interestTransaction(String interestTransaction) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog transactionDescription(String transactionDescription) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog transactionRateType(String transactionRateType) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog transactionInterestCharge(String transactionInterestCharge) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog managedPositionLimits(String managedPositionLimits) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog positionLimitType(String positionLimitType) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog positionLimitSettings(String positionLimitSettings) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog positionLimitValue(String positionLimitValue) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog amountBlock(String amountBlock) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog amountBlockType(String amountBlockType) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog priority(String priority) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog dateType(String dateType) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog initiationDate(String initiationDate) {
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

  public RetrieveFinancialPositionLogResponseFinancialPositionLog status(String status) {
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
    RetrieveFinancialPositionLogResponseFinancialPositionLog retrieveFinancialPositionLogResponseFinancialPositionLog = (RetrieveFinancialPositionLogResponseFinancialPositionLog) o;
    return Objects.equals(this.transactionLogType, retrieveFinancialPositionLogResponseFinancialPositionLog.transactionLogType) &&
        Objects.equals(this.productInstanceReference, retrieveFinancialPositionLogResponseFinancialPositionLog.productInstanceReference) &&
        Objects.equals(this.customerReference, retrieveFinancialPositionLogResponseFinancialPositionLog.customerReference) &&
        Objects.equals(this.counterpartyReference, retrieveFinancialPositionLogResponseFinancialPositionLog.counterpartyReference) &&
        Objects.equals(this.baseCurrency, retrieveFinancialPositionLogResponseFinancialPositionLog.baseCurrency) &&
        Objects.equals(this.interestApplicationRecord, retrieveFinancialPositionLogResponseFinancialPositionLog.interestApplicationRecord) &&
        Objects.equals(this.interestTransaction, retrieveFinancialPositionLogResponseFinancialPositionLog.interestTransaction) &&
        Objects.equals(this.transactionDescription, retrieveFinancialPositionLogResponseFinancialPositionLog.transactionDescription) &&
        Objects.equals(this.transactionRateType, retrieveFinancialPositionLogResponseFinancialPositionLog.transactionRateType) &&
        Objects.equals(this.transactionInterestCharge, retrieveFinancialPositionLogResponseFinancialPositionLog.transactionInterestCharge) &&
        Objects.equals(this.managedPositionLimits, retrieveFinancialPositionLogResponseFinancialPositionLog.managedPositionLimits) &&
        Objects.equals(this.positionLimitType, retrieveFinancialPositionLogResponseFinancialPositionLog.positionLimitType) &&
        Objects.equals(this.positionLimitSettings, retrieveFinancialPositionLogResponseFinancialPositionLog.positionLimitSettings) &&
        Objects.equals(this.positionLimitValue, retrieveFinancialPositionLogResponseFinancialPositionLog.positionLimitValue) &&
        Objects.equals(this.amountBlock, retrieveFinancialPositionLogResponseFinancialPositionLog.amountBlock) &&
        Objects.equals(this.amountBlockType, retrieveFinancialPositionLogResponseFinancialPositionLog.amountBlockType) &&
        Objects.equals(this.priority, retrieveFinancialPositionLogResponseFinancialPositionLog.priority) &&
        Objects.equals(this.dateType, retrieveFinancialPositionLogResponseFinancialPositionLog.dateType) &&
        Objects.equals(this.initiationDate, retrieveFinancialPositionLogResponseFinancialPositionLog.initiationDate) &&
        Objects.equals(this.status, retrieveFinancialPositionLogResponseFinancialPositionLog.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionLogType, productInstanceReference, customerReference, counterpartyReference, baseCurrency, interestApplicationRecord, interestTransaction, transactionDescription, transactionRateType, transactionInterestCharge, managedPositionLimits, positionLimitType, positionLimitSettings, positionLimitValue, amountBlock, amountBlockType, priority, dateType, initiationDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveFinancialPositionLogResponseFinancialPositionLog {\n");
    
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
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
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

