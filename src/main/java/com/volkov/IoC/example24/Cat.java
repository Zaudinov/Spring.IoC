package com.volkov.IoC.example24;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("cat")
@Order(Ordered.HIGHEST_PRECEDENCE)
public class Cat implements Animal {

    @Override
    public void voice() {
        System.out.println("meow");
    }
}
