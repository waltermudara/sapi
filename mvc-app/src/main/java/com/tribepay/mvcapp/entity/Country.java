package com.tribepay.mvcapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
@Id
  private long country_id;

  private String name;


  public long getCountry_id() {
    return country_id;
  }

  public void setCountry_id(long countryId) {
    this.country_id = countryId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
