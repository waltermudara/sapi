package com.tribepay.mvcapp.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "customer")
public class Customer implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
  private long customer_id;

  private String customer_name;
  private String customer_surname;
  private String msisdn;
  private java.sql.Date dob;
  private String national_id;
  private String email_address;
  private String gender;
  private long occupation_id;
  private String status;
  private long city_id;

  private String address_line;
  private String address_line2;
  private String address_line3;

  @Column(name = "customer_id", nullable = false)
  public long getCustomer_id() {
    return customer_id;
  }

  public void setCustomer_id(long customerId) {
    this.customer_id = customerId;
  }


  public String getCustomer_name() {
    return customer_name;
  }

  public void setCustomer_name(String customerName) {
    this.customer_name = customerName;
  }


  public String getCustomer_surname() {
    return customer_surname;
  }

  public void setCustomer_surname(String customerSurname) {
    this.customer_surname = customerSurname;
  }


  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }


  public java.sql.Date getDob() {
    return dob;
  }

  public void setDob(java.sql.Date dob) {
    this.dob = dob;
  }


  public String getNational_id() {
    return national_id;
  }

  public void setNational_id(String nationalId) {
    this.national_id = nationalId;
  }


  public String getEmail_address() {
    return email_address;
  }

  public void setEmail_address(String emailAddress) {
    this.email_address = emailAddress;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public long getOccupation_id() {
    return occupation_id;
  }

  public void setOccupation_id(long occupationId) {
    this.occupation_id = occupationId;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public long getCity_id() {
    return city_id;
  }

  public void setCity_id(long cityId) {
    this.city_id = cityId;
  }


  public String getAddress_line() {
    return address_line;
  }

  public void setAddress_line(String addressLine) {
    this.address_line = addressLine;
  }


  public String getAddress_line2() {
    return address_line2;
  }

  public void setAddress_line2(String addressLine2) {
    this.address_line2 = addressLine2;
  }

  @Override
  public String toString() {
    return "CustomerAccountDetail{" +
            "customerId=" + customer_id +
            ", customerName='" + customer_name + '\'' +
            ", customerSurname='" + customer_surname + '\'' +
            ", msisdn='" + msisdn + '\'' +
            ", dob=" + dob +
            ", nationalId='" + national_id + '\'' +
            ", emailAddress='" + email_address + '\'' +
            ", gender='" + gender + '\'' +
            ", occupationId=" + occupation_id +
            ", status='" + status + '\'' +
            ", cityId=" + city_id +
            ", addressLine='" + address_line + '\'' +
            ", addressLine2='" + address_line2 + '\'' +
            ", addressLine3='" + address_line3 + '\'' +
            '}';
  }

  public String getAddress_line3() {
    return address_line3;
  }

  public void setAddress_line3(String addressLine3) {
    this.address_line3 = addressLine3;
  }

}
