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
import org.threeten.bp.LocalDate;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Schedule
 */

public class Schedule {
  StringUtil util = new StringUtil();

  
  @JsonProperty("Period")
  private Integer period;
  /**
   * One of the following - WEEKLY or MONTHLY
   */
  public enum UnitEnum {
    WEEKLY("WEEKLY"),
    
    MONTHLY("MONTHLY");

    private String value;

    UnitEnum(String value) {
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
    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  
  @JsonProperty("Unit")
  private UnitEnum unit;

  
  @JsonProperty("DueDate")
  private Integer dueDate;
  /**
   * the payment terms
   */
  public enum DueDateTypeEnum {
    DAYSAFTERBILLDATE("DAYSAFTERBILLDATE"),
    
    DAYSAFTERBILLMONTH("DAYSAFTERBILLMONTH"),
    
    OFCURRENTMONTH("OFCURRENTMONTH"),
    
    OFFOLLOWINGMONTH("OFFOLLOWINGMONTH");

    private String value;

    DueDateTypeEnum(String value) {
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
    public static DueDateTypeEnum fromValue(String value) {
      for (DueDateTypeEnum b : DueDateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  
  @JsonProperty("DueDateType")
  private DueDateTypeEnum dueDateType;

  @JsonDeserialize(using = com.xero.api.CustomDateDeserializer.class)
  @JsonProperty("StartDate")
  private LocalDate startDate;

  @JsonDeserialize(using = com.xero.api.CustomDateDeserializer.class)
  @JsonProperty("NextScheduledDate")
  private LocalDate nextScheduledDate;

  @JsonDeserialize(using = com.xero.api.CustomDateDeserializer.class)
  @JsonProperty("EndDate")
  private LocalDate endDate;
  public Schedule period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Integer used with the unit e.g. 1 (every 1 week), 2 (every 2 months)
   * @return period
  **/
  @ApiModelProperty(value = "Integer used with the unit e.g. 1 (every 1 week), 2 (every 2 months)")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public Schedule unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

   /**
   * One of the following - WEEKLY or MONTHLY
   * @return unit
  **/
  @ApiModelProperty(value = "One of the following - WEEKLY or MONTHLY")
  public UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  public Schedule dueDate(Integer dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Integer used with due date type e.g 20 (of following month), 31 (of current month)
   * @return dueDate
  **/
  @ApiModelProperty(value = "Integer used with due date type e.g 20 (of following month), 31 (of current month)")
  public Integer getDueDate() {
    return dueDate;
  }

  public void setDueDate(Integer dueDate) {
    this.dueDate = dueDate;
  }

  public Schedule dueDateType(DueDateTypeEnum dueDateType) {
    this.dueDateType = dueDateType;
    return this;
  }

   /**
   * the payment terms
   * @return dueDateType
  **/
  @ApiModelProperty(value = "the payment terms")
  public DueDateTypeEnum getDueDateType() {
    return dueDateType;
  }

  public void setDueDateType(DueDateTypeEnum dueDateType) {
    this.dueDateType = dueDateType;
  }

  public Schedule startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Date the first invoice of the current version of the repeating schedule was generated (changes when repeating invoice is edited)
   * @return startDate
  **/
  @ApiModelProperty(value = "Date the first invoice of the current version of the repeating schedule was generated (changes when repeating invoice is edited)")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Schedule nextScheduledDate(LocalDate nextScheduledDate) {
    this.nextScheduledDate = nextScheduledDate;
    return this;
  }

   /**
   * The calendar date of the next invoice in the schedule to be generated
   * @return nextScheduledDate
  **/
  @ApiModelProperty(value = "The calendar date of the next invoice in the schedule to be generated")
  public LocalDate getNextScheduledDate() {
    return nextScheduledDate;
  }

  public void setNextScheduledDate(LocalDate nextScheduledDate) {
    this.nextScheduledDate = nextScheduledDate;
  }

  public Schedule endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Invoice end date – only returned if the template has an end date set
   * @return endDate
  **/
  @ApiModelProperty(value = "Invoice end date – only returned if the template has an end date set")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.period, schedule.period) &&
        Objects.equals(this.unit, schedule.unit) &&
        Objects.equals(this.dueDate, schedule.dueDate) &&
        Objects.equals(this.dueDateType, schedule.dueDateType) &&
        Objects.equals(this.startDate, schedule.startDate) &&
        Objects.equals(this.nextScheduledDate, schedule.nextScheduledDate) &&
        Objects.equals(this.endDate, schedule.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, unit, dueDate, dueDateType, startDate, nextScheduledDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    dueDateType: ").append(toIndentedString(dueDateType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    nextScheduledDate: ").append(toIndentedString(nextScheduledDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

