package com.tribepay.mvcapp.service;

import com.tribepay.mvcapp.dto.AccountDTO;
import com.tribepay.mvcapp.dto.MsisdnSearchDTO;
import com.tribepay.mvcapp.entity.Accounts;
import com.tribepay.mvcapp.entity.Bank;
import com.tribepay.mvcapp.entity.Customer;
import com.tribepay.mvcapp.springdata.AccountsSpringRepository;
import com.tribepay.mvcapp.springdata.BankSpringDataRepository;
import com.tribepay.mvcapp.springdata.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class SearchImpl implements SearchFormService {
    @Resource
    private CustomerRepo customerRepo;

    @Resource
    private AccountsSpringRepository accountsSpringRepository;

    @Resource
    private BankSpringDataRepository bankRepo;

    @Override
    public List<Customer>findAll(){
        return customerRepo.findAll();
    }

    @Override
    public List<Accounts> findAllAccounts() {
        return accountsSpringRepository.findAll();
    }

    @Override
    public AccountDTO seachByAccountNumber(Long accountNumber) {
        AccountDTO accountDTO = new AccountDTO();
        Accounts accounts = accountsSpringRepository.findByAccountNumber(accountNumber);
        accountDTO.setAccounts(accounts);
        accountDTO.setCustomer(customerRepo.findById(accounts.getCustomer_id()));
        return accountDTO;
    }

    @Override
    public MsisdnSearchDTO searchwithMsisdn(String msisdn) {
        MsisdnSearchDTO msisdnSearchDTO = new MsisdnSearchDTO();
        Customer customer = customerRepo.findByMsisdn(msisdn);
        msisdnSearchDTO.setCustomer(customer);
        Accounts accounts = accountsSpringRepository.findByCustomer_id(customer.getCustomer_id());
        msisdnSearchDTO.setAccounts(accounts);
        Bank bank = bankRepo.findByBank_id(accounts.getBank_id());
        msisdnSearchDTO.setBank(bank);
        return msisdnSearchDTO;
    }

    @Override
    public Map<String, Object> searchByAccountNumber2(Long accountNumber) {
        Map<String,Object> jsonRespon = new HashMap();
        Accounts accounts = accountsSpringRepository.findByAccountNumber(accountNumber);
        Customer customer = customerRepo.findByCustomer_id(accounts.getCustomer_id());
        Bank bank = bankRepo.findByBank_id(accounts.getBank_id());

        jsonRespon.put("accountNumber",accounts.getAccount_number());
        jsonRespon.put("accountName",accounts.getAccount_name());
        jsonRespon.put("customerName",customer.getCustomer_name());
        jsonRespon.put("bankName",bank.getName());
        return jsonRespon;
    }

    @Override
    public Map<String, Object> SearchByAccountName(String accountName) {

        Map<String, Object> jsonrRespon = new HashMap();
        Accounts accounts = accountsSpringRepository.findByAccount_name(accountName);
        jsonrRespon.put("accounts", accounts);
        return jsonrRespon;

    }

    @Override
    public Map<String, Object> SearchByCustomerId(Long customerId) {
        return null;
    }

    @Override
    public Map<String, Object> searchByMsisdn(String msisdn) {
        Map<String,Object> jsonRespon = new HashMap();
        Customer customer = customerRepo.findByMsisdn(msisdn);
        Long customerId = customer.getCustomer_id();
        Accounts accounts = accountsSpringRepository.findByCustomer_id(customerId);
        Bank bank = bankRepo.findByBank_id(accounts.getBank_id());

        jsonRespon.put("accountNumber",accounts.getAccount_number());
        jsonRespon.put("accountName",accounts.getAccount_name());
        jsonRespon.put("customerName",customer.getCustomer_name());
        jsonRespon.put("bankName",bank.getName());
        return jsonRespon;
    }


}
