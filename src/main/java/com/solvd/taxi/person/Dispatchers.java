package main.java.com.solvd.taxi.person;

import main.java.com.solvd.taxi.interfaces.JobApplication;

public class Dispatchers extends Employee implements JobApplication {
    private String kindOfProblem;
    private boolean busy;

    public Dispatchers() {}

    public Dispatchers(String fullName, String city, int experience, int salary, String kindOfProblem, boolean busy) {
        super(fullName, city, experience, salary);
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

    @Override
    public String toString() {
        return "Dispatchers{" +
                "kindOfProblem='" + kindOfProblem + '\'' +
                ", busy=" + busy +
                "} " + super.toString();
    }

    @Override
    public void applyForJob() {

    }

    @Override
    public void yourTransportParameters() {

    }
    public void takeOrder() {}

}
