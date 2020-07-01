package com.tribepay.mvcapp.web;


import com.tribepay.mvcapp.entity.User;
import com.tribepay.mvcapp.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class BankDetailsController {


    @Autowired
    UserServiceImpl userServiceimpl;


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value ="/users/{id}" , method= RequestMethod.GET)
    public User fetchUsers(@PathVariable int id){
        User user = userServiceimpl.findById(id);
        return user;
    }
    @RequestMapping(value ="/users/user" , method= RequestMethod.GET)
    public List<User> fetchAllUsers(){
      return userServiceimpl.findAllUsers();
    }

    @RequestMapping(path= "/users", consumes = "application/json",
            produces = "application/json", method = RequestMethod.POST)
    public void addUsers(@RequestBody User user){
        userServiceimpl.saveUser(user);

    }

    @RequestMapping(path="/users/create",
            consumes = "application/json", produces = "application/json",method = RequestMethod.POST)
    public ResponseEntity<Void>createUser(@RequestBody User user, UriComponentsBuilder uriComponentsBuilder){
        userServiceimpl.saveUser(user);
        HttpHeaders headers = new HttpHeaders();
        /*
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();
        headers.setLocation(uriComponentsBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
        return ResponseEntity.created(location).build();
        */
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);

    }
    @RequestMapping(path="/users/del/{id}",method = RequestMethod.GET)
    public ResponseEntity<Void>deleteUser(@PathVariable int id){
        HttpHeaders headers = new HttpHeaders();
        userServiceimpl.deleteUserById(id);
        return new ResponseEntity<Void>(headers, HttpStatus.ACCEPTED);

    }



}
