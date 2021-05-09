package com.volkov.IoC.additional.events4_annot_flag;


import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service("DBAdder")
public class AddEmployeeToDB {

    @EventListener(condition = "#employeeRegistrationEvent.flag")
    public void addToDB(EmployeeRegistrationEvent employeeRegistrationEvent) {
        System.out.println("Event received through @EventListener. Flag is true. "
                + employeeRegistrationEvent.getEmployee() + " is saved in DB. Новый работник успешно добавлен в базу данных");
    }
}
