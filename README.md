# CampusFlow - College Management System

CampusFlow is a Java console-based College Management System built using Core Java, JDBC, PostgreSQL, and Maven.

This project helps manage student records using CRUD operations and follows layered backend architecture.

---

# Features

- Admin Login Authentication
- Add Student
- View Students
- Delete Student
- JDBC Database Connectivity
- PostgreSQL Integration
- Input Validation
- Layered Architecture

---

# Technologies Used

- Java
- JDBC
- PostgreSQL
- Maven
- IntelliJ IDEA

---

# Project Structure

com.payal
│
├── model
│   ├── Student.java
│   ├── Admin.java
│
├── dao
│   ├── StudentDAO.java
│   ├── AdminDAO.java
│
├── service
│   ├── StudentService.java
│   ├── AdminService.java
│
├── db
│   ├── DBConnection.java
│
└── Main.java

---

# Database Tables

## Student Table

CREATE TABLE student (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    course VARCHAR(100),
    mobile VARCHAR(10)
);

## Admin Table

CREATE TABLE admin (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50),
    password VARCHAR(50)
);

---

# Maven Dependency

<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.7.3</version>
</dependency>

---

# How to Run

1. Clone repository
2. Open project in IntelliJ IDEA
3. Configure PostgreSQL database
4. Update DB credentials in DBConnection.java
5. Run Main.java

---

# Learning Outcomes

This project helped in learning:

- Core Java
- OOP Concepts
- JDBC
- PostgreSQL
- CRUD Operations
- Maven
- Backend Architecture

---

# Future Enhancements

- Update Student
- Search Student
- Attendance Module
- Fee Management
- Spring Boot REST API
- Web-based UI

---

# Author
Payal Kor
