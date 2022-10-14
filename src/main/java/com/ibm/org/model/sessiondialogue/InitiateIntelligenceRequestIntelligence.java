package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateIntelligenceRequestIntelligence
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class InitiateIntelligenceRequestIntelligence   {
  @JsonProperty("BQIntelligenceRecord")
  private String bqIntelligenceRecord;

  @JsonProperty("CustomerInsightType")
  private String customerInsightType;

  public InitiateIntelligenceRequestIntelligence bqIntelligenceRecord(String bqIntelligenceRecord) {
    this.bqIntelligenceRecord = bqIntelligenceRecord;
    return this;
  }

  /**
   * Get bqIntelligenceRecord
   * @return bqIntelligenceRecord
  */
  @ApiModelProperty(value = "")


  public String getBqIntelligenceRecord() {
    return bqIntelligenceRecord;
  }

  public void setBqIntelligenceRecord(String bqIntelligenceRecord) {
    this.bqIntelligenceRecord = bqIntelligenceRecord;
  }

  public InitiateIntelligenceRequestIntelligence customerInsightType(String customerInsightType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateIntelligenceRequestIntelligence initiateIntelligenceRequestIntelligence = (InitiateIntelligenceRequestIntelligence) o;
    return Objects.equals(this.bqIntelligenceRecord, initiateIntelligenceRequestIntelligence.bqIntelligenceRecord) &&
        Objects.equals(this.customerInsightType, initiateIntelligenceRequestIntelligence.customerInsightType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bqIntelligenceRecord, customerInsightType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateIntelligenceRequestIntelligence {\n");
    
    sb.append("    bqIntelligenceRecord: ").append(toIndentedString(bqIntelligenceRecord)).append("\n");
    sb.append("    customerInsightType: ").append(toIndentedString(customerInsightType)).append("\n");
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

