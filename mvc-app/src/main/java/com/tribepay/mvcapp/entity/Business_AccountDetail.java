package com.tribepay.mvcapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Business_AccountDetail {

  @Id
  private long businessId;

  private String businessFullname;
  private String accountNumber;
  private String emailAddress;
  private String status;
  private long bankId;
  private long branchId;
  private long cityId;
  private String addressLine;
  private String address_Line2;
  private String address_Line3;


  public long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(long businessId) {
    this.businessId = businessId;
  }


  public String getBusinessFullname() {
    return businessFullname;
  }

  public void setBusinessFullname(String businessFullname) {
    this.businessFullname = businessFullname;
  }


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
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
