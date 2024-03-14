package org.example.OOPS.DefaultConstructor;

import java.util.Scanner;


public class Practices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int studentId=sc.nextInt();
        String studentName=sc.next();
        String studentCity=sc.next();

        Student student=new Student();

        student.studentId=studentId;
        student.studentName=studentName;
        student.studentCity=studentCity;


        student.study();
        student.showStudentsDetails();

    }
}
