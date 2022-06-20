package com.solvd.cafe.patterns.singletone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Singleton {
    private static final Logger LOGGER = LogManager.getLogger(Singleton.class);

    private static Singleton instance = null;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void setUp() {
        LOGGER.info("setUp");
    }
}

