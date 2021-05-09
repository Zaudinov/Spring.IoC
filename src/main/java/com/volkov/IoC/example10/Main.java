package com.volkov.IoC.example10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // контекст без автосвязывания
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example10/application-context-noAutowire.xml");

        // контекс с автосвязыванием
//       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example13/application-context-autowired.xml");

        CatPerson catPerson = context.getBean("catPerson", CatPerson.class);


        PetPerson petPerson = context.getBean("petPerson", PetPerson.class);


        AnimalShelter animalShelter = context.getBean("animalShelter", AnimalShelter.class);


        System.out.println(petPerson.getAnimal() == animalShelter.getAnimal());
        System.out.println(catPerson.getCat() == animalShelter.getAnimal());
        System.out.println(animalShelter.getAnimal());

        System.out.println(catPerson.getCat());

        context.close();
    }
}
