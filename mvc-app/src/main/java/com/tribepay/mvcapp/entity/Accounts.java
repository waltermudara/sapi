package com.tribepay.mvcapp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity

@Data
public class Accounts {
@Id
  private long account_id;

  private long customer_id;
  private String account_name;
  private String account_number;
  private long account_type;
  private long currency_type;
  private long bank_id;
  private long branch_id;
  private String account_status;

 // @ManyToOne
 // private Customer customer;

 // @ManyToOne
 // private AccountTypes accountType;

 // @ManyToOne
 // private Bank bank;

  //@ManyToOne
 // private Branch branch;


  public long getAccount_id() {
    return account_id;
  }

  public void setAccount_id(long accountId) {
    this.account_id = accountId;
  }


  public long getCustomer_id() {
    return customer_id;
  }

  public void setCustomer_id(long customerId) {
    this.customer_id = customerId;
  }


  public String getAccount_name() {
    return account_name;
  }

  public void setAccount_name(String accountName) {
    this.account_name = accountName;
  }


  public String getAccount_number() {
    return account_number;
  }

  public void setAccount_number(String accountNumber) {
    this.account_number = accountNumber;
  }


  public long getAccount_type() {
    return account_type;
  }

  public void setAccount_type(long accountType) {
    this.account_type = accountType;
  }


  public long getCurrency_type() {
    return currency_type;
  }

  public void setCurrency_type(long currencyType) {
    this.currency_type = currencyType;
  }


  public long getBank_id() {
    return bank_id;
  }

  public void setBank_id(long bankId) {
    this.bank_id = bankId;
  }


  public long getBranch_id() {
    return branch_id;
  }

  public void setBranch_id(long branchId) {
    this.branch_id = branchId;
  }


  public String getAccount_status() {
    return account_status;
  }

  public void setAccount_status(String accountStatus) {
    this.account_status = accountStatus;
  }

}
