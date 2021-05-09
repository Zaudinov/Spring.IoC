package com.volkov.IoC.additional.events3_annot;


import com.volkov.IoC.additional.events2.EmployeeRegistrationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service("DBAdder")
public class AddEmployeeToDB {

    @EventListener
    public void addToDB(EmployeeRegistrationEvent employeeRegistrationEvent) {
        System.out.println("Event received through @EventListener. "
                + employeeRegistrationEvent.getEmployee() + " is saved in DB. Новый работник успешно добавлен в базу данных");
    }
}
