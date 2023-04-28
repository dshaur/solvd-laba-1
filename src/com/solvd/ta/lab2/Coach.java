package com.solvd.ta.lab2;

/*
 * This class represents a Coach. It is a subclass of the Person class.
 * It has a constructor that takes in a name and age as parameters,
 * and a method called motivateTeam() which prints a motivational message.
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


class Coach extends Person implements Coachable, Cheerable {

    // Logger
    private static final Logger logger = LogManager.getLogger(Coach.class);

    // Constructor
    Coach(String name, int age) {
        super(name, age);
    }

    // motivateTeam() method
    public void instructTeam() {
        logger.info(this.getName() + " is instructing his team...");
    }

    // cheer() method
    public void cheer() {
        logger.info(this.getName() + " is cheering up his team...");
    }
}
