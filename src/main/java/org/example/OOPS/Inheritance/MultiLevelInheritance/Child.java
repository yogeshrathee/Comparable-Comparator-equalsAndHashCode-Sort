package org.example.OOPS.Inheritance.MultiLevelInheritance;

public class Child extends Father{
    String childName;

    public Child(String grandFatherName, String fatherName, String childName){
        super(grandFatherName,fatherName);
        this.childName=childName;
    }

    public void showDetails(){
        System.out.println("Grand Father Name:: "+grandFatherName);
        System.out.println("Father Name:: "+fatherName);
        System.out.println("Child Name:: "+childName);
    }
}
