package org.example.OOPS.ParameterizeConstructor;

class Employee{
    int employeeId;
    String employeeName;
    String employeeCity;

    public Employee(int id, String name, String city){
        this.employeeId=id;
        this.employeeName=name;
        this.employeeCity=city;
    }
    public void showDisplay(){
        System.out.println(employeeId+" : "+employeeName+" : "+employeeCity);

    }
}