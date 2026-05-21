package com.payal.dao;

import com.payal.db.DBConnection;
import java.sql.*;
public class AdminDAO {

    // Login Method
    public boolean login(String username, String password) {

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "SELECT * FROM admin WHERE username=? AND password=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            // If record found
            if (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
