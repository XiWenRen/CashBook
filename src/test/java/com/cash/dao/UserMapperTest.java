package com.cash.dao;

import com.cash.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

public class UserMapperTest extends SuperTest{

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectAllUserTest(){
        User user = userMapper.selectAllUser();
        System.out.println(user);
    }

    @Test
    public void loginTest(){
        User login = new User();
        login.setUserName("XiWenRen");
        login.setPassWord("123456");
        User user = userMapper.login(login);
        if(user != null){
            System.out.println("login success!!!");
        }
    }
}
