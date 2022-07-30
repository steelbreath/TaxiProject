package com.solvd.taxi.vehicle;

public class Bicycle extends Vehicle {
    private String type;
    private int minutes;

    public Bicycle(){}
    public Bicycle(String type,int minutes){
        this.type=type;
        this.minutes=minutes;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getMinutes() {
        return minutes;
    }

    public void takeBike(){}
}
