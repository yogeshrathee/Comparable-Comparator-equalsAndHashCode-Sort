package org.example.OOPS.Interface;

public class Iphone implements Phone{
    @Override
    public void name() {
        System.out.println("14 pro max");
    }

    @Override
    public void color() {
        System.out.println("Black");
    }

    @Override
    public void cost() {
        System.out.println("1_50_000");
    }
}
