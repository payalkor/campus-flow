package com.payal.model;

public class Student {
    private int id;
    private String name,course,mobile;

    //Default Constructor
    public Student(){}

    //Parameterized Constructor
    public Student(int id,String name,String course,String mobile){
        this.id=id;
        this.name=name;
        this.course=course;
        this.mobile=mobile;
    }

    //Getter and Setter

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course=course;
    }

    public String getMobile(){
        return mobile;
    }
    public void setMobile(String mobile){
        this.mobile=mobile;
    }

}
