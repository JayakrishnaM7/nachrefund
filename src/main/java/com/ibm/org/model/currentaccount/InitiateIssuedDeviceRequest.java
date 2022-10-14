package com.ibm.org.model.currentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.currentaccount.InitiateIssuedDeviceRequestIssuedDevice;
import com.ibm.org.model.currentaccount.InitiatePaymentsRequestCorporateCurrentAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateIssuedDeviceRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class InitiateIssuedDeviceRequest   {
  @JsonProperty("CorporateCurrentAccountFacility")
  private InitiatePaymentsRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility;

  @JsonProperty("IssuedDevice")
  private InitiateIssuedDeviceRequestIssuedDevice issuedDevice;

  public InitiateIssuedDeviceRequest corporateCurrentAccountFacility(InitiatePaymentsRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
    return this;
  }

  /**
   * Get corporateCurrentAccountFacility
   * @return corporateCurrentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePaymentsRequestCorporateCurrentAccountFacility getCorporateCurrentAccountFacility() {
    return corporateCurrentAccountFacility;
  }

  public void setCorporateCurrentAccountFacility(InitiatePaymentsRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
  }

  public InitiateIssuedDeviceRequest issuedDevice(InitiateIssuedDeviceRequestIssuedDevice issuedDevice) {
    this.issuedDevice = issuedDevice;
    return this;
  }

  /**
   * Get issuedDevice
   * @return issuedDevice
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateIssuedDeviceRequestIssuedDevice getIssuedDevice() {
    return issuedDevice;
  }

  public void setIssuedDevice(InitiateIssuedDeviceRequestIssuedDevice issuedDevice) {
    this.issuedDevice = issuedDevice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateIssuedDeviceRequest initiateIssuedDeviceRequest = (InitiateIssuedDeviceRequest) o;
    return Objects.equals(this.corporateCurrentAccountFacility, initiateIssuedDeviceRequest.corporateCurrentAccountFacility) &&
        Objects.equals(this.issuedDevice, initiateIssuedDeviceRequest.issuedDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateCurrentAccountFacility, issuedDevice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateIssuedDeviceRequest {\n");
    
    sb.append("    corporateCurrentAccountFacility: ").append(toIndentedString(corporateCurrentAccountFacility)).append("\n");
    sb.append("    issuedDevice: ").append(toIndentedString(issuedDevice)).append("\n");
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

