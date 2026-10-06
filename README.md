# Student Management System

A simple Student Management System built using Java Servlets, HTML, JDBC, and MySQL.

## Features

- Add new students
- View all students
- Edit student details
- Delete students
- Store student data in MySQL
- Basic HTML web interface
- JDBC database connectivity

## Student Details

Each student contains:

- ID
- Name
- Age
- Department

## Technologies Used

- Java
- Java Servlets
- HTML
- JDBC
- MySQL
- Maven
- Apache Jetty

## Project Structure

```text
StudentManagementSystem/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── campus/
│       │           ├── controller/
│       │           │   └── StudentServlet.java
│       │           ├── dao/
│       │           │   └── StudentDAO.java
│       │           ├── model/
│       │           │   └── Student.java
│       │           ├── services/
│       │           │   └── StudentService.java
│       │           └── util/
│       │               └── DBConnection.java
│       └── webapp/
│           └── index.html
├── pom.xml
├── .gitignore
└── README.md
```

## Database Setup

Create the database:

```sql
CREATE DATABASE student_management;
```

Use the database:

```sql
USE student_management;
```

Create the students table:

```sql
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    department VARCHAR(100) NOT NULL
);
```

## Database Configuration

Update the MySQL connection details in `DBConnection.java`.

```java
String url = "jdbc:mysql://localhost:3306/student_management";
String username = "root";
String password = "your_password";
```

Replace `your_password` with your MySQL password.

## How to Run

1. Start MySQL.
2. Create the database and students table.
3. Configure the database credentials.
4. Open the project in IntelliJ IDEA or Eclipse.
5. Build the project using Maven:

```bash
mvn clean install
```

6. Start the Servlet server.
7. Open the application in your browser:

```text
http://localhost:8080
```

## Application Flow

```text
HTML Web Page
      ↓
StudentServlet
      ↓
StudentService
      ↓
StudentDAO
      ↓
JDBC
      ↓
MySQL Database
```

## CRUD Operations

### Create

Add a new student with:

- Name
- Age
- Department

### Read

View all students stored in the MySQL database.

### Update

Edit the details of an existing student.

### Delete

Delete a student from the database.

## Objective

The main objective of this project is to understand how Java Servlets, JDBC, HTML, and MySQL work together to build a basic web application.

## Future Improvements

- Student search
- Form validation
- Better UI with CSS/Bootstrap
- Login and authentication
- Student dashboard
- REST API
- React frontend
- Spring Boot backend

## Author

**Hasan**

Computer Science & Engineering Student