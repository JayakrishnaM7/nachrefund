package com.ibm.org.model.financialgateway;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.financialgateway.UpdateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateFinancialGatewayOperatingSessionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:23.495Z[GMT]")

public class UpdateFinancialGatewayOperatingSessionResponse   {
  @JsonProperty("FinancialGatewayOperatingSession")
  private UpdateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession financialGatewayOperatingSession;

  public UpdateFinancialGatewayOperatingSessionResponse financialGatewayOperatingSession(UpdateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession financialGatewayOperatingSession) {
    this.financialGatewayOperatingSession = financialGatewayOperatingSession;
    return this;
  }

  /**
   * Get financialGatewayOperatingSession
   * @return financialGatewayOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession getFinancialGatewayOperatingSession() {
    return financialGatewayOperatingSession;
  }

  public void setFinancialGatewayOperatingSession(UpdateFinancialGatewayOperatingSessionRequestFinancialGatewayOperatingSession financialGatewayOperatingSession) {
    this.financialGatewayOperatingSession = financialGatewayOperatingSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFinancialGatewayOperatingSessionResponse updateFinancialGatewayOperatingSessionResponse = (UpdateFinancialGatewayOperatingSessionResponse) o;
    return Objects.equals(this.financialGatewayOperatingSession, updateFinancialGatewayOperatingSessionResponse.financialGatewayOperatingSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialGatewayOperatingSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFinancialGatewayOperatingSessionResponse {\n");
    
    sb.append("    financialGatewayOperatingSession: ").append(toIndentedString(financialGatewayOperatingSession)).append("\n");
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

