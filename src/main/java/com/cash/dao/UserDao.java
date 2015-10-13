package com.cash.dao;

import com.cash.domain.User;
import com.cash.util.JsonUtil;

public class UserDao {

    /**
     * 添加用户
     * @param user 用户信息
     * @return 是否成功
     */
    public boolean putUser(User user) {
        JsonUtil.addEle(user);
        //insert user into (user_name,.....) values (user.getUserName(),....);
        return true;
    }

    /**
     * 删除数据
     * @param userId 用户ID，unique
     * @return 是否成功
     */
    public boolean deleteUser(int userId){
        JsonUtil.deleteEle(userId);
        return true;
    }

    /**
     * 更新用户数据
     * @param user 要更新的用户
     * @return 是否成功
     */
    public boolean updateUser(User user){
        JsonUtil.updateEle(user);
        return true;
    }

    /**
     * 登录
     * @param userName 用户名
     * @param passWord 密码
     * @return 登录成功的用户信息
     */
    public User logon(String userName, String passWord){
        return JsonUtil.getJson().get(0);
    }
}