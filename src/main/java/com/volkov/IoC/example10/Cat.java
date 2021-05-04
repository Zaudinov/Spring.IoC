package com.volkov.IoC.example10;

public class Cat {
    private String name;
    private Person owner;

    public Cat(String name, Person owner) {
        this.name = name;
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }
}
