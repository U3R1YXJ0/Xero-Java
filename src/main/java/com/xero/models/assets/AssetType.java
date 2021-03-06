/*
 * Xero Assets API
 * This is the Xero Assets API
 *
 * The version of the OpenAPI document: 2.2.13
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.assets;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** AssetType */
public class AssetType {
  StringUtil util = new StringUtil();

  @JsonProperty("assetTypeId")
  private UUID assetTypeId;

  @JsonProperty("assetTypeName")
  private String assetTypeName;

  @JsonProperty("fixedAssetAccountId")
  private UUID fixedAssetAccountId;

  @JsonProperty("depreciationExpenseAccountId")
  private UUID depreciationExpenseAccountId;

  @JsonProperty("accumulatedDepreciationAccountId")
  private UUID accumulatedDepreciationAccountId;

  @JsonProperty("bookDepreciationSetting")
  private BookDepreciationSetting bookDepreciationSetting;

  @JsonProperty("locks")
  private Integer locks;

  public AssetType assetTypeId(UUID assetTypeId) {
    this.assetTypeId = assetTypeId;
    return this;
  }

  /**
   * Xero generated unique identifier for asset types
   *
   * @return assetTypeId
   */
  @ApiModelProperty(
      example = "5da209c5-5e19-4a43-b925-71b776c49ced",
      value = "Xero generated unique identifier for asset types")
  public UUID getAssetTypeId() {
    return assetTypeId;
  }

  public void setAssetTypeId(UUID assetTypeId) {
    this.assetTypeId = assetTypeId;
  }

  public AssetType assetTypeName(String assetTypeName) {
    this.assetTypeName = assetTypeName;
    return this;
  }

  /**
   * The name of the asset type
   *
   * @return assetTypeName
   */
  @ApiModelProperty(
      example = "Computer Equipment",
      required = true,
      value = "The name of the asset type")
  public String getAssetTypeName() {
    return assetTypeName;
  }

  public void setAssetTypeName(String assetTypeName) {
    this.assetTypeName = assetTypeName;
  }

  public AssetType fixedAssetAccountId(UUID fixedAssetAccountId) {
    this.fixedAssetAccountId = fixedAssetAccountId;
    return this;
  }

  /**
   * The asset account for fixed assets of this type
   *
   * @return fixedAssetAccountId
   */
  @ApiModelProperty(
      example = "24e260f1-bfc4-4766-ad7f-8a8ce01de879",
      value = "The asset account for fixed assets of this type")
  public UUID getFixedAssetAccountId() {
    return fixedAssetAccountId;
  }

  public void setFixedAssetAccountId(UUID fixedAssetAccountId) {
    this.fixedAssetAccountId = fixedAssetAccountId;
  }

  public AssetType depreciationExpenseAccountId(UUID depreciationExpenseAccountId) {
    this.depreciationExpenseAccountId = depreciationExpenseAccountId;
    return this;
  }

  /**
   * The expense account for the depreciation of fixed assets of this type
   *
   * @return depreciationExpenseAccountId
   */
  @ApiModelProperty(
      example = "b23fc79b-d66b-44b0-a240-e138e086fcbc",
      value = "The expense account for the depreciation of fixed assets of this type")
  public UUID getDepreciationExpenseAccountId() {
    return depreciationExpenseAccountId;
  }

  public void setDepreciationExpenseAccountId(UUID depreciationExpenseAccountId) {
    this.depreciationExpenseAccountId = depreciationExpenseAccountId;
  }

  public AssetType accumulatedDepreciationAccountId(UUID accumulatedDepreciationAccountId) {
    this.accumulatedDepreciationAccountId = accumulatedDepreciationAccountId;
    return this;
  }

  /**
   * The account for accumulated depreciation of fixed assets of this type
   *
   * @return accumulatedDepreciationAccountId
   */
  @ApiModelProperty(
      example = "ca4c6b39-4f4f-43e8-98da-5e1f350a6694",
      value = "The account for accumulated depreciation of fixed assets of this type")
  public UUID getAccumulatedDepreciationAccountId() {
    return accumulatedDepreciationAccountId;
  }

  public void setAccumulatedDepreciationAccountId(UUID accumulatedDepreciationAccountId) {
    this.accumulatedDepreciationAccountId = accumulatedDepreciationAccountId;
  }

  public AssetType bookDepreciationSetting(BookDepreciationSetting bookDepreciationSetting) {
    this.bookDepreciationSetting = bookDepreciationSetting;
    return this;
  }

  /**
   * Get bookDepreciationSetting
   *
   * @return bookDepreciationSetting
   */
  @ApiModelProperty(required = true, value = "")
  public BookDepreciationSetting getBookDepreciationSetting() {
    return bookDepreciationSetting;
  }

  public void setBookDepreciationSetting(BookDepreciationSetting bookDepreciationSetting) {
    this.bookDepreciationSetting = bookDepreciationSetting;
  }

  public AssetType locks(Integer locks) {
    this.locks = locks;
    return this;
  }

  /**
   * All asset types that have accumulated depreciation for any assets that use them are deemed
   * ‘locked’ and cannot be removed.
   *
   * @return locks
   */
  @ApiModelProperty(
      example = "33",
      value =
          "All asset types that have accumulated depreciation for any assets that use them are"
              + " deemed ‘locked’ and cannot be removed.")
  public Integer getLocks() {
    return locks;
  }

  public void setLocks(Integer locks) {
    this.locks = locks;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetType assetType = (AssetType) o;
    return Objects.equals(this.assetTypeId, assetType.assetTypeId)
        && Objects.equals(this.assetTypeName, assetType.assetTypeName)
        && Objects.equals(this.fixedAssetAccountId, assetType.fixedAssetAccountId)
        && Objects.equals(this.depreciationExpenseAccountId, assetType.depreciationExpenseAccountId)
        && Objects.equals(
            this.accumulatedDepreciationAccountId, assetType.accumulatedDepreciationAccountId)
        && Objects.equals(this.bookDepreciationSetting, assetType.bookDepreciationSetting)
        && Objects.equals(this.locks, assetType.locks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assetTypeId,
        assetTypeName,
        fixedAssetAccountId,
        depreciationExpenseAccountId,
        accumulatedDepreciationAccountId,
        bookDepreciationSetting,
        locks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetType {\n");
    sb.append("    assetTypeId: ").append(toIndentedString(assetTypeId)).append("\n");
    sb.append("    assetTypeName: ").append(toIndentedString(assetTypeName)).append("\n");
    sb.append("    fixedAssetAccountId: ")
        .append(toIndentedString(fixedAssetAccountId))
        .append("\n");
    sb.append("    depreciationExpenseAccountId: ")
        .append(toIndentedString(depreciationExpenseAccountId))
        .append("\n");
    sb.append("    accumulatedDepreciationAccountId: ")
        .append(toIndentedString(accumulatedDepreciationAccountId))
        .append("\n");
    sb.append("    bookDepreciationSetting: ")
        .append(toIndentedString(bookDepreciationSetting))
        .append("\n");
    sb.append("    locks: ").append(toIndentedString(locks)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
