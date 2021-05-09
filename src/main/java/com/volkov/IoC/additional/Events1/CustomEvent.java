package com.volkov.IoC.additional.Events1;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
    private static final long serialVersionUID = 21L;

    public CustomEvent(Object source) {
        super(source);
    }
}
