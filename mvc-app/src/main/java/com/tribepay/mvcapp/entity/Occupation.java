package com.tribepay.mvcapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Occupation {
@Id
  private long occupation_id;
  private String name;


  public long getOccupation_id() {
    return occupation_id;
  }

  public void setOccupation_id(long occupationId) {
    this.occupation_id = occupationId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
