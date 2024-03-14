package org.example.ExceptionHandling;

import org.example.ExceptionHandling.CustomException.NegativeResultException;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("starting point");
        Scanner sc=new Scanner(System.in);
        try {
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int result=n1/n2;

            if(result<0){
                throw new NegativeResultException("negative result");
            }else{
                System.out.println("result :: "+result);
            }
        }
        catch (NegativeResultException e){
            System.out.println("invalid result");
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("in finally block");
        }


        System.out.println("terminated");
    }
}


