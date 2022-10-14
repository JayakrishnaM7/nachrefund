package com.ibm.org.model.financialgateway;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateInboundResponseFinancialGatewayOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:23.495Z[GMT]")

public class InitiateInboundResponseFinancialGatewayOperatingSession   {
  @JsonProperty("FinancialGatewayServiceSessionStatistics")
  private String financialGatewayServiceSessionStatistics;

  public InitiateInboundResponseFinancialGatewayOperatingSession financialGatewayServiceSessionStatistics(String financialGatewayServiceSessionStatistics) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateInboundResponseFinancialGatewayOperatingSession initiateInboundResponseFinancialGatewayOperatingSession = (InitiateInboundResponseFinancialGatewayOperatingSession) o;
    return Objects.equals(this.financialGatewayServiceSessionStatistics, initiateInboundResponseFinancialGatewayOperatingSession.financialGatewayServiceSessionStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialGatewayServiceSessionStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateInboundResponseFinancialGatewayOperatingSession {\n");
    
    sb.append("    financialGatewayServiceSessionStatistics: ").append(toIndentedString(financialGatewayServiceSessionStatistics)).append("\n");
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

