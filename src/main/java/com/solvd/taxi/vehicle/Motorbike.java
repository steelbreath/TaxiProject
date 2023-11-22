package com.solvd.taxi.vehicle;

import com.solvd.taxi.enums.TransportType;

public class Motorbike extends TwoWheeled{

    public Motorbike(int avgSpeed, int power, int fuelConsumption, TransportType type) {
        super(avgSpeed, power, fuelConsumption, type);
    }
}
