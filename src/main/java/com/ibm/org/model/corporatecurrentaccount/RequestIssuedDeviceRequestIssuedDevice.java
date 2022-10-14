package com.ibm.org.model.corporatecurrentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestIssuedDeviceRequestIssuedDevice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class RequestIssuedDeviceRequestIssuedDevice   {
  @JsonProperty("IssuedDeviceType")
  private String issuedDeviceType;

  @JsonProperty("IssuedDeviceOptionSetting")
  private String issuedDeviceOptionSetting;

  @JsonProperty("IssuedDeviceProperty")
  private String issuedDeviceProperty;

  @JsonProperty("IssuedDevicePropertyValue")
  private String issuedDevicePropertyValue;

  @JsonProperty("IssuedDeviceStatus")
  private String issuedDeviceStatus;

  public RequestIssuedDeviceRequestIssuedDevice issuedDeviceType(String issuedDeviceType) {
    this.issuedDeviceType = issuedDeviceType;
    return this;
  }

  /**
   * Get issuedDeviceType
   * @return issuedDeviceType
  */
  @ApiModelProperty(value = "")


  public String getIssuedDeviceType() {
    return issuedDeviceType;
  }

  public void setIssuedDeviceType(String issuedDeviceType) {
    this.issuedDeviceType = issuedDeviceType;
  }

  public RequestIssuedDeviceRequestIssuedDevice issuedDeviceOptionSetting(String issuedDeviceOptionSetting) {
    this.issuedDeviceOptionSetting = issuedDeviceOptionSetting;
    return this;
  }

  /**
   * Get issuedDeviceOptionSetting
   * @return issuedDeviceOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getIssuedDeviceOptionSetting() {
    return issuedDeviceOptionSetting;
  }

  public void setIssuedDeviceOptionSetting(String issuedDeviceOptionSetting) {
    this.issuedDeviceOptionSetting = issuedDeviceOptionSetting;
  }

  public RequestIssuedDeviceRequestIssuedDevice issuedDeviceProperty(String issuedDeviceProperty) {
    this.issuedDeviceProperty = issuedDeviceProperty;
    return this;
  }

  /**
   * Get issuedDeviceProperty
   * @return issuedDeviceProperty
  */
  @ApiModelProperty(value = "")


  public String getIssuedDeviceProperty() {
    return issuedDeviceProperty;
  }

  public void setIssuedDeviceProperty(String issuedDeviceProperty) {
    this.issuedDeviceProperty = issuedDeviceProperty;
  }

  public RequestIssuedDeviceRequestIssuedDevice issuedDevicePropertyValue(String issuedDevicePropertyValue) {
    this.issuedDevicePropertyValue = issuedDevicePropertyValue;
    return this;
  }

  /**
   * Get issuedDevicePropertyValue
   * @return issuedDevicePropertyValue
  */
  @ApiModelProperty(value = "")


  public String getIssuedDevicePropertyValue() {
    return issuedDevicePropertyValue;
  }

  public void setIssuedDevicePropertyValue(String issuedDevicePropertyValue) {
    this.issuedDevicePropertyValue = issuedDevicePropertyValue;
  }

  public RequestIssuedDeviceRequestIssuedDevice issuedDeviceStatus(String issuedDeviceStatus) {
    this.issuedDeviceStatus = issuedDeviceStatus;
    return this;
  }

  /**
   * Get issuedDeviceStatus
   * @return issuedDeviceStatus
  */
  @ApiModelProperty(value = "")


  public String getIssuedDeviceStatus() {
    return issuedDeviceStatus;
  }

  public void setIssuedDeviceStatus(String issuedDeviceStatus) {
    this.issuedDeviceStatus = issuedDeviceStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestIssuedDeviceRequestIssuedDevice requestIssuedDeviceRequestIssuedDevice = (RequestIssuedDeviceRequestIssuedDevice) o;
    return Objects.equals(this.issuedDeviceType, requestIssuedDeviceRequestIssuedDevice.issuedDeviceType) &&
        Objects.equals(this.issuedDeviceOptionSetting, requestIssuedDeviceRequestIssuedDevice.issuedDeviceOptionSetting) &&
        Objects.equals(this.issuedDeviceProperty, requestIssuedDeviceRequestIssuedDevice.issuedDeviceProperty) &&
        Objects.equals(this.issuedDevicePropertyValue, requestIssuedDeviceRequestIssuedDevice.issuedDevicePropertyValue) &&
        Objects.equals(this.issuedDeviceStatus, requestIssuedDeviceRequestIssuedDevice.issuedDeviceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceType, issuedDeviceOptionSetting, issuedDeviceProperty, issuedDevicePropertyValue, issuedDeviceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestIssuedDeviceRequestIssuedDevice {\n");
    
    sb.append("    issuedDeviceType: ").append(toIndentedString(issuedDeviceType)).append("\n");
    sb.append("    issuedDeviceOptionSetting: ").append(toIndentedString(issuedDeviceOptionSetting)).append("\n");
    sb.append("    issuedDeviceProperty: ").append(toIndentedString(issuedDeviceProperty)).append("\n");
    sb.append("    issuedDevicePropertyValue: ").append(toIndentedString(issuedDevicePropertyValue)).append("\n");
    sb.append("    issuedDeviceStatus: ").append(toIndentedString(issuedDeviceStatus)).append("\n");
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

