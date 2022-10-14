package com.ibm.org.model.achoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateWarehousingRequestWarehousing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:17.996Z[GMT]")

public class InitiateWarehousingRequestWarehousing   {
  @JsonProperty("ScheduleReleaseDateOrTime")
  private String scheduleReleaseDateOrTime;

  public InitiateWarehousingRequestWarehousing scheduleReleaseDateOrTime(String scheduleReleaseDateOrTime) {
    this.scheduleReleaseDateOrTime = scheduleReleaseDateOrTime;
    return this;
  }

  /**
   * Get scheduleReleaseDateOrTime
   * @return scheduleReleaseDateOrTime
  */
  @ApiModelProperty(value = "")


  public String getScheduleReleaseDateOrTime() {
    return scheduleReleaseDateOrTime;
  }

  public void setScheduleReleaseDateOrTime(String scheduleReleaseDateOrTime) {
    this.scheduleReleaseDateOrTime = scheduleReleaseDateOrTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateWarehousingRequestWarehousing initiateWarehousingRequestWarehousing = (InitiateWarehousingRequestWarehousing) o;
    return Objects.equals(this.scheduleReleaseDateOrTime, initiateWarehousingRequestWarehousing.scheduleReleaseDateOrTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleReleaseDateOrTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateWarehousingRequestWarehousing {\n");
    
    sb.append("    scheduleReleaseDateOrTime: ").append(toIndentedString(scheduleReleaseDateOrTime)).append("\n");
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

