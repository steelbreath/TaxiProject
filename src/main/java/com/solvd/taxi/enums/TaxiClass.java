package com.solvd.taxi.enums;

public enum TaxiClass {
    ECONOMY("economy"),
    COMFORT("comfort"),
    PREMIUM("premium"),
    BUSINESS("business");

    private final String value;

    TaxiClass(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
