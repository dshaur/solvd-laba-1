package com.solvd.ta.lab2;

/*
 * This class is used to create a Striker object which is a type of Player.
 * It has a constructor which takes the name, age, and number of the Player as parameters.
 * The performAction method is overridden to print "Scoring a goal..." when called.
 */

class Striker extends Player {

    // Constructor
    Striker(String name, int age, int number) {
        super(name, age, number, "Striker");
    }

    // Override of the performAction() method from Player Class
    @Override
    void performAction() {
        System.out.println("Scoring a goal...");
    }
}

