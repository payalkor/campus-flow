package com.payal.dao;

import com.payal.model.Student;
import com.payal.db.DBConnection;
import java.sql.*;
public class StudentDAO {
    // Add Student
    public void addStudent(Student s) {

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "INSERT INTO student(name, course, mobno) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, s.getName());
            ps.setString(2, s.getCourse());
            ps.setString(3, s.getMobile());

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Student Added Successfully");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // View Students
    public void viewStudents() {

        try {

            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM student";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                System.out.println("-------------------");

                System.out.println("ID : " + rs.getInt("id"));
                System.out.println("Name : " + rs.getString("name"));
                System.out.println("Course : " + rs.getString("course"));
                System.out.println("Mobile : " + rs.getString("mobno"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete Student
    public void deleteStudent(int id) {

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "DELETE FROM student WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Student Deleted Successfully");
            } else {
                System.out.println("Student Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
