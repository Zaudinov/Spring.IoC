package com.volkov.IoC.example23;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example23/application-context.xml");

        Person person = context.getBean("person", Person.class);

        System.out.println(person);

        context.close();
    }
}
