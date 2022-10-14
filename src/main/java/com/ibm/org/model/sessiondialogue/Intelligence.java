package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Intelligence
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class Intelligence   {
  @JsonProperty("IntelligenceRecord")
  private String intelligenceRecord;

  @JsonProperty("CustomerInsightType")
  private String customerInsightType;

  @JsonProperty("CustomerInsight")
  private String customerInsight;

  @JsonProperty("InsightTaskResult")
  private String insightTaskResult;

  public Intelligence intelligenceRecord(String intelligenceRecord) {
    this.intelligenceRecord = intelligenceRecord;
    return this;
  }

  /**
   * Get intelligenceRecord
   * @return intelligenceRecord
  */
  @ApiModelProperty(value = "")


  public String getIntelligenceRecord() {
    return intelligenceRecord;
  }

  public void setIntelligenceRecord(String intelligenceRecord) {
    this.intelligenceRecord = intelligenceRecord;
  }

  public Intelligence customerInsightType(String customerInsightType) {
    this.customerInsightType = customerInsightType;
    return this;
  }

  /**
   * Get customerInsightType
   * @return customerInsightType
  */
  @ApiModelProperty(value = "")


  public String getCustomerInsightType() {
    return customerInsightType;
  }

  public void setCustomerInsightType(String customerInsightType) {
    this.customerInsightType = customerInsightType;
  }

  public Intelligence customerInsight(String customerInsight) {
    this.customerInsight = customerInsight;
    return this;
  }

  /**
   * Get customerInsight
   * @return customerInsight
  */
  @ApiModelProperty(value = "")


  public String getCustomerInsight() {
    return customerInsight;
  }

  public void setCustomerInsight(String customerInsight) {
    this.customerInsight = customerInsight;
  }

  public Intelligence insightTaskResult(String insightTaskResult) {
    this.insightTaskResult = insightTaskResult;
    return this;
  }

  /**
   * Get insightTaskResult
   * @return insightTaskResult
  */
  @ApiModelProperty(value = "")


  public String getInsightTaskResult() {
    return insightTaskResult;
  }

  public void setInsightTaskResult(String insightTaskResult) {
    this.insightTaskResult = insightTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intelligence intelligence = (Intelligence) o;
    return Objects.equals(this.intelligenceRecord, intelligence.intelligenceRecord) &&
        Objects.equals(this.customerInsightType, intelligence.customerInsightType) &&
        Objects.equals(this.customerInsight, intelligence.customerInsight) &&
        Objects.equals(this.insightTaskResult, intelligence.insightTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intelligenceRecord, customerInsightType, customerInsight, insightTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intelligence {\n");
    
    sb.append("    intelligenceRecord: ").append(toIndentedString(intelligenceRecord)).append("\n");
    sb.append("    customerInsightType: ").append(toIndentedString(customerInsightType)).append("\n");
    sb.append("    customerInsight: ").append(toIndentedString(customerInsight)).append("\n");
    sb.append("    insightTaskResult: ").append(toIndentedString(insightTaskResult)).append("\n");
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

