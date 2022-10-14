package com.ibm.org.model.financialgateway;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.financialgateway.InitiateInboundResponseFinancialGatewayOperatingSession;
import com.ibm.org.model.financialgateway.InitiateOutboundResponseOutbound;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateOutboundResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:23.495Z[GMT]")

public class InitiateOutboundResponse   {
  @JsonProperty("FinancialGatewayOperatingSession")
  private InitiateInboundResponseFinancialGatewayOperatingSession financialGatewayOperatingSession;

  @JsonProperty("Outbound")
  private InitiateOutboundResponseOutbound outbound;

  public InitiateOutboundResponse financialGatewayOperatingSession(InitiateInboundResponseFinancialGatewayOperatingSession financialGatewayOperatingSession) {
    this.financialGatewayOperatingSession = financialGatewayOperatingSession;
    return this;
  }

  /**
   * Get financialGatewayOperatingSession
   * @return financialGatewayOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateInboundResponseFinancialGatewayOperatingSession getFinancialGatewayOperatingSession() {
    return financialGatewayOperatingSession;
  }

  public void setFinancialGatewayOperatingSession(InitiateInboundResponseFinancialGatewayOperatingSession financialGatewayOperatingSession) {
    this.financialGatewayOperatingSession = financialGatewayOperatingSession;
  }

  public InitiateOutboundResponse outbound(InitiateOutboundResponseOutbound outbound) {
    this.outbound = outbound;
    return this;
  }

  /**
   * Get outbound
   * @return outbound
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOutboundResponseOutbound getOutbound() {
    return outbound;
  }

  public void setOutbound(InitiateOutboundResponseOutbound outbound) {
    this.outbound = outbound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateOutboundResponse initiateOutboundResponse = (InitiateOutboundResponse) o;
    return Objects.equals(this.financialGatewayOperatingSession, initiateOutboundResponse.financialGatewayOperatingSession) &&
        Objects.equals(this.outbound, initiateOutboundResponse.outbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialGatewayOperatingSession, outbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateOutboundResponse {\n");
    
    sb.append("    financialGatewayOperatingSession: ").append(toIndentedString(financialGatewayOperatingSession)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
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

