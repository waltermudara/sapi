package com.tribepay.mvcapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountTypes {
 @Id
  private long account_type_id;

  private String account_type_name;


  public long getAccount_type_id() {
    return account_type_id;
  }

  public void setAccount_type_id(long accountTypeId) {
    this.account_type_id = accountTypeId;
  }


  public String getAccount_type_name() {
    return account_type_name;
  }

  public void setAccount_type_name(String accountTypeName) {
    this.account_type_name = accountTypeName;
  }

}
