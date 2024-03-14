package org.example.OOPS.Inheritance.MultiLevelInheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String grandFatherName=sc.next();
        String fatherName=sc.next();
        String childName=sc.next();

        Child child=new Child(grandFatherName,fatherName,childName);
        child.showDetails();
    }
}
