package com.ibm.org.model.financialgateway;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:23.495Z[GMT]")

public class InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession   {
  @JsonProperty("FinancialGatewayServiceType")
  private String financialGatewayServiceType;

  @JsonProperty("FinancialGatewayServiceSessionReportType")
  private String financialGatewayServiceSessionReportType;

  @JsonProperty("FinancialGatewayServiceSessionDate")
  private String financialGatewayServiceSessionDate;

  @JsonProperty("FinancialGatewayServiceSessionIssueRecord")
  private String financialGatewayServiceSessionIssueRecord;

  @JsonProperty("EmployeeOrBusinessUnitReference")
  private Object employeeOrBusinessUnitReference;

  @JsonProperty("MessageReference")
  private Object messageReference;

  @JsonProperty("ProductionIssueType")
  private String productionIssueType;

  @JsonProperty("ProductionIssueDescription")
  private String productionIssueDescription;

  public InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession financialGatewayServiceType(String financialGatewayServiceType) {
    this.financialGatewayServiceType = financialGatewayServiceType;
    return this;
  }

  /**
   * Get financialGatewayServiceType
   * @return financialGatewayServiceType
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayServiceType() {
    return financialGatewayServiceType;
  }

  public void setFinancialGatewayServiceType(String financialGatewayServiceType) {
    this.financialGatewayServiceType = financialGatewayServiceType;
  }

  public InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession financialGatewayServiceSessionReportType(String financialGatewayServiceSessionReportType) {
    this.financialGatewayServiceSessionReportType = financialGatewayServiceSessionReportType;
    return this;
  }

  /**
   * Get financialGatewayServiceSessionReportType
   * @return financialGatewayServiceSessionReportType
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayServiceSessionReportType() {
    return financialGatewayServiceSessionReportType;
  }

  public void setFinancialGatewayServiceSessionReportType(String financialGatewayServiceSessionReportType) {
    this.financialGatewayServiceSessionReportType = financialGatewayServiceSessionReportType;
  }

  public InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession financialGatewayServiceSessionDate(String financialGatewayServiceSessionDate) {
    this.financialGatewayServiceSessionDate = financialGatewayServiceSessionDate;
    return this;
  }

  /**
   * Get financialGatewayServiceSessionDate
   * @return financialGatewayServiceSessionDate
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayServiceSessionDate() {
    return financialGatewayServiceSessionDate;
  }

  public void setFinancialGatewayServiceSessionDate(String financialGatewayServiceSessionDate) {
    this.financialGatewayServiceSessionDate = financialGatewayServiceSessionDate;
  }

  public InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession financialGatewayServiceSessionIssueRecord(String financialGatewayServiceSessionIssueRecord) {
    this.financialGatewayServiceSessionIssueRecord = financialGatewayServiceSessionIssueRecord;
    return this;
  }

  /**
   * Get financialGatewayServiceSessionIssueRecord
   * @return financialGatewayServiceSessionIssueRecord
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayServiceSessionIssueRecord() {
    return financialGatewayServiceSessionIssueRecord;
  }

  public void setFinancialGatewayServiceSessionIssueRecord(String financialGatewayServiceSessionIssueRecord) {
    this.financialGatewayServiceSessionIssueRecord = financialGatewayServiceSessionIssueRecord;
  }

  public InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession employeeOrBusinessUnitReference(Object employeeOrBusinessUnitReference) {
    this.employeeOrBusinessUnitReference = employeeOrBusinessUnitReference;
    return this;
  }

  /**
   * Get employeeOrBusinessUnitReference
   * @return employeeOrBusinessUnitReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeeOrBusinessUnitReference() {
    return employeeOrBusinessUnitReference;
  }

  public void setEmployeeOrBusinessUnitReference(Object employeeOrBusinessUnitReference) {
    this.employeeOrBusinessUnitReference = employeeOrBusinessUnitReference;
  }

  public InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession messageReference(Object messageReference) {
    this.messageReference = messageReference;
    return this;
  }

  /**
   * Get messageReference
   * @return messageReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getMessageReference() {
    return messageReference;
  }

  public void setMessageReference(Object messageReference) {
    this.messageReference = messageReference;
  }

  public InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession productionIssueType(String productionIssueType) {
    this.productionIssueType = productionIssueType;
    return this;
  }

  /**
   * Get productionIssueType
   * @return productionIssueType
  */
  @ApiModelProperty(value = "")


  public String getProductionIssueType() {
    return productionIssueType;
  }

  public void setProductionIssueType(String productionIssueType) {
    this.productionIssueType = productionIssueType;
  }

  public InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession productionIssueDescription(String productionIssueDescription) {
    this.productionIssueDescription = productionIssueDescription;
    return this;
  }

  /**
   * Get productionIssueDescription
   * @return productionIssueDescription
  */
  @ApiModelProperty(value = "")


  public String getProductionIssueDescription() {
    return productionIssueDescription;
  }

  public void setProductionIssueDescription(String productionIssueDescription) {
    this.productionIssueDescription = productionIssueDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession initiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession = (InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession) o;
    return Objects.equals(this.financialGatewayServiceType, initiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession.financialGatewayServiceType) &&
        Objects.equals(this.financialGatewayServiceSessionReportType, initiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession.financialGatewayServiceSessionReportType) &&
        Objects.equals(this.financialGatewayServiceSessionDate, initiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession.financialGatewayServiceSessionDate) &&
        Objects.equals(this.financialGatewayServiceSessionIssueRecord, initiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession.financialGatewayServiceSessionIssueRecord) &&
        Objects.equals(this.employeeOrBusinessUnitReference, initiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession.employeeOrBusinessUnitReference) &&
        Objects.equals(this.messageReference, initiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession.messageReference) &&
        Objects.equals(this.productionIssueType, initiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession.productionIssueType) &&
        Objects.equals(this.productionIssueDescription, initiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession.productionIssueDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialGatewayServiceType, financialGatewayServiceSessionReportType, financialGatewayServiceSessionDate, financialGatewayServiceSessionIssueRecord, employeeOrBusinessUnitReference, messageReference, productionIssueType, productionIssueDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession {\n");
    
    sb.append("    financialGatewayServiceType: ").append(toIndentedString(financialGatewayServiceType)).append("\n");
    sb.append("    financialGatewayServiceSessionReportType: ").append(toIndentedString(financialGatewayServiceSessionReportType)).append("\n");
    sb.append("    financialGatewayServiceSessionDate: ").append(toIndentedString(financialGatewayServiceSessionDate)).append("\n");
    sb.append("    financialGatewayServiceSessionIssueRecord: ").append(toIndentedString(financialGatewayServiceSessionIssueRecord)).append("\n");
    sb.append("    employeeOrBusinessUnitReference: ").append(toIndentedString(employeeOrBusinessUnitReference)).append("\n");
    sb.append("    messageReference: ").append(toIndentedString(messageReference)).append("\n");
    sb.append("    productionIssueType: ").append(toIndentedString(productionIssueType)).append("\n");
    sb.append("    productionIssueDescription: ").append(toIndentedString(productionIssueDescription)).append("\n");
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

