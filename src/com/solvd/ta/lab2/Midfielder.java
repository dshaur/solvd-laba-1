package com.solvd.ta.lab2;

/*
 * This class is a Subclass of Player and represents a Midfielder. It has a constructor that calls the super constructor
 *  with the type set to "Midfielder". It also overrides the performAction method to print out "Making a pass...".
 */

class Midfielder extends Player {

    // Constructor
    public Midfielder(String name, int age, int number, String teamName) {
        super(name, age, number, teamName);
    }

    @Override
    public void performAction() {
        // Simulate the midfielders' ability to pass the ball
        System.out.println(getName() + " is passing the ball.");
    }
}

