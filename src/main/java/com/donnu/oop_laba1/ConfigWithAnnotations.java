package com.donnu.oop_laba1;

import com.donnu.oop_laba1.employee.Employee;
import com.donnu.oop_laba1.employee.cars.Car;
import com.donnu.oop_laba1.employee.cars.Mazda;
import com.donnu.oop_laba1.employee.cars.Rangerover;
import com.donnu.oop_laba1.employee.pets.Kitten;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Employee employee = context.getBean("employeeBean", Employee.class);
        System.out.printf("Мое имя - %s\n", employee.getName());
        System.out.printf("Мой возраст - %s\n", employee.getAge());
        employee.getYourPet();
        employee.getYourCar();

        int carsCount = 8;
        ArrayList<Car> manyMazdas = new ArrayList<Car>(carsCount);
        for(int x = 0; x<carsCount; x++){
            manyMazdas.add(context.getBean("mazdaBean", Mazda.class));
        }
        ArrayList<Car> manyRangerovers = new ArrayList<Car>(carsCount);
        for(int x = 0; x<carsCount; x++){
            manyRangerovers.add(context.getBean("rangeroverBean", Rangerover.class));
        }


        context.close();
    }
}
