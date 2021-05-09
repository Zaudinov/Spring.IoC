package com.volkov.IoC.example13;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cat")
public class Cat {

    private String name;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Value("Barsik")
    public void setName(String name) {
        this.name = name;
    }
}
