package com.mvc.example.spring_mvc_example.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("/home")
    public String adminHome(){
        return "admin/home";
   }
}
