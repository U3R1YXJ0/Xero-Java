/*
 * Xero Assets API
 * This is the Xero Assets API
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.assets;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * BookDepreciationSetting
 */

public class BookDepreciationSetting {
  /**
   * The method of depreciation applied to this asset. See Depreciation Methods
   */
  public enum DepreciationMethodEnum {
    NODEPRECIATION("NoDepreciation"),
    
    STRAIGHTLINE("StraightLine"),
    
    DIMINISHINGVALUE100("DiminishingValue100"),
    
    DIMINISHINGVALUE150("DiminishingValue150"),
    
    DIMINISHINGVALUE200("DiminishingValue200"),
    
    FULLDEPRECIATION("FullDepreciation");

    private String value;

    DepreciationMethodEnum(String value) {
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
    public static DepreciationMethodEnum fromValue(String value) {
      for (DepreciationMethodEnum b : DepreciationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("depreciationMethod")
  private DepreciationMethodEnum depreciationMethod;

  /**
   * The method of averaging applied to this asset. See Averaging Methods
   */
  public enum AveragingMethodEnum {
    FULLMONTH("FullMonth"),
    
    ACTUALDAYS("ActualDays");

    private String value;

    AveragingMethodEnum(String value) {
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
    public static AveragingMethodEnum fromValue(String value) {
      for (AveragingMethodEnum b : AveragingMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("averagingMethod")
  private AveragingMethodEnum averagingMethod;

  @JsonProperty("depreciationRate")
  private Float depreciationRate;

  @JsonProperty("effectiveLifeYears")
  private Integer effectiveLifeYears;

  /**
   * See Depreciation Calculation Methods
   */
  public enum DepreciationCalculationMethodEnum {
    RATE("Rate"),
    
    LIFE("Life"),
    
    NONE("None");

    private String value;

    DepreciationCalculationMethodEnum(String value) {
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
    public static DepreciationCalculationMethodEnum fromValue(String value) {
      for (DepreciationCalculationMethodEnum b : DepreciationCalculationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("depreciationCalculationMethod")
  private DepreciationCalculationMethodEnum depreciationCalculationMethod;

  @JsonProperty("depreciableObjectId")
  private UUID depreciableObjectId;

  @JsonProperty("depreciableObjectType")
  private String depreciableObjectType;

  @JsonProperty("bookEffectiveDateOfChangeId")
  private UUID bookEffectiveDateOfChangeId;

  public BookDepreciationSetting depreciationMethod(DepreciationMethodEnum depreciationMethod) {
    this.depreciationMethod = depreciationMethod;
    return this;
  }

   /**
   * The method of depreciation applied to this asset. See Depreciation Methods
   * @return depreciationMethod
  **/
  @ApiModelProperty(example = "StraightLine", value = "The method of depreciation applied to this asset. See Depreciation Methods")
  public DepreciationMethodEnum getDepreciationMethod() {
    return depreciationMethod;
  }

  public void setDepreciationMethod(DepreciationMethodEnum depreciationMethod) {
    this.depreciationMethod = depreciationMethod;
  }

  public BookDepreciationSetting averagingMethod(AveragingMethodEnum averagingMethod) {
    this.averagingMethod = averagingMethod;
    return this;
  }

   /**
   * The method of averaging applied to this asset. See Averaging Methods
   * @return averagingMethod
  **/
  @ApiModelProperty(example = "ActualDays", value = "The method of averaging applied to this asset. See Averaging Methods")
  public AveragingMethodEnum getAveragingMethod() {
    return averagingMethod;
  }

  public void setAveragingMethod(AveragingMethodEnum averagingMethod) {
    this.averagingMethod = averagingMethod;
  }

  public BookDepreciationSetting depreciationRate(Float depreciationRate) {
    this.depreciationRate = depreciationRate;
    return this;
  }

   /**
   * The rate of depreciation (e.g. 0.05)
   * @return depreciationRate
  **/
  @ApiModelProperty(example = "0.05", value = "The rate of depreciation (e.g. 0.05)")
  public Float getDepreciationRate() {
    return depreciationRate;
  }

  public void setDepreciationRate(Float depreciationRate) {
    this.depreciationRate = depreciationRate;
  }

  public BookDepreciationSetting effectiveLifeYears(Integer effectiveLifeYears) {
    this.effectiveLifeYears = effectiveLifeYears;
    return this;
  }

   /**
   * Effective life of the asset in years (e.g. 5)
   * @return effectiveLifeYears
  **/
  @ApiModelProperty(example = "5", value = "Effective life of the asset in years (e.g. 5)")
  public Integer getEffectiveLifeYears() {
    return effectiveLifeYears;
  }

  public void setEffectiveLifeYears(Integer effectiveLifeYears) {
    this.effectiveLifeYears = effectiveLifeYears;
  }

  public BookDepreciationSetting depreciationCalculationMethod(DepreciationCalculationMethodEnum depreciationCalculationMethod) {
    this.depreciationCalculationMethod = depreciationCalculationMethod;
    return this;
  }

   /**
   * See Depreciation Calculation Methods
   * @return depreciationCalculationMethod
  **/
  @ApiModelProperty(example = "None", value = "See Depreciation Calculation Methods")
  public DepreciationCalculationMethodEnum getDepreciationCalculationMethod() {
    return depreciationCalculationMethod;
  }

  public void setDepreciationCalculationMethod(DepreciationCalculationMethodEnum depreciationCalculationMethod) {
    this.depreciationCalculationMethod = depreciationCalculationMethod;
  }

  public BookDepreciationSetting depreciableObjectId(UUID depreciableObjectId) {
    this.depreciableObjectId = depreciableObjectId;
    return this;
  }

   /**
   * Unique Xero identifier for the depreciable object
   * @return depreciableObjectId
  **/
  @ApiModelProperty(example = "68f17094-af97-4f1b-b36b-013b45b6ad3c", value = "Unique Xero identifier for the depreciable object")
  public UUID getDepreciableObjectId() {
    return depreciableObjectId;
  }

  public void setDepreciableObjectId(UUID depreciableObjectId) {
    this.depreciableObjectId = depreciableObjectId;
  }

  public BookDepreciationSetting depreciableObjectType(String depreciableObjectType) {
    this.depreciableObjectType = depreciableObjectType;
    return this;
  }

   /**
   * The type of asset object
   * @return depreciableObjectType
  **/
  @ApiModelProperty(example = "Asset", value = "The type of asset object")
  public String getDepreciableObjectType() {
    return depreciableObjectType;
  }

  public void setDepreciableObjectType(String depreciableObjectType) {
    this.depreciableObjectType = depreciableObjectType;
  }

  public BookDepreciationSetting bookEffectiveDateOfChangeId(UUID bookEffectiveDateOfChangeId) {
    this.bookEffectiveDateOfChangeId = bookEffectiveDateOfChangeId;
    return this;
  }

   /**
   * Unique Xero identifier for the effective date change
   * @return bookEffectiveDateOfChangeId
  **/
  @ApiModelProperty(example = "68f17094-af97-4f1b-b36b-013b45b6ad3c", value = "Unique Xero identifier for the effective date change")
  public UUID getBookEffectiveDateOfChangeId() {
    return bookEffectiveDateOfChangeId;
  }

  public void setBookEffectiveDateOfChangeId(UUID bookEffectiveDateOfChangeId) {
    this.bookEffectiveDateOfChangeId = bookEffectiveDateOfChangeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookDepreciationSetting bookDepreciationSetting = (BookDepreciationSetting) o;
    return Objects.equals(this.depreciationMethod, bookDepreciationSetting.depreciationMethod) &&
        Objects.equals(this.averagingMethod, bookDepreciationSetting.averagingMethod) &&
        Objects.equals(this.depreciationRate, bookDepreciationSetting.depreciationRate) &&
        Objects.equals(this.effectiveLifeYears, bookDepreciationSetting.effectiveLifeYears) &&
        Objects.equals(this.depreciationCalculationMethod, bookDepreciationSetting.depreciationCalculationMethod) &&
        Objects.equals(this.depreciableObjectId, bookDepreciationSetting.depreciableObjectId) &&
        Objects.equals(this.depreciableObjectType, bookDepreciationSetting.depreciableObjectType) &&
        Objects.equals(this.bookEffectiveDateOfChangeId, bookDepreciationSetting.bookEffectiveDateOfChangeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depreciationMethod, averagingMethod, depreciationRate, effectiveLifeYears, depreciationCalculationMethod, depreciableObjectId, depreciableObjectType, bookEffectiveDateOfChangeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookDepreciationSetting {\n");
    sb.append("    depreciationMethod: ").append(toIndentedString(depreciationMethod)).append("\n");
    sb.append("    averagingMethod: ").append(toIndentedString(averagingMethod)).append("\n");
    sb.append("    depreciationRate: ").append(toIndentedString(depreciationRate)).append("\n");
    sb.append("    effectiveLifeYears: ").append(toIndentedString(effectiveLifeYears)).append("\n");
    sb.append("    depreciationCalculationMethod: ").append(toIndentedString(depreciationCalculationMethod)).append("\n");
    sb.append("    depreciableObjectId: ").append(toIndentedString(depreciableObjectId)).append("\n");
    sb.append("    depreciableObjectType: ").append(toIndentedString(depreciableObjectType)).append("\n");
    sb.append("    bookEffectiveDateOfChangeId: ").append(toIndentedString(bookEffectiveDateOfChangeId)).append("\n");
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

