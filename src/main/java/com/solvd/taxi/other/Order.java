package com.solvd.taxi.other;

import java.util.Date;

public abstract class Order {
    private int id;
    private Date date;
    private double price;

    public Order() {}
    public Order(int id, double price) {
        if (id < 0) {
            throw new ArithmeticException("ID cannot be negative!");
        } else {
            this.id = id;
        }
        this.date = new Date();
        if (price < 0) {
            throw new ArithmeticException("Price cannot be negative!");
        } else {
            this.price = price;
        }
    }

    public void setId(int id) {
        if (id < 0) {
            throw new ArithmeticException("ID cannot be negative!");
        } else {
            this.id = id;
        }
    }
    public int getId() {
        return id;
    }
    public void setDate() {
        this.date = new Date();
    }
    public Date getDate() {
        return date;
    }
    public void setPrice(double price) {
        if (price < 0) {
            throw new ArithmeticException("Price cannot be negative!");
        } else {
            this.price = price;
        }
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
