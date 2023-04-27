package com.solvd.ta.lab2;

import java.util.Random;

/*
 * This class represents a Goalkeeper Player. It extends the Player class and
 * overrides the performAction() method to print a statement specific to the Goalkeeper.
 */
class Goalkeeper extends Player implements Runnable, Substituable {

    public Goalkeeper(String name, int age, int number, String teamName) {
        super(name, age, number, teamName);
    }

    @Override
    public void performAction() {
        // Simulate the goalkeeper's ability to save a goal
        Random random = new Random();
        if (random.nextDouble() < 0.3) {
            System.out.println(getName() + " made a great save!");
        } else {
            System.out.println(getName() + " performed a goal kick.");
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

