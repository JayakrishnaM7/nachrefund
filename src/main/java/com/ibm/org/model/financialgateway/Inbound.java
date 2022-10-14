package com.ibm.org.model.financialgateway;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Inbound
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:23.495Z[GMT]")

public class Inbound   {
  @JsonProperty("FinancialGatewayInboundMessageType")
  private String financialGatewayInboundMessageType;

  @JsonProperty("FinancialGatewayInboundMessageRecord")
  private String financialGatewayInboundMessageRecord;

  @JsonProperty("FinancialGatewayInboundMessageReceiver")
  private String financialGatewayInboundMessageReceiver;

  @JsonProperty("FinancialGatewayInboundMessageStatus")
  private String financialGatewayInboundMessageStatus;

  public Inbound financialGatewayInboundMessageType(String financialGatewayInboundMessageType) {
    this.financialGatewayInboundMessageType = financialGatewayInboundMessageType;
    return this;
  }

  /**
   * Get financialGatewayInboundMessageType
   * @return financialGatewayInboundMessageType
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayInboundMessageType() {
    return financialGatewayInboundMessageType;
  }

  public void setFinancialGatewayInboundMessageType(String financialGatewayInboundMessageType) {
    this.financialGatewayInboundMessageType = financialGatewayInboundMessageType;
  }

  public Inbound financialGatewayInboundMessageRecord(String financialGatewayInboundMessageRecord) {
    this.financialGatewayInboundMessageRecord = financialGatewayInboundMessageRecord;
    return this;
  }

  /**
   * Get financialGatewayInboundMessageRecord
   * @return financialGatewayInboundMessageRecord
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayInboundMessageRecord() {
    return financialGatewayInboundMessageRecord;
  }

  public void setFinancialGatewayInboundMessageRecord(String financialGatewayInboundMessageRecord) {
    this.financialGatewayInboundMessageRecord = financialGatewayInboundMessageRecord;
  }

  public Inbound financialGatewayInboundMessageReceiver(String financialGatewayInboundMessageReceiver) {
    this.financialGatewayInboundMessageReceiver = financialGatewayInboundMessageReceiver;
    return this;
  }

  /**
   * Get financialGatewayInboundMessageReceiver
   * @return financialGatewayInboundMessageReceiver
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayInboundMessageReceiver() {
    return financialGatewayInboundMessageReceiver;
  }

  public void setFinancialGatewayInboundMessageReceiver(String financialGatewayInboundMessageReceiver) {
    this.financialGatewayInboundMessageReceiver = financialGatewayInboundMessageReceiver;
  }

  public Inbound financialGatewayInboundMessageStatus(String financialGatewayInboundMessageStatus) {
    this.financialGatewayInboundMessageStatus = financialGatewayInboundMessageStatus;
    return this;
  }

  /**
   * Get financialGatewayInboundMessageStatus
   * @return financialGatewayInboundMessageStatus
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayInboundMessageStatus() {
    return financialGatewayInboundMessageStatus;
  }

  public void setFinancialGatewayInboundMessageStatus(String financialGatewayInboundMessageStatus) {
    this.financialGatewayInboundMessageStatus = financialGatewayInboundMessageStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inbound inbound = (Inbound) o;
    return Objects.equals(this.financialGatewayInboundMessageType, inbound.financialGatewayInboundMessageType) &&
        Objects.equals(this.financialGatewayInboundMessageRecord, inbound.financialGatewayInboundMessageRecord) &&
        Objects.equals(this.financialGatewayInboundMessageReceiver, inbound.financialGatewayInboundMessageReceiver) &&
        Objects.equals(this.financialGatewayInboundMessageStatus, inbound.financialGatewayInboundMessageStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialGatewayInboundMessageType, financialGatewayInboundMessageRecord, financialGatewayInboundMessageReceiver, financialGatewayInboundMessageStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inbound {\n");
    
    sb.append("    financialGatewayInboundMessageType: ").append(toIndentedString(financialGatewayInboundMessageType)).append("\n");
    sb.append("    financialGatewayInboundMessageRecord: ").append(toIndentedString(financialGatewayInboundMessageRecord)).append("\n");
    sb.append("    financialGatewayInboundMessageReceiver: ").append(toIndentedString(financialGatewayInboundMessageReceiver)).append("\n");
    sb.append("    financialGatewayInboundMessageStatus: ").append(toIndentedString(financialGatewayInboundMessageStatus)).append("\n");
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

