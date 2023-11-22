package com.solvd.taxi.vehicle;

import com.solvd.taxi.enums.TransportType;

public class Bike extends TwoWheeled{
    public Bike(int avgSpeed, int power, int fuelConsumption, TransportType type) {
        super(avgSpeed, power, fuelConsumption, type);
    }
}
