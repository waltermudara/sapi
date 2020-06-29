package com.tribepay.mvcapp.service;

import com.tribepay.mvcapp.entity.Users;
import com.tribepay.mvcapp.springdata.UserSpringDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    UserSpringDataRepository repository;
   
    public boolean validateUser(String name, String password) {
        Users loginUser = repository.findUsersByName(name);
        if ((loginUser == null)) {
            return false;
        }

        else if (loginUser.getName().equalsIgnoreCase(name) && loginUser.getPassword().equalsIgnoreCase(password)) {
                return true;
            } else return false;

        }

        public Users printUser (String name){
            return repository.findUsersByName(name);
        }


    }

