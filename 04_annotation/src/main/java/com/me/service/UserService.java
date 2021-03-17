package com.me.service;

import com.me.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

// value可以不写，不写默认为首字母小写其余同名
@Service(value = "userService")
public class UserService {

    // 在属性上用注解添加注入，不需要set方法
    // Qualifier表示具体指向哪个类，要和Autowired配合使用
    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;

    // 根据类型注入或名称注入
    // Resource是java的扩展包下的，spring不建议使用
    @Resource(name = "userDaoImpl")
    private UserDao userDao2;

    @Value("abc")
    private String name;

    public void add() {
        System.out.println("service add...");
        userDao.add();
        userDao2.delete();
        System.out.println(name);
    }

}
