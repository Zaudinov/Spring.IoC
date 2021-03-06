package com.volkov.IoC.example19;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Service service = context.getBean("service", Service.class);

        System.out.println(service.getExampleBean().getValue());

        context.close();
    }
}
