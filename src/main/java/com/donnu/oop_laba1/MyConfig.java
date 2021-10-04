package com.donnu.oop_laba1;

import com.donnu.oop_laba1.employee.Employee;
import com.donnu.oop_laba1.employee.cars.Car;
import com.donnu.oop_laba1.employee.cars.Mazda;
import com.donnu.oop_laba1.employee.pets.Kitten;
import com.donnu.oop_laba1.employee.pets.Pet;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet kittenBean(){
        return new Kitten();
    }
    @Bean
    @Scope("singleton")
    public Car mazdaBean(){
        return new Mazda();
    }

    @Bean
    public Employee employeeBean(){
        return new Employee(kittenBean(), mazdaBean());
    }

}
