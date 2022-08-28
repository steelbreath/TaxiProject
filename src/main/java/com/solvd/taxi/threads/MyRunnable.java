package com.solvd.taxi.threads;

import org.apache.log4j.Logger;

public class MyRunnable implements Runnable{
    public static Logger LOGGER = Logger.getLogger(MyRunnable.class);

    public MyRunnable(){}

    @Override
    public void run() {
        LOGGER.info(Thread.currentThread().getName());
    }
}
