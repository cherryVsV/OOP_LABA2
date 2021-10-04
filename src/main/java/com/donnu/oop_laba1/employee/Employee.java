package com.donnu.oop_laba1.employee;

import com.donnu.oop_laba1.employee.cars.Car;
import com.donnu.oop_laba1.employee.pets.Kitten;
import com.donnu.oop_laba1.employee.pets.Pet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
    private Pet pet;
    private Car car;
    @Value("${employee.name}")
    private String name;
    @Value("${employee.age}")
    private int age;


    public void setPet(Pet pet){this.pet=pet;}
    public void setCar(Car car){this.car=car;}
    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;}

    public void getYourPet() {
        System.out.println("Мои животные:");
        pet.myPet();
    }

    public void getYourCar() {
        System.out.println("Мои машины:");
        car.myCar();
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public Employee(Pet kitten, Car mazda) {
        System.out.println("Employee bean was created!");
        pet = kitten;
        car = mazda;
    }
    @PostConstruct
    public void init(){
        System.out.println("Class Employee: init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Employee: destroy method");
    }
}
