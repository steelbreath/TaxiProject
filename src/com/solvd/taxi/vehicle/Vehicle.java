package com.solvd.taxi.vehicle;

public abstract class Vehicle {
    private int maxSpeed;
    private int power;
    private boolean fuelEngine;
    private int fuelConsumption;

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
    public void setFuelEngine(boolean fuelEngine) {
        this.fuelEngine = fuelEngine;
    }
    public boolean isFuelEngine() {
        return fuelEngine;
    }
    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public int getFuelConsumption() {
        return fuelConsumption;
    }
}
