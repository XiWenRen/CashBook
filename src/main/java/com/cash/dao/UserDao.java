package com.cash.dao;

import com.cash.pojo.User;
import com.cash.util.JsonUtil;

public class UserDao {

    public boolean putUser(User user){
        JsonUtil.addToJsonFile(user);
        //insert user into (user_name,.....) values (user.getUserName(),....);
        return true;
    }



}