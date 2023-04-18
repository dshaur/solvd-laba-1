package com.solvd.ta.lab2;

abstract class Player extends Person {
    private int number;
    private String position;

    Player(String name, int age, int number, String position) {
        super(name, age);
        this.number = number;
        this.position = position;
    }

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

    abstract void performAction();
}