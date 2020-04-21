/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrolluk;

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
 * EmployeeTax
 */

public class EmployeeTax {
  StringUtil util = new StringUtil();

  
  @JsonProperty("starterType")
  private String starterType;

  
  @JsonProperty("starterDeclaration")
  private String starterDeclaration;

  
  @JsonProperty("taxCode")
  private String taxCode;

  
  @JsonProperty("w1M1")
  private Boolean w1M1;

  
  @JsonProperty("previousTaxablePay")
  private Float previousTaxablePay;

  
  @JsonProperty("previousTaxPaid")
  private Float previousTaxPaid;

  
  @JsonProperty("studentLoanDeduction")
  private String studentLoanDeduction;

  
  @JsonProperty("hasPostGraduateLoans")
  private Boolean hasPostGraduateLoans;

  
  @JsonProperty("isDirector")
  private Boolean isDirector;

  
  @JsonProperty("directorshipStartDate")
  private LocalDate directorshipStartDate;

  
  @JsonProperty("nicCalculationMethod")
  private String nicCalculationMethod;
  public EmployeeTax starterType(String starterType) {
    this.starterType = starterType;
    return this;
  }

   /**
   * The Starter type.
   * @return starterType
  **/
  @ApiModelProperty(example = "New Employee with P45", value = "The Starter type.")
  public String getStarterType() {
    return starterType;
  }

  public void setStarterType(String starterType) {
    this.starterType = starterType;
  }

  public EmployeeTax starterDeclaration(String starterDeclaration) {
    this.starterDeclaration = starterDeclaration;
    return this;
  }

   /**
   * Starter declaration.
   * @return starterDeclaration
  **/
  @ApiModelProperty(example = "B.) This is currently their only job", value = "Starter declaration.")
  public String getStarterDeclaration() {
    return starterDeclaration;
  }

  public void setStarterDeclaration(String starterDeclaration) {
    this.starterDeclaration = starterDeclaration;
  }

  public EmployeeTax taxCode(String taxCode) {
    this.taxCode = taxCode;
    return this;
  }

   /**
   * The Tax code.
   * @return taxCode
  **/
  @ApiModelProperty(example = "1185L", value = "The Tax code.")
  public String getTaxCode() {
    return taxCode;
  }

  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }

  public EmployeeTax w1M1(Boolean w1M1) {
    this.w1M1 = w1M1;
    return this;
  }

   /**
   * Describes whether the tax settings is W1M1
   * @return w1M1
  **/
  @ApiModelProperty(value = "Describes whether the tax settings is W1M1")
  public Boolean getW1M1() {
    return w1M1;
  }

  public void setW1M1(Boolean w1M1) {
    this.w1M1 = w1M1;
  }

  public EmployeeTax previousTaxablePay(Float previousTaxablePay) {
    this.previousTaxablePay = previousTaxablePay;
    return this;
  }

   /**
   * The previous taxable pay
   * @return previousTaxablePay
  **/
  @ApiModelProperty(value = "The previous taxable pay")
  public Float getPreviousTaxablePay() {
    return previousTaxablePay;
  }

  public void setPreviousTaxablePay(Float previousTaxablePay) {
    this.previousTaxablePay = previousTaxablePay;
  }

  public EmployeeTax previousTaxPaid(Float previousTaxPaid) {
    this.previousTaxPaid = previousTaxPaid;
    return this;
  }

   /**
   * The tax amount previously paid
   * @return previousTaxPaid
  **/
  @ApiModelProperty(value = "The tax amount previously paid")
  public Float getPreviousTaxPaid() {
    return previousTaxPaid;
  }

  public void setPreviousTaxPaid(Float previousTaxPaid) {
    this.previousTaxPaid = previousTaxPaid;
  }

  public EmployeeTax studentLoanDeduction(String studentLoanDeduction) {
    this.studentLoanDeduction = studentLoanDeduction;
    return this;
  }

   /**
   * The employee&#39;s student loan deduction type
   * @return studentLoanDeduction
  **/
  @ApiModelProperty(example = "Plan Type 2", value = "The employee's student loan deduction type")
  public String getStudentLoanDeduction() {
    return studentLoanDeduction;
  }

  public void setStudentLoanDeduction(String studentLoanDeduction) {
    this.studentLoanDeduction = studentLoanDeduction;
  }

  public EmployeeTax hasPostGraduateLoans(Boolean hasPostGraduateLoans) {
    this.hasPostGraduateLoans = hasPostGraduateLoans;
    return this;
  }

   /**
   * Describes whether the employee has post graduate loans
   * @return hasPostGraduateLoans
  **/
  @ApiModelProperty(value = "Describes whether the employee has post graduate loans")
  public Boolean getHasPostGraduateLoans() {
    return hasPostGraduateLoans;
  }

  public void setHasPostGraduateLoans(Boolean hasPostGraduateLoans) {
    this.hasPostGraduateLoans = hasPostGraduateLoans;
  }

  public EmployeeTax isDirector(Boolean isDirector) {
    this.isDirector = isDirector;
    return this;
  }

   /**
   * Describes whether the employee is director
   * @return isDirector
  **/
  @ApiModelProperty(value = "Describes whether the employee is director")
  public Boolean getIsDirector() {
    return isDirector;
  }

  public void setIsDirector(Boolean isDirector) {
    this.isDirector = isDirector;
  }

  public EmployeeTax directorshipStartDate(LocalDate directorshipStartDate) {
    this.directorshipStartDate = directorshipStartDate;
    return this;
  }

   /**
   * The directorship start date
   * @return directorshipStartDate
  **/
  @ApiModelProperty(value = "The directorship start date")
  public LocalDate getDirectorshipStartDate() {
    return directorshipStartDate;
  }

  public void setDirectorshipStartDate(LocalDate directorshipStartDate) {
    this.directorshipStartDate = directorshipStartDate;
  }

  public EmployeeTax nicCalculationMethod(String nicCalculationMethod) {
    this.nicCalculationMethod = nicCalculationMethod;
    return this;
  }

   /**
   * NICs calculation method
   * @return nicCalculationMethod
  **/
  @ApiModelProperty(example = "Annualized", value = "NICs calculation method")
  public String getNicCalculationMethod() {
    return nicCalculationMethod;
  }

  public void setNicCalculationMethod(String nicCalculationMethod) {
    this.nicCalculationMethod = nicCalculationMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeTax employeeTax = (EmployeeTax) o;
    return Objects.equals(this.starterType, employeeTax.starterType) &&
        Objects.equals(this.starterDeclaration, employeeTax.starterDeclaration) &&
        Objects.equals(this.taxCode, employeeTax.taxCode) &&
        Objects.equals(this.w1M1, employeeTax.w1M1) &&
        Objects.equals(this.previousTaxablePay, employeeTax.previousTaxablePay) &&
        Objects.equals(this.previousTaxPaid, employeeTax.previousTaxPaid) &&
        Objects.equals(this.studentLoanDeduction, employeeTax.studentLoanDeduction) &&
        Objects.equals(this.hasPostGraduateLoans, employeeTax.hasPostGraduateLoans) &&
        Objects.equals(this.isDirector, employeeTax.isDirector) &&
        Objects.equals(this.directorshipStartDate, employeeTax.directorshipStartDate) &&
        Objects.equals(this.nicCalculationMethod, employeeTax.nicCalculationMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(starterType, starterDeclaration, taxCode, w1M1, previousTaxablePay, previousTaxPaid, studentLoanDeduction, hasPostGraduateLoans, isDirector, directorshipStartDate, nicCalculationMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeTax {\n");
    sb.append("    starterType: ").append(toIndentedString(starterType)).append("\n");
    sb.append("    starterDeclaration: ").append(toIndentedString(starterDeclaration)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    w1M1: ").append(toIndentedString(w1M1)).append("\n");
    sb.append("    previousTaxablePay: ").append(toIndentedString(previousTaxablePay)).append("\n");
    sb.append("    previousTaxPaid: ").append(toIndentedString(previousTaxPaid)).append("\n");
    sb.append("    studentLoanDeduction: ").append(toIndentedString(studentLoanDeduction)).append("\n");
    sb.append("    hasPostGraduateLoans: ").append(toIndentedString(hasPostGraduateLoans)).append("\n");
    sb.append("    isDirector: ").append(toIndentedString(isDirector)).append("\n");
    sb.append("    directorshipStartDate: ").append(toIndentedString(directorshipStartDate)).append("\n");
    sb.append("    nicCalculationMethod: ").append(toIndentedString(nicCalculationMethod)).append("\n");
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

