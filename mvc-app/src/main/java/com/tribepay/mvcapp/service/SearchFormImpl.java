package com.tribepay.mvcapp.service;

import com.tribepay.mvcapp.entity.CustomerAccountDetail;
import com.tribepay.mvcapp.springdata.AccountsSpringRepository;
import com.tribepay.mvcapp.springdata.CustomerAccountDetRepo;
import org.hibernate.Session;
import org.hibernate.annotations.NamedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.Query;


@Service
public class SearchFormImpl  {

    @Autowired
    private CustomerAccountDetRepo customersRepo;
    private AccountsSpringRepository accounts;
    private EntityManager entityManager;

    public CustomerAccountDetail findCustomerByAccountId(String accountNumber) {
        CustomerAccountDetail customer =null;
        Query query = entityManager.createQuery("SELECT u FROM CustomerAccountDetail u WHERE u.customerId = (SELECT a.accountId FROM Accounts a WHERE a.accountNumber=:accountNumber)");
        query.setParameter("accountNumber", accountNumber);
       // try {
            customer =(CustomerAccountDetail) query.getSingleResult();
      //  } catch (Exception e) {
            // Handle exception
       // }
        return customer;
    }


}
