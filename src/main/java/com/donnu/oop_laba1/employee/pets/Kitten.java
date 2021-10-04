package com.donnu.oop_laba1.employee.pets;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Kitten implements Pet {
    public Kitten(){
        System.out.println("Kitten bean was created!");
    }
    @Override
    public void myPet(){
        System.out.println("Шотландский вислоухий котенок");
    }
    @PostConstruct
    public void init(){
        System.out.println("Class Cat: init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Cat: destroy method");
    }
}
