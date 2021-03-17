package com.me.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2) // 设置优先级，越小优先级越高
public class PersonProxy {

    @Pointcut("execution(* com.me.aop.annotation.User.add(..))")
    public void extractPoint() {

    }

    @Before("extractPoint()")
    public void before() {
        System.out.println("person Before....");
    }

}
