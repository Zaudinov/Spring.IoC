package com.volkov.IoC.example24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration("config")
@ComponentScan
public class Config {

    @Autowired
    private List<Animal> animals;

    public void voice(){
        for (Animal animal: animals) {
            animal.voice();
        }
    }
}
