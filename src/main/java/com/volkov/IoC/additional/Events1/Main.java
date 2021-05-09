package com.volkov.IoC.additional.Events1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("additional_Events1/application-context.xml");

        Manager manager = context.getBean("manager", Manager.class);

        manager.getApplicationContext().publishEvent(new CustomEvent(new Object()));


        context.close();
    }
}
