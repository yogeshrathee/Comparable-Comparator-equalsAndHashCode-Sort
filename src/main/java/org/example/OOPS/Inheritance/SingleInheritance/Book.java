package org.example.OOPS.Inheritance.SingleInheritance;

public class Book extends Store{
    int bookId;
    String bookName;
    public Book(int storeId,String storeName, int bookId, String bookName){
        super(storeId,storeName);
        this.bookId=bookId;
        this.bookName=bookName;
    }
    public void showDetails(){
        System.out.println(storeId+" : "+storeName);
        System.out.println(bookId+" : "+bookName);
    }
}
