package com.solvd.ta.lab2;

class Goalkeeper extends Player {
    Goalkeeper(String name, int age, int number) {
        super(name, age, number, "Goalkeeper");
    }

    @Override
    void performAction() {
        System.out.println("Saving a goal...");
    }
}

