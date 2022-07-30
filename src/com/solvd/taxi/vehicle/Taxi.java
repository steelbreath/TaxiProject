package com.solvd.taxi.vehicle;

public class Taxi extends Car {
    private String type;
    private int seats;

    public Taxi(){}

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public int getSeats() {
        return seats;
    }
    public void takePeople(){}
}
