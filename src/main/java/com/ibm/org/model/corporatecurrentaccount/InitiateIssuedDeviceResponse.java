package com.ibm.org.model.corporatecurrentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.corporatecurrentaccount.InitiateIssuedDeviceResponseCorporateCurrentAccountFacility;
import com.ibm.org.model.corporatecurrentaccount.InitiateIssuedDeviceResponseIssuedDevice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateIssuedDeviceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class InitiateIssuedDeviceResponse   {
  @JsonProperty("CorporateCurrentAccountFacility")
  private InitiateIssuedDeviceResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility;

  @JsonProperty("IssuedDevice")
  private InitiateIssuedDeviceResponseIssuedDevice issuedDevice;

  public InitiateIssuedDeviceResponse corporateCurrentAccountFacility(InitiateIssuedDeviceResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
    return this;
  }

  /**
   * Get corporateCurrentAccountFacility
   * @return corporateCurrentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateIssuedDeviceResponseCorporateCurrentAccountFacility getCorporateCurrentAccountFacility() {
    return corporateCurrentAccountFacility;
  }

  public void setCorporateCurrentAccountFacility(InitiateIssuedDeviceResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
  }

  public InitiateIssuedDeviceResponse issuedDevice(InitiateIssuedDeviceResponseIssuedDevice issuedDevice) {
    this.issuedDevice = issuedDevice;
    return this;
  }

  /**
   * Get issuedDevice
   * @return issuedDevice
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateIssuedDeviceResponseIssuedDevice getIssuedDevice() {
    return issuedDevice;
  }

  public void setIssuedDevice(InitiateIssuedDeviceResponseIssuedDevice issuedDevice) {
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
    InitiateIssuedDeviceResponse initiateIssuedDeviceResponse = (InitiateIssuedDeviceResponse) o;
    return Objects.equals(this.corporateCurrentAccountFacility, initiateIssuedDeviceResponse.corporateCurrentAccountFacility) &&
        Objects.equals(this.issuedDevice, initiateIssuedDeviceResponse.issuedDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateCurrentAccountFacility, issuedDevice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateIssuedDeviceResponse {\n");
    
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

