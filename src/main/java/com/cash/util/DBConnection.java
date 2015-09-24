package com.cash.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 */
public class DBConnection {

    public static Connection getConnection(){
        Connection conn = null;

        try {
            String name = "root";
            String pass = "root";
            String url = "jdbc:mysql://127.0.0.1:3306/sakila";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,name,pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
