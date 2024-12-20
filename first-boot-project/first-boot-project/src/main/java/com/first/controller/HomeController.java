package com.first.controller;


import com.first.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pack.Student;

//@Component
@RestController
public class HomeController
{
    @Autowired
    public Student student;
    @Autowired
    public ProductService productService;

    @RequestMapping("/magic")
    public String test() throws InterruptedException {
        Thread.sleep(1000);
        productService.createProduct();
        return "This is Magic";
    }
    @RequestMapping("/another")
    public String test1(){
        productService.searchProduct();
        return "This is actually magic";
    }
    /*public HomeController(){
        System.out.println("Home controller bean created");
    }*/
}
