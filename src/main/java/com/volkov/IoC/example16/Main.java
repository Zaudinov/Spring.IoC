package com.volkov.IoC.example16;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example16/application-context.xml");

        //change scope to prototype. Измените область видимости на prototype

        ExampleBean exampleBean1 = context.getBean("exampleBean", ExampleBean.class);
        ExampleBean exampleBean2 = context.getBean("exampleBean", ExampleBean.class);
        ExampleBean exampleBean3 = context.getBean("exampleBean", ExampleBean.class);

        System.out.println(exampleBean1==exampleBean2);
        System.out.println(exampleBean2==exampleBean3);

        System.out.println(exampleBean1.equals(exampleBean2));
        System.out.println(exampleBean2.equals(exampleBean3));

        context.close();
    }
}
