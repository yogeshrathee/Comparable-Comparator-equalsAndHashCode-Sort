package org.example.Comparator;

import java.util.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of employees: ");
        int val = sc.nextInt();

        List<Employee2> list = new ArrayList<>();
        List<Integer> idList = new ArrayList<>();
        List<String> nameList = new ArrayList<>();

        System.out.println("\s\sEnter details of " + val + " employees: ");
        for (int i = 0; i < val; i++) {
            System.out.print("\s\s\sEnter id for employee " + (i + 1) + ": ");
            int id = sc.nextInt();
            idList.add(id);

            System.out.print("\s\s\sEnter name for employee " + (i + 1) + ": ");
            String name = sc.next();
            nameList.add(name);

            // Create Employee2 object and add it to the list
            list.add(new Employee2(id, name));
        }
        System.out.println();

        System.out.println("Original list: " + list);


        //if the comparator class is non-static
//        EmpComparator.IdComparator idComparator = new EmpComparator().new IdComparator();
//        EmpComparator.NameComparator nameComparator = new EmpComparator().new NameComparator();
//
//        Collections.sort(list, idComparator);
//        System.out.println("Sorted by id :: " + list);
//
//        Collections.sort(list, nameComparator);
//        System.out.println("Sorted by name :: " + list);




        //if the comparator class is static

//        EmpComparator.IdComparator idComparator = new EmpComparator.IdComparator();
//        EmpComparator.NameComparator nameComparator = new EmpComparator.NameComparator();

        Collections.sort(list, new EmpComparator.IdComparator());
        System.out.println("Sorted by id :: " + list);

        Collections.sort(list, new EmpComparator.NameComparator());
        System.out.println("Sorted by name :: " + list);
    }
}
