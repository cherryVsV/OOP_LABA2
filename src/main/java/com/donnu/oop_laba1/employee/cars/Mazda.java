package com.donnu.oop_laba1.employee.cars;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mazda implements Car{
    public Mazda(){
        System.out.println("Mazda bean was created!");
    }
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
