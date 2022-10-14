package com.ibm.org.model.achoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.achoperations.UpdateACHFulfillmentOperatingSessionResponseACHFulfillmentOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateACHFulfillmentOperatingSessionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:17.996Z[GMT]")

public class UpdateACHFulfillmentOperatingSessionResponse   {
  @JsonProperty("ACHFulfillmentOperatingSession")
  private UpdateACHFulfillmentOperatingSessionResponseACHFulfillmentOperatingSession acHFulfillmentOperatingSession;

  public UpdateACHFulfillmentOperatingSessionResponse acHFulfillmentOperatingSession(UpdateACHFulfillmentOperatingSessionResponseACHFulfillmentOperatingSession acHFulfillmentOperatingSession) {
    this.acHFulfillmentOperatingSession = acHFulfillmentOperatingSession;
    return this;
  }

  /**
   * Get acHFulfillmentOperatingSession
   * @return acHFulfillmentOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateACHFulfillmentOperatingSessionResponseACHFulfillmentOperatingSession getAcHFulfillmentOperatingSession() {
    return acHFulfillmentOperatingSession;
  }

  public void setAcHFulfillmentOperatingSession(UpdateACHFulfillmentOperatingSessionResponseACHFulfillmentOperatingSession acHFulfillmentOperatingSession) {
    this.acHFulfillmentOperatingSession = acHFulfillmentOperatingSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateACHFulfillmentOperatingSessionResponse updateACHFulfillmentOperatingSessionResponse = (UpdateACHFulfillmentOperatingSessionResponse) o;
    return Objects.equals(this.acHFulfillmentOperatingSession, updateACHFulfillmentOperatingSessionResponse.acHFulfillmentOperatingSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acHFulfillmentOperatingSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateACHFulfillmentOperatingSessionResponse {\n");
    
    sb.append("    acHFulfillmentOperatingSession: ").append(toIndentedString(acHFulfillmentOperatingSession)).append("\n");
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

