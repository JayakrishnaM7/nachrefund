package com.ibm.org.model.corporatecurrentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestIssuedDeviceResponseIssuedDevice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class RequestIssuedDeviceResponseIssuedDevice   {
  @JsonProperty("IssuedDeviceDescription")
  private String issuedDeviceDescription;

  @JsonProperty("IssuedDeviceOptionDefinition")
  private String issuedDeviceOptionDefinition;

  @JsonProperty("IssuedDeviceOptionSetting")
  private String issuedDeviceOptionSetting;

  @JsonProperty("IssuedDevicePropertyType")
  private String issuedDevicePropertyType;

  @JsonProperty("IssuedDevicePropertyValue")
  private String issuedDevicePropertyValue;

  @JsonProperty("IssuedDeviceStatus")
  private String issuedDeviceStatus;

  public RequestIssuedDeviceResponseIssuedDevice issuedDeviceDescription(String issuedDeviceDescription) {
    this.issuedDeviceDescription = issuedDeviceDescription;
    return this;
  }

  /**
   * Get issuedDeviceDescription
   * @return issuedDeviceDescription
  */
  @ApiModelProperty(value = "")


  public String getIssuedDeviceDescription() {
    return issuedDeviceDescription;
  }

  public void setIssuedDeviceDescription(String issuedDeviceDescription) {
    this.issuedDeviceDescription = issuedDeviceDescription;
  }

  public RequestIssuedDeviceResponseIssuedDevice issuedDeviceOptionDefinition(String issuedDeviceOptionDefinition) {
    this.issuedDeviceOptionDefinition = issuedDeviceOptionDefinition;
    return this;
  }

  /**
   * Get issuedDeviceOptionDefinition
   * @return issuedDeviceOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getIssuedDeviceOptionDefinition() {
    return issuedDeviceOptionDefinition;
  }

  public void setIssuedDeviceOptionDefinition(String issuedDeviceOptionDefinition) {
    this.issuedDeviceOptionDefinition = issuedDeviceOptionDefinition;
  }

  public RequestIssuedDeviceResponseIssuedDevice issuedDeviceOptionSetting(String issuedDeviceOptionSetting) {
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

  public RequestIssuedDeviceResponseIssuedDevice issuedDevicePropertyType(String issuedDevicePropertyType) {
    this.issuedDevicePropertyType = issuedDevicePropertyType;
    return this;
  }

  /**
   * Get issuedDevicePropertyType
   * @return issuedDevicePropertyType
  */
  @ApiModelProperty(value = "")


  public String getIssuedDevicePropertyType() {
    return issuedDevicePropertyType;
  }

  public void setIssuedDevicePropertyType(String issuedDevicePropertyType) {
    this.issuedDevicePropertyType = issuedDevicePropertyType;
  }

  public RequestIssuedDeviceResponseIssuedDevice issuedDevicePropertyValue(String issuedDevicePropertyValue) {
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

  public RequestIssuedDeviceResponseIssuedDevice issuedDeviceStatus(String issuedDeviceStatus) {
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
    RequestIssuedDeviceResponseIssuedDevice requestIssuedDeviceResponseIssuedDevice = (RequestIssuedDeviceResponseIssuedDevice) o;
    return Objects.equals(this.issuedDeviceDescription, requestIssuedDeviceResponseIssuedDevice.issuedDeviceDescription) &&
        Objects.equals(this.issuedDeviceOptionDefinition, requestIssuedDeviceResponseIssuedDevice.issuedDeviceOptionDefinition) &&
        Objects.equals(this.issuedDeviceOptionSetting, requestIssuedDeviceResponseIssuedDevice.issuedDeviceOptionSetting) &&
        Objects.equals(this.issuedDevicePropertyType, requestIssuedDeviceResponseIssuedDevice.issuedDevicePropertyType) &&
        Objects.equals(this.issuedDevicePropertyValue, requestIssuedDeviceResponseIssuedDevice.issuedDevicePropertyValue) &&
        Objects.equals(this.issuedDeviceStatus, requestIssuedDeviceResponseIssuedDevice.issuedDeviceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceDescription, issuedDeviceOptionDefinition, issuedDeviceOptionSetting, issuedDevicePropertyType, issuedDevicePropertyValue, issuedDeviceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestIssuedDeviceResponseIssuedDevice {\n");
    
    sb.append("    issuedDeviceDescription: ").append(toIndentedString(issuedDeviceDescription)).append("\n");
    sb.append("    issuedDeviceOptionDefinition: ").append(toIndentedString(issuedDeviceOptionDefinition)).append("\n");
    sb.append("    issuedDeviceOptionSetting: ").append(toIndentedString(issuedDeviceOptionSetting)).append("\n");
    sb.append("    issuedDevicePropertyType: ").append(toIndentedString(issuedDevicePropertyType)).append("\n");
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

