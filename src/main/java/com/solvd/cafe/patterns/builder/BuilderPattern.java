package com.solvd.cafe.patterns.builder;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BuilderPattern {
    private static final Logger LOGGER = LogManager.getLogger(BuilderPattern.class);


    public static void main(String[] args) {
        Dish borsh = new Dish.BuilderDish("first").setName("borshch").setCost(25).build();
        LOGGER.info(borsh);
    }
}