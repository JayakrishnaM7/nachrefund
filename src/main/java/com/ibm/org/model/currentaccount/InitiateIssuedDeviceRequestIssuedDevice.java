package com.ibm.org.model.currentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateIssuedDeviceRequestIssuedDevice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class InitiateIssuedDeviceRequestIssuedDevice   {
  @JsonProperty("IssuedDeviceType")
  private String issuedDeviceType;

  @JsonProperty("IssuedDeviceDescription")
  private String issuedDeviceDescription;

  @JsonProperty("IssuedDeviceOptionDefinition")
  private String issuedDeviceOptionDefinition;

  @JsonProperty("IssuedDeviceOptionSetting")
  private String issuedDeviceOptionSetting;

  @JsonProperty("IssuedDeviceProperty")
  private String issuedDeviceProperty;

  @JsonProperty("IssuedDevicePropertyType")
  private String issuedDevicePropertyType;

  @JsonProperty("IssuedDevicePropertyValue")
  private String issuedDevicePropertyValue;

  @JsonProperty("IssuedDeviceStatus")
  private String issuedDeviceStatus;

  public InitiateIssuedDeviceRequestIssuedDevice issuedDeviceType(String issuedDeviceType) {
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

  public InitiateIssuedDeviceRequestIssuedDevice issuedDeviceDescription(String issuedDeviceDescription) {
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

  public InitiateIssuedDeviceRequestIssuedDevice issuedDeviceOptionDefinition(String issuedDeviceOptionDefinition) {
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

  public InitiateIssuedDeviceRequestIssuedDevice issuedDeviceOptionSetting(String issuedDeviceOptionSetting) {
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

  public InitiateIssuedDeviceRequestIssuedDevice issuedDeviceProperty(String issuedDeviceProperty) {
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

  public InitiateIssuedDeviceRequestIssuedDevice issuedDevicePropertyType(String issuedDevicePropertyType) {
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

  public InitiateIssuedDeviceRequestIssuedDevice issuedDevicePropertyValue(String issuedDevicePropertyValue) {
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

  public InitiateIssuedDeviceRequestIssuedDevice issuedDeviceStatus(String issuedDeviceStatus) {
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
    InitiateIssuedDeviceRequestIssuedDevice initiateIssuedDeviceRequestIssuedDevice = (InitiateIssuedDeviceRequestIssuedDevice) o;
    return Objects.equals(this.issuedDeviceType, initiateIssuedDeviceRequestIssuedDevice.issuedDeviceType) &&
        Objects.equals(this.issuedDeviceDescription, initiateIssuedDeviceRequestIssuedDevice.issuedDeviceDescription) &&
        Objects.equals(this.issuedDeviceOptionDefinition, initiateIssuedDeviceRequestIssuedDevice.issuedDeviceOptionDefinition) &&
        Objects.equals(this.issuedDeviceOptionSetting, initiateIssuedDeviceRequestIssuedDevice.issuedDeviceOptionSetting) &&
        Objects.equals(this.issuedDeviceProperty, initiateIssuedDeviceRequestIssuedDevice.issuedDeviceProperty) &&
        Objects.equals(this.issuedDevicePropertyType, initiateIssuedDeviceRequestIssuedDevice.issuedDevicePropertyType) &&
        Objects.equals(this.issuedDevicePropertyValue, initiateIssuedDeviceRequestIssuedDevice.issuedDevicePropertyValue) &&
        Objects.equals(this.issuedDeviceStatus, initiateIssuedDeviceRequestIssuedDevice.issuedDeviceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceType, issuedDeviceDescription, issuedDeviceOptionDefinition, issuedDeviceOptionSetting, issuedDeviceProperty, issuedDevicePropertyType, issuedDevicePropertyValue, issuedDeviceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateIssuedDeviceRequestIssuedDevice {\n");
    
    sb.append("    issuedDeviceType: ").append(toIndentedString(issuedDeviceType)).append("\n");
    sb.append("    issuedDeviceDescription: ").append(toIndentedString(issuedDeviceDescription)).append("\n");
    sb.append("    issuedDeviceOptionDefinition: ").append(toIndentedString(issuedDeviceOptionDefinition)).append("\n");
    sb.append("    issuedDeviceOptionSetting: ").append(toIndentedString(issuedDeviceOptionSetting)).append("\n");
    sb.append("    issuedDeviceProperty: ").append(toIndentedString(issuedDeviceProperty)).append("\n");
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

