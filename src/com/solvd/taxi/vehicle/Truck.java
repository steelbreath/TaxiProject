package com.solvd.taxi.vehicle;

public class Truck extends Car {

    private int maxWeight;
    private float bodyVolume;

    public Truck(){}
    public Truck(int maxWeight,float bodyVolume,int maxSpeed,int power,int fuelConsumption,
                 String brand, String model,int carNumber,String color){
        super(maxSpeed,power,fuelConsumption,brand,model,carNumber,color);
        this.maxWeight=maxWeight;
        this.bodyVolume=bodyVolume;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    public int getMaxWeight() {
        return maxWeight;
    }
    public void setBodyVolume(float bodyVolume) {
        this.bodyVolume = bodyVolume;
    }
    public float getBodyVolume() {
        return bodyVolume;
    }

    public void moreSpace(){}
}
