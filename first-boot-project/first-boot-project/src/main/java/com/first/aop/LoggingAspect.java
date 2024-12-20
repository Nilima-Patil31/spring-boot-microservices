package com.first.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    //cross cutting concern
    @Before("execution(* com.first.services.ProductService.createProduct(..))")
    public void greeting(){
        System.out.println("Hi!!method starting");
    }
    @After("execution(* com.first.services.ProductService.createProduct(..))")
    public void byeBye(){
        System.out.println("bye by!!method terminating");
    }
}
