package com.solvd.taxi.other;

import com.solvd.taxi.enums.OrderPriority;

public class OrderDelivery extends Order {
    private String address;
    private String[] meals;
    private OrderPriority orderPriority;

    public OrderDelivery() {}
    public OrderDelivery(Builder builder) {
        super(builder.id, builder.price);
        this.address = builder.address;
        this.meals = builder.meals;
        this.orderPriority = builder.orderPriority;
    }

    public static Builder builder(){
        return new Builder();
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setMeals(String[] meals) {
        this.meals = meals;
    }
    public String[] getMeals() {
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

    public static class Builder {
        private int id;
        private double price;
        private String address;
        private String[] meals;
        private OrderPriority orderPriority;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setMeals(String[] meals) {
            this.meals = meals;
            return this;
        }

        public Builder setOrderPriority(OrderPriority orderPriority) {
            this.orderPriority = orderPriority;
            return this;
        }

        public OrderDelivery build() {
            return new OrderDelivery(this);
        }
    }
}
