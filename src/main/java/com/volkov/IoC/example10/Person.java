package com.volkov.IoC.example10;

public class Person {
    private String firstName;
    private String surname;
    private int age;

    public Person(String firstName, String surname, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ",\n surname='" + surname + '\'' +
                ",\n age=" + age +
                '}';
    }
}
