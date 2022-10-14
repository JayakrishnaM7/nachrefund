package com.ibm.org.model.financialgateway;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateInboundResponseInbound
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:23.495Z[GMT]")

public class InitiateInboundResponseInbound   {
  @JsonProperty("FinancialGatewayInboundMessageStatus")
  private String financialGatewayInboundMessageStatus;

  public InitiateInboundResponseInbound financialGatewayInboundMessageStatus(String financialGatewayInboundMessageStatus) {
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
    InitiateInboundResponseInbound initiateInboundResponseInbound = (InitiateInboundResponseInbound) o;
    return Objects.equals(this.financialGatewayInboundMessageStatus, initiateInboundResponseInbound.financialGatewayInboundMessageStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialGatewayInboundMessageStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateInboundResponseInbound {\n");
    
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

