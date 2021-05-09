package com.volkov.IoC.example13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {

    private String name;
    private Cat cat;

    public String getName() {
        return name;
    }

    @Value("Ivan Ivanov")
    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                '}';
    }
}
