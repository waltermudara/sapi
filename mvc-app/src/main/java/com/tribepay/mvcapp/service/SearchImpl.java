package com.tribepay.mvcapp.service;

import com.tribepay.mvcapp.entity.CustomerAccountDetail;
import com.tribepay.mvcapp.springdata.CustomerAccountDetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SearchImpl  {
    @Autowired
    private CustomerAccountDetRepo customerAccountDetRepo;

   public Optional <CustomerAccountDetail> findbyCustomerid(Long custId){
        return customerAccountDetRepo.findByCustomerId(custId);

    }
}
