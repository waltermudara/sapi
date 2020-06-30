package com.tribepay.mvcapp.service;

import com.tribepay.mvcapp.entity.Users;
import com.tribepay.mvcapp.springdata.UserCrudRepository;
import com.tribepay.mvcapp.springdata.UserSpringDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterUser {
    @Autowired
    UserCrudRepository repository;

    public void registerNewUser(String name,String email,String username,String password){
        Users newUser = new Users(name,email,username,password);
        repository.save(newUser);
    }

    public void registerNewUser(Users users) {
        repository.save(users);
    }
}
