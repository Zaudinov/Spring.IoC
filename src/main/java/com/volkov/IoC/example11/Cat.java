package com.volkov.IoC.example11;

public class Cat {
    private String name;
    private Person owner;


    public Cat() {
    }

    public Cat(String name, Person owner) {
        this.name = name;
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }
}
