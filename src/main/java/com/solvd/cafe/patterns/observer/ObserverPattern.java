package com.solvd.cafe.patterns.observer;

//saucedemo.com

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
    private static final Logger LOGGER = LogManager.getLogger(ObserverPattern.class);

    interface Visitor {
        void event(List<String> strings);
    }

    static class University {
        private List<Visitor> visitors = new ArrayList<Visitor>();
        private List<String> students = new ArrayList<String>();

        public void addStudent(String name) {
            students.add(name);
            notifyVisitors();
        }

        public void removeStudent(String name) {
            students.remove(name);
            notifyVisitors();
        }

        public void addObserver(Visitor visitor) {
            visitors.add(visitor);
        }

        public void removeVisitor(Visitor visitor) {
            visitors.remove(visitor);
        }

        public void notifyVisitors() {
            for (Visitor visitor : visitors) {
                visitor.event(students);
            }
        }
    }

    static class Director implements Visitor {
        public void event(List<String> strings) {
            LOGGER.info("The list of students has changed: " + strings);
        }
    }

}
