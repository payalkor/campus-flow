package com.payal.db;

import java.sql.*;
public class DBConnection {
    public static Connection getConnection(){
        try{
            Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/campusflow",
                    "postgres",
                    "postgreuser");

            return c;

        } catch (Exception e) {
           e.printStackTrace();
        }
        return null;
    }
}
