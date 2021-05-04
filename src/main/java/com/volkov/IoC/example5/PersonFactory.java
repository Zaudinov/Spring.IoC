package com.volkov.IoC.example5;

public class PersonFactory {

    public Person createInstance(String name, int age){
        Person person = new Person(name, age);
        if(person.getAge() >= 18){
            person.setAdult(true);
        }
        //or some other operations with the instance
        //можно добавить другие операции над объектом.
        return person;
    }
}
