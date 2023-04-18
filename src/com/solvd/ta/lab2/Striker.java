package com.solvd.ta.lab2;

class Striker extends Player {
    Striker(String name, int age, int number) {
        super(name, age, number, "Striker");
    }

    @Override
    void performAction() {
        System.out.println("Scoring a goal...");
    }
}

