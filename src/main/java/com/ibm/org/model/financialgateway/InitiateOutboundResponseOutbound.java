package com.ibm.org.model.financialgateway;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateOutboundResponseOutbound
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:23.495Z[GMT]")

public class InitiateOutboundResponseOutbound   {
  @JsonProperty("FinancialGatewayOutboundMessageStatus")
  private String financialGatewayOutboundMessageStatus;

  public InitiateOutboundResponseOutbound financialGatewayOutboundMessageStatus(String financialGatewayOutboundMessageStatus) {
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
    InitiateOutboundResponseOutbound initiateOutboundResponseOutbound = (InitiateOutboundResponseOutbound) o;
    return Objects.equals(this.financialGatewayOutboundMessageStatus, initiateOutboundResponseOutbound.financialGatewayOutboundMessageStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialGatewayOutboundMessageStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateOutboundResponseOutbound {\n");
    
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

