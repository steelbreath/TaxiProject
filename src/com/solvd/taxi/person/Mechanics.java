package com.solvd.taxi.person;

public class Mechanics extends Employee {
    private String harm;

    public Mechanics(){}
    public Mechanics(String harm){
        this.harm=harm;
    }

    public void setHarm(String harm) {
        this.harm = harm;
    }
    public String getHarm() {
        return harm;
    }

    public void repair(){}
}
