package com.solvd.taxi.other;

public class Discount {
    private int amount;
    private int quantity;
    private String cardName;

    public Discount(){}

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
    public String getCardName() {
        return cardName;
    }

}
