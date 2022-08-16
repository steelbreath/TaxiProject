package com.solvd.taxi.vehicle;

import com.solvd.taxi.enums.TransportType;

public class TwoWheeled extends Vehicle {
    private TransportType type;

    public TwoWheeled() {}

    public TwoWheeled(int avgSpeed, int power, int fuelConsumption, TransportType type) {
        super(avgSpeed, power, fuelConsumption);
        this.type = type;
    }

    public void setType(TransportType type) {
        this.type = type;
    }

    public TransportType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "TwoWheeled{" +
                "type=" + type +
                "} " + super.toString();
    }
}
