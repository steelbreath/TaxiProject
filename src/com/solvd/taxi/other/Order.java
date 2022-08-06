package com.solvd.taxi.other;

import java.util.Date;

public class Order {
    private int id;
    private Date date;
    private String start; //exception
    private String finish; //exception
    private double price;

    public Order() {}

    public Order(int id, String start, String finish, double price) {
        this.id = id;
        this.date = new Date();
        this.start = start;
        this.finish = finish;
        this.price = price;
    }

    public void setId(int id) {
        if(id<0){
            throw new ArithmeticException("ID cannot be negative!");
        }else {
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

    public void setStart(String start) {
        this.start = start;
    }

    public String getStart() {
        return start;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public String getFinish() {
        return finish;
    }

    public void setPrice(double price) {
        if(price<0){
            throw new ArithmeticException("Price cannot be negative!");
        }else {
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
                ", start='" + start + '\'' +
                ", finish='" + finish + '\'' +
                ", price=" + price +
                '}';
    }
}
