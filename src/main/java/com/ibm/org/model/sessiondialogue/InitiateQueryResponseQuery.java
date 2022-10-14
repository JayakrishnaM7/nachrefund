package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateQueryResponseQuery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class InitiateQueryResponseQuery   {
  @JsonProperty("QueryTaskResult")
  private String queryTaskResult;

  public InitiateQueryResponseQuery queryTaskResult(String queryTaskResult) {
    this.queryTaskResult = queryTaskResult;
    return this;
  }

  /**
   * Get queryTaskResult
   * @return queryTaskResult
  */
  @ApiModelProperty(value = "")


  public String getQueryTaskResult() {
    return queryTaskResult;
  }

  public void setQueryTaskResult(String queryTaskResult) {
    this.queryTaskResult = queryTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateQueryResponseQuery initiateQueryResponseQuery = (InitiateQueryResponseQuery) o;
    return Objects.equals(this.queryTaskResult, initiateQueryResponseQuery.queryTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateQueryResponseQuery {\n");
    
    sb.append("    queryTaskResult: ").append(toIndentedString(queryTaskResult)).append("\n");
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

