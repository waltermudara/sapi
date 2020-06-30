package com.tribepay.mvcapp.web;

import com.tribepay.mvcapp.entity.Users;
import com.tribepay.mvcapp.service.LoginService;
import com.tribepay.mvcapp.service.RegisterUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    private RegisterUser registerUser;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage() {

        return "login";
    }
    @RequestMapping(value = "/greeting", method= RequestMethod.GET)
    public String showGreetings(ModelMap model){
        model.addAttribute("message","Greetings and a warm welcome");
        return "greeting";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleUserLogin(ModelMap model, @RequestParam String name,
                                  @RequestParam String password) {
        logger.info("user returned from db {}", loginService.printUser(name));


        if (!loginService.validateUser(name, password)) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }

        model.put("name", name);
        return "welcome";
    }
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerUser(){
            return "register";
    }
    @RequestMapping(value="/onboard",method =RequestMethod.POST)
    public String onBoardUser( @ModelAttribute ("userForm") Users users,BindingResult result,ModelMap model){
        if (result.hasErrors()){
            return "error";
        }
        registerUser.registerNewUser(users);
         model.addAttribute("name", users.getName());
         model.addAttribute("email", users.getEmail());
         model.addAttribute("username", users.getUsername());
         model.addAttribute("password", users.getPassword());
         logger.info("form data=>", users);

                return "welcome";
    }





}
