package com.ibm.org.model.positionkeeping;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateFinancialPositionLogResponseFinancialPositionLog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:34.102Z[GMT]")

public class InitiateFinancialPositionLogResponseFinancialPositionLog   {
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

  @JsonProperty("PositionLimitValue")
  private String positionLimitValue;

  @JsonProperty("AmountBlock")
  private String amountBlock;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("Status")
  private String status;

  public InitiateFinancialPositionLogResponseFinancialPositionLog interestApplicationRecord(String interestApplicationRecord) {
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

  public InitiateFinancialPositionLogResponseFinancialPositionLog interestTransaction(String interestTransaction) {
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

  public InitiateFinancialPositionLogResponseFinancialPositionLog transactionDescription(String transactionDescription) {
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

  public InitiateFinancialPositionLogResponseFinancialPositionLog transactionRateType(String transactionRateType) {
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

  public InitiateFinancialPositionLogResponseFinancialPositionLog transactionInterestCharge(String transactionInterestCharge) {
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

  public InitiateFinancialPositionLogResponseFinancialPositionLog managedPositionLimits(String managedPositionLimits) {
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

  public InitiateFinancialPositionLogResponseFinancialPositionLog positionLimitValue(String positionLimitValue) {
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

  public InitiateFinancialPositionLogResponseFinancialPositionLog amountBlock(String amountBlock) {
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

  public InitiateFinancialPositionLogResponseFinancialPositionLog dateType(String dateType) {
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

  public InitiateFinancialPositionLogResponseFinancialPositionLog status(String status) {
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
    InitiateFinancialPositionLogResponseFinancialPositionLog initiateFinancialPositionLogResponseFinancialPositionLog = (InitiateFinancialPositionLogResponseFinancialPositionLog) o;
    return Objects.equals(this.interestApplicationRecord, initiateFinancialPositionLogResponseFinancialPositionLog.interestApplicationRecord) &&
        Objects.equals(this.interestTransaction, initiateFinancialPositionLogResponseFinancialPositionLog.interestTransaction) &&
        Objects.equals(this.transactionDescription, initiateFinancialPositionLogResponseFinancialPositionLog.transactionDescription) &&
        Objects.equals(this.transactionRateType, initiateFinancialPositionLogResponseFinancialPositionLog.transactionRateType) &&
        Objects.equals(this.transactionInterestCharge, initiateFinancialPositionLogResponseFinancialPositionLog.transactionInterestCharge) &&
        Objects.equals(this.managedPositionLimits, initiateFinancialPositionLogResponseFinancialPositionLog.managedPositionLimits) &&
        Objects.equals(this.positionLimitValue, initiateFinancialPositionLogResponseFinancialPositionLog.positionLimitValue) &&
        Objects.equals(this.amountBlock, initiateFinancialPositionLogResponseFinancialPositionLog.amountBlock) &&
        Objects.equals(this.dateType, initiateFinancialPositionLogResponseFinancialPositionLog.dateType) &&
        Objects.equals(this.status, initiateFinancialPositionLogResponseFinancialPositionLog.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestApplicationRecord, interestTransaction, transactionDescription, transactionRateType, transactionInterestCharge, managedPositionLimits, positionLimitValue, amountBlock, dateType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateFinancialPositionLogResponseFinancialPositionLog {\n");
    
    sb.append("    interestApplicationRecord: ").append(toIndentedString(interestApplicationRecord)).append("\n");
    sb.append("    interestTransaction: ").append(toIndentedString(interestTransaction)).append("\n");
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
    sb.append("    transactionRateType: ").append(toIndentedString(transactionRateType)).append("\n");
    sb.append("    transactionInterestCharge: ").append(toIndentedString(transactionInterestCharge)).append("\n");
    sb.append("    managedPositionLimits: ").append(toIndentedString(managedPositionLimits)).append("\n");
    sb.append("    positionLimitValue: ").append(toIndentedString(positionLimitValue)).append("\n");
    sb.append("    amountBlock: ").append(toIndentedString(amountBlock)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
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

