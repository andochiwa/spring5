package com.me.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 增强的类
 */
@Component
@Aspect // 生成代理对象
@Order(1) // 设置优先级，越小优先级越高
public class UserProxy {

    // 抽取相同切入点
    @Pointcut("execution(* com.me.aop.annotation.User.add(..))")
    public void extractPoint() {

    }

    // 前置通知
    @Before("extractPoint()")
    public void before() {
        System.out.println("before add....");
    }

    // 后置通知
    @After("extractPoint()")
    public void after() {
        System.out.println("after add....");
    }

    // 正常返回后后置通知
    @AfterReturning("extractPoint()")
    public void afterReturning() {
        System.out.println("afterReturning add....");
    }

    // 异常抛出后后置通知
    @AfterThrowing("extractPoint()")
    public void afterThrowing() {
        System.out.println("afterThrowing add....");
    }

    // 环绕通知
    @Around("extractPoint()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before add....");

        // 执行被增强的方法
        proceedingJoinPoint.proceed();

        System.out.println("around after add....");
    }

}
