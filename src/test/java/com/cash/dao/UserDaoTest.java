package com.cash.dao;

import com.cash.domain.User;
import com.cash.util.JsonUtil;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;

import java.sql.Time;

public class UserDaoTest {

    private UserDao dao = new UserDao();

    @Ignore
    @Test
    public void putUserTest() {
        User user = new User();
        user.setUserId(1);
        user.setUserName("笨芸芸");
        user.setPassWord("12345678");
        user.setMobile("15221327109");
        user.setEMail("qiaoran@126.com");
        user.setTotalCash(50000);
        user.setClockTime(new Time(14 * 60 * 60 * 1000));
        boolean b = dao.putUser(user);
        System.out.println("添加" + (b ? "成功" : "失败"));
    }

    @Ignore
    @Test
    public void deleteUserTest(){
        boolean b = dao.deleteUser(1);
        System.out.println("删除" + (b ? "成功" : "失败"));
    }

    @Ignore
    @Test
    public void updateUserTest(){
        User user = JsonUtil.getJson().get(0);
        user.setUserName("聪明哒哥哥");
        boolean b = dao.updateUser(user);
        System.out.println("更新" + (b ? "成功" : "失败"));
    }

    @Test
    public void login(){
        User user = dao.logon("","");
        System.out.println(user);
    }
}
