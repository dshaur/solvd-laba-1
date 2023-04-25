package com.solvd.ta.lab2;

/*
 * This class represents a Coach. It is a subclass of the Person class.
 * It has a constructor that takes in a name and age as parameters,
 * and a method called motivateTeam() which prints a motivational message.
 */

class Coach extends Person {

    // Constructor
    Coach(String name, int age) {
        super(name, age);
    }

    public void giveInstructions(String instructions) {
        System.out.println(this.getName() + ": " + instructions);
    }

    public void motivatePlayer(Player player) {
        // Default behavior - do nothing for now
    }


    // motivateTeam() method
    public void motivateTeam() {
        System.out.println("Motivating the team...");
    }
}
