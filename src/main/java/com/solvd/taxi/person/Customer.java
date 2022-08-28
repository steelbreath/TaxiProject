package com.solvd.taxi.person;

public class Customer extends Person {
    private int phoneNumber;
    private String email;
    private float rating;

    public Customer() {}
    public Customer(String fullName, String city,int phoneNumber, String email, float rating) {
        super(fullName, city);
        this.phoneNumber = phoneNumber;
        this.email = email;
        if((rating<0)||(rating>5)){
            throw new ArithmeticException("Choose from 0 to 5!");
        }else {
            this.rating = rating;
        }
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
    @Override
    public String toString() {
        return "Customer{" +
                "phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", rating=" + rating +
                "} " + super.toString();
    }
}
