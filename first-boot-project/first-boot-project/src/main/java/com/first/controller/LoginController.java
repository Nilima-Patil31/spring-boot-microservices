package com.first.controller;

import com.first.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;


    @RequestMapping("/login")
    public String login(){
        Boolean isLogin=loginService.doLogin();
        if(isLogin==true){
            return "success_login";
        }else{
            return "login";
        }

    }
}
