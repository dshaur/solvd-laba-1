package com.solvd.ta.lab2;

class Coach extends Person {
    Coach(String name, int age) {
        super(name, age);
    }

    public void motivateTeam() {
        System.out.println("Motivating the team...");
    }
}
