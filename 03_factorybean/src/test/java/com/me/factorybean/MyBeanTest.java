package com.me.factorybean;

import com.me.collectiontype.Course;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class MyBeanTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        MyBean myBean = context.getBean("myBean", MyBean.class);
        Course myBean1 = context.getBean("myBean", Course.class);
        Course myBean2 = context.getBean("myBean", Course.class);
        System.out.println(myBean1);
        // 单实例和多实例判断
        System.out.println(myBean1 == myBean2);
    }
}