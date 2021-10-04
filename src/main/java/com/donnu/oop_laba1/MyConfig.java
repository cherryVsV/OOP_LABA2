package com.donnu.oop_laba1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.donnu.oop_laba1")
@PropertySource("classpath:myApp.properties")
public class MyConfig {
}
