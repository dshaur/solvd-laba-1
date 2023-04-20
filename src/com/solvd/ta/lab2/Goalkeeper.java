package com.solvd.ta.lab2;

/*
 * This class represents a Goalkeeper Player. It extends the Player class and
 * overrides the performAction() method to print a statement specific to the Goalkeeper.
 */
class Goalkeeper extends Player {

    // Constructor
    Goalkeeper(String name, int age, int number) {
        super(name, age, number, "Goalkeeper");
    }

    // Override of the performAction() method from Player Class
    @Override
    void performAction() {
        System.out.println("Saving a goal...");
    }
}

