package com.ibm.org.model.achoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateACHFulfillmentOperatingSessionResponseACHFulfillmentOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:17.996Z[GMT]")

public class UpdateACHFulfillmentOperatingSessionResponseACHFulfillmentOperatingSession   {
  @JsonProperty("ACHAccessSchedule")
  private String acHAccessSchedule;

  public UpdateACHFulfillmentOperatingSessionResponseACHFulfillmentOperatingSession acHAccessSchedule(String acHAccessSchedule) {
    this.acHAccessSchedule = acHAccessSchedule;
    return this;
  }

  /**
   * Get acHAccessSchedule
   * @return acHAccessSchedule
  */
  @ApiModelProperty(value = "")


  public String getAcHAccessSchedule() {
    return acHAccessSchedule;
  }

  public void setAcHAccessSchedule(String acHAccessSchedule) {
    this.acHAccessSchedule = acHAccessSchedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateACHFulfillmentOperatingSessionResponseACHFulfillmentOperatingSession updateACHFulfillmentOperatingSessionResponseACHFulfillmentOperatingSession = (UpdateACHFulfillmentOperatingSessionResponseACHFulfillmentOperatingSession) o;
    return Objects.equals(this.acHAccessSchedule, updateACHFulfillmentOperatingSessionResponseACHFulfillmentOperatingSession.acHAccessSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acHAccessSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateACHFulfillmentOperatingSessionResponseACHFulfillmentOperatingSession {\n");
    
    sb.append("    acHAccessSchedule: ").append(toIndentedString(acHAccessSchedule)).append("\n");
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

