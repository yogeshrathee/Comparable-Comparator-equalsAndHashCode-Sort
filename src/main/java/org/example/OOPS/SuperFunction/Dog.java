package org.example.OOPS.SuperFunction;

public class Dog extends Animal{
    String color="black";
    public Dog(String name){
        super(name);
    }
    public void showDetails(){
        System.out.println(super.color);
        System.out.println(this.color);
        System.out.println(name);
    }
}
