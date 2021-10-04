package com.donnu.oop_laba1.employee;

import com.donnu.oop_laba1.employee.cars.Car;
import com.donnu.oop_laba1.employee.pets.Kitten;
import com.donnu.oop_laba1.employee.pets.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("employeeBean")
public class Employee {
    //@Autowired
    //@Qualifier("dogBean")
    private Pet pet;
    //@Autowired
    //@Qualifier("mazdaBean")
    private Car car;
    @Value("${employee.name}")
    private String name;
    @Value("${employee.age}")
    private int age;
    @Autowired
    @Qualifier("kittenBean")
    public void setPet(Pet pet){
        System.out.println("Class employee: pet setter");
        this.pet=pet;
    }
    @Autowired
    @Qualifier("rangeroverBean")
    public void setCar(Car car){
        System.out.println("Class employee: car setter");
        this.car=car;
    }
    public void setName(String name){
        System.out.println("Class employee: name setter");
        this.name=name;
    }
    public void setAge(int age){
        System.out.println("Class employee: age setter");
        this.age=age;
    }

    public void getYourPet() {
        System.out.println("Class employee: pet getter");
        System.out.println("Мои животные:");
        pet.myPet();
    }

    public void getYourCar() {
        System.out.println("Class employee: car getter");
        System.out.println("Мои машины:");
        car.myCar();
    }

    public String getName(){
        System.out.println("Class employee: name getter");
        return name;
    }

    public int getAge(){
        System.out.println("Class employee: age getter");
        return age;
    }
    /*@Autowired
    public Employee( Kitten kitten ) {
        System.out.println("Employee bean was created!");
        pet = kitten;
    }*/
   @Autowired
   public Employee(@Qualifier("dogBean") Pet dog ) {
       System.out.println("Employee bean was created!");
       pet = dog;
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
