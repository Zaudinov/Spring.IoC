package com.volkov.IoC.example9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //try both application contexts: change context to correct.
        //Проверьте работу обоих контекстов: измените контекст на correct.
        ApplicationContext context = new ClassPathXmlApplicationContext("example9/application-context-incorrect.xml");

        Cat cat = context.getBean("cat", Cat.class);

        Person owner = cat.getOwner();

        System.out.println(owner);
    }
}
