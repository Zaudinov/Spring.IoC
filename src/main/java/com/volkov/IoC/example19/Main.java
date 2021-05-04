package com.volkov.IoC.example19;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example19/application-context.xml");

        Cat cat = context.getBean("cat", Cat.class);
        System.out.println(cat);
        System.out.println();

        Person person = context.getBean("person", Person.class);
        System.out.println(person);
        System.out.println();

    }
}
