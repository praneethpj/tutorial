package com.tutorial.praneethpj.tutorial.controller;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Praneethpj
 */
@Component
@Aspect
public class Helper {

    @Before("execution(* com.tutorial.praneethpj.tutorial.*.*.*(..))")
    public void log(){
        System.out.println("Log is running");
    }

}
