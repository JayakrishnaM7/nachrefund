package com.ibm.org.model.financialgateway;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.financialgateway.InitiateInboundRequestFinancialGatewayOperatingSession;
import com.ibm.org.model.financialgateway.InitiateInboundRequestInbound;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveInboundResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:23.495Z[GMT]")

public class RetrieveInboundResponse   {
  @JsonProperty("FinancialGatewayOperatingSession")
  private InitiateInboundRequestFinancialGatewayOperatingSession financialGatewayOperatingSession;

  @JsonProperty("Inbound")
  private InitiateInboundRequestInbound inbound;

  public RetrieveInboundResponse financialGatewayOperatingSession(InitiateInboundRequestFinancialGatewayOperatingSession financialGatewayOperatingSession) {
    this.financialGatewayOperatingSession = financialGatewayOperatingSession;
    return this;
  }

  /**
   * Get financialGatewayOperatingSession
   * @return financialGatewayOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateInboundRequestFinancialGatewayOperatingSession getFinancialGatewayOperatingSession() {
    return financialGatewayOperatingSession;
  }

  public void setFinancialGatewayOperatingSession(InitiateInboundRequestFinancialGatewayOperatingSession financialGatewayOperatingSession) {
    this.financialGatewayOperatingSession = financialGatewayOperatingSession;
  }

  public RetrieveInboundResponse inbound(InitiateInboundRequestInbound inbound) {
    this.inbound = inbound;
    return this;
  }

  /**
   * Get inbound
   * @return inbound
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateInboundRequestInbound getInbound() {
    return inbound;
  }

  public void setInbound(InitiateInboundRequestInbound inbound) {
    this.inbound = inbound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveInboundResponse retrieveInboundResponse = (RetrieveInboundResponse) o;
    return Objects.equals(this.financialGatewayOperatingSession, retrieveInboundResponse.financialGatewayOperatingSession) &&
        Objects.equals(this.inbound, retrieveInboundResponse.inbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialGatewayOperatingSession, inbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveInboundResponse {\n");
    
    sb.append("    financialGatewayOperatingSession: ").append(toIndentedString(financialGatewayOperatingSession)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
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

