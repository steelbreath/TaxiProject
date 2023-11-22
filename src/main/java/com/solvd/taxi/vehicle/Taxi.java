package com.solvd.taxi.vehicle;

import com.solvd.taxi.enums.TaxiClass;
import com.solvd.taxi.enums.TaxiType;
import com.solvd.taxi.observer.LocationSubject;
import com.solvd.taxi.observer.Observer;
import com.solvd.taxi.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class Taxi extends Car implements LocationSubject {

    private List<Observer> observers = new ArrayList<Observer>();
    private TaxiClass clas;
    private TaxiType type;
    private int seats;
    private boolean kids;
    private boolean pets;
    private int x = 0;
    private int y = 0;

    public Taxi() {
    }

    public Taxi(int avgSpeed, int power, int fuelConsumption, String brand, String model, int carNumber, String color,
                TaxiClass clas, TaxiType type, int seats, boolean kids, boolean pets) {
        super(avgSpeed, power, fuelConsumption, brand, model, carNumber, color);
        this.clas = clas;
        this.type = type;
        if (seats < 0) {
            throw new ArithmeticException("Number of seats cannot be negative!");
        } else {
            this.seats = seats;
        }
        this.kids = kids;
        this.pets = pets;
    }

    public void setClas(TaxiClass clas) {
        this.clas = clas;
        notifyObservers();
    }

    public TaxiClass getClas() {
        return clas;
    }

    public void setType(TaxiType type) {
        this.type = type;
        notifyObservers();
    }

    public TaxiType getType() {
        return type;
    }

    public void setSeats(int seats) {
        if (seats < 0) {
            throw new ArithmeticException("Number of seats cannot be negative!");
        } else {
            this.seats = seats;
        }
        notifyObservers();
    }

    public int getSeats() {
        return seats;
    }

    public void setKids(boolean kids) {
        this.kids = kids;
        notifyObservers();
    }

    public boolean isKids() {
        return kids;
    }

    public void setPets(boolean pets) {
        this.pets = pets;
        notifyObservers();
    }

    public boolean isPets() {
        return pets;
    }

    public void changeLocation(int x, int y) {
        this.x = x;
        this.y = y;
        notifyObservers();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
