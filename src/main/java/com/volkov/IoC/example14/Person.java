package com.volkov.IoC.example14;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private Cat cat;

    public Person(@Value("Ivan Ivanov")String name, @Autowired Cat cat) {
        this.name = name;
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
