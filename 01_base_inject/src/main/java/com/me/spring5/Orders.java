package com.me.spring5;

/**
 * 有参数的构造型注入
 */
public class Orders {

    private String name;
    private String address;

    public Orders(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
