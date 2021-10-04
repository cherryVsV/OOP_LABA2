package com.donnu.oop_laba1.employee.pets;

import com.donnu.oop_laba1.OopLaba1Application;
import org.springframework.boot.SpringApplication;

public class PetTest {
    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Kitten();
        dog.myPet();
        cat.myPet();
    }

}
