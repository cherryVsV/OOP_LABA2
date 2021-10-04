package com.donnu.oop_laba1.employee.cars;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("rangeroverBean")
@Scope("prototype")
public class Rangerover implements Car{

    public Rangerover(){
        System.out.println("Rangerover bean was created!");
    }
    @PostConstruct
    public void init(){
        System.out.println("Class Rangerover: init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Rangerover: destroy method");
    }
    @Override
    public void myCar(){
        System.out.println("Range Rover Sport");
    }
}
