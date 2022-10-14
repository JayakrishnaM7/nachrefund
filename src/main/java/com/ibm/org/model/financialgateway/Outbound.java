package com.ibm.org.model.financialgateway;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Outbound
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:23.495Z[GMT]")

public class Outbound   {
  @JsonProperty("FinancialGatewayOutboundMessageType")
  private String financialGatewayOutboundMessageType;

  @JsonProperty("FinancialGatewayOutboundMessageRecord")
  private String financialGatewayOutboundMessageRecord;

  @JsonProperty("FinancialGatewayOutboundMessageSender")
  private String financialGatewayOutboundMessageSender;

  @JsonProperty("FinancialGatewayOutboundMessageReceiver")
  private String financialGatewayOutboundMessageReceiver;

  @JsonProperty("FinancialGatewayOutboundMessageStatus")
  private String financialGatewayOutboundMessageStatus;

  public Outbound financialGatewayOutboundMessageType(String financialGatewayOutboundMessageType) {
    this.financialGatewayOutboundMessageType = financialGatewayOutboundMessageType;
    return this;
  }

  /**
   * Get financialGatewayOutboundMessageType
   * @return financialGatewayOutboundMessageType
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayOutboundMessageType() {
    return financialGatewayOutboundMessageType;
  }

  public void setFinancialGatewayOutboundMessageType(String financialGatewayOutboundMessageType) {
    this.financialGatewayOutboundMessageType = financialGatewayOutboundMessageType;
  }

  public Outbound financialGatewayOutboundMessageRecord(String financialGatewayOutboundMessageRecord) {
    this.financialGatewayOutboundMessageRecord = financialGatewayOutboundMessageRecord;
    return this;
  }

  /**
   * Get financialGatewayOutboundMessageRecord
   * @return financialGatewayOutboundMessageRecord
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayOutboundMessageRecord() {
    return financialGatewayOutboundMessageRecord;
  }

  public void setFinancialGatewayOutboundMessageRecord(String financialGatewayOutboundMessageRecord) {
    this.financialGatewayOutboundMessageRecord = financialGatewayOutboundMessageRecord;
  }

  public Outbound financialGatewayOutboundMessageSender(String financialGatewayOutboundMessageSender) {
    this.financialGatewayOutboundMessageSender = financialGatewayOutboundMessageSender;
    return this;
  }

  /**
   * Get financialGatewayOutboundMessageSender
   * @return financialGatewayOutboundMessageSender
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayOutboundMessageSender() {
    return financialGatewayOutboundMessageSender;
  }

  public void setFinancialGatewayOutboundMessageSender(String financialGatewayOutboundMessageSender) {
    this.financialGatewayOutboundMessageSender = financialGatewayOutboundMessageSender;
  }

  public Outbound financialGatewayOutboundMessageReceiver(String financialGatewayOutboundMessageReceiver) {
    this.financialGatewayOutboundMessageReceiver = financialGatewayOutboundMessageReceiver;
    return this;
  }

  /**
   * Get financialGatewayOutboundMessageReceiver
   * @return financialGatewayOutboundMessageReceiver
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayOutboundMessageReceiver() {
    return financialGatewayOutboundMessageReceiver;
  }

  public void setFinancialGatewayOutboundMessageReceiver(String financialGatewayOutboundMessageReceiver) {
    this.financialGatewayOutboundMessageReceiver = financialGatewayOutboundMessageReceiver;
  }

  public Outbound financialGatewayOutboundMessageStatus(String financialGatewayOutboundMessageStatus) {
    this.financialGatewayOutboundMessageStatus = financialGatewayOutboundMessageStatus;
    return this;
  }

  /**
   * Get financialGatewayOutboundMessageStatus
   * @return financialGatewayOutboundMessageStatus
  */
  @ApiModelProperty(value = "")


  public String getFinancialGatewayOutboundMessageStatus() {
    return financialGatewayOutboundMessageStatus;
  }

  public void setFinancialGatewayOutboundMessageStatus(String financialGatewayOutboundMessageStatus) {
    this.financialGatewayOutboundMessageStatus = financialGatewayOutboundMessageStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outbound outbound = (Outbound) o;
    return Objects.equals(this.financialGatewayOutboundMessageType, outbound.financialGatewayOutboundMessageType) &&
        Objects.equals(this.financialGatewayOutboundMessageRecord, outbound.financialGatewayOutboundMessageRecord) &&
        Objects.equals(this.financialGatewayOutboundMessageSender, outbound.financialGatewayOutboundMessageSender) &&
        Objects.equals(this.financialGatewayOutboundMessageReceiver, outbound.financialGatewayOutboundMessageReceiver) &&
        Objects.equals(this.financialGatewayOutboundMessageStatus, outbound.financialGatewayOutboundMessageStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialGatewayOutboundMessageType, financialGatewayOutboundMessageRecord, financialGatewayOutboundMessageSender, financialGatewayOutboundMessageReceiver, financialGatewayOutboundMessageStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outbound {\n");
    
    sb.append("    financialGatewayOutboundMessageType: ").append(toIndentedString(financialGatewayOutboundMessageType)).append("\n");
    sb.append("    financialGatewayOutboundMessageRecord: ").append(toIndentedString(financialGatewayOutboundMessageRecord)).append("\n");
    sb.append("    financialGatewayOutboundMessageSender: ").append(toIndentedString(financialGatewayOutboundMessageSender)).append("\n");
    sb.append("    financialGatewayOutboundMessageReceiver: ").append(toIndentedString(financialGatewayOutboundMessageReceiver)).append("\n");
    sb.append("    financialGatewayOutboundMessageStatus: ").append(toIndentedString(financialGatewayOutboundMessageStatus)).append("\n");
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

