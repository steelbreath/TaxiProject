package com.solvd.taxi.enums;

public enum TaxiType {
    GREEN("green"),
    SUPPORT("support"),
    BUS("bus");

    private final String value;

    TaxiType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
