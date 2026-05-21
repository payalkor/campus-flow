package com.payal.db;

import java.sql.*;
public class DBConnection {
    public static Connection getConnection(){
        try{
            Connection c=DriverManager.getConnection("url",
                    "your_username",
                    "your_pass");

            return c;

        } catch (Exception e) {
           e.printStackTrace();
        }
        return null;
    }
}
