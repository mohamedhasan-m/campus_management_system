package com.campus.app;

import java.util.Scanner;

import com.campus.model.ScholarshipStudent;
import com.campus.model.Student;
import com.campus.service.StudentService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input student ID
        System.out.println("Enter the student id:");
        int studentid = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input student name
        System.out.println("Enter the student name:");
        String studentname = sc.nextLine();

        // Input student age
        System.out.println("Enter the student age:");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input department
        System.out.println("Enter the student department:");
        String department = sc.nextLine();

        // Input number of subjects
        System.out.println("Number of subjects:");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Input marks
        System.out.println("Enter the marks of " + n + " subjects:");

        for (int i = 0; i < n; i++) {

            System.out.println("Enter the mark of subject " + (i + 1) + ":");
            marks[i] = sc.nextInt();
        }

        // Input scholarship percentage
        System.out.println("Enter scholarship percentage:");
        double scholarshipPercentage = sc.nextDouble();

        /*
         * Polymorphism:
         * Student is the reference type,
         * ScholarshipStudent is the object type.
         */
        Student student = new ScholarshipStudent(
                studentid,
                studentname,
                age,
                department,
                marks,
                scholarshipPercentage
        );

        // Display student information
        student.displayStudentInfo(true);

        // Display student type
        student.studentType();

        // Display student count
        Student.displayStudentCount();

        // Display report card
        StudentService studentService = new StudentService();
        studentService.displayReportCard(student);

        sc.close();
    }
}
