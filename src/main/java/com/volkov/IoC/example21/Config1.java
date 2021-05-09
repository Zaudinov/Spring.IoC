package com.volkov.IoC.example21;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config1 {
    @Bean
    public ExampleBean1 bean1(){
        ExampleBean1 bean = new ExampleBean1();
        bean.setValue(1);
        return bean;
    }
}
