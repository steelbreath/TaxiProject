package com.solvd.taxi;

import com.solvd.taxi.other.OrderDelivery;
import com.solvd.taxi.person.Customer;
import com.solvd.taxi.person.Dispatcher;
import com.solvd.taxi.vehicle.Taxi;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

    private static Logger logger = LogManager.getLogger(Test.class);
    public static void main(String[] args) {
        logger.info(OrderDelivery.builder().setId(1).setAddress("blabla").build());
        Taxi taxi = new Taxi();
        Dispatcher dispatcher = Dispatcher.builder().setTaxi(taxi).build();
        Customer customer = Customer.builder().setTaxi(taxi).build();
        taxi.changeLocation(2,3);
    }
}
