package com.solvd.taxi.other;

public class Discount {
    private int amount;
    private int promoCode;
    private int[] promoCodes;

    public Discount() {}
    public Discount(int amount, int promoCode) {
        generatePromoCodes();
        if((amount>100)||(amount<0)){
            throw new ArithmeticException("Something went wrong! Please try again.");
        }else {
            this.amount = amount;
        }
        for (int i=0;i<5;i++) {
            if (promoCode != this.promoCodes[i]) {
                System.out.println("Invalid promo code");
            } else {
                this.promoCode = promoCode;
            }
        }
    }

    public void setAmount(int amount) {
        if((amount>100)||(amount<0)){
            throw new ArithmeticException("Something went wrong! Please try again.");
        }else {
            this.amount = amount;
        }
    }
    public int getAmount() {
        return amount;
    }
    public void setPromoCode(int promoCode) {
        for (int i=0;i<5;i++) {
            if (promoCode != this.promoCodes[i]) {
               System.out.println("Invalid promo code");
            } else {
                this.promoCode = promoCode;
            }
        }
    }
    public int getPromoCode() {
        return promoCode;
    }
    public void generatePromoCodes(){
        for (int i=0;i<5;i++) {
            promoCodes[i] =(int) (Math.random() * 899999 + 100000);
        }
    }
    public int[] getPromoCodes() {
        return promoCodes;
    }
    @Override
    public String toString() {
        return "Discount{" +
                "amount=" + amount +
                '}';
    }
}
