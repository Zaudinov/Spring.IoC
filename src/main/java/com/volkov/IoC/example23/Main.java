package com.volkov.IoC.example23;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Config config = context.getBean("config", Config.class);

        System.out.println(config);

        System.out.println(config.getEnv().getProperty("jdbc.other"));

        context.close();
    }
}
