package com.volkov.IoC.example6;


public class ExampleBean1 implements Bean {
    public ExampleBean1() {
        System.out.println("Inside " + getClass().getSimpleName() + " constructor");
        System.out.println("Внутри конструктора " + getClass().getSimpleName());
        System.out.println();
    }
}
