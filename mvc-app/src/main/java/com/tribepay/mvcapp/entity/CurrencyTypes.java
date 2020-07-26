package com.tribepay.mvcapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyTypes {
@Id
  private long currencyTypeId;
  private String currencyTypeName;


  public long getCurrencyTypeId() {
    return currencyTypeId;
  }

  public void setCurrencyTypeId(long currencyTypeId) {
    this.currencyTypeId = currencyTypeId;
  }


  public String getCurrencyTypeName() {
    return currencyTypeName;
  }

  public void setCurrencyTypeName(String currencyTypeName) {
    this.currencyTypeName = currencyTypeName;
  }

}
