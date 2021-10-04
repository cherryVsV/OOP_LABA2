package com.donnu.oop_laba1.employee.cars;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("mazdaBean")
@Scope("singleton")
public class Mazda implements Car{
    @Override
    public void myCar(){
        System.out.println("Mazda Axela 2013");
    }
    @PostConstruct
    public void init(){
        System.out.println("Class Mazda: init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Mazda: destroy method");
    }
}
