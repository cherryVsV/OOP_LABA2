package com.donnu.oop_laba1.employee.pets;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
public class Dog implements Pet{
    @Override
    public void myPet(){
        System.out.println("Золотистый ретривер");
    }
    @PostConstruct
    public void init(){
        System.out.println("Class Dog: init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Dog: destroy method");
    }
}
