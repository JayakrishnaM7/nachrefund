package com.ibm.org.model.financialgateway;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:23.495Z[GMT]")

public class RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession   {
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

  @JsonProperty("ProductionIssueDiagnosis")
  private String productionIssueDiagnosis;

  @JsonProperty("ProductionIssueResolutionTask")
  private String productionIssueResolutionTask;

  @JsonProperty("ProductionIssueRecord")
  private String productionIssueRecord;

  @JsonProperty("ProductionIssueStatus")
  private String productionIssueStatus;

  public RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession financialGatewayServiceSessionIssueRecord(String financialGatewayServiceSessionIssueRecord) {
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

  public RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession employeeOrBusinessUnitReference(Object employeeOrBusinessUnitReference) {
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

  public RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession messageReference(Object messageReference) {
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

  public RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession productionIssueType(String productionIssueType) {
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

  public RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession productionIssueDescription(String productionIssueDescription) {
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

  public RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession productionIssueDiagnosis(String productionIssueDiagnosis) {
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

  public RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession productionIssueResolutionTask(String productionIssueResolutionTask) {
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

  public RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession productionIssueRecord(String productionIssueRecord) {
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

  public RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession productionIssueStatus(String productionIssueStatus) {
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
    RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession requestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession = (RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession) o;
    return Objects.equals(this.financialGatewayServiceSessionIssueRecord, requestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession.financialGatewayServiceSessionIssueRecord) &&
        Objects.equals(this.employeeOrBusinessUnitReference, requestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession.employeeOrBusinessUnitReference) &&
        Objects.equals(this.messageReference, requestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession.messageReference) &&
        Objects.equals(this.productionIssueType, requestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession.productionIssueType) &&
        Objects.equals(this.productionIssueDescription, requestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession.productionIssueDescription) &&
        Objects.equals(this.productionIssueDiagnosis, requestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession.productionIssueDiagnosis) &&
        Objects.equals(this.productionIssueResolutionTask, requestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession.productionIssueResolutionTask) &&
        Objects.equals(this.productionIssueRecord, requestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession.productionIssueRecord) &&
        Objects.equals(this.productionIssueStatus, requestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession.productionIssueStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialGatewayServiceSessionIssueRecord, employeeOrBusinessUnitReference, messageReference, productionIssueType, productionIssueDescription, productionIssueDiagnosis, productionIssueResolutionTask, productionIssueRecord, productionIssueStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestFinancialGatewayOperatingSessionResponseFinancialGatewayOperatingSession {\n");
    
    sb.append("    financialGatewayServiceSessionIssueRecord: ").append(toIndentedString(financialGatewayServiceSessionIssueRecord)).append("\n");
    sb.append("    employeeOrBusinessUnitReference: ").append(toIndentedString(employeeOrBusinessUnitReference)).append("\n");
    sb.append("    messageReference: ").append(toIndentedString(messageReference)).append("\n");
    sb.append("    productionIssueType: ").append(toIndentedString(productionIssueType)).append("\n");
    sb.append("    productionIssueDescription: ").append(toIndentedString(productionIssueDescription)).append("\n");
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

