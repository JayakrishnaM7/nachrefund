package com.ibm.org.model.achoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.achoperations.InitiateInboundACHRequestInboundACH;
import com.ibm.org.model.achoperations.InitiateOutboundACHResponseOutboundACH;
import com.ibm.org.model.achoperations.InitiateWarehousingRequestWarehousing;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveWarehousingResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:17.996Z[GMT]")

public class RetrieveWarehousingResponse   {
  @JsonProperty("InboundACH")
  private InitiateInboundACHRequestInboundACH inboundACH;

  @JsonProperty("OutboundACH")
  private InitiateOutboundACHResponseOutboundACH outboundACH;

  @JsonProperty("Warehousing")
  private InitiateWarehousingRequestWarehousing warehousing;

  public RetrieveWarehousingResponse inboundACH(InitiateInboundACHRequestInboundACH inboundACH) {
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

  public RetrieveWarehousingResponse outboundACH(InitiateOutboundACHResponseOutboundACH outboundACH) {
    this.outboundACH = outboundACH;
    return this;
  }

  /**
   * Get outboundACH
   * @return outboundACH
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOutboundACHResponseOutboundACH getOutboundACH() {
    return outboundACH;
  }

  public void setOutboundACH(InitiateOutboundACHResponseOutboundACH outboundACH) {
    this.outboundACH = outboundACH;
  }

  public RetrieveWarehousingResponse warehousing(InitiateWarehousingRequestWarehousing warehousing) {
    this.warehousing = warehousing;
    return this;
  }

  /**
   * Get warehousing
   * @return warehousing
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateWarehousingRequestWarehousing getWarehousing() {
    return warehousing;
  }

  public void setWarehousing(InitiateWarehousingRequestWarehousing warehousing) {
    this.warehousing = warehousing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveWarehousingResponse retrieveWarehousingResponse = (RetrieveWarehousingResponse) o;
    return Objects.equals(this.inboundACH, retrieveWarehousingResponse.inboundACH) &&
        Objects.equals(this.outboundACH, retrieveWarehousingResponse.outboundACH) &&
        Objects.equals(this.warehousing, retrieveWarehousingResponse.warehousing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundACH, outboundACH, warehousing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveWarehousingResponse {\n");
    
    sb.append("    inboundACH: ").append(toIndentedString(inboundACH)).append("\n");
    sb.append("    outboundACH: ").append(toIndentedString(outboundACH)).append("\n");
    sb.append("    warehousing: ").append(toIndentedString(warehousing)).append("\n");
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

