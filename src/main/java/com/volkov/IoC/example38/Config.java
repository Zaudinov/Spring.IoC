package com.volkov.IoC.example38;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:example38/application-context.xml")
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
