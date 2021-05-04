package com.volkov.IoC.example11;

public class Person {
    private String firstName;
    private String surname;
    private int age;
    private Cat cat;

    public Person() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Person(String firstName, String surname, int age, Cat cat) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Person:\n{" +
                "firstName='" + firstName + '\'' +
                ",\n surname='" + surname + '\'' +
                ",\n age=" + age +
                ",\n Cat='" + cat.getName() + '\'' +
                '}';
    }

}
