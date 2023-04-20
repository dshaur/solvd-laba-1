package com.solvd.ta.lab2;

/*
 * This class is a Subclass of Player and represents a Midfielder. It has a constructor that calls the super constructor
 *  with the type set to "Midfielder". It also overrides the performAction method to print out "Making a pass...".
 */

class Midfielder extends Player {

    // Constructor
    Midfielder(String name, int age, int number) {
        super(name, age, number, "Midfielder");
    }

    // Override of the performAction() method from Player Class
    @Override
    void performAction() {
        System.out.println("Making a pass...");
    }
}

