package com.donnu.oop_laba1;

import com.donnu.oop_laba1.employee.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test5 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Employee employee = context.getBean("employeeBean", Employee.class);
        employee.getYourCar();
        context.close();
    }
}
