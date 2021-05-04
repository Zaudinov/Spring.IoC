package com.volkov.IoC.example26;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        //Change scope to prototype, watch the difference. Измените область видимости бина на prototype, посмотрите отличие.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example26/application-context.xml");

        ExampleBean bean = context.getBean("exampleBean", ExampleBean.class);
        System.out.println("Inside main");

        context.close();
    }
}
