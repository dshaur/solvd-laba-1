package com.solvd.ta.lab2;

/*
 * This is the Player abstract class which extends from the Person class. It contains variables for number and position
 * as well as getter and setter methods for them. There is also an abstract method performAction() which should be
 * overridden in a derived class.
 */

abstract class Player extends Person {

    // Attributes and variables
    private int number;
    private String position;

    // Constructor
    Player(String name, int age, int number, String position) {
        super(name, age);
        this.number = number;
        this.position = position;
    }

    // Getters and Setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Abstract method to be overridden in subclass
    abstract void performAction();
}