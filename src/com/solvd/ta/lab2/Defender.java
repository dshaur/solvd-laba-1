package com.solvd.ta.lab2;

class Defender extends Player {
    Defender(String name, int age, int number) {
        super(name, age, number, "Defender");
    }

    @Override
    void performAction() {
        System.out.println("Clearing the ball...");
    }
}
