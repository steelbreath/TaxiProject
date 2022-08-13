package main.java.com.solvd.taxi;

import main.java.com.solvd.taxi.other.OrderTaxi;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class Main {
    public static Logger logger = Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) {
        OrderTaxi orderTaxi1 = new OrderTaxi();
        OrderTaxi orderTaxi2 = new OrderTaxi(2939875,1000,"difhbv","orijgpi");
        Set<Integer> orders = new HashSet<>();
        orders.add(2939870);
        orders.add(2939871);
        orders.add(2939872);
        orders.add(2939873);
        orders.add(2939874);
        orders.add(orderTaxi1.getId());
        orders.add(orderTaxi2.getId());
        orders.stream().skip(1).limit(4).forEach(System.out::println);
        logger.info("Hello world");

    }
}