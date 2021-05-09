package com.volkov.IoC.additional.Events0;

import org.springframework.context.ApplicationListener;

public class CustonEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println("Custom event received. Кастомное событие принято");
    }
}
