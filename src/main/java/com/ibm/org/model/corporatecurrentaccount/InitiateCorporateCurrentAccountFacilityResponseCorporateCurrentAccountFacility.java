package com.ibm.org.model.corporatecurrentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:36:28.297Z[GMT]")

public class InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility   {
  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("CorporateCurrentAccountNumber")
  private String corporateCurrentAccountNumber;

  @JsonProperty("AccountCurrency")
  private String accountCurrency;

  @JsonProperty("EntitlementOptionDefinition")
  private String entitlementOptionDefinition;

  @JsonProperty("EntitlementOptionSetting")
  private String entitlementOptionSetting;

  @JsonProperty("RestrictionOptionDefinition")
  private String restrictionOptionDefinition;

  @JsonProperty("RestrictionOptionSetting")
  private String restrictionOptionSetting;

  @JsonProperty("PositionLimits")
  private String positionLimits;

  @JsonProperty("PositionLimitType")
  private String positionLimitType;

  @JsonProperty("PositionLimitSettings")
  private String positionLimitSettings;

  @JsonProperty("PositionLimitValue")
  private String positionLimitValue;

  @JsonProperty("DateType")
  private String dateType;

  public InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility productInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

  /**
   * Get productInstanceReference
   * @return productInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility corporateCurrentAccountNumber(String corporateCurrentAccountNumber) {
    this.corporateCurrentAccountNumber = corporateCurrentAccountNumber;
    return this;
  }

  /**
   * Get corporateCurrentAccountNumber
   * @return corporateCurrentAccountNumber
  */
  @ApiModelProperty(value = "")


  public String getCorporateCurrentAccountNumber() {
    return corporateCurrentAccountNumber;
  }

  public void setCorporateCurrentAccountNumber(String corporateCurrentAccountNumber) {
    this.corporateCurrentAccountNumber = corporateCurrentAccountNumber;
  }

  public InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility accountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
    return this;
  }

  /**
   * Get accountCurrency
   * @return accountCurrency
  */
  @ApiModelProperty(value = "")


  public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }

  public InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility entitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
    return this;
  }

  /**
   * Get entitlementOptionDefinition
   * @return entitlementOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }

  public InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility entitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
    return this;
  }

  /**
   * Get entitlementOptionSetting
   * @return entitlementOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }

  public InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility restrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
    return this;
  }

  /**
   * Get restrictionOptionDefinition
   * @return restrictionOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
  }

  public InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility restrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
    return this;
  }

  /**
   * Get restrictionOptionSetting
   * @return restrictionOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }

  public InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility positionLimits(String positionLimits) {
    this.positionLimits = positionLimits;
    return this;
  }

  /**
   * Get positionLimits
   * @return positionLimits
  */
  @ApiModelProperty(value = "")


  public String getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(String positionLimits) {
    this.positionLimits = positionLimits;
  }

  public InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility positionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
    return this;
  }

  /**
   * Get positionLimitType
   * @return positionLimitType
  */
  @ApiModelProperty(value = "")


  public String getPositionLimitType() {
    return positionLimitType;
  }

  public void setPositionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
  }

  public InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility positionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
    return this;
  }

  /**
   * Get positionLimitSettings
   * @return positionLimitSettings
  */
  @ApiModelProperty(value = "")


  public String getPositionLimitSettings() {
    return positionLimitSettings;
  }

  public void setPositionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
  }

  public InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility positionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
    return this;
  }

  /**
   * Get positionLimitValue
   * @return positionLimitValue
  */
  @ApiModelProperty(value = "")


  public String getPositionLimitValue() {
    return positionLimitValue;
  }

  public void setPositionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
  }

  public InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")


  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility initiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility = (InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility) o;
    return Objects.equals(this.productInstanceReference, initiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility.productInstanceReference) &&
        Objects.equals(this.corporateCurrentAccountNumber, initiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility.corporateCurrentAccountNumber) &&
        Objects.equals(this.accountCurrency, initiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility.accountCurrency) &&
        Objects.equals(this.entitlementOptionDefinition, initiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility.entitlementOptionDefinition) &&
        Objects.equals(this.entitlementOptionSetting, initiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionDefinition, initiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility.restrictionOptionDefinition) &&
        Objects.equals(this.restrictionOptionSetting, initiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility.restrictionOptionSetting) &&
        Objects.equals(this.positionLimits, initiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility.positionLimits) &&
        Objects.equals(this.positionLimitType, initiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility.positionLimitType) &&
        Objects.equals(this.positionLimitSettings, initiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility.positionLimitSettings) &&
        Objects.equals(this.positionLimitValue, initiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility.positionLimitValue) &&
        Objects.equals(this.dateType, initiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, corporateCurrentAccountNumber, accountCurrency, entitlementOptionDefinition, entitlementOptionSetting, restrictionOptionDefinition, restrictionOptionSetting, positionLimits, positionLimitType, positionLimitSettings, positionLimitValue, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCorporateCurrentAccountFacilityResponseCorporateCurrentAccountFacility {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    corporateCurrentAccountNumber: ").append(toIndentedString(corporateCurrentAccountNumber)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    entitlementOptionDefinition: ").append(toIndentedString(entitlementOptionDefinition)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionDefinition: ").append(toIndentedString(restrictionOptionDefinition)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
    sb.append("    positionLimits: ").append(toIndentedString(positionLimits)).append("\n");
    sb.append("    positionLimitType: ").append(toIndentedString(positionLimitType)).append("\n");
    sb.append("    positionLimitSettings: ").append(toIndentedString(positionLimitSettings)).append("\n");
    sb.append("    positionLimitValue: ").append(toIndentedString(positionLimitValue)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
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

