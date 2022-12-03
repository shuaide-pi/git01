package com.msb.springboot.service;

import com.msb.springboot.dao.AccountDao;
import com.msb.springboot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;
//    @Autowired
    @Resource
    private AccountDao accountDao;
    @Value("${uname}")
    private String uname;
    @Value("${upwd}")
    private String upwd;

    public void testUserService(){
        userDao.testUserDao();
        System.out.println("UserServiceTest.......");
        accountDao.testAccountDao();
        System.out.println("accountDao对象："+accountDao);
        System.out.println("UserService获取："+uname+"："+upwd);
    }
}
