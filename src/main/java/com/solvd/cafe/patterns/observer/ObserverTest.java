package com.solvd.cafe.patterns.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ObserverTest {
    private static final Logger LOGGER = LogManager.getLogger(ObserverTest.class);
    public static void main(String[] args) {

        ObserverPattern.Cafe cafe = new ObserverPattern.Cafe();
        ObserverPattern.Director director = new ObserverPattern.Director();
        cafe.addStudent("Roma");
        cafe.addObserver(director);
        cafe.addStudent("Yurii");
        cafe.removeStudent("Roma");
    }
}

