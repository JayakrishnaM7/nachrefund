package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ModelCase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class ModelCase   {
  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("CustomerCaseType")
  private String customerCaseType;

  @JsonProperty("CaseTaskResult")
  private String caseTaskResult;

  public ModelCase productInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

  /**
   * Get productInstanceReference
   * @return productInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public ModelCase customerCaseType(String customerCaseType) {
    this.customerCaseType = customerCaseType;
    return this;
  }

  /**
   * Get customerCaseType
   * @return customerCaseType
  */
  @ApiModelProperty(value = "")


  public String getCustomerCaseType() {
    return customerCaseType;
  }

  public void setCustomerCaseType(String customerCaseType) {
    this.customerCaseType = customerCaseType;
  }

  public ModelCase caseTaskResult(String caseTaskResult) {
    this.caseTaskResult = caseTaskResult;
    return this;
  }

  /**
   * Get caseTaskResult
   * @return caseTaskResult
  */
  @ApiModelProperty(value = "")


  public String getCaseTaskResult() {
    return caseTaskResult;
  }

  public void setCaseTaskResult(String caseTaskResult) {
    this.caseTaskResult = caseTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCase _case = (ModelCase) o;
    return Objects.equals(this.productInstanceReference, _case.productInstanceReference) &&
        Objects.equals(this.customerCaseType, _case.customerCaseType) &&
        Objects.equals(this.caseTaskResult, _case.caseTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, customerCaseType, caseTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCase {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    customerCaseType: ").append(toIndentedString(customerCaseType)).append("\n");
    sb.append("    caseTaskResult: ").append(toIndentedString(caseTaskResult)).append("\n");
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

