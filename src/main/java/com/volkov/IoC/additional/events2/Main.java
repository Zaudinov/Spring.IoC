package com.volkov.IoC.additional.events2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("additional_Events2/application-context.xml");

        EmployeeService service = context.getBean("service", EmployeeService.class);

        service.registerEmployee("Ivan Ivanov", 2000);

        context.close();
    }
}
