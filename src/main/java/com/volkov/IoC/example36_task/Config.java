package com.volkov.IoC.example36_task;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ExampleBean exampleBean(){
        ExampleBean exampleBean = new ExampleBean();
        exampleBean.setValue(1);
        return exampleBean;
    }

    @Bean
    public Service service(){
        Service service = new Service();
        service.setExampleBean(exampleBean());
        return service;
    }
}
