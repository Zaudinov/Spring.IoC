package com.volkov.IoC.additional.events4_annot_flag;

import com.volkov.IoC.additional.events3_annot.Employee;
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

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public void registerEmployee(String name, int wage){
        Employee employee = new Employee(name, wage);
        applicationContext.publishEvent(new EmployeeRegistrationEvent(employee));
    }
}
