package com.payal;
import com.payal.model.Student;
import com.payal.service.AdminService;
import com.payal.service.StudentService;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        AdminService adm = new AdminService();
        StudentService stu = new StudentService();

        //Admin Login
        System.out.println("\n***********ADMIN LOGIN***************\n");

        System.out.println("Enter Username : \n");
        String usern = s.nextLine();

        System.out.println("Enter Password : \n");
        String pass = s.nextLine();

        boolean logstatus = adm.login(usern, pass);

        if (logstatus) {
            System.out.println("Login Successfully !\n");

            while (true) {
                System.out.println("\n===== CAMPUSFLOW MENU =====");

                System.out.println("\n1. Add Student");
                System.out.println("\n2. View Students");
                System.out.println("\n3. Delete Student");
                System.out.println("\n4. Exit");

                System.out.print("\nEnter Choice: ");

                int choice = s.nextInt();
                s.nextLine();

                switch (choice) {

                    // Add Student
                    case 1:
                        Student st = new Student();
                        System.out.print("\nEnter Name: ");
                        st.setName(s.nextLine());

                        System.out.print("\nEnter Course: ");
                        st.setCourse(s.nextLine());

                        System.out.print("\nEnter Mobile: ");
                        st.setMobile(s.nextLine());

                        stu.addStudent(st);

                        break;

                    //View Student
                    case 2:
                        stu.viewStudents();
                        break;

                    //Delete Student
                    case 3:
                        System.out.println("\n Enter Student ID : ");
                        int id = s.nextInt();
                        stu.deleteStudent(id);
                        break;

                    case 4:
                        System.out.println("\n Thank You");
                        System.exit(0);

                    default:
                        System.out.println("\n Invalid Choice");

                }
            }
        } else {
            System.out.println("\n Invalid Username and Password");
        }
    }
}