package com.solvd.ta.lab2;

/*
 * This class is a Subclass of Player and represents a Midfielder. It has a constructor that calls the super constructor
 *  with the type set to "Midfielder". It also overrides the performAction method to print out "Making a pass...".
 */

class Midfielder extends Player implements Runnable, Substituable {

    // Constructor
    public Midfielder(String name, int age, int number, String teamName) {
        super(name, age, number, teamName);
    }

    @Override
    public void performAction() {
        // Simulate the midfielders' ability to pass the ball
        System.out.println(getName() + " is passing the ball.");
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

