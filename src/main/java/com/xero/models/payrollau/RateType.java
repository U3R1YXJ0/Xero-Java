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
 * Gets or Sets RateType
 */
public enum RateType {
  
  FIXEDAMOUNT("FIXEDAMOUNT"),
  
  MULTIPLE_MULTIPLE_OF_EMPLOYEE_S_ORDINARY_EARNINGS_RATE_AN_EARNINGS_RATE_WHICH_IS_DERIVED_FROM_AN_EMPLOYEE_S_ORDINARY_EARNINGS_RATE("MULTIPLE  Multiple of Employee’s Ordinary Earnings Rate - an earnings rate which is derived from an employee’s ordinary earnings rate"),
  
  RATEPERUNIT_AN_EARNINGS_RATE_ALLOWING_ENTRY_OF_A_RATE_PER_UNIT("RATEPERUNIT  An earnings rate allowing entry of a rate per unit");

  private String value;

  RateType(String value) {
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
  public static RateType fromValue(String value) {
    for (RateType b : RateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

