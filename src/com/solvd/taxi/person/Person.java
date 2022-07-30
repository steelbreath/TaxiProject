package com.solvd.taxi.person;

public abstract class Person {
    private String fullName;
    private String city;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
}
