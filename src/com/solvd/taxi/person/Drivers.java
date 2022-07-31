package com.solvd.taxi.person;

public class Drivers extends Employee {
    private float rating;

    public Drivers(){}
    public Drivers(float rating,String fullName,String city,String position,int experience,int workingInCompany,int salary){
        this.rating=rating;
        super.setFullName(fullName);
        super.setCity(city);
        super.setPosition(position);
        super.setExperience(experience);
        super.setWorkingInCompany(workingInCompany);
        super.setSalary(salary);
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
    public float getRating() {
        return rating;
    }

    public void driveCar(){}
}
