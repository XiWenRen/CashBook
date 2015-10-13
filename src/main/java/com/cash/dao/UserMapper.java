package com.cash.dao;

import com.cash.domain.User;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

public interface UserMapper {
    User selectAllUser();

    User login(User user);
}
