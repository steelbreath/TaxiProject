package com.solvd.taxi.vehicle;

public class Truck extends Car {
    private int maxWeight;
    private float bodyVolume;

    public Truck() {}

    public Truck(int avgSpeed, int power, int fuelConsumption, String brand, String model, int carNumber, String color,
                 int maxWeight, float bodyVolume) {
        super(avgSpeed, power, fuelConsumption, brand, model, carNumber, color);
        this.maxWeight = maxWeight;
        this.bodyVolume = bodyVolume;
    }

    public void setMaxWeight(int maxWeight) {
        if(maxWeight<0){
            throw new ArithmeticException("Max weight cannot be negative!");
        }else {
            this.maxWeight = maxWeight;
        }
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setBodyVolume(float bodyVolume) {
        if(bodyVolume<0){
            throw new ArithmeticException("Body volume cannot be negative!");
        }else {
            this.bodyVolume = bodyVolume;
        }
    }

    public float getBodyVolume() {
        return bodyVolume;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxWeight=" + maxWeight +
                ", bodyVolume=" + bodyVolume +
                "} " + super.toString();
    }
}
