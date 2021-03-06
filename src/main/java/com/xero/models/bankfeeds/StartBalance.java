/*
 * Bank Feeds API
 * This specifing endpoints Xero Bank feeds API
 *
 * The version of the OpenAPI document: 2.2.13
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.bankfeeds;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** The starting balance of the statement */
@ApiModel(description = "The starting balance of the statement")
public class StartBalance {
  StringUtil util = new StringUtil();

  @JsonProperty("amount")
  private Double amount;

  @JsonProperty("creditDebitIndicator")
  private CreditDebitIndicator creditDebitIndicator;

  public StartBalance amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * decimal(19,4) unsigned Opening/closing balance amount.
   *
   * @return amount
   */
  @ApiModelProperty(
      example = "9.0000",
      value = "decimal(19,4) unsigned Opening/closing balance amount.")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public StartBalance creditDebitIndicator(CreditDebitIndicator creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Get creditDebitIndicator
   *
   * @return creditDebitIndicator
   */
  @ApiModelProperty(value = "")
  public CreditDebitIndicator getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(CreditDebitIndicator creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartBalance startBalance = (StartBalance) o;
    return Objects.equals(this.amount, startBalance.amount)
        && Objects.equals(this.creditDebitIndicator, startBalance.creditDebitIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, creditDebitIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartBalance {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditDebitIndicator: ")
        .append(toIndentedString(creditDebitIndicator))
        .append("\n");
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
