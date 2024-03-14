package org.example.equalsAndHashCode;
import org.example.equalsAndHashCode.Employee;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee employee1=new Employee(1,"yogesh","kulbir");

        Employee employee2=new Employee(1,"yogesh","kulbir");





        //:- equals() checks for reference equality,
        // which would be false since employee1 and
        //  employee2 are distinct objects in memory.
        System.out.println(employee1.equals(employee2));

        //employee1 == employee2: This would also return false
        // because employee1 and employee2 are separate objects with
        // different memory addresses.
//        System.out.println(employee1==employee2);

        int hashCode1=employee1.hashCode();
        int hashCode2=employee2.hashCode();

        System.out.println(hashCode1);
        System.out.println(hashCode2);






        List<Employee>employees=new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);

        System.out.println("Id  :   Name    :   FatherName");
        for(Employee employee : employees){
            System.out.println(employee.getId()+"   :   "+employee.getName()+"  :   "+employee.getFatherName());
        }

        System.out.println(employees.contains(employee1));
        System.out.println(employees.contains(employee2));


//        String s1="yogesh";
//        String s2="yogesh";
//
//        System.out.println(s1.equals(s2)); // true
//        System.out.println(s1 == s2); //
//
//        String s3=new String("yogesh");
//        String s4=new String("yogesh");
//
//        System.out.println(s3.equals(s4));
//        System.out.println(s3 == s4);



    }
}