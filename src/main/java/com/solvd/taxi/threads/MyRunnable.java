package com.solvd.taxi.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyRunnable implements Runnable{
    public static Logger LOGGER = LogManager.getLogger(MyRunnable.class);

    public MyRunnable(){}

    @Override
    public void run() {
        LOGGER.info(Thread.currentThread().getName());
    }
}
