package com.volkov.IoC.example23;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cat")
public class Cat {

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Value("Barsik")
    public void setName(String name) {
        this.name = name;
    }


    @Value("1")
    public void setAge(int age) {
        this.age = age;
    }
}
