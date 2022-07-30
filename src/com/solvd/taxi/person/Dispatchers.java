package com.solvd.taxi.person;

public abstract class Dispatchers extends Employee {
    private String kindOfProblem;

    public void setKindOfProblem(String kindOfProblem) {
        this.kindOfProblem = kindOfProblem;
    }
    public String getKindOfProblem() {
        return kindOfProblem;
    }

    public void takeOrder(){}

}
