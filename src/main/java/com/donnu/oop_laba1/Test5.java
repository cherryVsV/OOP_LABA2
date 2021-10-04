package com.donnu.oop_laba1;

import com.donnu.oop_laba1.employee.Employee;
import com.donnu.oop_laba1.employee.cars.Car;
import com.donnu.oop_laba1.employee.cars.Mazda;
import com.donnu.oop_laba1.employee.pets.Kitten;
import com.donnu.oop_laba1.employee.pets.Pet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test5 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Pet pet = context.getBean("kittenBean", Kitten.class);
        Car car = context.getBean("mazdaBean", Mazda.class);
        Employee employee = context.getBean("employeeBean", Employee.class);
        System.out.printf("Мое имя - %s\n", employee.getName());
        System.out.printf("Мой возраст - %s\n", employee.getAge());
        employee.getYourCar();
        employee.getYourPet();
        context.close();
    }
}
