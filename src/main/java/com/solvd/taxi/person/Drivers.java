package com.solvd.taxi.person;

import com.solvd.taxi.interfaces.JobApplication;

public class Drivers extends Employee implements JobApplication {
    private float rating;
    private float km;

    public Drivers() {}
    public Drivers(String fullName, String city,int experience, int salary, float rating, float km) {
        super(fullName, city, experience, salary);
        if((rating<0)||(rating>5)){
            throw new ArithmeticException("Choose from 0 to 5!");
        }else {
            this.rating = rating;
        }
        if(km<0){
            throw new ArithmeticException("Distance cannot be negative!");
        }else {
            this.km = km;
        }
    }

    public void setRating(float rating) {
        if((rating<0)||(rating>5)){
            throw new ArithmeticException("Choose from 0 to 5!");
        }else {
            this.rating = rating;
        }
    }
    public float getRating() {
        return rating;
    }
    public void setKm(float km) {
        if(km<0){
            throw new ArithmeticException("Distance cannot be negative!");
        }else {
            this.km = km;
        }
    }
    public float getKm() {
        return km;
    }
    @Override
    public String toString() {
        return "Drivers{" +
                "rating=" + rating +
                ", km=" + km +
                "} " + super.toString();
    }
    @Override
    public void applyForJob() {

    }
    @Override
    public void describeTransport() {

    }
}
