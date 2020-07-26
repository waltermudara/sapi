package com.tribepay.mvcapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerAccountDetail {
@Id
  private long customerId;
  private String customerName;
  private String customerSurname;
  private String msisdn;
  private java.sql.Date dob;
  private String nationalId;
  private String emailAddress;
  private String gender;
  private long occupationId;
  private String status;
  private long cityId;
  private String addressLine;
  private String addressLine2;
  private String addressLine3;


  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }


  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public String getCustomerSurname() {
    return customerSurname;
  }

  public void setCustomerSurname(String customerSurname) {
    this.customerSurname = customerSurname;
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


  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  @Override
  public String toString() {
    return "CustomerAccountDetail{" +
            "customerId=" + customerId +
            ", customerName='" + customerName + '\'' +
            ", customerSurname='" + customerSurname + '\'' +
            ", msisdn='" + msisdn + '\'' +
            ", dob=" + dob +
            ", nationalId='" + nationalId + '\'' +
            ", emailAddress='" + emailAddress + '\'' +
            ", gender='" + gender + '\'' +
            ", occupationId=" + occupationId +
            ", status='" + status + '\'' +
            ", cityId=" + cityId +
            ", addressLine='" + addressLine + '\'' +
            ", addressLine2='" + addressLine2 + '\'' +
            ", addressLine3='" + addressLine3 + '\'' +
            '}';
  }

  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }

}
