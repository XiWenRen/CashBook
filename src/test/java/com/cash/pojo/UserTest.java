package com.cash.pojo;

import org.junit.Test;

import java.sql.Date;
import java.sql.Time;

public class UserTest {

    @Test
    public void createUser(){
        User user = new User();
        user.setUserId(0);
        user.setUserName("���ǽ��");
        user.setPassWord("ddxxyy150304");
        user.setEMail("qiaoranmengmei@126.com");
        user.setMobile("15221327109");
        user.setTotalCash(40000);
        Time time = new Time(22,0,0);
        user.setClockTime(time);

        System.out.println(user);
    }
}
