package com.solvd.taxi.enums;

public enum TransportType {
    MOTORBIKE("motorbike"),
    MOPED("moped"),
    SCOOTER("scooter"),
    BICYCLE("bicycle");

    private final String value;

    TransportType(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
