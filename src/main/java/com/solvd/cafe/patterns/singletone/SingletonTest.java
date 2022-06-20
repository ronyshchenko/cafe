package com.solvd.cafe.patterns.singletone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SingletonTest {
    private static final Logger LOGGER = LogManager.getLogger(SingletonTest.class);

    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        singleton.setUp();
    }
}
