package com.solvd.cafe.patterns.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FactoryTest {
    private static final Logger LOGGER = LogManager.getLogger(FactoryTest.class);

    public static void main(String[] args){
        String win = "dollar";
        Factory factory = new Factory();

        Currency currency = factory.getCurrency(win);
        currency.getCurrency();
    }
}
