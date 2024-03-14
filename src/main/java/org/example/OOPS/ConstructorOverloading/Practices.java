package org.example.OOPS.ConstructorOverloading;

import java.util.Scanner;

public class Practices {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int collegeId=sc.nextInt();
        String collegeName=sc.next();
        int uniId=sc.nextInt();
        String uniName=sc.next();

        University university=new University(collegeId,collegeName,uniId,uniName);
        university.showDetails();

    College college=new College("Yogesh Rathee");
        System.out.println(college.getPrincipleName());
    }
}
