package com.tribepay.mvcapp.service;

import com.tribepay.mvcapp.dto.AccountDTO;
import com.tribepay.mvcapp.dto.MsisdnSearchDTO;
import com.tribepay.mvcapp.entity.Accounts;
import com.tribepay.mvcapp.entity.Customer;

import java.util.List;
import java.util.Map;

public interface SearchFormService {
    List<Customer> findAll();

    List<Accounts> findAllAccounts();

    AccountDTO seachByAccountNumber(Long accountNumber);
    MsisdnSearchDTO searchwithMsisdn(String msisdn);

    Map<String,Object>searchByAccountNumber2(Long accountNumber);

    Map<String,Object>SearchByAccountName(String accountName);

    Map<String,Object>SearchByCustomerId(Long customerId);

    Map <String,Object>searchByMsisdn(String msisdn);



}
