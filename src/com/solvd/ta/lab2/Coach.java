package com.solvd.ta.lab2;

/*
 * This class represents a Coach. It is a subclass of the Person class.
 * It has a constructor that takes in a name and age as parameters,
 * and a method called motivateTeam() which prints a motivational message.
 */

class Coach extends Person implements Coachable, Cheerable {

    // Constructor
    Coach(String name, int age) {
        super(name, age);
    }

    // motivateTeam() method
    public void instructTeam() {
        System.out.println("Instructing the team...");
    }

    // cheer() method
    public void cheer() {
        System.out.println(this.getName() + " is cheering up his team...");
    }
}
