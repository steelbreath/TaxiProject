package com.solvd.taxi.vehicle;

public class Taxi extends Car {
    private String type;
    private int seats;
    private boolean kids;
    private boolean pets;
    private boolean eco;
    private boolean support;

    public Taxi(){}
    public Taxi(String type,int seats,boolean kids,boolean pets,boolean eco,boolean support){
        this.type=type;
        this.seats=seats;
        this.kids=kids;
        this.pets=pets;
        this.eco=eco;
        this.support=support;
    }

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
    public void setEco(boolean eco) {
        this.eco = eco;
    }
    public boolean isEco() {
        return eco;
    }
    public void setSupport(boolean support) {
        this.support = support;
    }
    public boolean isSupport() {
        return support;
    }

    public void takePeople(){}
}
