package org.example.OOPS.Inheritance.SingleInheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int storeId=sc.nextInt();
        String storeName=sc.next();

        int bookId=sc.nextInt();
        String bookName=sc.next();

        Book book=new Book(storeId,storeName,bookId,bookName);
        book.showDetails();


    }
}
