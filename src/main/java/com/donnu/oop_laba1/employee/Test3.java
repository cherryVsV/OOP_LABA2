package com.donnu.oop_laba1.employee;

import com.donnu.oop_laba1.employee.pets.Kitten;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Kitten myKitten = context.getBean("myPet", Kitten.class);
        //myKitten.setName("Persik");
        myKitten.myPet();
        Kitten yourKitten = context.getBean("myPet", Kitten.class);
        yourKitten.myPet();
        //yourKitten.setName("Bobby");
       // System.out.println("Переменные ссылаются на один объект?"+
        //        (myKitten==yourKitten));
        //System.out.println(myKitten.getName());
        //System.out.println(yourKitten.getName());
        context.close();

    }
}
