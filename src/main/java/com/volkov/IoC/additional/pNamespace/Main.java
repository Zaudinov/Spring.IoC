package com.volkov.IoC.additional.pNamespace;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("additionam_pNamespace/application-context.xml");

        Cat cat = context.getBean("cat", Cat.class);
        System.out.println(cat);
        System.out.println();

        Person person = context.getBean("person", Person.class);
        System.out.println(person);
        System.out.println();

    }
}
