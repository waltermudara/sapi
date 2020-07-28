package com.tribepay.mvcapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyTypes {
@Id
  private long currency_type_id;
  private String currency_type_name;


  public long getCurrency_type_id() {
    return currency_type_id;
  }

  public void setCurrency_type_id(long currencyTypeId) {
    this.currency_type_id = currencyTypeId;
  }


  public String getCurrency_type_name() {
    return currency_type_name;
  }

  public void setCurrency_type_name(String currencyTypeName) {
    this.currency_type_name = currencyTypeName;
  }

}
