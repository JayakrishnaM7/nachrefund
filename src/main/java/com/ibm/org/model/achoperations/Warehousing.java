package com.ibm.org.model.achoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Warehousing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:17.996Z[GMT]")

public class Warehousing   {
  @JsonProperty("ScheduleReleaseDate/Time")
  private String scheduleReleaseDateTime;

  public Warehousing scheduleReleaseDateTime(String scheduleReleaseDateTime) {
    this.scheduleReleaseDateTime = scheduleReleaseDateTime;
    return this;
  }

  /**
   * Get scheduleReleaseDateTime
   * @return scheduleReleaseDateTime
  */
  @ApiModelProperty(value = "")


  public String getScheduleReleaseDateTime() {
    return scheduleReleaseDateTime;
  }

  public void setScheduleReleaseDateTime(String scheduleReleaseDateTime) {
    this.scheduleReleaseDateTime = scheduleReleaseDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Warehousing warehousing = (Warehousing) o;
    return Objects.equals(this.scheduleReleaseDateTime, warehousing.scheduleReleaseDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleReleaseDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Warehousing {\n");
    
    sb.append("    scheduleReleaseDateTime: ").append(toIndentedString(scheduleReleaseDateTime)).append("\n");
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

