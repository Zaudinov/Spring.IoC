package com.volkov.IoC.example32_flag;



import com.volkov.IoC.example32.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example32_flag/application-context.xml");

        EmployeeService service = context.getBean("service", EmployeeService.class);

        service.getApplicationContext().publishEvent (new EmployeeRegistrationEvent((new Employee("Ivan Ivanov", 2000)), true));

        context.close();
    }
}
