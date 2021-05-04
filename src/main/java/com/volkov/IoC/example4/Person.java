package com.volkov.IoC.example4;

public class Person {
    private String name;
    private int age;
    private boolean isAdult;

    public static Person createInstance (String name, int age){
        Person person = new Person(name, age);
        if(person.age >= 18){
            person.setAdult(true);
        }
        //or some other operations with the instance
        //можно добавить другие операции над объектом.
        return person;
    }

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
