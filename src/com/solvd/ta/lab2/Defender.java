package com.solvd.ta.lab2;

/*
 * This class is a child class of Player and is used to represent a Defender in a game.
 * It has a constructor which takes in a name, age and number, and sets the team.
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

class Defender extends Player implements Runnable, Substituable {

    // Logger
    private static final Logger logger = LogManager.getLogger(Defender.class);

    public Defender(String name, int age, int number, String team) {
        super(name, age, number, team);
    }

    @Override
    public void performAction() {
        // Simulate the defender's ability to stop a goal

        Random random = new Random();
        if (random.nextDouble() < 0.9) {
            logger.info(getName() + " prevented a goal from being scored!");
        } else {
            logger.info(getName() + " gave the opposing team a penalty. They scored a goal!");
            if (this.getTeam().equals("Home Team")) { // Check if the defender belongs to the home team
                Match.getScore().awayScored(); // The away team scores if the defender belongs to the home team
            } else {
                Match.getScore().homeScored(); // The home team scores if the defender belongs to the away team
            }
        }
    }

    // Run method
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
