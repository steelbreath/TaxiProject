package com.solvd.taxi;

import com.solvd.taxi.interfaces.SalaryCounter;
import com.solvd.taxi.interfaces.TravelTime;
import com.solvd.taxi.other.OrderTaxi;
import com.solvd.taxi.threads.MyRunnable;
import com.solvd.taxi.threads.MyThread1;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static Logger LOGGER = Logger.getLogger(Main.class);
    public static void main(String[] args) {

        MyThread1 myThread1 = new MyThread1();
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread2 = new Thread(myRunnable);
        myThread1.start();
        myThread2.start();
        LOGGER.info(Thread.currentThread().getName());

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
        LOGGER.info(StringUtils.replaceChars("I'm in the center","Inr","ftb"));
        LOGGER.info(StringUtils.difference("i love you", "i like him"));
        LOGGER.info(StringUtils.swapCase(orderTaxi2.getStart()));
        LOGGER.info(StringUtils.abbreviate(orderTaxi2.getFinish(), 6));
        try {
            File file = new File("Orders.txt");
            FileUtils.writeLines(file,orders);
            File copy = new File("Copy.txt");
            FileUtils.copyFile(new File("logs.log"), copy);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SalaryCounter c = (experience, rate) -> {
            int res;
           res = (experience == 0) ? rate : experience / 2 * rate + rate;
            LOGGER.info("Your salary is " + res);
            return res;
        };
        c.countSalary(2,1000);
        TravelTime t = (avgSpeed, distance) -> {
            int minutes = avgSpeed * distance;
            LOGGER.info("Your trip will take " + minutes + " minutes");
            return minutes;
        };
        t.countTime(100,1000);


        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        int y = myObj.nextInt();
        System.out.println((x > y) ? "x>y" : "x<y");

    }
}