package com.volkov.IoC.example6;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example6/application-context.xml");


        Bean bean1 = context.getBean("exampleBean1", com.volkov.IoC.example6.Bean.class);
        Bean bean2 = context.getBean("exampleBean2", com.volkov.IoC.example6.Bean.class);
        Bean bean3 = context.getBean("exampleBean3", com.volkov.IoC.example6.Bean.class);


    }
}
