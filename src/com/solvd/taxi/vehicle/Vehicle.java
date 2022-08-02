package com.solvd.taxi.vehicle;

public abstract class Vehicle {
    private int maxSpeed;
    private int power;
    private int fuelConsumption;

    public Vehicle(){}
    public Vehicle(int maxSpeed, int power,int fuelConsumption){
        this.maxSpeed=maxSpeed;
        this.power=power;
        this.fuelConsumption=fuelConsumption;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getPower() {
        return power;
    }
    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public int getFuelConsumption() {
        return fuelConsumption;
    }
}
