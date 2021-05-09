package com.volkov.IoC.additional.events3_annot;

import com.volkov.IoC.additional.events2.Employee;
import com.volkov.IoC.additional.events2.EmployeeRegistrationEvent;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service("service")
public class EmployeeService implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext =  applicationContext;
    }

    public void registerEmployee(String name, int wage){
        Employee employee = new Employee(name, wage);
        applicationContext.publishEvent(new EmployeeRegistrationEvent(employee));
    }
}
