package com.volkov.IoC.example15;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example15/application-context.xml");

        ExampleBean bean = context.getBean("exampleBean", ExampleBean.class);


        System.out.println(bean.getList().getClass().getName());
        System.out.println(bean.getList().size());
        for (Object o: bean.getList()) {
            System.out.println(o);
        }
        System.out.println();

        System.out.println(bean.getSet().getClass().getName());
        System.out.println(bean.getSet().size());
        System.out.println();

        System.out.println(bean.getMap().getClass().getName());
        for (Map.Entry<String, Object> entry:
        bean.getMap().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();

        System.out.println(bean.getProps().getClass().getName());
        System.out.println(bean.getProps().keySet().size());
        System.out.println(bean.getProps().values().size());

        context.close();
    }
}
