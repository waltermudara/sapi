package com.tribepay.mvcapp.dto;

import com.tribepay.mvcapp.entity.Accounts;
import com.tribepay.mvcapp.entity.Bank;
import com.tribepay.mvcapp.entity.Customer;

import java.io.Serializable;

public class MsisdnSearchDTO implements Serializable {
    private Accounts accounts;
    private Customer customer;
    private Bank bank;

    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
