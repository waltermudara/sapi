package com.tribepay.mvcapp.web;

import com.tribepay.mvcapp.entity.User;
import com.tribepay.mvcapp.service.LoginServiceImpl;
import com.tribepay.mvcapp.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @Autowired
    private LoginServiceImpl loginServiceImpl;

    @Autowired
    private UserServiceImpl userService;


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage() {

        return "login";
    }
    @RequestMapping(value = "/message/register", method= RequestMethod.GET)
    public String showSuccessReg(ModelMap model){
        model.addAttribute("message","You have successfully registered on the system use /login page to login");
        return "message";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleUserLogin(ModelMap model, @RequestParam String name,
                                  @RequestParam String password) {
        if (!loginServiceImpl.validateUser(name, password)) {
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
    public String onBoardUser(@ModelAttribute  User user, BindingResult result, ModelMap modelMap){
        if (result.hasErrors()){
            return "error";
        }
        userService.saveUser(user);
        modelMap.addAttribute("message","You have successfully registered on the system use /login page to login");
            return "message";
    }





}
