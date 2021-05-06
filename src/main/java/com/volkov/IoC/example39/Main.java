package com.volkov.IoC.example39;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Config config = context.getBean("config", Config.class);

        System.out.println(config);

        context.close();
    }
}
