package com.volkov.IoC.example36_task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    //Change the example to use @Autowired to inject ExampleBean in Service. Set ExampleBean value = 2.
    //Измените пример так, чтобы использовать @Autowired для внедрения ExampleBean в Service. Установите ExampleBean value = 2.
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Service service = context.getBean("service", Service.class);

        System.out.println(service.getExampleBean().getValue());

        context.close();
    }
}
