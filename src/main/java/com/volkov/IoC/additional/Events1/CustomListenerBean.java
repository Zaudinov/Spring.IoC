package com.volkov.IoC.additional.Events1;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component("customListenerBean")
public class CustomListenerBean implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println("Custom event received. Кастомное событие принято");
    }
}
