package main.java.com.solvd.taxi.person;

import main.java.com.solvd.taxi.interfaces.Delivery;
import main.java.com.solvd.taxi.interfaces.JobApplication;

public class Courier extends Employee implements Delivery, JobApplication {
    private float rating;
    private int quantityOfOrders;
    private int workingHours;

    public Courier() {}

    public Courier(String fullName, String city, int experience, int salary,
                   float rating, int quantityOfOrders, int workingHours) {
        super(fullName, city, experience, salary);
        if((rating<0)||(rating>5)){
            throw new ArithmeticException("Choose from 0 to 5!");
        }else {
            this.rating = rating;
        }
        if(quantityOfOrders<0){
            throw new ArithmeticException("Quantity of orders cannot be negative!");
        }else {
            this.quantityOfOrders = quantityOfOrders;
        }
        if(workingHours<0){
            throw new ArithmeticException("Working hours cannot be negative!");
        }else {
            this.workingHours = workingHours;
        }
    }

    public void setRating(float rating) {
        if((rating<0)||(rating>5)){
            throw new ArithmeticException("Choose from 0 to 5!");
        }else {
            this.rating = rating;
        }
    }

    public float getRating() {
        return rating;
    }

    public void setQuantityOfOrders(int quantityOfOrders) {
        if(quantityOfOrders<0){
            throw new ArithmeticException("Quantity of orders cannot be negative!");
        }else {
            this.quantityOfOrders = quantityOfOrders;
        }
    }

    public int getQuantityOfOrders() {
        return quantityOfOrders;
    }

    public void setWorkingHours(int workingHours) {
        if(workingHours<0){
            throw new ArithmeticException("Working hours cannot be negative!");
        }else {
            this.workingHours = workingHours;
        }
    }

    public int getWorkingHours() {
        return workingHours;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "rating=" + rating +
                ", quantityOfOrders=" + quantityOfOrders +
                ", workingHours=" + workingHours +
                "} " + super.toString();
    }

    @Override
    public void deliver() {

    }

    @Override
    public void applyForJob() {

    }

    @Override
    public void yourTransportParameters() {

    }

}
