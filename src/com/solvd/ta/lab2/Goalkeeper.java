package com.solvd.ta.lab2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

/*
 * This class represents a Goalkeeper Player. It extends the Player class and
 * overrides the performAction() method to print a statement specific to the Goalkeeper.
 */
class Goalkeeper extends Player implements Runnable, Substituable {


    // Logger
    private static final Logger logger = LogManager.getLogger(Goalkeeper.class);

    // Constructor
    public Goalkeeper(String name, int age, int number, String teamName) {
        super(name, age, number, teamName);
    }

    @Override
    public void performAction() {
        // Simulate the goalkeeper's ability to save a goal
        Random random = new Random();
        if (random.nextDouble() < 0.3) {
            logger.info(getName() + " made a great save!");
        } else {
            logger.info(getName() + " performed a goal kick.");
        }
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

