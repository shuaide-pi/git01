package com.msb.springboot;

import com.msb.springboot.config.IocConfig;
import com.msb.springboot.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext aa = new AnnotationConfigApplicationContext(IocConfig.class);
        UserService userService1 = aa.getBean(UserService.class);
        UserService userService2 = aa.getBean(UserService.class);
        userService1.testUserService();
//        System.out.println(userService1==userService2);//true
//        userService2.testUserService();
//        System.out.println("userDao是否单例:"+ aa.isSingleton("userDao"));
        //NoSuchBeanDefinitionException 未定义？？
//        System.out.println("accountDao是否单例:"+ aa.isSingleton("accountDao"));
        IocConfig iocConfig = aa.getBean(IocConfig.class);
        iocConfig.test();
    }
}
