package com.solvd.taxi.vehicle;

public abstract class Car extends Vehicle {
    private String brand;
    private String model;
    private int carNumber;
    private String color;

    public Car() {}
    public Car(int avgSpeed, int power, int fuelConsumption, String brand, String model, int carNumber, String color) {
        super(avgSpeed, power, fuelConsumption);
        this.brand = brand;
        this.model = model;
        this.carNumber = carNumber;
        this.color = color;
    }

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
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", carNumber=" + carNumber +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
