package com.me.factorybean;

import com.me.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBean implements FactoryBean<Course> {

    // 定义返回bean的对象
    // 设置MyBean的返回对象类型为course
    @Override
    public Course getObject() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        return context.getBean("course", Course.class);
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
