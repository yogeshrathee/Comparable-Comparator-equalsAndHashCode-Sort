package org.example.Comparable;

import java.util.*;

public class Main {
    public static void main(String[] args) {



        List<Employee1> list= new ArrayList<>();
        list.add(new Employee1(2,"a"));
        list.add(new Employee1(1,"c"));
        list.add(new Employee1(3,"b"));



        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


    }
}

