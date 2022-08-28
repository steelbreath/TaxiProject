package com.solvd.taxi.other;

import com.solvd.taxi.enums.OrderPriority;

public class OrderDelivery extends Order {
    private String address;
    private String meals;
    private OrderPriority orderPriority;

    OrderDelivery() {}
    OrderDelivery(int id, double price, String address, String meals, OrderPriority orderPriority) {
        super(id, price);
        this.address = address;
        this.meals = meals;
        this.orderPriority = orderPriority;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setMeals(String meals) {
        this.meals = meals;
    }
    public String getMeals() {
        return meals;
    }
    public void setOrderPriority(OrderPriority orderPriority) {
        this.orderPriority = orderPriority;
    }
    public OrderPriority getOrderPriority() {
        return orderPriority;
    }
    @Override
    public String toString() {
        return "OrderDelivery{" +
                "address='" + address + '\'' +
                ", meals='" + meals + '\'' +
                ", orderPriority=" + orderPriority +
                "} " + super.toString();
    }
}
