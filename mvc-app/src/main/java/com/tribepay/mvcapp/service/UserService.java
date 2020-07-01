package com.tribepay.mvcapp.service;

import com.tribepay.mvcapp.entity.User;

import java.util.List;

public interface UserService {
    User findById(int id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(int id);

    void deleteAllUsers();

    List<User> findAllUsers();

    boolean isUserExist(User user);
}
