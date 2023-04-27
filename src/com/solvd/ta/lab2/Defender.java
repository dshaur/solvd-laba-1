package com.solvd.ta.lab2;

/*
 * This class is a child class of Player and is used to represent a Defender in a game.
 * It has a constructor which takes in a name, age and number, and sets the team.
 */

import java.util.Random;

class Defender extends Player implements Runnable, Substituable {
    public Defender(String name, int age, int number, String team) {
        super(name, age, number, team);
    }

    @Override
    public void performAction() {
        // Simulate the defender's ability to stop a goal

        Random random = new Random();
        if (random.nextDouble() < 0.9) {
            System.out.println(getName() + " prevented a goal from being scored!");
        } else {
            System.out.println(getName() + " gave the opposing team a penalty. They scored a goal!");
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
        System.out.println(getName() + " is running.");
    }

    // Substitution method
    @Override
    public void substitute() {
        System.out.println(getName() + " is going off the field and being replaced by a substitute.");
    }
}
