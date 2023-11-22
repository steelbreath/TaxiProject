package com.solvd.taxi.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyThread1 extends Thread{
    public static Logger LOGGER = LogManager.getLogger(MyThread1.class);

    public MyThread1(){}

    @Override
    public void run() {
        LOGGER.info(Thread.currentThread().getName());
    }
}
