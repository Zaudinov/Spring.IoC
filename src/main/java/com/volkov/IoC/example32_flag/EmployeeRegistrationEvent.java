package com.volkov.IoC.example32_flag;

import com.volkov.IoC.example32.Employee;
import org.springframework.context.ApplicationEvent;

public class EmployeeRegistrationEvent extends ApplicationEvent {
    private static final long serialVersionUID = 51L;

    private Employee employee;
    private boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public EmployeeRegistrationEvent(Employee employee, boolean flag) {
        super(employee);
        this.employee = employee;
        this.flag = flag;
    }

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
