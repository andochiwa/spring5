package com.me.aop.annotation;

import org.springframework.stereotype.Component;

@Component
public class User {

    public void add() {
        System.out.println("user add...");
    }
}
