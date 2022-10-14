package com.ibm.org.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateOfferResponseOffer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:40.505Z[GMT]")

public class InitiateOfferResponseOffer   {
  @JsonProperty("OfferTaskResult")
  private String offerTaskResult;

  public InitiateOfferResponseOffer offerTaskResult(String offerTaskResult) {
    this.offerTaskResult = offerTaskResult;
    return this;
  }

  /**
   * Get offerTaskResult
   * @return offerTaskResult
  */
  @ApiModelProperty(value = "")


  public String getOfferTaskResult() {
    return offerTaskResult;
  }

  public void setOfferTaskResult(String offerTaskResult) {
    this.offerTaskResult = offerTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateOfferResponseOffer initiateOfferResponseOffer = (InitiateOfferResponseOffer) o;
    return Objects.equals(this.offerTaskResult, initiateOfferResponseOffer.offerTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateOfferResponseOffer {\n");
    
    sb.append("    offerTaskResult: ").append(toIndentedString(offerTaskResult)).append("\n");
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

