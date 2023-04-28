package com.solvd.ta.lab2;

/*
 * This class is a Subclass of Player and represents a Midfielder. It has a constructor that calls the super constructor
 *  with the type set to "Midfielder". It also overrides the performAction method to print out "Making a pass...".
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Midfielder extends Player implements Runnable, Substituable {

    // Logger
    private static final Logger logger = LogManager.getLogger(Midfielder.class);

    // Constructor
    public Midfielder(String name, int age, int number, String teamName) {
        super(name, age, number, teamName);
    }

    @Override
    public void performAction() {
        // Simulate the midfielders' ability to pass the ball
        logger.info(getName() + " is passing the ball.");
    }

    @Override
    public void run() {
        logger.info(getName() + " is running.");
    }

    // Substitution method
    @Override
    public void substitute() {
        logger.info(getName() + " is going off the field and being replaced by a substitute.");
    }
}

