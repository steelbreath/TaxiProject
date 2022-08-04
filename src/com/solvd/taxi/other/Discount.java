package com.solvd.taxi.other;

public class Discount {
    private int amount;
    private int promoCode;

    public Discount(){}
    public Discount(int amount,int promoCode){
        this.amount=amount;
        this.promoCode = promoCode;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public void setPromoCode(int promoCode) {
        this.promoCode = promoCode;
    }
    public int getPromoCode() {
        return promoCode;
    }

}
