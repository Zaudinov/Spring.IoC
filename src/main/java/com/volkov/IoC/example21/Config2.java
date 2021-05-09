package com.volkov.IoC.example21;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Config1.class)
public class Config2 {
    @Bean
    public ExampleBean2 bean2(){
        ExampleBean2 bean = new ExampleBean2();
        bean.setValue(2);
        return bean;
    }
}
