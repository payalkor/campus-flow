package com.payal.service;

import com.payal.model.Student;
import com.payal.dao.StudentDAO;

public class StudentService {
    StudentDAO st=new StudentDAO();

    //Add Stud Services
    public void addStudent(Student s){

        //Validation
        if(s.getName().isEmpty() ||
                s.getCourse().isEmpty() ||
                s.getMobile().isEmpty() ) {

            System.out.println("All fields are required ! ");
            return;
        }

        //mobile no validation
        if(s.getMobile().length()!=10){
            System.out.println("Mobile number must be 10 digits!");
            return;
        }

        st.addStudent(s);
    }

    //view students
    public void viewStudents(){
        st.viewStudents();
    }

    //Delete Student
    public void deleteStudent(int id){
        st.deleteStudent(id);
    }

}
