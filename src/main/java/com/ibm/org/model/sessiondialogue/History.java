package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * History
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class History   {
  @JsonProperty("HistoryTaskResult")
  private String historyTaskResult;

  public History historyTaskResult(String historyTaskResult) {
    this.historyTaskResult = historyTaskResult;
    return this;
  }

  /**
   * Get historyTaskResult
   * @return historyTaskResult
  */
  @ApiModelProperty(value = "")


  public String getHistoryTaskResult() {
    return historyTaskResult;
  }

  public void setHistoryTaskResult(String historyTaskResult) {
    this.historyTaskResult = historyTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    History history = (History) o;
    return Objects.equals(this.historyTaskResult, history.historyTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historyTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class History {\n");
    
    sb.append("    historyTaskResult: ").append(toIndentedString(historyTaskResult)).append("\n");
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

