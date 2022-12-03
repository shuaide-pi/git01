package com.msb.springboot.dao;


import org.springframework.stereotype.Repository;

/**
 * 不加@Repository
 * 通过 IocConfig实例化 AccountDao
 */

public class AccountDao {

    public void testAccountDao(){
        System.out.println("AcountDaoTest.........");
    }
}
