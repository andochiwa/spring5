package com.me.dao.impl;

import com.me.dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {

    public static void main(String[] args){
        UserDao userDao = new UserDaoImpl();
        UserDao dao = (UserDao) ProxyFactory.getProxyInstance(userDao);
        int res = dao.add(1, 2);
        System.out.println(res);
    }
}

/**
 * 动态代理类
 */
class ProxyFactory {

    /**
     * 通过被代理类对象获取代理类对象
     * @return 代理类对象
     */
    public static Object getProxyInstance(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new UserDaoProxy(obj));
    }
}

class UserDaoProxy implements InvocationHandler {

    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    // 增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 方法之前
        System.out.println("方法之前执行");

        // 被增强方法执行
        Object res = method.invoke(obj, args);

        // 方法之后执行
        System.out.println("方法之后执行..." + obj);

        return res;
    }
}
