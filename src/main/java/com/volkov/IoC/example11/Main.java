package com.volkov.IoC.example11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("example11/application-context-correct.xml");

        Cat cat = context.getBean("cat", Cat.class);

        Person owner = cat.getOwner();

        System.out.println(owner);
    }
}
