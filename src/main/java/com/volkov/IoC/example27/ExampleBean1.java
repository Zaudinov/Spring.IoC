package com.volkov.IoC.example27;


public class ExampleBean1 {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public void init(){
        System.out.println("Inside user init-method for bean1. Внутри нашего метода инициализации бина1 value = " + value);
    }

    public void destroy(){
        System.out.println("Inside user destroy for bean1. Внутри нашего метода уничтожения бина1");
    }
}
