package com.ibm.org.model.positionkeeping;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.positionkeeping.UpdateFinancialPositionLogRequestFinancialPositionLog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateFinancialPositionLogResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:34.102Z[GMT]")

public class UpdateFinancialPositionLogResponse   {
  @JsonProperty("FinancialPositionLog")
  private UpdateFinancialPositionLogRequestFinancialPositionLog financialPositionLog;

  public UpdateFinancialPositionLogResponse financialPositionLog(UpdateFinancialPositionLogRequestFinancialPositionLog financialPositionLog) {
    this.financialPositionLog = financialPositionLog;
    return this;
  }

  /**
   * Get financialPositionLog
   * @return financialPositionLog
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateFinancialPositionLogRequestFinancialPositionLog getFinancialPositionLog() {
    return financialPositionLog;
  }

  public void setFinancialPositionLog(UpdateFinancialPositionLogRequestFinancialPositionLog financialPositionLog) {
    this.financialPositionLog = financialPositionLog;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFinancialPositionLogResponse updateFinancialPositionLogResponse = (UpdateFinancialPositionLogResponse) o;
    return Objects.equals(this.financialPositionLog, updateFinancialPositionLogResponse.financialPositionLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialPositionLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFinancialPositionLogResponse {\n");
    
    sb.append("    financialPositionLog: ").append(toIndentedString(financialPositionLog)).append("\n");
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

