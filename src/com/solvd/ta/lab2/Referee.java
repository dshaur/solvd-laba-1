package com.solvd.ta.lab2;

class Referee extends Person {
    Referee(String name, int age) {
        super(name, age);
    }

    public void whistle() {
        System.out.println("Whistling...");
    }
}
