package com.volkov.IoC.example5;

public class ExampleBean4 implements Bean{
    public ExampleBean4() {
        System.out.println("Inside " + getClass().getSimpleName() + " constructor");
        System.out.println("Внутри конструктора " + getClass().getSimpleName());
        System.out.println();
    }
}
