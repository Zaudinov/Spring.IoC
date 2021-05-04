package com.volkov.IoC.example27;


public class ExampleBean2 {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public void customInit(){
        System.out.println("Inside user init-method for bean2. Внутри нашего особого метода инициализации для бина2 value = " + value);
    }

    public void destroy(){
        System.out.println("Inside user destroy for bean2. Внутри нашего метода уничтожения бина2");
    }
}
