package com.ibm.org.model.achoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateReconciliationRequestReconciliation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:17.996Z[GMT]")

public class UpdateReconciliationRequestReconciliation   {
  @JsonProperty("ACHReconciliationTaskResult")
  private String acHReconciliationTaskResult;

  public UpdateReconciliationRequestReconciliation acHReconciliationTaskResult(String acHReconciliationTaskResult) {
    this.acHReconciliationTaskResult = acHReconciliationTaskResult;
    return this;
  }

  /**
   * Get acHReconciliationTaskResult
   * @return acHReconciliationTaskResult
  */
  @ApiModelProperty(value = "")


  public String getAcHReconciliationTaskResult() {
    return acHReconciliationTaskResult;
  }

  public void setAcHReconciliationTaskResult(String acHReconciliationTaskResult) {
    this.acHReconciliationTaskResult = acHReconciliationTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateReconciliationRequestReconciliation updateReconciliationRequestReconciliation = (UpdateReconciliationRequestReconciliation) o;
    return Objects.equals(this.acHReconciliationTaskResult, updateReconciliationRequestReconciliation.acHReconciliationTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acHReconciliationTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateReconciliationRequestReconciliation {\n");
    
    sb.append("    acHReconciliationTaskResult: ").append(toIndentedString(acHReconciliationTaskResult)).append("\n");
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

