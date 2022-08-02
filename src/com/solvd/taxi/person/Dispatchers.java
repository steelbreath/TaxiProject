package com.solvd.taxi.person;

public abstract class Dispatchers extends Employee {
    private String kindOfProblem;

    public Dispatchers(){}
    public Dispatchers(String kindOfProblem,String position,int experience,int workingInCompany,int salary,String fullName,
                       String city){
        super(position,experience,workingInCompany,salary,fullName,city);
        this.kindOfProblem = kindOfProblem;
    }

    public void setKindOfProblem(String kindOfProblem) {
        this.kindOfProblem = kindOfProblem;
    }
    public String getKindOfProblem() {
        return kindOfProblem;
    }

    public void takeOrder(){}

}
