package org.example.OOPS.ConstructorOverloading;

public class College {
    int collegeId;
    String collegeName;
    private String  principleName;

    public College(int collegeId, String collegeName){
        this.collegeId=collegeId;
        this.collegeName=collegeName;

    }
    public College( String principleName){
        this.principleName=principleName;
    }

    public String getPrincipleName() {
        return principleName;
    }

    public void setPrincipleName(String principleName) {
        this.principleName = principleName;
    }
}
