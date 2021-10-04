package com.donnu.oop_laba1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@SpringBootApplication
@RestController
public class OopLaba1Application {

    public static void main(String[] args) {
        SpringApplication.run(OopLaba1Application.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name){
        return String.format("Hello %s!", name);
    }

    @GetMapping("/about")
    public String sayAbout(){
        return "about us";
    }

    @GetMapping("/options")
    public String getOptions(@RequestParam(value = "option", defaultValue = "") String option){
        if(!Objects.equals(option, "")){
            return "not an option";
        }
        else{
            return "option" ;
        }
    }


}
