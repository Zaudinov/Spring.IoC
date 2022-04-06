package com.volkov.IoC.example17;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Change scope to prototype, watch the difference. Измените область видимости бина на prototype, посмотрите отличие.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example17/application-context.xml");

        ExampleBean bean = context.getBean("exampleBean", ExampleBean.class);


        System.out.println("Inside main " + bean.getValue()+"\n" + context.getBean("dep", com.volkov.IoC.example15.ExampleBean.class));


        context.close();
    }
}
