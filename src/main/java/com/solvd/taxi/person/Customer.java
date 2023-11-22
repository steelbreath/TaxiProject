package com.solvd.taxi.person;

import com.solvd.taxi.Test;
import com.solvd.taxi.observer.LocationSubject;
import com.solvd.taxi.observer.Observer;
import com.solvd.taxi.observer.Subject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Customer extends Person implements Observer {
    private static Logger logger = LogManager.getLogger(Customer.class);
    private LocationSubject taxi;
    private int phoneNumber;
    private String email;
    private float rating;

    public Customer() {}
    public Customer(Builder builder) {
        super(builder.fullName, builder.city);
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
        this.rating = builder.rating;
        this.taxi = builder.taxi;
        taxi.registerObserver(this);
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setRating(float rating) {
        if((rating<0)||(rating>5)){
            throw new ArithmeticException("Choose from 0 to 5!");
        }else {
            this.rating = rating;
        }
    }
    public float getRating() {
        return rating;
    }
    public float rateDriver(float rating) {
        return 0;
    }
    public static Builder builder(){
        return new Builder();
    }
    @Override
    public String toString() {
        return "Customer{" +
                "phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", rating=" + rating +
                "} " + super.toString();
    }

    @Override
    public void update() {
        logger.info("Customer get car location! x:{},y:{}.",taxi.getX(),taxi.getY());
    }

    public static class Builder {
        private String fullName;
        private String city;
        private LocationSubject taxi;
        private int phoneNumber;
        private String email;
        private float rating;

        public Builder setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setTaxi(LocationSubject taxi) {
            this.taxi = taxi;
            return this;
        }

        public Builder setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setRating(float rating) {
            this.rating = rating;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
