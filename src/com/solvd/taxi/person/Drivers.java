package com.solvd.taxi.person;

public class Drivers extends Employee {
    private float rating;

    public Drivers(){}
    public Drivers(float rating){
        this.rating=rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
    public float getRating() {
        return rating;
    }

    public void driveCar(){}
}
