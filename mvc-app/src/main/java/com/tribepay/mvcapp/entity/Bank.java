package com.tribepay.mvcapp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Bank {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long bank_id;

  private String name;
  private long country_id;
  private long branch_id;

  public long getBank_id() {
    return bank_id;
  }

  public void setBank_id(long bankId) {
    this.bank_id = bankId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getCountry_id() {
    return country_id;
  }

  public void setCountry_id(long countryId) {
    this.country_id = countryId;
  }


  public long getBranch_id() {
    return branch_id;
  }

  public void setBranch_id(long branchId) {
    this.branch_id = branchId;
  }

}
