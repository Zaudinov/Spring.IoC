package com.volkov.IoC.example39;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:example38/jdbc.properties")
public class Config {

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;



    @Override
    public String toString() {
        return "Config{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
