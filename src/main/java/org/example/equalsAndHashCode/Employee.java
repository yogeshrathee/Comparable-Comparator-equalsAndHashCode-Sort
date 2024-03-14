package org.example.equalsAndHashCode;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;

    private String father_name;

    public Employee(int id, String name, String father_name) {
        this.id = id;
        this.name = name;
        this.father_name=father_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return father_name;
    }

    public void setFatherName(String fatherName) {
        this.father_name = fatherName;
    }

//    public boolean equals(Object o){
//        if(this == o){
//            return true;
//        }
//        if(o == null || getClass() != o.getClass()){
//            return false;
//        }
//        Employee employee=(Employee) o;
//        return (this.id == getId());
//
////        return id==employee.id && Objects.equals(name,employee.name) && Objects.equals(father_name,employee.father_name);
//    }
//    public int hashCode(){
//        return Objects.hash(id, name, father_name);
//    }
//
//    public int hashCode(Employee employee2) {
//            return Objects.hashCode(employee2);
//
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(father_name, employee.father_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, father_name);
    }


}
