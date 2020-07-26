package com.tribepay.mvcapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountTypes {
 @Id
  private long accountTypeId;

  private String accountTypeName;


  public long getAccountTypeId() {
    return accountTypeId;
  }

  public void setAccountTypeId(long accountTypeId) {
    this.accountTypeId = accountTypeId;
  }


  public String getAccountTypeName() {
    return accountTypeName;
  }

  public void setAccountTypeName(String accountTypeName) {
    this.accountTypeName = accountTypeName;
  }

}
