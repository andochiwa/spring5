package com.me.lifecycle;

/**
 * bean的生命周期
 * 1.通过构造器创建bean的实例（无参）
 * 2.把bean的属性设置值和对其他bean的引用（调用set方法）
 * 3.（后置处理器）把bean实例传递bean后置处理器的方法
 * 4.调用bean初始化的方法（init-method配置）
 * 5.（后置处理器）把bean实例传递bean后置处理器的方法
 * 6.对象创建完全，可以调用
 * 7.容器关闭时，调用bean的销毁方法（destroy-method配置）
 */
public class Orders {

    private String name;

    public Orders() {
        System.out.println("1.执行了无参数的构造");
    }

    public void setName(String name) {
        System.out.println("2.执行了set方法");
        this.name = name;
    }

    // 创建执行初始化方法(需要配置)
    public void initMethod() {
        System.out.println("3.执行初始化方法");
    }

    public void destroy() {
        System.out.println("5.销毁bean对象方法");
    }
}
