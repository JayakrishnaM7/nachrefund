package com.ibm.org.model.financialgateway;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:23.495Z[GMT]")

public class InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession   {
  @JsonProperty("FinancialGatewayServiceSessionStatistics")
  private String financialGatewayServiceSessionStatistics;

  @JsonProperty("FinancialGatewayServiceSessionReportType")
  private String financialGatewayServiceSessionReportType;

  @JsonProperty("FinancialGatewayServiceSessionDate")
  private String financialGatewayServiceSessionDate;

  @JsonProperty("FinancialGatewayServiceSessionIssueRecord")
  private String financialGatewayServiceSessionIssueRecord;

  @JsonProperty("ProductionIssueDiagnosis")
  private String productionIssueDiagnosis;

  @JsonProperty("ProductionIssueResolutionTask")
  private String productionIssueResolutionTask;

  @JsonProperty("ProductionIssueRecord")
  private String productionIssueRecord;

  @JsonProperty("ProductionIssueStatus")
  private String productionIssueStatus;

  public InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession financialGatewayServiceSessionStatistics(String financialGatewayServiceSessionStatistics) {
    this.financialGatewayServiceSessionStatistics = financialGatewayServiceSessionStatistics;
    return this;
  }

  /**
   * Get financialGatewayServiceSessionStatistics
   * @return financialGatewayServiceSessionStatistics
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayServiceSessionStatistics() {
    return financialGatewayServiceSessionStatistics;
  }

  public void setFinancialGatewayServiceSessionStatistics(String financialGatewayServiceSessionStatistics) {
    this.financialGatewayServiceSessionStatistics = financialGatewayServiceSessionStatistics;
  }

  public InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession financialGatewayServiceSessionReportType(String financialGatewayServiceSessionReportType) {
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

  public InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession financialGatewayServiceSessionDate(String financialGatewayServiceSessionDate) {
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

  public InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession financialGatewayServiceSessionIssueRecord(String financialGatewayServiceSessionIssueRecord) {
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

  public InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession productionIssueDiagnosis(String productionIssueDiagnosis) {
    this.productionIssueDiagnosis = productionIssueDiagnosis;
    return this;
  }

  /**
   * Get productionIssueDiagnosis
   * @return productionIssueDiagnosis
  */
  @ApiModelProperty(value = "")


  public String getProductionIssueDiagnosis() {
    return productionIssueDiagnosis;
  }

  public void setProductionIssueDiagnosis(String productionIssueDiagnosis) {
    this.productionIssueDiagnosis = productionIssueDiagnosis;
  }

  public InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession productionIssueResolutionTask(String productionIssueResolutionTask) {
    this.productionIssueResolutionTask = productionIssueResolutionTask;
    return this;
  }

  /**
   * Get productionIssueResolutionTask
   * @return productionIssueResolutionTask
  */
  @ApiModelProperty(value = "")


  public String getProductionIssueResolutionTask() {
    return productionIssueResolutionTask;
  }

  public void setProductionIssueResolutionTask(String productionIssueResolutionTask) {
    this.productionIssueResolutionTask = productionIssueResolutionTask;
  }

  public InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession productionIssueRecord(String productionIssueRecord) {
    this.productionIssueRecord = productionIssueRecord;
    return this;
  }

  /**
   * Get productionIssueRecord
   * @return productionIssueRecord
  */
  @ApiModelProperty(value = "")


  public String getProductionIssueRecord() {
    return productionIssueRecord;
  }

  public void setProductionIssueRecord(String productionIssueRecord) {
    this.productionIssueRecord = productionIssueRecord;
  }

  public InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession productionIssueStatus(String productionIssueStatus) {
    this.productionIssueStatus = productionIssueStatus;
    return this;
  }

  /**
   * Get productionIssueStatus
   * @return productionIssueStatus
  */
  @ApiModelProperty(value = "")


  public String getProductionIssueStatus() {
    return productionIssueStatus;
  }

  public void setProductionIssueStatus(String productionIssueStatus) {
    this.productionIssueStatus = productionIssueStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession initiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession = (InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession) o;
    return Objects.equals(this.financialGatewayServiceSessionStatistics, initiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession.financialGatewayServiceSessionStatistics) &&
        Objects.equals(this.financialGatewayServiceSessionReportType, initiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession.financialGatewayServiceSessionReportType) &&
        Objects.equals(this.financialGatewayServiceSessionDate, initiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession.financialGatewayServiceSessionDate) &&
        Objects.equals(this.financialGatewayServiceSessionIssueRecord, initiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession.financialGatewayServiceSessionIssueRecord) &&
        Objects.equals(this.productionIssueDiagnosis, initiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession.productionIssueDiagnosis) &&
        Objects.equals(this.productionIssueResolutionTask, initiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession.productionIssueResolutionTask) &&
        Objects.equals(this.productionIssueRecord, initiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession.productionIssueRecord) &&
        Objects.equals(this.productionIssueStatus, initiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession.productionIssueStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialGatewayServiceSessionStatistics, financialGatewayServiceSessionReportType, financialGatewayServiceSessionDate, financialGatewayServiceSessionIssueRecord, productionIssueDiagnosis, productionIssueResolutionTask, productionIssueRecord, productionIssueStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession {\n");
    
    sb.append("    financialGatewayServiceSessionStatistics: ").append(toIndentedString(financialGatewayServiceSessionStatistics)).append("\n");
    sb.append("    financialGatewayServiceSessionReportType: ").append(toIndentedString(financialGatewayServiceSessionReportType)).append("\n");
    sb.append("    financialGatewayServiceSessionDate: ").append(toIndentedString(financialGatewayServiceSessionDate)).append("\n");
    sb.append("    financialGatewayServiceSessionIssueRecord: ").append(toIndentedString(financialGatewayServiceSessionIssueRecord)).append("\n");
    sb.append("    productionIssueDiagnosis: ").append(toIndentedString(productionIssueDiagnosis)).append("\n");
    sb.append("    productionIssueResolutionTask: ").append(toIndentedString(productionIssueResolutionTask)).append("\n");
    sb.append("    productionIssueRecord: ").append(toIndentedString(productionIssueRecord)).append("\n");
    sb.append("    productionIssueStatus: ").append(toIndentedString(productionIssueStatus)).append("\n");
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

