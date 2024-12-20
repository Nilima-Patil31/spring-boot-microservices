package com.first.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeAspect {
    @Around("execution(* com.first.controller.*.*(..))")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        //before
    //time calculate
        long start=System.currentTimeMillis();
        //actual execution
        Object result=joinPoint.proceed();
        //after
        long end=System.currentTimeMillis();
        System.out.println("time taken by "+(joinPoint.getSignature())+" logic "+(end-start)+"ms");
        return result;
    }
}
