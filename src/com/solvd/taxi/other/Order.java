package com.solvd.taxi.other;

public class Order {
    private int id;
    private String date;
    private String time;
    private String start;
    private String finish;
    private double price;

    public Order(){}
    public Order(int id,String date,String time,String start,String finish,double price){
        this.id=id;
        this.date=date;
        this.time=time;
        this.start=start;
        this.finish=finish;
        this.price=price;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getTime() {
        return time;
    }
    public void setFinish(String finish) {
        this.finish = finish;
    }
    public String getFinish() {
        return finish;
    }
    public void setStart(String start) {
        this.start = start;
    }
    public String getStart() {
        return start;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void carType(){}
    public void discount(Discount discount){

    }
}
