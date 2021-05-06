package com.volkov.IoC.example40;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    //Change Parrot @Order parameter to 1. Измените параметр @Order у попугая, чтобы он был равен одному. Что изменилось?
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Config config = context.getBean("config", Config.class);

        config.voice();

        context.close();
    }
}
