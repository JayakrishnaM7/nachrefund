package com.ibm.org.model.achoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.achoperations.InitiateOutboundACHResponseInboundACH;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateWarehousingResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:17.996Z[GMT]")

public class InitiateWarehousingResponse   {
  @JsonProperty("InboundACH")
  private InitiateOutboundACHResponseInboundACH inboundACH;

  public InitiateWarehousingResponse inboundACH(InitiateOutboundACHResponseInboundACH inboundACH) {
    this.inboundACH = inboundACH;
    return this;
  }

  /**
   * Get inboundACH
   * @return inboundACH
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOutboundACHResponseInboundACH getInboundACH() {
    return inboundACH;
  }

  public void setInboundACH(InitiateOutboundACHResponseInboundACH inboundACH) {
    this.inboundACH = inboundACH;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateWarehousingResponse initiateWarehousingResponse = (InitiateWarehousingResponse) o;
    return Objects.equals(this.inboundACH, initiateWarehousingResponse.inboundACH);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundACH);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateWarehousingResponse {\n");
    
    sb.append("    inboundACH: ").append(toIndentedString(inboundACH)).append("\n");
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

