package com.solvd.ta.lab2;

/*
 * This class represents a Referee, which is a type of Person. It has a constructor that takes a name
 * and age as parameters, and it has a method whistle() that prints a message.
 */

import com.solvd.ta.lab2.exceptions.RefereeNotFoundException;
import com.solvd.ta.lab2.interfaces.Runnable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

class Referee extends Person implements Runnable {

    // Logger
    private static final Logger logger = LogManager.getLogger(Referee.class);

    // Constructor
    Referee(String name, int age) throws RefereeNotFoundException {

        super(name, age);

        // Check if the referee name is empty
        if (Objects.equals(this.getName(), "")) {

            throw new RefereeNotFoundException("Referee name not found.");

        }
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
