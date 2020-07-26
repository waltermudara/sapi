package com.tribepay.mvcapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Occupation {
@Id
  private long occupationId;
  private String name;


  public long getOccupationId() {
    return occupationId;
  }

  public void setOccupationId(long occupationId) {
    this.occupationId = occupationId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
