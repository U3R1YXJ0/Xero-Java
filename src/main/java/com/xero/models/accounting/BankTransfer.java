/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0.0
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
import com.xero.models.accounting.Account;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * BankTransfer
 */

public class BankTransfer {
  
  @JsonProperty("FromBankAccount")
  private Account fromBankAccount = null;

  
  @JsonProperty("ToBankAccount")
  private Account toBankAccount = null;

  
  @JsonProperty("Amount")
  private String amount = null;

  @JsonDeserialize(using = com.xero.api.CustomDateDeserializer.class)
  @JsonProperty("Date")
  private LocalDate date = null;

  
  @JsonProperty("BankTransferID")
  private UUID bankTransferID = null;

  
  @JsonProperty("CurrencyRate")
  private Float currencyRate = null;

  
  @JsonProperty("FromBankTransactionID")
  private UUID fromBankTransactionID = null;

  
  @JsonProperty("ToBankTransactionID")
  private UUID toBankTransactionID = null;

  
  @JsonProperty("HasAttachments")
  private Boolean hasAttachments = null;

  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("CreatedDateUTC")
  private OffsetDateTime createdDateUTC = null;

  public BankTransfer fromBankAccount(Account fromBankAccount) {
    this.fromBankAccount = fromBankAccount;
    return this;
  }

   /**
   * Get fromBankAccount
   * @return fromBankAccount
  **/
  @ApiModelProperty(required = true, value = "")
  public Account getFromBankAccount() {
    return fromBankAccount;
  }

  public void setFromBankAccount(Account fromBankAccount) {
    this.fromBankAccount = fromBankAccount;
  }

  public BankTransfer toBankAccount(Account toBankAccount) {
    this.toBankAccount = toBankAccount;
    return this;
  }

   /**
   * Get toBankAccount
   * @return toBankAccount
  **/
  @ApiModelProperty(required = true, value = "")
  public Account getToBankAccount() {
    return toBankAccount;
  }

  public void setToBankAccount(Account toBankAccount) {
    this.toBankAccount = toBankAccount;
  }

  public BankTransfer amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * amount of the transaction
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "amount of the transaction")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public BankTransfer date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date of the Transfer YYYY-MM-DD
   * @return date
  **/
  @ApiModelProperty(value = "The date of the Transfer YYYY-MM-DD")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

   /**
   * The identifier of the Bank Transfer
   * @return bankTransferID
  **/
  @ApiModelProperty(value = "The identifier of the Bank Transfer")
  public UUID getBankTransferID() {
    return bankTransferID;
  }

   /**
   * The currency rate
   * @return currencyRate
  **/
  @ApiModelProperty(value = "The currency rate")
  public Float getCurrencyRate() {
    return currencyRate;
  }

   /**
   * The Bank Transaction ID for the source account
   * @return fromBankTransactionID
  **/
  @ApiModelProperty(value = "The Bank Transaction ID for the source account")
  public UUID getFromBankTransactionID() {
    return fromBankTransactionID;
  }

   /**
   * The Bank Transaction ID for the destination account
   * @return toBankTransactionID
  **/
  @ApiModelProperty(value = "The Bank Transaction ID for the destination account")
  public UUID getToBankTransactionID() {
    return toBankTransactionID;
  }

   /**
   * Boolean to indicate if a Bank Transfer has an attachment
   * @return hasAttachments
  **/
  @ApiModelProperty(value = "Boolean to indicate if a Bank Transfer has an attachment")
  public Boolean getHasAttachments() {
    return hasAttachments;
  }

   /**
   * UTC timestamp of creation date of bank transfer
   * @return createdDateUTC
  **/
  @ApiModelProperty(value = "UTC timestamp of creation date of bank transfer")
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
    BankTransfer bankTransfer = (BankTransfer) o;
    return Objects.equals(this.fromBankAccount, bankTransfer.fromBankAccount) &&
        Objects.equals(this.toBankAccount, bankTransfer.toBankAccount) &&
        Objects.equals(this.amount, bankTransfer.amount) &&
        Objects.equals(this.date, bankTransfer.date) &&
        Objects.equals(this.bankTransferID, bankTransfer.bankTransferID) &&
        Objects.equals(this.currencyRate, bankTransfer.currencyRate) &&
        Objects.equals(this.fromBankTransactionID, bankTransfer.fromBankTransactionID) &&
        Objects.equals(this.toBankTransactionID, bankTransfer.toBankTransactionID) &&
        Objects.equals(this.hasAttachments, bankTransfer.hasAttachments) &&
        Objects.equals(this.createdDateUTC, bankTransfer.createdDateUTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromBankAccount, toBankAccount, amount, date, bankTransferID, currencyRate, fromBankTransactionID, toBankTransactionID, hasAttachments, createdDateUTC);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransfer {\n");
    
    sb.append("    fromBankAccount: ").append(toIndentedString(fromBankAccount)).append("\n");
    sb.append("    toBankAccount: ").append(toIndentedString(toBankAccount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    bankTransferID: ").append(toIndentedString(bankTransferID)).append("\n");
    sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
    sb.append("    fromBankTransactionID: ").append(toIndentedString(fromBankTransactionID)).append("\n");
    sb.append("    toBankTransactionID: ").append(toIndentedString(toBankTransactionID)).append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
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
