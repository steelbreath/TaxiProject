package com.solvd.taxi.vehicle;

import com.solvd.taxi.enums.TaxiClass;
import com.solvd.taxi.enums.TaxiType;

public class Taxi extends Car {
    private TaxiClass clas;
    private TaxiType type;
    private int seats;
    private boolean kids;
    private boolean pets;

    public Taxi() {}

    public Taxi(int avgSpeed, int power, int fuelConsumption, String brand, String model, int carNumber, String color,
                TaxiClass clas, TaxiType type, int seats, boolean kids, boolean pets) {
        super(avgSpeed, power, fuelConsumption, brand, model, carNumber, color);
        this.clas = clas;
        this.type = type;
        this.seats = seats;
        this.kids = kids;
        this.pets = pets;
    }

    public void setClas(TaxiClass clas) {
        this.clas = clas;
    }

    public TaxiClass getClas() {
        return clas;
    }

    public void setType(TaxiType type) {
        this.type = type;
    }

    public TaxiType getType() {
        return type;
    }

    public void setSeats(int seats) {
        if(seats<0){
            throw new ArithmeticException("Number of seats cannot be negative!");
        }else {
            this.seats = seats;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setKids(boolean kids) {
        this.kids = kids;
    }

    public boolean isKids() {
        return kids;
    }

    public void setPets(boolean pets) {
        this.pets = pets;
    }

    public boolean isPets() {
        return pets;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "clas=" + clas +
                ", type=" + type +
                ", seats=" + seats +
                ", kids=" + kids +
                ", pets=" + pets +
                "} " + super.toString();
    }
}
