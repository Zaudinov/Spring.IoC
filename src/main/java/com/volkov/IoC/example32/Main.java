package com.volkov.IoC.example32;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example32/application-context.xml");

        EmployeeService service = context.getBean("service", EmployeeService.class);

        service.registerEmployee("Ivan Ivanov", 2000);

        context.close();
    }
}
