package com.solvd.taxi.person;

public class Dispatchers extends Employee {
    private String kindOfProblem;
    private boolean busy;

    public Dispatchers() {
    }

    public Dispatchers(String kindOfProblem, boolean busy, String position, int experience, int workingInCompany,
                       int salary, String fullName, String city) {
        super(position, experience, workingInCompany, salary, fullName, city);
        this.kindOfProblem = kindOfProblem;
        this.busy = busy;
    }

    public void setKindOfProblem(String kindOfProblem) {
        this.kindOfProblem = kindOfProblem;
    }

    public String getKindOfProblem() {
        return kindOfProblem;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public boolean isBusy() {
        return busy;
    }

    public void takeOrder() {
    }

}
