package com.ibm.org.model.positionkeeping;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateFinancialPositionLogRequestFinancialPositionLog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:34.102Z[GMT]")

public class InitiateFinancialPositionLogRequestFinancialPositionLog   {
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

  @JsonProperty("ManagedPositionLimits")
  private String managedPositionLimits;

  @JsonProperty("PositionLimitType")
  private String positionLimitType;

  @JsonProperty("PositionLimitSettings")
  private String positionLimitSettings;

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

  public InitiateFinancialPositionLogRequestFinancialPositionLog transactionLogType(String transactionLogType) {
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

  public InitiateFinancialPositionLogRequestFinancialPositionLog productInstanceReference(Object productInstanceReference) {
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

  public InitiateFinancialPositionLogRequestFinancialPositionLog customerReference(Object customerReference) {
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

  public InitiateFinancialPositionLogRequestFinancialPositionLog counterpartyReference(Object counterpartyReference) {
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

  public InitiateFinancialPositionLogRequestFinancialPositionLog baseCurrency(String baseCurrency) {
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

  public InitiateFinancialPositionLogRequestFinancialPositionLog interestApplicationRecord(String interestApplicationRecord) {
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

  public InitiateFinancialPositionLogRequestFinancialPositionLog managedPositionLimits(String managedPositionLimits) {
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

  public InitiateFinancialPositionLogRequestFinancialPositionLog positionLimitType(String positionLimitType) {
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

  public InitiateFinancialPositionLogRequestFinancialPositionLog positionLimitSettings(String positionLimitSettings) {
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

  public InitiateFinancialPositionLogRequestFinancialPositionLog amountBlock(String amountBlock) {
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

  public InitiateFinancialPositionLogRequestFinancialPositionLog amountBlockType(String amountBlockType) {
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

  public InitiateFinancialPositionLogRequestFinancialPositionLog priority(String priority) {
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

  public InitiateFinancialPositionLogRequestFinancialPositionLog dateType(String dateType) {
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

  public InitiateFinancialPositionLogRequestFinancialPositionLog initiationDate(String initiationDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateFinancialPositionLogRequestFinancialPositionLog initiateFinancialPositionLogRequestFinancialPositionLog = (InitiateFinancialPositionLogRequestFinancialPositionLog) o;
    return Objects.equals(this.transactionLogType, initiateFinancialPositionLogRequestFinancialPositionLog.transactionLogType) &&
        Objects.equals(this.productInstanceReference, initiateFinancialPositionLogRequestFinancialPositionLog.productInstanceReference) &&
        Objects.equals(this.customerReference, initiateFinancialPositionLogRequestFinancialPositionLog.customerReference) &&
        Objects.equals(this.counterpartyReference, initiateFinancialPositionLogRequestFinancialPositionLog.counterpartyReference) &&
        Objects.equals(this.baseCurrency, initiateFinancialPositionLogRequestFinancialPositionLog.baseCurrency) &&
        Objects.equals(this.interestApplicationRecord, initiateFinancialPositionLogRequestFinancialPositionLog.interestApplicationRecord) &&
        Objects.equals(this.managedPositionLimits, initiateFinancialPositionLogRequestFinancialPositionLog.managedPositionLimits) &&
        Objects.equals(this.positionLimitType, initiateFinancialPositionLogRequestFinancialPositionLog.positionLimitType) &&
        Objects.equals(this.positionLimitSettings, initiateFinancialPositionLogRequestFinancialPositionLog.positionLimitSettings) &&
        Objects.equals(this.amountBlock, initiateFinancialPositionLogRequestFinancialPositionLog.amountBlock) &&
        Objects.equals(this.amountBlockType, initiateFinancialPositionLogRequestFinancialPositionLog.amountBlockType) &&
        Objects.equals(this.priority, initiateFinancialPositionLogRequestFinancialPositionLog.priority) &&
        Objects.equals(this.dateType, initiateFinancialPositionLogRequestFinancialPositionLog.dateType) &&
        Objects.equals(this.initiationDate, initiateFinancialPositionLogRequestFinancialPositionLog.initiationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionLogType, productInstanceReference, customerReference, counterpartyReference, baseCurrency, interestApplicationRecord, managedPositionLimits, positionLimitType, positionLimitSettings, amountBlock, amountBlockType, priority, dateType, initiationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateFinancialPositionLogRequestFinancialPositionLog {\n");
    
    sb.append("    transactionLogType: ").append(toIndentedString(transactionLogType)).append("\n");
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    counterpartyReference: ").append(toIndentedString(counterpartyReference)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
    sb.append("    interestApplicationRecord: ").append(toIndentedString(interestApplicationRecord)).append("\n");
    sb.append("    managedPositionLimits: ").append(toIndentedString(managedPositionLimits)).append("\n");
    sb.append("    positionLimitType: ").append(toIndentedString(positionLimitType)).append("\n");
    sb.append("    positionLimitSettings: ").append(toIndentedString(positionLimitSettings)).append("\n");
    sb.append("    amountBlock: ").append(toIndentedString(amountBlock)).append("\n");
    sb.append("    amountBlockType: ").append(toIndentedString(amountBlockType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    initiationDate: ").append(toIndentedString(initiationDate)).append("\n");
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

