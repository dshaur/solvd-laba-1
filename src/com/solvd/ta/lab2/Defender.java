package com.solvd.ta.lab2;

/*
 * This class is a child class of Player and is used to represent a Defender in a game.
 * It has a constructor which takes in a name, age and number, and sets the position to "Defender".
 * It also contains an overridden method to perform the action of a Defender, which is to clear the ball.
 */

class Defender extends Player {

    // Constructor
    Defender(String name, int age, int number) {
        super(name, age, number, "Defender");
    }

    // Override of the performAction() method from Player Class
    @Override
    void performAction() {
        System.out.println("Clearing the ball...");
    }
}
