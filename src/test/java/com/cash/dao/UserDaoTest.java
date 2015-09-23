package com.cash.dao;

import com.cash.pojo.User;
import org.junit.Test;

import java.sql.Time;

public class UserDaoTest {

    private UserDao dao = new UserDao();

    @Test
    public void putUserTest(){
        User user = new User();
        user.setUserId(1);
        user.setUserName("笨芸芸");
        user.setPassWord("12345678");
        user.setMobile("15221327109");
        user.setEMail("qiaoran@126.com");
        user.setTotalCash(50000);
        user.setClockTime(new Time(14*60*60*1000));
        boolean b = dao.putUser(user);
        System.out.println("添加" + (b ? "成功" : "失败"));
    }


}
