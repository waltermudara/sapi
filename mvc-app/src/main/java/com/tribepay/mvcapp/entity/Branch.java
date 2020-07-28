package com.tribepay.mvcapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch {

  @Id
  private long branch_id;

  private String name;
  private long city_id;


  public long getBranch_id() {
    return branch_id;
  }

  public void setBranch_id(long branchId) {
    this.branch_id = branchId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getCity_id() {
    return city_id;
  }

  public void setCity_id(long cityId) {
    this.city_id = cityId;
  }

}
