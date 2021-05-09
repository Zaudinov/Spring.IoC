package com.volkov.IoC.example12;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

//Для демонстрации второй части(аннотация @Qualifier) расскоментируйте строки в Person и application context)
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example12/application-context.xml");

        Person person = context.getBean("person", Person.class);

        System.out.println(person);

        context.close();
    }
}
