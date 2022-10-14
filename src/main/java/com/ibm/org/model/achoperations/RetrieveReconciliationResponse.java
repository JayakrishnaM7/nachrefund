package com.ibm.org.model.achoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.achoperations.InitiateClearingandSettlementRequestClearingandSettlement;
import com.ibm.org.model.achoperations.InitiateOutboundACHResponseOutboundACH;
import com.ibm.org.model.achoperations.UpdateInboundACHRequestInboundACH;
import com.ibm.org.model.achoperations.UpdateReconciliationRequestReconciliation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveReconciliationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:17.996Z[GMT]")

public class RetrieveReconciliationResponse   {
  @JsonProperty("InboundACH")
  private UpdateInboundACHRequestInboundACH inboundACH;

  @JsonProperty("OutboundACH")
  private InitiateOutboundACHResponseOutboundACH outboundACH;

  @JsonProperty("ClearingandSettlement")
  private InitiateClearingandSettlementRequestClearingandSettlement clearingandSettlement;

  @JsonProperty("Reconciliation")
  private UpdateReconciliationRequestReconciliation reconciliation;

  public RetrieveReconciliationResponse inboundACH(UpdateInboundACHRequestInboundACH inboundACH) {
    this.inboundACH = inboundACH;
    return this;
  }

  /**
   * Get inboundACH
   * @return inboundACH
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateInboundACHRequestInboundACH getInboundACH() {
    return inboundACH;
  }

  public void setInboundACH(UpdateInboundACHRequestInboundACH inboundACH) {
    this.inboundACH = inboundACH;
  }

  public RetrieveReconciliationResponse outboundACH(InitiateOutboundACHResponseOutboundACH outboundACH) {
    this.outboundACH = outboundACH;
    return this;
  }

  /**
   * Get outboundACH
   * @return outboundACH
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOutboundACHResponseOutboundACH getOutboundACH() {
    return outboundACH;
  }

  public void setOutboundACH(InitiateOutboundACHResponseOutboundACH outboundACH) {
    this.outboundACH = outboundACH;
  }

  public RetrieveReconciliationResponse clearingandSettlement(InitiateClearingandSettlementRequestClearingandSettlement clearingandSettlement) {
    this.clearingandSettlement = clearingandSettlement;
    return this;
  }

  /**
   * Get clearingandSettlement
   * @return clearingandSettlement
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateClearingandSettlementRequestClearingandSettlement getClearingandSettlement() {
    return clearingandSettlement;
  }

  public void setClearingandSettlement(InitiateClearingandSettlementRequestClearingandSettlement clearingandSettlement) {
    this.clearingandSettlement = clearingandSettlement;
  }

  public RetrieveReconciliationResponse reconciliation(UpdateReconciliationRequestReconciliation reconciliation) {
    this.reconciliation = reconciliation;
    return this;
  }

  /**
   * Get reconciliation
   * @return reconciliation
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateReconciliationRequestReconciliation getReconciliation() {
    return reconciliation;
  }

  public void setReconciliation(UpdateReconciliationRequestReconciliation reconciliation) {
    this.reconciliation = reconciliation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveReconciliationResponse retrieveReconciliationResponse = (RetrieveReconciliationResponse) o;
    return Objects.equals(this.inboundACH, retrieveReconciliationResponse.inboundACH) &&
        Objects.equals(this.outboundACH, retrieveReconciliationResponse.outboundACH) &&
        Objects.equals(this.clearingandSettlement, retrieveReconciliationResponse.clearingandSettlement) &&
        Objects.equals(this.reconciliation, retrieveReconciliationResponse.reconciliation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundACH, outboundACH, clearingandSettlement, reconciliation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveReconciliationResponse {\n");
    
    sb.append("    inboundACH: ").append(toIndentedString(inboundACH)).append("\n");
    sb.append("    outboundACH: ").append(toIndentedString(outboundACH)).append("\n");
    sb.append("    clearingandSettlement: ").append(toIndentedString(clearingandSettlement)).append("\n");
    sb.append("    reconciliation: ").append(toIndentedString(reconciliation)).append("\n");
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

