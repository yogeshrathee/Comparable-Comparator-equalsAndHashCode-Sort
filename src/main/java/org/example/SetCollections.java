package org.example;


import java.util.*;

public class SetCollections {
    public static void main(String[] args) {
        String element=null;
        int i;

        Scanner sc=new Scanner(System.in);
        System.out.print("total Element:: ");
        int num=sc.nextInt();

        System.out.print("Enter the "+num+" element:: ");
        Map<Integer,String> map= new HashMap<>();

        for(i=0;i<num;i++){
            element=sc.next();
            map.put(i,element);
        }
        System.out.println(map);

        System.out.print("enter the new index ::");
        int val=sc.nextInt();

        System.out.print("enter element of "+val+" index :: ");
        String ele=sc.next();

        map.put(val,ele);
        System.out.println(map);

        map.putIfAbsent(val,ele);
        System.out.println(map);

        boolean isEmpty = map.isEmpty();
        System.out.println("map is empty ?? "+isEmpty);


        System.out.println(map.keySet());
        System.out.println(map.values());

    }
}
