package com.cash.domain;

import org.junit.Test;

import java.sql.Time;

public class UserTest {

    @Test
    public void createUser(){
        User user = new User();
        user.setUserId(0);
        user.setUserName("笨芸芸");
        user.setPassWord("ddxxyy150304");
        user.setEMail("qiaoranmengmei@126.com");
        user.setMobile("15221327109");
        user.setTotalCash(40000);
        Time time = new Time(22,0,0);
        user.setClockTime(time);

        System.out.println(user);
    }
}
