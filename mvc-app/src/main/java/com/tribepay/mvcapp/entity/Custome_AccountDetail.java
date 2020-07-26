package com.tribepay.mvcapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Custome_AccountDetail {
@Id
  private long customerId;
  private String msisdn;
  private String accountFullname;
  private String accountNumber;
  private java.sql.Date dob;
  private String nationalId;
  private String emailAddress;
  private String gender;
  private long age;
  private long occupationId;
  private String status;
  private long bankId;
  private long branchId;
  private long cityId;
  private String addressLine;
  private String address_Line2;
  private String address_Line3;


  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }


  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }


  public String getAccountFullname() {
    return accountFullname;
  }

  public void setAccountFullname(String accountFullname) {
    this.accountFullname = accountFullname;
  }


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public java.sql.Date getDob() {
    return dob;
  }

  public void setDob(java.sql.Date dob) {
    this.dob = dob;
  }


  public String getNationalId() {
    return nationalId;
  }

  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }


  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public long getOccupationId() {
    return occupationId;
  }

  public void setOccupationId(long occupationId) {
    this.occupationId = occupationId;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public long getBankId() {
    return bankId;
  }

  public void setBankId(long bankId) {
    this.bankId = bankId;
  }


  public long getBranchId() {
    return branchId;
  }

  public void setBranchId(long branchId) {
    this.branchId = branchId;
  }


  public long getCityId() {
    return cityId;
  }

  public void setCityId(long cityId) {
    this.cityId = cityId;
  }


  public String getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }


  public String getAddress_Line2() {
    return address_Line2;
  }

  public void setAddress_Line2(String address_Line2) {
    this.address_Line2 = address_Line2;
  }


  public String getAddress_Line3() {
    return address_Line3;
  }

  public void setAddress_Line3(String address_Line3) {
    this.address_Line3 = address_Line3;
  }

}
