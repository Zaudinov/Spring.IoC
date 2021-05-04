package com.volkov.IoC.example5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example5/application-context.xml");

        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
}
