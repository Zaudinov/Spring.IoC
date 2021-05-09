package com.volkov.IoC.example24;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("parrot")
@Order
public class Parrot implements Animal{
    @Override
    public void voice() {
        System.out.println("Hi!");
    }
}
