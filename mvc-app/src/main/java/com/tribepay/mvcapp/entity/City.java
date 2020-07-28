package com.tribepay.mvcapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {

@Id
private long city_id;

  private String name;
  private long country_id;


  public long getCity_id() {
    return city_id;
  }

  public void setCity_id(long cityId) {
    this.city_id = cityId;
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

}
