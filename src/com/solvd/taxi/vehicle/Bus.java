package com.solvd.taxi.vehicle;

public class Bus extends Taxi{

    public Bus(){}
    public Bus(String type,int seats,boolean kids,boolean pets,boolean eco,boolean support,
               int maxSpeed,int power,int fuelConsumption,
               String brand, String model,int carNumber,String color){
        super(type,seats,kids,pets,eco,support,maxSpeed,power,fuelConsumption,brand,model,carNumber,color);
    }
}
