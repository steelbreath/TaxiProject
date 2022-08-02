package com.solvd.taxi.person;

public class Mechanics extends Employee {
    private String harm;

    public Mechanics(){}
    public Mechanics(String harm,String fullName,String city,String position,int experience,int workingInCompany,int salary){
        super(position,experience,workingInCompany,salary,fullName,city);
        this.harm=harm;
    }

    public void setHarm(String harm) {
        this.harm = harm;
    }
    public String getHarm() {
        return harm;
    }

    public void repair(){}
}
