package com.solvd.taxi.vehicle;

public class Truck extends Car {

    private int maxWeight;

    public Truck(){}
    public Truck(int maxSpeed,int power,int fuelConsumption,
                 String brand, String model,int carNumber,String color){
        super(maxSpeed,power,fuelConsumption,brand,model,carNumber,color);
    }
    public void moreSpace(){}
}
