package com.solvd.taxi.person;

public abstract class Employee extends Person {
    private String position;
    private int experience;
    private int workingInCompany;
    private int salary;

    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public int getExperience() {
        return experience;
    }
    public void setWorkingInCompany(int workingInCompany) {
        this.workingInCompany = workingInCompany;
    }
    public int getWorkingInCompany() {
        return workingInCompany;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
}
