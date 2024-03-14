package org.example.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortMethods {
    public static void main(String[] args) {

        int[] arr={11,5,6,120,8,9};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<int[]>list= List.of(arr);
        for (int[] list2 : list ) {
            System.out.println(Arrays.toString(list2));
        }

        List<Integer> list1 = Arrays.stream(arr).boxed().toList();
        System.out.println(list1);



        List<Integer> list3=new ArrayList<>(Arrays.stream(arr).boxed().toList());
         Collections.reverse(list3);
        System.out.println(list3);
    }
}
