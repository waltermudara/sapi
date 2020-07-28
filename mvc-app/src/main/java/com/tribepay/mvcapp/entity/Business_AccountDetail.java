package com.tribepay.mvcapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Business_AccountDetail {

  @Id
  private long business_id;

  private String business_fullname;
  private String account_number;
  private String email_address;
  private String status;
  private long bank_id;
  private long branch_id;
  private long city_id;
  private String address_line;
  private String address_line2;
  private String address_line3;


  public long getBusiness_id() {
    return business_id;
  }

  public void setBusiness_id(long businessId) {
    this.business_id = businessId;
  }


  public String getBusiness_fullname() {
    return business_fullname;
  }

  public void setBusiness_fullname(String businessFullname) {
    this.business_fullname = businessFullname;
  }


  public String getAccount_number() {
    return account_number;
  }

  public void setAccount_number(String accountNumber) {
    this.account_number = accountNumber;
  }


  public String getEmail_address() {
    return email_address;
  }

  public void setEmail_address(String emailAddress) {
    this.email_address = emailAddress;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public long getBank_id() {
    return bank_id;
  }

  public void setBank_id(long bankId) {
    this.bank_id = bankId;
  }


  public long getBranch_id() {
    return branch_id;
  }

  public void setBranch_id(long branchId) {
    this.branch_id = branchId;
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

  public void setAddress_line2(String address_Line2) {
    this.address_line2 = address_Line2;
  }


  public String getAddress_line3() {
    return address_line3;
  }

  public void setAddress_line3(String address_Line3) {
    this.address_line3 = address_Line3;
  }

}
