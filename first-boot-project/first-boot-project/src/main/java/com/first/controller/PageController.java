package com.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/about")
    public String about(){
        return "about";
    }
    @RequestMapping("/services")
    public String services(){
        return "services";
    }
}
