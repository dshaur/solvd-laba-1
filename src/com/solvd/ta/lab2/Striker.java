package com.solvd.ta.lab2;

/*
 * This class is used to create a Striker object which is a type of Player.
 * It has a constructor which takes the name, age, and number of the Player as parameters.
 * The performAction method is overridden to print "Scoring a goal..." when called.
 */

import java.util.Random;

class Striker extends Player implements Runnable, Substituable {
    public Striker(String name, int age, int number, String team) {
        super(name, age, number, team);
    }

    @Override
    public void performAction() {
        // Simulate the striker's goal-scoring ability
        Random random = new Random();
        if (random.nextDouble() < 0.4) {
            System.out.println(getName() + " scored a goal!");
            celebrate();
            if (this.getTeam().equals("Home Team")) { // Check if the striker belongs to the home team
                Match.getScore().homeScored(); // The home team scores if the striker belongs to the home team

            } else {
                Match.getScore().awayScored(); // The away team scores if the striker belongs to the away team
            }
        } else {
            System.out.println(getName() + " missed.");
        }
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running.");
    }

    // Substitution method
    @Override
    public void substitute() {
        System.out.println(getName() + " is going off the field and being replaced by a substitute.");
    }

}

