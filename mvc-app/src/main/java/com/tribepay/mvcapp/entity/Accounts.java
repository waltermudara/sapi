package com.tribepay.mvcapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accounts {
@Id
  private long accountId;

  private long customerId;
  private String accountName;
  private String accountNumber;
  private long accountType;
  private long currencyType;
  private long bankId;
  private long branchId;
  private String accountStatus;


  public long getAccountId() {
    return accountId;
  }

  public void setAccountId(long accountId) {
    this.accountId = accountId;
  }


  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }


  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public long getAccountType() {
    return accountType;
  }

  public void setAccountType(long accountType) {
    this.accountType = accountType;
  }


  public long getCurrencyType() {
    return currencyType;
  }

  public void setCurrencyType(long currencyType) {
    this.currencyType = currencyType;
  }


  public long getBankId() {
    return bankId;
  }

  public void setBankId(long bankId) {
    this.bankId = bankId;
  }


  public long getBranchId() {
    return branchId;
  }

  public void setBranchId(long branchId) {
    this.branchId = branchId;
  }


  public String getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }

}
