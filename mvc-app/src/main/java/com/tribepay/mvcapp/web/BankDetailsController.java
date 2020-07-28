package com.tribepay.mvcapp.web;


import com.tribepay.mvcapp.dto.AccountDTO;
import com.tribepay.mvcapp.dto.MsisdnSearchDTO;
import com.tribepay.mvcapp.entity.Accounts;
import com.tribepay.mvcapp.entity.Customer;
import com.tribepay.mvcapp.entity.User;
import com.tribepay.mvcapp.exception.CustomUserNotFoundException;
import com.tribepay.mvcapp.service.SearchImpl;
import com.tribepay.mvcapp.service.UserServiceImpl;
import com.tribepay.mvcapp.springdata.CustomerRepo;
import com.tribepay.mvcapp.springdata.UserSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class BankDetailsController {


    @Autowired
    UserServiceImpl userServiceimpl;

    @Resource
    UserSpringDataRepository repository;

    @Autowired
    SearchImpl searchimpl;


    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /** Commenting code for a different project
    @RequestMapping(value ="/users/{id}" , method= RequestMethod.GET)
    public User fetchUsers(@PathVariable int id){
        User user = userServiceimpl.findById(id);
        return user;
    }
    @RequestMapping(value ="/users/user" , method= RequestMethod.GET)
    public List<User> fetchAllUsers(){
      return userServiceimpl.findAllUsers();
    }
     **/



    @RequestMapping(value ="/search" , method= RequestMethod.GET)
    public List <Customer> search(){
         return searchimpl.findAll();
    }
    @RequestMapping(value ="/accounts/search" , method= RequestMethod.GET)
    public List <Accounts> searchAccounts(){
        return searchimpl.findAllAccounts();
    }
    @RequestMapping(value ="/accounts/search/accountNumber/{account_number}" , method= RequestMethod.GET)
    public Map<String, Object> searchByAccountNumber(@PathVariable Long account_number){
        return searchimpl.searchByAccountNumber2(account_number);
    }
    @RequestMapping(value = "/accounts/search/msisdn/{msisdn}", method = RequestMethod.GET)
    public Map<String, Object> searchByMsisdn(@PathVariable String msisdn){
        return searchimpl.searchByMsisdn(msisdn);
    }




    /**Commenting code for a different project on Users

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

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();
        headers.setLocation(uriComponentsBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
        return ResponseEntity.created(location).build();

        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);

    }
    @RequestMapping(path="/users/del/{id}",method = RequestMethod.GET)
    public ResponseEntity<Void>deleteUser(@PathVariable int id){

        if (!repository.existsById(id))
            throw new CustomUserNotFoundException("id" + id);

        HttpHeaders headers = new HttpHeaders();
        userServiceimpl.deleteUserById(id);
        return new ResponseEntity<Void>(headers, HttpStatus.ACCEPTED);

    }
    **/



}
