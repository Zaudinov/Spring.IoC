package com.volkov.IoC.example6;


public class ExampleBean3 implements Bean {
    public ExampleBean3() {
        System.out.println("Inside " + getClass().getSimpleName() + " constructor");
        System.out.println("Внутри конструктора " + getClass().getSimpleName());
        System.out.println();
    }
}
