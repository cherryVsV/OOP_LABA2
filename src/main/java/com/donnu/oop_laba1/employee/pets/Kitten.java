package com.donnu.oop_laba1.employee.pets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("kittenBean")
public class Kitten implements Pet {

    //private String name;
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
   /* public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }*/
}
