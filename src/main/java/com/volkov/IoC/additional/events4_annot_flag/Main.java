package com.volkov.IoC.additional.events4_annot_flag;



import com.volkov.IoC.additional.events3_annot.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("additional_Events4_flag/application-context.xml");

        EmployeeService service = context.getBean("service", EmployeeService.class);

        service.getApplicationContext().publishEvent (new EmployeeRegistrationEvent((new Employee("Ivan Ivanov", 2000)), true));

        context.close();
    }
}
