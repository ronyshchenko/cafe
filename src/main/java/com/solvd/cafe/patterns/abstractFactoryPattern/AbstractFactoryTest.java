package com.solvd.cafe.patterns.abstractFactoryPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AbstractFactoryTest {
    private static final Logger LOGGER = LogManager.getLogger(AbstractFactoryTest.class);
    public static void main(String[] args) {
        String country = "UA";
        AbstractFactoryPattern.InteAbsFactory ifactory = null;
        if(country.equals("UA")) {
            ifactory = new AbstractFactoryPattern.UaDrinkPriceAbsFactory();
        } else if(country.equals("PL")) {
            ifactory = new AbstractFactoryPattern.PLDrinkPriceAbsFactory();
        }

        AbstractFactoryPattern.Milk milk = ifactory.getMilk();
        LOGGER.info(milk.getMilkPrice());
    }
}

