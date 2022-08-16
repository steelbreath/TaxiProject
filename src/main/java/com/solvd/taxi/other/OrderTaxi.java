package com.solvd.taxi.other;

public class OrderTaxi extends Order {
    private String start; //exception
    private String finish; //exception

    public OrderTaxi() {}

    public OrderTaxi(int id, double price, String start, String finish) {
        super(id, price);
        this.start = start;
        this.finish = finish;
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

    @Override
    public String toString() {
        return "OrderTaxi{" +
                "start='" + start + '\'' +
                ", finish='" + finish + '\'' +
                "} " + super.toString();
    }
}
