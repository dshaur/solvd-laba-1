package com.solvd.ta.lab2;

/*
 * This class represents a Referee, which is a type of Person. It has a constructor that takes a name
 * and age as parameters, and it has a method whistle() that prints a message.
 */

class Referee extends Person implements Runnable {

    // Constructor
    Referee(String name, int age) {
        super(name, age);
    }

    // whistle() method
    public void whistle() {
        System.out.println("The referee " + this.getName() + " is whistling...");
    }

    //  run() method
    @Override
    public void run() {
        System.out.println(getName() + " is running.");
    }
}
