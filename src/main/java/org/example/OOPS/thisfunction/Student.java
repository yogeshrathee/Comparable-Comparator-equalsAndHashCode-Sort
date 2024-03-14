package org.example.OOPS.thisfunction;

class Student{
    String studentName;
    int rollNo;

    public Student(){
        this("Yogesh",23);
        System.out.println("Students Details :: ");
    }
    public Student(String studentName, int rollNo){
        this.studentName=studentName;
        this.rollNo=rollNo;
    }
    public void showDisplay(){
        System.out.println(studentName+" : "+rollNo);
    }

}