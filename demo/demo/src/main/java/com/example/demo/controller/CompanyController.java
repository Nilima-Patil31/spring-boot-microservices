package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CompanyController {

    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    @RequestMapping("/article")
    public String article(){
        return "article";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }

    @RequestMapping("/gallery")
    public String gallery(){
        return "gallery";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    @RequestMapping("/quotation_page")
    public String quotation_page(){
        return "quotation_page";
    }

    @RequestMapping("/services")
    public String services(){
        return "services";
    }

}
