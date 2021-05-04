package com.volkov.IoC.example32_flag;


import com.volkov.IoC.example32_flag.EmployeeRegistrationEvent;
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
