package com.cash.service;

import com.cash.dao.UserMapper;
import com.cash.domain.User;
import com.cash.service.impl.UserServiceImpl;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Ignore
    @Test
    public void getAllUserListTest(){
        List<User> userList = userService.getAllUserList();
        System.out.println(userList);
    }

    @Test
    public void testWired(){
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
//        userService = (UserServiceImpl) ac.getBean("userService");
//        System.out.println(userService.getAllUserList());
        UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
        System.out.println(userMapper.selectAllUser());
    }

}
