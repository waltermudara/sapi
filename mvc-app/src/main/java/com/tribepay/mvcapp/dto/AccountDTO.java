package com.tribepay.mvcapp.dto;

import com.tribepay.mvcapp.entity.Accounts;
import com.tribepay.mvcapp.entity.Customer;

import java.io.Serializable;
import java.util.Optional;

public class AccountDTO implements Serializable {

    private Accounts accounts;
    private Optional<Customer> customer;


    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    public Optional<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Optional<Customer> customer) {
        this.customer = customer;
    }
}
