package org.example.Comparator;

import java.util.Comparator;

public class EmpComparator {
    public  static class IdComparator implements Comparator<Employee2>{

        @Override
        public int compare(Employee2 o1, Employee2 o2) {
            return o1.getId() - o2.getId();
        }
    }
    public static class NameComparator implements Comparator<Employee2>{

        @Override
        public int compare(Employee2 o1, Employee2 o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
}


