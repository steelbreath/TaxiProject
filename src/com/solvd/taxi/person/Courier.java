package com.solvd.taxi.person;

import com.solvd.taxi.other.Delivery;

public class Courier extends Employee implements Delivery {

    private float rating;
    private int quantityOfOrders;
    private int workingHours;

    public Courier(){}
    public Courier(float rating,int quantityOfOrders, int workingHours, String position,int experience,
                   int workingInCompany, int salary,String fullName, String city){
        super(position,experience,workingInCompany,salary,fullName,city);
        this.rating=rating;
        this.quantityOfOrders=quantityOfOrders;
        this.workingHours=workingHours;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
    public float getRating() {
        return rating;
    }
    public void setQuantityOfOrders(int quantityOfOrders) {
        this.quantityOfOrders = quantityOfOrders;
    }
    public int getQuantityOfOrders() {
        return quantityOfOrders;
    }
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
    public int getWorkingHours() {
        return workingHours;
    }

    @Override
    public void deliver() {

    }
}
