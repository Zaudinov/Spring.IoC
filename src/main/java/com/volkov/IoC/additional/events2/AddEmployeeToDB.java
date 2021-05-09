package com.volkov.IoC.additional.events2;


import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service("DBAdder")
public class AddEmployeeToDB implements ApplicationListener<EmployeeRegistrationEvent> {

    @Override
    public void onApplicationEvent(EmployeeRegistrationEvent employeeRegistrationEvent) {
        System.out.println(employeeRegistrationEvent.getEmployee() + " is saved in DB. Новый работник успешно добавлен в базу данных");
    }
}
