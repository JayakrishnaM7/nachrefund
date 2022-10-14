package com.ibm.org.model.corporatecurrentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdatePaymentsRequestPayments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class UpdatePaymentsRequestPayments   {
  @JsonProperty("PaymentType")
  private String paymentType;

  @JsonProperty("PaymentProcessingOptionDefinition")
  private String paymentProcessingOptionDefinition;

  @JsonProperty("PaymentProcessingOptionSetting")
  private String paymentProcessingOptionSetting;

  @JsonProperty("PaymentConfiguration")
  private String paymentConfiguration;

  @JsonProperty("PaymentSchedule")
  private String paymentSchedule;

  @JsonProperty("DirectDebitMandateReference")
  private Object directDebitMandateReference;

  @JsonProperty("DirectDebitMandateSettings")
  private String directDebitMandateSettings;

  @JsonProperty("BillPayMandateReference")
  private Object billPayMandateReference;

  @JsonProperty("BillPayMandateSettings")
  private String billPayMandateSettings;

  @JsonProperty("PaymentTransaction")
  private String paymentTransaction;

  @JsonProperty("PaymentTransactionType")
  private String paymentTransactionType;

  @JsonProperty("PaymentTransactionPayeeReference")
  private Object paymentTransactionPayeeReference;

  @JsonProperty("PaymentTransactionPayeeAccountReference")
  private Object paymentTransactionPayeeAccountReference;

  @JsonProperty("PaymentTransactionPayeeBankReference")
  private Object paymentTransactionPayeeBankReference;

  @JsonProperty("PaymentTransactionAmount")
  private BigDecimal paymentTransactionAmount;

  @JsonProperty("PaymentTransactionFeeType")
  private String paymentTransactionFeeType;

  @JsonProperty("PaymentTransactionFeeCharge")
  private String paymentTransactionFeeCharge;

  @JsonProperty("PaymentTransactionDate")
  private String paymentTransactionDate;

  @JsonProperty("PaymentTransactionPaymentMechanism")
  private String paymentTransactionPaymentMechanism;

  @JsonProperty("PaymentTransactionPaymentPurpose")
  private String paymentTransactionPaymentPurpose;

  @JsonProperty("PaymentTransactionBankBranchOrLocationReference")
  private Object paymentTransactionBankBranchOrLocationReference;

  public UpdatePaymentsRequestPayments paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
  */
  @ApiModelProperty(value = "")


  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public UpdatePaymentsRequestPayments paymentProcessingOptionDefinition(String paymentProcessingOptionDefinition) {
    this.paymentProcessingOptionDefinition = paymentProcessingOptionDefinition;
    return this;
  }

  /**
   * Get paymentProcessingOptionDefinition
   * @return paymentProcessingOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getPaymentProcessingOptionDefinition() {
    return paymentProcessingOptionDefinition;
  }

  public void setPaymentProcessingOptionDefinition(String paymentProcessingOptionDefinition) {
    this.paymentProcessingOptionDefinition = paymentProcessingOptionDefinition;
  }

  public UpdatePaymentsRequestPayments paymentProcessingOptionSetting(String paymentProcessingOptionSetting) {
    this.paymentProcessingOptionSetting = paymentProcessingOptionSetting;
    return this;
  }

  /**
   * Get paymentProcessingOptionSetting
   * @return paymentProcessingOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getPaymentProcessingOptionSetting() {
    return paymentProcessingOptionSetting;
  }

  public void setPaymentProcessingOptionSetting(String paymentProcessingOptionSetting) {
    this.paymentProcessingOptionSetting = paymentProcessingOptionSetting;
  }

  public UpdatePaymentsRequestPayments paymentConfiguration(String paymentConfiguration) {
    this.paymentConfiguration = paymentConfiguration;
    return this;
  }

  /**
   * Get paymentConfiguration
   * @return paymentConfiguration
  */
  @ApiModelProperty(value = "")


  public String getPaymentConfiguration() {
    return paymentConfiguration;
  }

  public void setPaymentConfiguration(String paymentConfiguration) {
    this.paymentConfiguration = paymentConfiguration;
  }

  public UpdatePaymentsRequestPayments paymentSchedule(String paymentSchedule) {
    this.paymentSchedule = paymentSchedule;
    return this;
  }

  /**
   * Get paymentSchedule
   * @return paymentSchedule
  */
  @ApiModelProperty(value = "")


  public String getPaymentSchedule() {
    return paymentSchedule;
  }

  public void setPaymentSchedule(String paymentSchedule) {
    this.paymentSchedule = paymentSchedule;
  }

  public UpdatePaymentsRequestPayments directDebitMandateReference(Object directDebitMandateReference) {
    this.directDebitMandateReference = directDebitMandateReference;
    return this;
  }

  /**
   * Get directDebitMandateReference
   * @return directDebitMandateReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDirectDebitMandateReference() {
    return directDebitMandateReference;
  }

  public void setDirectDebitMandateReference(Object directDebitMandateReference) {
    this.directDebitMandateReference = directDebitMandateReference;
  }

  public UpdatePaymentsRequestPayments directDebitMandateSettings(String directDebitMandateSettings) {
    this.directDebitMandateSettings = directDebitMandateSettings;
    return this;
  }

  /**
   * Get directDebitMandateSettings
   * @return directDebitMandateSettings
  */
  @ApiModelProperty(value = "")


  public String getDirectDebitMandateSettings() {
    return directDebitMandateSettings;
  }

  public void setDirectDebitMandateSettings(String directDebitMandateSettings) {
    this.directDebitMandateSettings = directDebitMandateSettings;
  }

  public UpdatePaymentsRequestPayments billPayMandateReference(Object billPayMandateReference) {
    this.billPayMandateReference = billPayMandateReference;
    return this;
  }

  /**
   * Get billPayMandateReference
   * @return billPayMandateReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBillPayMandateReference() {
    return billPayMandateReference;
  }

  public void setBillPayMandateReference(Object billPayMandateReference) {
    this.billPayMandateReference = billPayMandateReference;
  }

  public UpdatePaymentsRequestPayments billPayMandateSettings(String billPayMandateSettings) {
    this.billPayMandateSettings = billPayMandateSettings;
    return this;
  }

  /**
   * Get billPayMandateSettings
   * @return billPayMandateSettings
  */
  @ApiModelProperty(value = "")


  public String getBillPayMandateSettings() {
    return billPayMandateSettings;
  }

  public void setBillPayMandateSettings(String billPayMandateSettings) {
    this.billPayMandateSettings = billPayMandateSettings;
  }

  public UpdatePaymentsRequestPayments paymentTransaction(String paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
    return this;
  }

  /**
   * Get paymentTransaction
   * @return paymentTransaction
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(String paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }

  public UpdatePaymentsRequestPayments paymentTransactionType(String paymentTransactionType) {
    this.paymentTransactionType = paymentTransactionType;
    return this;
  }

  /**
   * Get paymentTransactionType
   * @return paymentTransactionType
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionType() {
    return paymentTransactionType;
  }

  public void setPaymentTransactionType(String paymentTransactionType) {
    this.paymentTransactionType = paymentTransactionType;
  }

  public UpdatePaymentsRequestPayments paymentTransactionPayeeReference(Object paymentTransactionPayeeReference) {
    this.paymentTransactionPayeeReference = paymentTransactionPayeeReference;
    return this;
  }

  /**
   * Get paymentTransactionPayeeReference
   * @return paymentTransactionPayeeReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentTransactionPayeeReference() {
    return paymentTransactionPayeeReference;
  }

  public void setPaymentTransactionPayeeReference(Object paymentTransactionPayeeReference) {
    this.paymentTransactionPayeeReference = paymentTransactionPayeeReference;
  }

  public UpdatePaymentsRequestPayments paymentTransactionPayeeAccountReference(Object paymentTransactionPayeeAccountReference) {
    this.paymentTransactionPayeeAccountReference = paymentTransactionPayeeAccountReference;
    return this;
  }

  /**
   * Get paymentTransactionPayeeAccountReference
   * @return paymentTransactionPayeeAccountReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentTransactionPayeeAccountReference() {
    return paymentTransactionPayeeAccountReference;
  }

  public void setPaymentTransactionPayeeAccountReference(Object paymentTransactionPayeeAccountReference) {
    this.paymentTransactionPayeeAccountReference = paymentTransactionPayeeAccountReference;
  }

  public UpdatePaymentsRequestPayments paymentTransactionPayeeBankReference(Object paymentTransactionPayeeBankReference) {
    this.paymentTransactionPayeeBankReference = paymentTransactionPayeeBankReference;
    return this;
  }

  /**
   * Get paymentTransactionPayeeBankReference
   * @return paymentTransactionPayeeBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentTransactionPayeeBankReference() {
    return paymentTransactionPayeeBankReference;
  }

  public void setPaymentTransactionPayeeBankReference(Object paymentTransactionPayeeBankReference) {
    this.paymentTransactionPayeeBankReference = paymentTransactionPayeeBankReference;
  }

  public UpdatePaymentsRequestPayments paymentTransactionAmount(BigDecimal paymentTransactionAmount) {
    this.paymentTransactionAmount = paymentTransactionAmount;
    return this;
  }

  /**
   * Get paymentTransactionAmount
   * @return paymentTransactionAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPaymentTransactionAmount() {
    return paymentTransactionAmount;
  }

  public void setPaymentTransactionAmount(BigDecimal paymentTransactionAmount) {
    this.paymentTransactionAmount = paymentTransactionAmount;
  }

  public UpdatePaymentsRequestPayments paymentTransactionFeeType(String paymentTransactionFeeType) {
    this.paymentTransactionFeeType = paymentTransactionFeeType;
    return this;
  }

  /**
   * Get paymentTransactionFeeType
   * @return paymentTransactionFeeType
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionFeeType() {
    return paymentTransactionFeeType;
  }

  public void setPaymentTransactionFeeType(String paymentTransactionFeeType) {
    this.paymentTransactionFeeType = paymentTransactionFeeType;
  }

  public UpdatePaymentsRequestPayments paymentTransactionFeeCharge(String paymentTransactionFeeCharge) {
    this.paymentTransactionFeeCharge = paymentTransactionFeeCharge;
    return this;
  }

  /**
   * Get paymentTransactionFeeCharge
   * @return paymentTransactionFeeCharge
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionFeeCharge() {
    return paymentTransactionFeeCharge;
  }

  public void setPaymentTransactionFeeCharge(String paymentTransactionFeeCharge) {
    this.paymentTransactionFeeCharge = paymentTransactionFeeCharge;
  }

  public UpdatePaymentsRequestPayments paymentTransactionDate(String paymentTransactionDate) {
    this.paymentTransactionDate = paymentTransactionDate;
    return this;
  }

  /**
   * Get paymentTransactionDate
   * @return paymentTransactionDate
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionDate() {
    return paymentTransactionDate;
  }

  public void setPaymentTransactionDate(String paymentTransactionDate) {
    this.paymentTransactionDate = paymentTransactionDate;
  }

  public UpdatePaymentsRequestPayments paymentTransactionPaymentMechanism(String paymentTransactionPaymentMechanism) {
    this.paymentTransactionPaymentMechanism = paymentTransactionPaymentMechanism;
    return this;
  }

  /**
   * Get paymentTransactionPaymentMechanism
   * @return paymentTransactionPaymentMechanism
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionPaymentMechanism() {
    return paymentTransactionPaymentMechanism;
  }

  public void setPaymentTransactionPaymentMechanism(String paymentTransactionPaymentMechanism) {
    this.paymentTransactionPaymentMechanism = paymentTransactionPaymentMechanism;
  }

  public UpdatePaymentsRequestPayments paymentTransactionPaymentPurpose(String paymentTransactionPaymentPurpose) {
    this.paymentTransactionPaymentPurpose = paymentTransactionPaymentPurpose;
    return this;
  }

  /**
   * Get paymentTransactionPaymentPurpose
   * @return paymentTransactionPaymentPurpose
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionPaymentPurpose() {
    return paymentTransactionPaymentPurpose;
  }

  public void setPaymentTransactionPaymentPurpose(String paymentTransactionPaymentPurpose) {
    this.paymentTransactionPaymentPurpose = paymentTransactionPaymentPurpose;
  }

  public UpdatePaymentsRequestPayments paymentTransactionBankBranchOrLocationReference(Object paymentTransactionBankBranchOrLocationReference) {
    this.paymentTransactionBankBranchOrLocationReference = paymentTransactionBankBranchOrLocationReference;
    return this;
  }

  /**
   * Get paymentTransactionBankBranchOrLocationReference
   * @return paymentTransactionBankBranchOrLocationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPaymentTransactionBankBranchOrLocationReference() {
    return paymentTransactionBankBranchOrLocationReference;
  }

  public void setPaymentTransactionBankBranchOrLocationReference(Object paymentTransactionBankBranchOrLocationReference) {
    this.paymentTransactionBankBranchOrLocationReference = paymentTransactionBankBranchOrLocationReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePaymentsRequestPayments updatePaymentsRequestPayments = (UpdatePaymentsRequestPayments) o;
    return Objects.equals(this.paymentType, updatePaymentsRequestPayments.paymentType) &&
        Objects.equals(this.paymentProcessingOptionDefinition, updatePaymentsRequestPayments.paymentProcessingOptionDefinition) &&
        Objects.equals(this.paymentProcessingOptionSetting, updatePaymentsRequestPayments.paymentProcessingOptionSetting) &&
        Objects.equals(this.paymentConfiguration, updatePaymentsRequestPayments.paymentConfiguration) &&
        Objects.equals(this.paymentSchedule, updatePaymentsRequestPayments.paymentSchedule) &&
        Objects.equals(this.directDebitMandateReference, updatePaymentsRequestPayments.directDebitMandateReference) &&
        Objects.equals(this.directDebitMandateSettings, updatePaymentsRequestPayments.directDebitMandateSettings) &&
        Objects.equals(this.billPayMandateReference, updatePaymentsRequestPayments.billPayMandateReference) &&
        Objects.equals(this.billPayMandateSettings, updatePaymentsRequestPayments.billPayMandateSettings) &&
        Objects.equals(this.paymentTransaction, updatePaymentsRequestPayments.paymentTransaction) &&
        Objects.equals(this.paymentTransactionType, updatePaymentsRequestPayments.paymentTransactionType) &&
        Objects.equals(this.paymentTransactionPayeeReference, updatePaymentsRequestPayments.paymentTransactionPayeeReference) &&
        Objects.equals(this.paymentTransactionPayeeAccountReference, updatePaymentsRequestPayments.paymentTransactionPayeeAccountReference) &&
        Objects.equals(this.paymentTransactionPayeeBankReference, updatePaymentsRequestPayments.paymentTransactionPayeeBankReference) &&
        Objects.equals(this.paymentTransactionAmount, updatePaymentsRequestPayments.paymentTransactionAmount) &&
        Objects.equals(this.paymentTransactionFeeType, updatePaymentsRequestPayments.paymentTransactionFeeType) &&
        Objects.equals(this.paymentTransactionFeeCharge, updatePaymentsRequestPayments.paymentTransactionFeeCharge) &&
        Objects.equals(this.paymentTransactionDate, updatePaymentsRequestPayments.paymentTransactionDate) &&
        Objects.equals(this.paymentTransactionPaymentMechanism, updatePaymentsRequestPayments.paymentTransactionPaymentMechanism) &&
        Objects.equals(this.paymentTransactionPaymentPurpose, updatePaymentsRequestPayments.paymentTransactionPaymentPurpose) &&
        Objects.equals(this.paymentTransactionBankBranchOrLocationReference, updatePaymentsRequestPayments.paymentTransactionBankBranchOrLocationReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentType, paymentProcessingOptionDefinition, paymentProcessingOptionSetting, paymentConfiguration, paymentSchedule, directDebitMandateReference, directDebitMandateSettings, billPayMandateReference, billPayMandateSettings, paymentTransaction, paymentTransactionType, paymentTransactionPayeeReference, paymentTransactionPayeeAccountReference, paymentTransactionPayeeBankReference, paymentTransactionAmount, paymentTransactionFeeType, paymentTransactionFeeCharge, paymentTransactionDate, paymentTransactionPaymentMechanism, paymentTransactionPaymentPurpose, paymentTransactionBankBranchOrLocationReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentsRequestPayments {\n");
    
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentProcessingOptionDefinition: ").append(toIndentedString(paymentProcessingOptionDefinition)).append("\n");
    sb.append("    paymentProcessingOptionSetting: ").append(toIndentedString(paymentProcessingOptionSetting)).append("\n");
    sb.append("    paymentConfiguration: ").append(toIndentedString(paymentConfiguration)).append("\n");
    sb.append("    paymentSchedule: ").append(toIndentedString(paymentSchedule)).append("\n");
    sb.append("    directDebitMandateReference: ").append(toIndentedString(directDebitMandateReference)).append("\n");
    sb.append("    directDebitMandateSettings: ").append(toIndentedString(directDebitMandateSettings)).append("\n");
    sb.append("    billPayMandateReference: ").append(toIndentedString(billPayMandateReference)).append("\n");
    sb.append("    billPayMandateSettings: ").append(toIndentedString(billPayMandateSettings)).append("\n");
    sb.append("    paymentTransaction: ").append(toIndentedString(paymentTransaction)).append("\n");
    sb.append("    paymentTransactionType: ").append(toIndentedString(paymentTransactionType)).append("\n");
    sb.append("    paymentTransactionPayeeReference: ").append(toIndentedString(paymentTransactionPayeeReference)).append("\n");
    sb.append("    paymentTransactionPayeeAccountReference: ").append(toIndentedString(paymentTransactionPayeeAccountReference)).append("\n");
    sb.append("    paymentTransactionPayeeBankReference: ").append(toIndentedString(paymentTransactionPayeeBankReference)).append("\n");
    sb.append("    paymentTransactionAmount: ").append(toIndentedString(paymentTransactionAmount)).append("\n");
    sb.append("    paymentTransactionFeeType: ").append(toIndentedString(paymentTransactionFeeType)).append("\n");
    sb.append("    paymentTransactionFeeCharge: ").append(toIndentedString(paymentTransactionFeeCharge)).append("\n");
    sb.append("    paymentTransactionDate: ").append(toIndentedString(paymentTransactionDate)).append("\n");
    sb.append("    paymentTransactionPaymentMechanism: ").append(toIndentedString(paymentTransactionPaymentMechanism)).append("\n");
    sb.append("    paymentTransactionPaymentPurpose: ").append(toIndentedString(paymentTransactionPaymentPurpose)).append("\n");
    sb.append("    paymentTransactionBankBranchOrLocationReference: ").append(toIndentedString(paymentTransactionBankBranchOrLocationReference)).append("\n");
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

