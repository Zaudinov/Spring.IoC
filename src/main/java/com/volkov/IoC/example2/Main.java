package com.volkov.IoC.example2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    //Конструктор без аргументов: можно использовать консутруктор без аргументов.
    // Поле name нашего экземпляра ExampleBean в том случае равно null
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example2/application-context.xml");

        ExampleBean bean = context.getBean("exampleBean", ExampleBean.class);
        System.out.println(bean);
    }
}
