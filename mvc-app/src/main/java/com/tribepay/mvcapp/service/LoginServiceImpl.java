package com.tribepay.mvcapp.service;

import com.tribepay.mvcapp.entity.User;
import com.tribepay.mvcapp.springdata.UserSpringDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LoginServiceImpl {
    @Autowired
    UserSpringDataRepository repository;
   
    public boolean validateUser(String name, String password) {
        User loginUser = repository.findByName(name);
        if ((loginUser == null)) {
            return false;
        }

        else if (loginUser.getName().equalsIgnoreCase(name) && loginUser.getPassword().equalsIgnoreCase(password)) {
                return true;
            }
        else return false;

        }


    }

