package com.msb.springboot.config;

import com.msb.springboot.annotations.MyComponentScan;
import com.msb.springboot.dao.AccountDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * IOC 容器 代码实现
 * @Bean 通过容器实例化对象 单例
 *  spring java项目 配置
 */
@Configuration//初始化
@MyComponentScan("com.msb.springboot")//自定义注解，组合了@ComponentScan
@PropertySource(value={"db.properties","user.properties"})//加载配置文件
public class IocConfig {

    @Value("${jdbc.driver}")//注入对应的属性值
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Bean//初始化对象并返回
    public AccountDao crateAccountDao(){
        return new AccountDao();
    }
    //控制台打印信息
    public void test(){
        System.out.println("IocConfig初始化获取："+username+"："+password);
    }
}
