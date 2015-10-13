package com.cash.dao;

import com.cash.domain.Consume;
import com.cash.domain.User;
import com.cash.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 */
public class ConsumeDao {

    public boolean addConsumeDao(String consumeName){
        return true;
    }

    public boolean deleteConsume(int consumeId){
        return true;
    }

    public boolean updateConsume(Consume consume){
        return true;
    }

    public List<Consume> getConsumeListByUser(int userId){
        //获取数据库连接
        Connection conn = null;
        //声明一个查询器，用来将查询语句放入数据库执行
        PreparedStatement ps = null;
        //声明一个结果集，用来存放数据库的查询结果
        ResultSet rs = null;

        try {
            conn = DBConnection.getConnection();
            String sql = "SELECT  * FROM CashBook.T_USER WHERE user_id = 1";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setUserName(rs.getString("user_id"));
                user.setEMail(rs.getString(2));
                System.out.println(rs.getString(1) + ";" + rs.getString(2) + ";" + rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }
}
