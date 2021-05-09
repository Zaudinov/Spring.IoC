package com.volkov.IoC.example5;

public class ExampleBean2 implements Bean{
    public ExampleBean2() {
        System.out.println("Inside " + getClass().getSimpleName() + " constructor");
        System.out.println("Внутри конструктора " + getClass().getSimpleName());
        System.out.println();
    }
}
