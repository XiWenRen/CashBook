package com.cash.service.impl;

import com.cash.dao.UserMapper;
import com.cash.domain.User;
import com.cash.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUserList() {
        return null;
    }

}
