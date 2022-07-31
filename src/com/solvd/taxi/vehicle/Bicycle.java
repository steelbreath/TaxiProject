package com.solvd.taxi.vehicle;

public class Bicycle extends Vehicle {
    private String type;
    private int minutesOfUsing;

    public Bicycle(){}
    public Bicycle(String type,int minutesOfUsing,int maxSpeed,int power,boolean fuelEngine,int fuelConsumption){
        this.type=type;
        this.minutesOfUsing = minutesOfUsing;
        super.setMaxSpeed(maxSpeed);
        super.setPower(power);
        super.setFuelEngine(fuelEngine);
        super.setFuelConsumption(fuelConsumption);
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setMinutesOfUsing(int minutesOfUsing) {
        this.minutesOfUsing = minutesOfUsing;
    }
    public int getMinutesOfUsing() {
        return minutesOfUsing;
    }

    public void takeBike(){}
}
