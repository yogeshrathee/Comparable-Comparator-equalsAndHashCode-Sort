package org.example.OOPS.ConstructorOverloading;

public class University extends College{
    int uniId;
    String uniName;

    public University(int collegeId, String collegeName, int uniId, String uniName){
        super(collegeId,collegeName);
        this.uniId=uniId;
        this.uniName=uniName;
    }
    public void showDetails(){
        System.out.println("College Id :: "+collegeId);
        System.out.println("College Name :: "+collegeName);
        System.out.println();
        System.out.println("University Id :: "+uniId);
        System.out.println("University NAme :: "+uniName);

    }
}
