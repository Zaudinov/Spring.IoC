package com.volkov.IoC.example37;

import com.volkov.IoC.example24.ExampleBean;
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
