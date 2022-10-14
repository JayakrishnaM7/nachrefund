package com.ibm.org.model.correspondentbankoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveReconciliationResponseReconciliation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:01.907Z[GMT]")

public class RetrieveReconciliationResponseReconciliation   {
  @JsonProperty("CorrespondentBankReconciliationTaskReference")
  private Object correspondentBankReconciliationTaskReference;

  @JsonProperty("CorrespondentBankReconciliationTaskWorkProducts")
  private String correspondentBankReconciliationTaskWorkProducts;

  @JsonProperty("CorrespondentBankReconciliationTaskResult")
  private String correspondentBankReconciliationTaskResult;

  public RetrieveReconciliationResponseReconciliation correspondentBankReconciliationTaskReference(Object correspondentBankReconciliationTaskReference) {
    this.correspondentBankReconciliationTaskReference = correspondentBankReconciliationTaskReference;
    return this;
  }

  /**
   * Get correspondentBankReconciliationTaskReference
   * @return correspondentBankReconciliationTaskReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCorrespondentBankReconciliationTaskReference() {
    return correspondentBankReconciliationTaskReference;
  }

  public void setCorrespondentBankReconciliationTaskReference(Object correspondentBankReconciliationTaskReference) {
    this.correspondentBankReconciliationTaskReference = correspondentBankReconciliationTaskReference;
  }

  public RetrieveReconciliationResponseReconciliation correspondentBankReconciliationTaskWorkProducts(String correspondentBankReconciliationTaskWorkProducts) {
    this.correspondentBankReconciliationTaskWorkProducts = correspondentBankReconciliationTaskWorkProducts;
    return this;
  }

  /**
   * Get correspondentBankReconciliationTaskWorkProducts
   * @return correspondentBankReconciliationTaskWorkProducts
  */
  @ApiModelProperty(value = "")


  public String getCorrespondentBankReconciliationTaskWorkProducts() {
    return correspondentBankReconciliationTaskWorkProducts;
  }

  public void setCorrespondentBankReconciliationTaskWorkProducts(String correspondentBankReconciliationTaskWorkProducts) {
    this.correspondentBankReconciliationTaskWorkProducts = correspondentBankReconciliationTaskWorkProducts;
  }

  public RetrieveReconciliationResponseReconciliation correspondentBankReconciliationTaskResult(String correspondentBankReconciliationTaskResult) {
    this.correspondentBankReconciliationTaskResult = correspondentBankReconciliationTaskResult;
    return this;
  }

  /**
   * Get correspondentBankReconciliationTaskResult
   * @return correspondentBankReconciliationTaskResult
  */
  @ApiModelProperty(value = "")


  public String getCorrespondentBankReconciliationTaskResult() {
    return correspondentBankReconciliationTaskResult;
  }

  public void setCorrespondentBankReconciliationTaskResult(String correspondentBankReconciliationTaskResult) {
    this.correspondentBankReconciliationTaskResult = correspondentBankReconciliationTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveReconciliationResponseReconciliation retrieveReconciliationResponseReconciliation = (RetrieveReconciliationResponseReconciliation) o;
    return Objects.equals(this.correspondentBankReconciliationTaskReference, retrieveReconciliationResponseReconciliation.correspondentBankReconciliationTaskReference) &&
        Objects.equals(this.correspondentBankReconciliationTaskWorkProducts, retrieveReconciliationResponseReconciliation.correspondentBankReconciliationTaskWorkProducts) &&
        Objects.equals(this.correspondentBankReconciliationTaskResult, retrieveReconciliationResponseReconciliation.correspondentBankReconciliationTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondentBankReconciliationTaskReference, correspondentBankReconciliationTaskWorkProducts, correspondentBankReconciliationTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveReconciliationResponseReconciliation {\n");
    
    sb.append("    correspondentBankReconciliationTaskReference: ").append(toIndentedString(correspondentBankReconciliationTaskReference)).append("\n");
    sb.append("    correspondentBankReconciliationTaskWorkProducts: ").append(toIndentedString(correspondentBankReconciliationTaskWorkProducts)).append("\n");
    sb.append("    correspondentBankReconciliationTaskResult: ").append(toIndentedString(correspondentBankReconciliationTaskResult)).append("\n");
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

