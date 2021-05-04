package com.volkov.IoC.example30;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example30/application-context.xml");

        Manager manager = context.getBean("manager", Manager.class);

        manager.getApplicationContext().publishEvent(new CustomEvent(new Object()));


        context.close();
    }
}
