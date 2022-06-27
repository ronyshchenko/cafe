package com.solvd.cafe.patterns.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ObserverTest {
    private static final Logger LOGGER = LogManager.getLogger(ObserverTest.class);
    public static void main(String[] args) {

        ObserverPattern.University university = new ObserverPattern.University();
        ObserverPattern.Director director = new ObserverPattern.Director();
        university.addStudent("Roma");
        university.addObserver(director);
        university.addStudent("Yurii");
        university.removeStudent("Roma");
    }
}

