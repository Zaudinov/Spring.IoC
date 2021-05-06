package com.volkov.IoC.example40;

import org.springframework.core.Ordered;
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
