package com.volkov.IoC.additional.Events1;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Component("closeListenerBean")
public class CloseListenerBean implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
        System.out.println("ContextClosedEvent received. Событие о закрытии контекста получено.");
    }
}
