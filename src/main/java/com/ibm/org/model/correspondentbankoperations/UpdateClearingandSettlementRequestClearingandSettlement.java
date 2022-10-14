package com.ibm.org.model.correspondentbankoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateClearingandSettlementRequestClearingandSettlement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:01.907Z[GMT]")

public class UpdateClearingandSettlementRequestClearingandSettlement   {
  @JsonProperty("ClearingTransaction")
  private String clearingTransaction;

  @JsonProperty("SettlementTransaction")
  private String settlementTransaction;

  public UpdateClearingandSettlementRequestClearingandSettlement clearingTransaction(String clearingTransaction) {
    this.clearingTransaction = clearingTransaction;
    return this;
  }

  /**
   * Get clearingTransaction
   * @return clearingTransaction
  */
  @ApiModelProperty(value = "")


  public String getClearingTransaction() {
    return clearingTransaction;
  }

  public void setClearingTransaction(String clearingTransaction) {
    this.clearingTransaction = clearingTransaction;
  }

  public UpdateClearingandSettlementRequestClearingandSettlement settlementTransaction(String settlementTransaction) {
    this.settlementTransaction = settlementTransaction;
    return this;
  }

  /**
   * Get settlementTransaction
   * @return settlementTransaction
  */
  @ApiModelProperty(value = "")


  public String getSettlementTransaction() {
    return settlementTransaction;
  }

  public void setSettlementTransaction(String settlementTransaction) {
    this.settlementTransaction = settlementTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClearingandSettlementRequestClearingandSettlement updateClearingandSettlementRequestClearingandSettlement = (UpdateClearingandSettlementRequestClearingandSettlement) o;
    return Objects.equals(this.clearingTransaction, updateClearingandSettlementRequestClearingandSettlement.clearingTransaction) &&
        Objects.equals(this.settlementTransaction, updateClearingandSettlementRequestClearingandSettlement.settlementTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearingTransaction, settlementTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateClearingandSettlementRequestClearingandSettlement {\n");
    
    sb.append("    clearingTransaction: ").append(toIndentedString(clearingTransaction)).append("\n");
    sb.append("    settlementTransaction: ").append(toIndentedString(settlementTransaction)).append("\n");
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

