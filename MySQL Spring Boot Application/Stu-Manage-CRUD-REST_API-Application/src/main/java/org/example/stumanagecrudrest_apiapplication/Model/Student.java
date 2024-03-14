package org.example.stumanagecrudrest_apiapplication.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentDetails")
public class Student {

    @Column(name="STUDENT NAME")
    private String stuName;
    @Id
    @Column(name="REG NO")
    private String stuRegNo;
    @Column(name="CLASS")
    private String Class;
    @Column(name="BATCH")
    private String batch;
    @Column(name="FATHER NAME")
    private String fatherName;

    public Student(){

    }

    public Student(String stuName, String stuRegNo, String Class, String batch, String fatherName){
        this.stuName=stuName;
        this.stuRegNo=stuRegNo;
        this.Class=Class;
        this.batch=batch;
        this.fatherName=fatherName;
    }

   public String getStuName(){
        return stuName;
   }
   public void setStuName(String stuName){
        this.stuName=stuName;
   }

   public String getStuRegNo(){
        return stuRegNo;
   }
   public void setStuRegNo(String stuRegNo){
        this.stuRegNo=stuRegNo;
   }

   public String getStuClass(){
        return Class;
   }
   public void setStuClass(String Class){
        this.Class=Class;
   }

   public String getBatch(){
        return batch;
   }
   public void setBatch(String batch){
        this.batch=batch;
   }

   public String getFatherName(){
        return fatherName;
   }
   public void SetFatherName(String fatherName){
        this.fatherName=fatherName;
   }

}
