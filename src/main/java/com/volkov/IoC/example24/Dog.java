package com.volkov.IoC.example24;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("dog")
@Order(Ordered.LOWEST_PRECEDENCE)
public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("woof");
    }
}
