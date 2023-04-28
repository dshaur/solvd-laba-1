package com.solvd.ta.lab2;

/*
 * This class represents a Referee, which is a type of Person. It has a constructor that takes a name
 * and age as parameters, and it has a method whistle() that prints a message.
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Referee extends Person implements Runnable {

    // Logger
    private static final Logger logger = LogManager.getLogger(Referee.class);

    // Constructor
    Referee(String name, int age) {
        super(name, age);
    }

    // whistle() method
    public void whistle() {
        logger.info("The referee " + this.getName() + " is whistling...");
    }

    //  run() method
    @Override
    public void run() {
        logger.info(getName() + " is running.");
    }
}
