package com.donnu.oop_laba1.employee;

import com.donnu.oop_laba1.OopLaba1Application;
import com.donnu.oop_laba1.employee.pets.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = context.getBean("myEmployee", Employee.class);
        System.out.printf("Мое имя - %s\n", employee.getName());
        System.out.printf("Мой возраст - %s\n", employee.getAge());
        employee.getYourPet();
        employee.getYourCar();
        context.close();
    }
}
