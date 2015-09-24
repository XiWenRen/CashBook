package com.cash.pojo;

import java.sql.Time;

public class User {

    private int userId;
    private String userName;
    private String passWord;
    private double totalCash;
    private String EMail;
    private String mobile;
    private Time clockTime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getTotalCash() {
        return totalCash;
    }

    public void setTotalCash(double totalCash) {
        this.totalCash = totalCash;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Time getClockTime() {
        return clockTime;
    }

    public void setClockTime(Time clockTime) {
        this.clockTime = clockTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != user.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", totalCash=" + totalCash +
                ", EMail='" + EMail + '\'' +
                ", mobile='" + mobile + '\'' +
                ", clockTime=" + clockTime +
                '}';
    }
}
