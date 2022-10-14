package com.ibm.org.model.achoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.achoperations.InitiateInboundACHRequestACHFulfillmentOperatingSession;
import com.ibm.org.model.achoperations.InitiateInboundACHRequestInboundACH;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateInboundACHRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:17.996Z[GMT]")

public class InitiateInboundACHRequest   {
  @JsonProperty("ACHFulfillmentOperatingSession")
  private InitiateInboundACHRequestACHFulfillmentOperatingSession acHFulfillmentOperatingSession;

  @JsonProperty("InboundACH")
  private InitiateInboundACHRequestInboundACH inboundACH;

  public InitiateInboundACHRequest acHFulfillmentOperatingSession(InitiateInboundACHRequestACHFulfillmentOperatingSession acHFulfillmentOperatingSession) {
    this.acHFulfillmentOperatingSession = acHFulfillmentOperatingSession;
    return this;
  }

  /**
   * Get acHFulfillmentOperatingSession
   * @return acHFulfillmentOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateInboundACHRequestACHFulfillmentOperatingSession getAcHFulfillmentOperatingSession() {
    return acHFulfillmentOperatingSession;
  }

  public void setAcHFulfillmentOperatingSession(InitiateInboundACHRequestACHFulfillmentOperatingSession acHFulfillmentOperatingSession) {
    this.acHFulfillmentOperatingSession = acHFulfillmentOperatingSession;
  }

  public InitiateInboundACHRequest inboundACH(InitiateInboundACHRequestInboundACH inboundACH) {
    this.inboundACH = inboundACH;
    return this;
  }

  /**
   * Get inboundACH
   * @return inboundACH
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateInboundACHRequestInboundACH getInboundACH() {
    return inboundACH;
  }

  public void setInboundACH(InitiateInboundACHRequestInboundACH inboundACH) {
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
    InitiateInboundACHRequest initiateInboundACHRequest = (InitiateInboundACHRequest) o;
    return Objects.equals(this.acHFulfillmentOperatingSession, initiateInboundACHRequest.acHFulfillmentOperatingSession) &&
        Objects.equals(this.inboundACH, initiateInboundACHRequest.inboundACH);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acHFulfillmentOperatingSession, inboundACH);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateInboundACHRequest {\n");
    
    sb.append("    acHFulfillmentOperatingSession: ").append(toIndentedString(acHFulfillmentOperatingSession)).append("\n");
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

