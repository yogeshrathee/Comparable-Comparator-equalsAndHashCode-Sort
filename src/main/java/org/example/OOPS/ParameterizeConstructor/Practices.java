package org.example.OOPS.ParameterizeConstructor;

import java.util.Scanner;



public class Practices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int id=sc.nextInt();
        String name=sc.next();
        String city=sc.next();

        Employee employee=new Employee(id,name,city);

        employee.showDisplay();
    }
}
