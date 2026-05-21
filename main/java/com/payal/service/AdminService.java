package com.payal.service;

import com.payal.dao.AdminDAO;
//import com.payal.model.Admin;

public class AdminService {
    AdminDAO ad=new AdminDAO();

    public boolean login(String username , String password){
    // Validation
        if(username.isEmpty() || password.isEmpty()) {
        System.out.println("Username and Password are required");
        return false;
    }

    // Username length validation
        if(username.length() < 3) {
        System.out.println("Username must contain at least 3 characters");
        return false;
    }

    // Password length validation
        if(password.length() < 4) {
        System.out.println("Password must contain at least 4 characters");
        return false;
    }

    // DAO Call
        return ad.login(username, password);
      }

}
