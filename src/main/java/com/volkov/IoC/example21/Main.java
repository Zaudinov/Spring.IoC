package com.volkov.IoC.example21;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config2.class);

        ExampleBean1 bean1 = context.getBean("bean1", ExampleBean1.class);
        ExampleBean2 bean2 = context.getBean("bean2", ExampleBean2.class);

        System.out.println(bean1.getValue());
        System.out.println(bean2.getValue());

        context.close();
    }
}
