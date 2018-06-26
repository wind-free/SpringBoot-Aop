package com.imooc.aop.service;

import com.imooc.aop.dao.OperationLogDao;
import com.imooc.aop.dao.UserDao;
import com.imooc.aop.domain.OperationLog;
import com.imooc.aop.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * create by maoxiangyu
 */
@Component
public class DemoService {

    @Autowired
    UserDao userDao;
    @Autowired
    OperationLogDao operationLogDao;

    @Transactional
    public void adduser(String name) {
        OperationLog log=new OperationLog();
        log.setContent("create user:"+ name);
        System.out.println(log.getContent());
        System.out.println(log.getCreatedAt());
        System.out.println(log.getId());

        operationLogDao.save(log);

        User user=new User();
        user.setName(name);
        System.out.println(user.toString());
        userDao.save(user);
    }
}
