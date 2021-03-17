package com.me.service;

import com.me.config.TxConfig;
import com.me.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.lang.Nullable;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@ExtendWith(SpringExtension.class) //整合JUnit5
//@ContextConfiguration(classes = TxConfig.class) //设置配置类
@SpringJUnitConfig(TxConfig.class) // 上面两个合并简化
class UserServiceTest {

    @Nullable
    private int id;

    @Autowired
    private UserService userService;

    @org.junit.jupiter.api.Test
    void transferMoney2() {
        userService.transferMoney();
    }

    @org.junit.jupiter.api.Test
    void genericApplicationContext() {
        // 1.创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        // 2.调用context方法注册, 第一个参数可以为空，表示指定对象名字
        context.refresh();
        context.registerBean("user",User.class, User::new);
        // 3.获取在spring注册的对象
        User user = (User) context.getBean("user");
        System.out.println(user);

    }
}