    package com.me.service;

import com.me.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
// 可以加到类也可以加到方法上
// propagation 传播属性，isolation 隔离级别, timeout 超时时间, readOnly 是否只读, rollbackFor noRollbackFor 设置哪些异常进行回滚
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
/**
 * 事务的传播属性
 * REQUIRED 如果有事务在运行，当前方法就在这个事务内运行，否则启动新的事务，并在自己的事务内运行
 * REQUIRES_NEW 当前的方法必须启动新事物，并在它自己的事务内运行，如果有事务运行，则挂起
 * SUPPORTS 如果有事务在运行，当前方法就在这个事务内运行，否则可以不运行在事务内
 * NOT_SUPPORTED 当前方法不应该运行在事务内，如果有在运行的事务，则挂起
 * MANDATORY 当前的方法必须运行在事务内部，如果没有正在运行的事务，则抛出异常
 * NEVER 当前方法不应该运行在事务内，如果有在运行的事务，则抛出异常
 * NESTED 如果有事务在运行，当前方法就应该在这个事务的嵌套事务内运行，否则就启动一个新的事务，并在它自己的事务内运行
 */
public class UserService {

    @Autowired
    private UserDao userDao;



    public void transferMoney() {
        // lucy少100
        userDao.reduceMoney();
        // money多100
        userDao.addMoney();
    }

}
