package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateQueryRequestQuery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class InitiateQueryRequestQuery   {
  @JsonProperty("QueryType")
  private String queryType;

  public InitiateQueryRequestQuery queryType(String queryType) {
    this.queryType = queryType;
    return this;
  }

  /**
   * Get queryType
   * @return queryType
  */
  @ApiModelProperty(value = "")


  public String getQueryType() {
    return queryType;
  }

  public void setQueryType(String queryType) {
    this.queryType = queryType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateQueryRequestQuery initiateQueryRequestQuery = (InitiateQueryRequestQuery) o;
    return Objects.equals(this.queryType, initiateQueryRequestQuery.queryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateQueryRequestQuery {\n");
    
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
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

