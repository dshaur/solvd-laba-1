package com.solvd.ta.lab2;

class Midfielder extends Player {
    Midfielder(String name, int age, int number) {
        super(name, age, number, "Midfielder");
    }

    @Override
    void performAction() {
        System.out.println("Making a pass...");
    }
}

