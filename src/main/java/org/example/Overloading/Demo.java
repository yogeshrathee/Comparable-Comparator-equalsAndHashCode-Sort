package org.example.Overloading;

import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Add.add();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


        System.out.println("sum of "+a+" and "+b+" is "+Add.add(a,b));

        // non-static method
        Add ad=new Add();
        System.out.println("sum of "+a+" , "+b+" and "+c+" is "+ad.add(a,b,c));

    }
}
