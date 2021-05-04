package com.volkov.IoC.example20;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
    private String name;
    private Cat cat;

    @Autowired
//    @Qualifier("cat")
    public void setCat(Cat cat) {
        this.cat = cat;
    }

//    @Autowired
//    @Qualifier("cat1")
//    public void prepare(Cat cat){
//        System.out.println(cat);
//    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                '}';
    }
}
