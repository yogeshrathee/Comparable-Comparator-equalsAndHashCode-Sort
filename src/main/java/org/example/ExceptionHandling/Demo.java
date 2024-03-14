package org.example.ExceptionHandling;

import java.util.*;

public class Demo {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        try {
            int val = sc.nextInt();
            int val1 = sc.nextInt();
            check(val, val1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void check(int val, int val1) throws Exception{
        System.out.println(val / val1);

    }
}