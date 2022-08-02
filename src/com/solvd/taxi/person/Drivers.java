package com.solvd.taxi.person;

public class Drivers extends Employee {
    private float rating;
    private float km;

    public Drivers(){}
    public Drivers(float rating,float km,String position,int experience,int workingInCompany,int salary,String fullName, String city){
        super(position,experience,workingInCompany,salary,fullName,city);
        this.rating=rating;
        this.km=km;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
    public float getRating() {
        return rating;
    }
    public void setKm(float km) {
        this.km = km;
    }
    public float getKm() {
        return km;
    }

    public void driveCar(){}
}
