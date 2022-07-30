package com.solvd.taxi.vehicle;

public abstract class Car extends Vehicle {
    private String brand;
    private String model;
    private int carNumber;
    private String color;


    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }
    public int getCarNumber() {
        return carNumber;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    protected void drive(){}
}
