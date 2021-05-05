package com.volkov.IoC.example36_task_solution;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExampleBean {
    private int value;

    public int getValue() {
        return value;
    }

    @Value("2")
    public void setValue(int value) {
        this.value = value;
    }
}
