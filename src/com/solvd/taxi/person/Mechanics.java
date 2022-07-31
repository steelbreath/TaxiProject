package com.solvd.taxi.person;

public class Mechanics extends Employee {
    private String harm;

    public Mechanics(){}
    public Mechanics(String harm,String fullName,String city,String position,int experience,int workingInCompany,int salary){
        this.harm=harm;
        super.setFullName(fullName);
        super.setCity(city);
        super.setPosition(position);
        super.setExperience(experience);
        super.setWorkingInCompany(workingInCompany);
        super.setSalary(salary);
    }

    public void setHarm(String harm) {
        this.harm = harm;
    }
    public String getHarm() {
        return harm;
    }

    public void repair(){}
}
