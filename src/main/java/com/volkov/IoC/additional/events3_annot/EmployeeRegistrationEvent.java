package com.volkov.IoC.additional.events3_annot;

import com.volkov.IoC.additional.events2.Employee;
import org.springframework.context.ApplicationEvent;

public class EmployeeRegistrationEvent extends ApplicationEvent {
    private static final long serialVersionUID = 51L;

    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeRegistrationEvent(Employee employee) {
        super(employee);
        this.employee = employee;
    }
}
