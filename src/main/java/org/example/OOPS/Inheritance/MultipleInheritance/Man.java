package org.example.OOPS.Inheritance.MultipleInheritance;

public class Man extends Person implements Father  {
    int salary;

    public Man(String name, int age, int salary){
        super(name,age);
        this.salary=salary;
    }
    public void showDetails(){
        System.out.println("Father Name:: "+name);
        System.out.println("Father Age:: "+age);
        System.out.println("Father Salary:: "+salary);
    }
    @Override
    public void task(){
        System.out.println("Father Details:: ");
    }


}
