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


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** See Asset Status Codes. */
public enum AssetStatus {
  DRAFT("Draft"),

  REGISTERED("Registered"),

  DISPOSED("Disposed");

  private String value;

  AssetStatus(String value) {
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
  public static AssetStatus fromValue(String value) {
    for (AssetStatus b : AssetStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
