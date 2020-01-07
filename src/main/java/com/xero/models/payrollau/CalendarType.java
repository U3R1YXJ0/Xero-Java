/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrollau;

import java.util.Objects;
import java.util.Arrays;
import org.threeten.bp.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CalendarType
 */
public enum CalendarType {
  
  WEEKLY("WEEKLY"),
  
  FORTNIGHTLY("FORTNIGHTLY"),
  
  FOURWEEKLY("FOURWEEKLY"),
  
  MONTHLY("MONTHLY"),
  
  TWICEMONTHLY("TWICEMONTHLY"),
  
  QUARTERLY("QUARTERLY");

  private String value;

  CalendarType(String value) {
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
  public static CalendarType fromValue(String value) {
    for (CalendarType b : CalendarType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

