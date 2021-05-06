package com.volkov.IoC.example13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // контекст без автосвязывания
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example13/application-context-noAutowire.xml");

        // контекс с автосвязыванием
//       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example13/application-context-autowired.xml");

        CatPerson catPerson = context.getBean("catPerson", CatPerson.class);
        System.out.println(catPerson.hashCode());

        PetPerson petPerson = context.getBean("petPerson", PetPerson.class);
        System.out.println(petPerson.hashCode());

        AnimalShelter animalShelter = context.getBean("animalShelter", AnimalShelter.class);
        System.out.println(animalShelter.hashCode());
        System.out.println();

        System.out.println(petPerson.getAnimal() == animalShelter.getAnimal());
        System.out.println(catPerson.getCat() == animalShelter.getAnimal());
        System.out.println(animalShelter.getAnimal());

        System.out.println(catPerson.getCat());

        context.close();
    }
}
