package main.java.com.solvd.taxi.vehicle;

public abstract class Vehicle {
    private int avgSpeed;
    private int power;
    private int fuelConsumption;

    public Vehicle() {}

    public Vehicle(int avgSpeed, int power, int fuelConsumption) {
        if(avgSpeed<0){
            throw new ArithmeticException("Average speed cannot be negative!");
        }else {
            this.avgSpeed = avgSpeed;
        }
        if(power<0){
            throw new ArithmeticException("Power cannot be negative!");
        }else {
            this.power = power;
        }
        if(fuelConsumption<0){
            throw new ArithmeticException("Experience cannot be negative!");
        }else {
            this.fuelConsumption = fuelConsumption;
        }
    }

    public void setAvgSpeed(int avgSpeed) {
        if(avgSpeed<0){
            throw new ArithmeticException("Average speed cannot be negative!");
        }else {
            this.avgSpeed = avgSpeed;
        }
    }

    public int getAvgSpeed() {
        return avgSpeed;
    }

    public void setPower(int power) {
        if(power<0){
            throw new ArithmeticException("Power cannot be negative!");
        }else {
            this.power = power;
        }

    }

    public int getPower() {
        return power;
    }

    public void setFuelConsumption(int fuelConsumption) {
        if(fuelConsumption<0){
            throw new ArithmeticException("Experience cannot be negative!");
        }else {
            this.fuelConsumption = fuelConsumption;
        }
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "avgSpeed=" + avgSpeed +
                ", power=" + power +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
