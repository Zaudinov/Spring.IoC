package com.volkov.IoC.example4;

public class Person {
    private String name;
    private int age;
    private boolean isAdult;



    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){}

    @Override
    public String toString() {
        return String.format("Person name : %s\n" +
                "age: %s\n" +
                "isAdult : %s\n",getName(), getAge(), isAdult());
    }
}
