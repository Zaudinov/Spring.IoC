package com.volkov.IoC.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example1/application-context.xml");

        ExampleBean bean = context.getBean("exampleBean", ExampleBean.class);
        ExampleBean bean2 = (ExampleBean) context.getBean("exampleBean");

        System.out.println(bean);
        System.out.println();
        System.out.println(bean2);

    }


}
