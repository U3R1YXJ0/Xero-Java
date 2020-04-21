/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * BrandingTheme
 */

public class BrandingTheme {
  StringUtil util = new StringUtil();

  
  @JsonProperty("BrandingThemeID")
  private UUID brandingThemeID;

  
  @JsonProperty("Name")
  private String name;

  
  @JsonProperty("LogoUrl")
  private String logoUrl;
  /**
   * Always INVOICE
   */
  public enum TypeEnum {
    INVOICE("INVOICE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  
  @JsonProperty("Type")
  private TypeEnum type;

  
  @JsonProperty("SortOrder")
  private Integer sortOrder;

  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("CreatedDateUTC")
  private OffsetDateTime createdDateUTC;
  public BrandingTheme brandingThemeID(UUID brandingThemeID) {
    this.brandingThemeID = brandingThemeID;
    return this;
  }

   /**
   * Xero identifier
   * @return brandingThemeID
  **/
  @ApiModelProperty(value = "Xero identifier")
  public UUID getBrandingThemeID() {
    return brandingThemeID;
  }

  public void setBrandingThemeID(UUID brandingThemeID) {
    this.brandingThemeID = brandingThemeID;
  }

  public BrandingTheme name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of branding theme
   * @return name
  **/
  @ApiModelProperty(value = "Name of branding theme")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BrandingTheme logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * The location of the image file used as the logo on this branding theme
   * @return logoUrl
  **/
  @ApiModelProperty(value = "The location of the image file used as the logo on this branding theme")
  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  public BrandingTheme type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Always INVOICE
   * @return type
  **/
  @ApiModelProperty(value = "Always INVOICE")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public BrandingTheme sortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Integer – ranked order of branding theme. The default branding theme has a value of 0
   * @return sortOrder
  **/
  @ApiModelProperty(value = "Integer – ranked order of branding theme. The default branding theme has a value of 0")
  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

   /**
   * UTC timestamp of creation date of branding theme
   * @return createdDateUTC
  **/
  @ApiModelProperty(value = "UTC timestamp of creation date of branding theme")
  public OffsetDateTime getCreatedDateUTC() {
    return createdDateUTC;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandingTheme brandingTheme = (BrandingTheme) o;
    return Objects.equals(this.brandingThemeID, brandingTheme.brandingThemeID) &&
        Objects.equals(this.name, brandingTheme.name) &&
        Objects.equals(this.logoUrl, brandingTheme.logoUrl) &&
        Objects.equals(this.type, brandingTheme.type) &&
        Objects.equals(this.sortOrder, brandingTheme.sortOrder) &&
        Objects.equals(this.createdDateUTC, brandingTheme.createdDateUTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandingThemeID, name, logoUrl, type, sortOrder, createdDateUTC);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandingTheme {\n");
    sb.append("    brandingThemeID: ").append(toIndentedString(brandingThemeID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    createdDateUTC: ").append(toIndentedString(createdDateUTC)).append("\n");
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

