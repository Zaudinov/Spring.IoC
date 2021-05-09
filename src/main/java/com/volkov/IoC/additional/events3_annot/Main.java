package com.volkov.IoC.additional.events3_annot;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("additional_Events3_annot/application-context.xml");

        EmployeeService service = context.getBean("service", EmployeeService.class);

        service.registerEmployee("Ivan Ivanov", 2000);

        context.close();
    }
}
