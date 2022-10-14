package com.ibm.org.model.positionkeeping;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FinancialTransactionCapture
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:34.102Z[GMT]")

public class FinancialTransactionCapture   {
  @JsonProperty("PostingDescription")
  private String postingDescription;

  @JsonProperty("PostingTransaction")
  private String postingTransaction;

  @JsonProperty("PostingValueDate")
  private String postingValueDate;

  public FinancialTransactionCapture postingDescription(String postingDescription) {
    this.postingDescription = postingDescription;
    return this;
  }

  /**
   * Get postingDescription
   * @return postingDescription
  */
  @ApiModelProperty(value = "")


  public String getPostingDescription() {
    return postingDescription;
  }

  public void setPostingDescription(String postingDescription) {
    this.postingDescription = postingDescription;
  }

  public FinancialTransactionCapture postingTransaction(String postingTransaction) {
    this.postingTransaction = postingTransaction;
    return this;
  }

  /**
   * Get postingTransaction
   * @return postingTransaction
  */
  @ApiModelProperty(value = "")


  public String getPostingTransaction() {
    return postingTransaction;
  }

  public void setPostingTransaction(String postingTransaction) {
    this.postingTransaction = postingTransaction;
  }

  public FinancialTransactionCapture postingValueDate(String postingValueDate) {
    this.postingValueDate = postingValueDate;
    return this;
  }

  /**
   * Get postingValueDate
   * @return postingValueDate
  */
  @ApiModelProperty(value = "")


  public String getPostingValueDate() {
    return postingValueDate;
  }

  public void setPostingValueDate(String postingValueDate) {
    this.postingValueDate = postingValueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialTransactionCapture financialTransactionCapture = (FinancialTransactionCapture) o;
    return Objects.equals(this.postingDescription, financialTransactionCapture.postingDescription) &&
        Objects.equals(this.postingTransaction, financialTransactionCapture.postingTransaction) &&
        Objects.equals(this.postingValueDate, financialTransactionCapture.postingValueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postingDescription, postingTransaction, postingValueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialTransactionCapture {\n");
    
    sb.append("    postingDescription: ").append(toIndentedString(postingDescription)).append("\n");
    sb.append("    postingTransaction: ").append(toIndentedString(postingTransaction)).append("\n");
    sb.append("    postingValueDate: ").append(toIndentedString(postingValueDate)).append("\n");
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

