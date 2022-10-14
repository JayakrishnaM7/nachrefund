package com.ibm.org.model.correspondentbankoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.correspondentbankoperations.UpdateClearingandSettlementRequestClearingandSettlement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestClearingandSettlementRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:01.907Z[GMT]")

public class RequestClearingandSettlementRequest   {
  @JsonProperty("ClearingandSettlement")
  private UpdateClearingandSettlementRequestClearingandSettlement clearingandSettlement;

  public RequestClearingandSettlementRequest clearingandSettlement(UpdateClearingandSettlementRequestClearingandSettlement clearingandSettlement) {
    this.clearingandSettlement = clearingandSettlement;
    return this;
  }

  /**
   * Get clearingandSettlement
   * @return clearingandSettlement
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateClearingandSettlementRequestClearingandSettlement getClearingandSettlement() {
    return clearingandSettlement;
  }

  public void setClearingandSettlement(UpdateClearingandSettlementRequestClearingandSettlement clearingandSettlement) {
    this.clearingandSettlement = clearingandSettlement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestClearingandSettlementRequest requestClearingandSettlementRequest = (RequestClearingandSettlementRequest) o;
    return Objects.equals(this.clearingandSettlement, requestClearingandSettlementRequest.clearingandSettlement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearingandSettlement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestClearingandSettlementRequest {\n");
    
    sb.append("    clearingandSettlement: ").append(toIndentedString(clearingandSettlement)).append("\n");
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

