package com.solvd.taxi.person;

import com.solvd.taxi.other.Discount;

public class Customer extends Person {
    private int phoneNumber;
    private String email;
    private float rating;

    public Customer (){}
    public Customer (int phoneNumber,String email,float rating,String fullName,String city){
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.rating=rating;
        super.setFullName(fullName);
        super.setCity(city);
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
        this.rating = rating;
    }
    public float getRating() {
        return rating;
    }
    public float rateDriver(float rating){
        return 0;
    }

}
