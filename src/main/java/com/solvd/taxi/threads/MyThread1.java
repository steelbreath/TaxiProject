package com.solvd.taxi.threads;

import org.apache.log4j.Logger;

public class MyThread1 extends Thread{
    public static Logger LOGGER = Logger.getLogger(MyThread1.class);
    public MyThread1(){}

    @Override
    public void run() {
        LOGGER.info(Thread.currentThread().getName());
    }
}
