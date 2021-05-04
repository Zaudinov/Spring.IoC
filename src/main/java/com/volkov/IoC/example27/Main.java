package com.volkov.IoC.example27;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example27/application-context.xml");

        ExampleBean1 bean1 = context.getBean("bean1", ExampleBean1.class);
        ExampleBean2 bean2 = context.getBean("bean2", ExampleBean2.class);

        context.close();
    }
}
