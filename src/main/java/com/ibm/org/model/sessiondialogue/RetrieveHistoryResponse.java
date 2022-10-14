package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.sessiondialogue.UpdateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure;
import com.ibm.org.model.sessiondialogue.UpdateHistoryRequestHistory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveHistoryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class RetrieveHistoryResponse   {
  @JsonProperty("CustomerContactSessionProcedure")
  private UpdateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure customerContactSessionProcedure;

  @JsonProperty("History")
  private UpdateHistoryRequestHistory history;

  public RetrieveHistoryResponse customerContactSessionProcedure(UpdateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure customerContactSessionProcedure) {
    this.customerContactSessionProcedure = customerContactSessionProcedure;
    return this;
  }

  /**
   * Get customerContactSessionProcedure
   * @return customerContactSessionProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure getCustomerContactSessionProcedure() {
    return customerContactSessionProcedure;
  }

  public void setCustomerContactSessionProcedure(UpdateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure customerContactSessionProcedure) {
    this.customerContactSessionProcedure = customerContactSessionProcedure;
  }

  public RetrieveHistoryResponse history(UpdateHistoryRequestHistory history) {
    this.history = history;
    return this;
  }

  /**
   * Get history
   * @return history
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateHistoryRequestHistory getHistory() {
    return history;
  }

  public void setHistory(UpdateHistoryRequestHistory history) {
    this.history = history;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveHistoryResponse retrieveHistoryResponse = (RetrieveHistoryResponse) o;
    return Objects.equals(this.customerContactSessionProcedure, retrieveHistoryResponse.customerContactSessionProcedure) &&
        Objects.equals(this.history, retrieveHistoryResponse.history);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactSessionProcedure, history);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveHistoryResponse {\n");
    
    sb.append("    customerContactSessionProcedure: ").append(toIndentedString(customerContactSessionProcedure)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
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

