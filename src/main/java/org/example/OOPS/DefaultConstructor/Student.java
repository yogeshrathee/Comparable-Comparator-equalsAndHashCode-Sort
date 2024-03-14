package org.example.OOPS.DefaultConstructor;

class Student{

    //data members
    int studentId;
    String studentName;
    String studentCity;

    //Behaviour:= members methods, methods,functions
    public void study(){
        System.out.println(studentName+" is studying");
    }
    public void showStudentsDetails(){
        System.out.println(studentId+" : "+studentName+" : "+studentCity);
    }
}