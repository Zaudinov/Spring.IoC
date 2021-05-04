package com.volkov.IoC.example1;

public class ExampleBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExampleBean(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
