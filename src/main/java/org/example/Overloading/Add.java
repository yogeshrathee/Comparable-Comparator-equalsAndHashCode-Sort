package org.example.Overloading;

class Add{
    public static void add() {
        System.out.println(30);
    }
    public static int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
}