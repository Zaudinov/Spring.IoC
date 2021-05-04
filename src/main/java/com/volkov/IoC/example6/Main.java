package com.volkov.IoC.example6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example6/application-context.xml");

        System.out.println("Before calling beans↑↑\n" +
                "До вызова бинов↑↑\n");

        System.out.println("Calling beans\n" +
                "Вызываем бины:");
        Bean bean1 = context.getBean("exampleBean1", Bean.class);
        Bean bean2 = context.getBean("exampleBean2", Bean.class);
        Bean bean3 = context.getBean("exampleBean3", Bean.class);
        Bean bean4 = context.getBean("exampleBean4", Bean.class);

    }
}
