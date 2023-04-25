package com.solvd.ta.lab2;

/*
 * This program is used to create a match between two teams.
 * It instantiates two teams, a referee, a stadium and a match, and then calls the start() method on the match.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a stadium
        Stadium stadium = new Stadium("Santiago Bernabeu", 50000);
        // Create a referee
        Referee referee = new Referee("John Smith", 45);
        // Create players for home team
        ArrayList<Player> homeTeam = new ArrayList<>();
        homeTeam.add(new Striker("Benedetto", 25, 9, "Home Team"));
        homeTeam.add(new Striker("Villa", 28, 10, "Home Team"));
        homeTeam.add(new Midfielder("Pol", 30, 8, "Home Team"));
        homeTeam.add(new Midfielder("Medina", 27, 6, "Home Team"));
        homeTeam.add(new Midfielder("Varela", 26, 12, "Home Team"));
        homeTeam.add(new Midfielder("Ramirez", 22, 11, "Home Team"));
        homeTeam.add(new Defender("Barco", 29, 5, "Home Team"));
        homeTeam.add(new Defender("Figal", 32, 4, "Home Team"));
        homeTeam.add(new Defender("Valentini", 24, 3, "Home Team"));
        homeTeam.add(new Defender("Chelo", 24, 2, "Home Team"));
        homeTeam.add(new Goalkeeper("Romero", 33, 1, "Home Team"));

        // Create players for away team
        ArrayList<Player> awayTeam = new ArrayList<>();
        awayTeam.add(new Striker("Tom", 23, 9, "Away Team"));
        awayTeam.add(new Striker("Richard", 27, 10, "Away Team"));
        awayTeam.add(new Midfielder("Harry", 29, 8, "Away Team"));
        awayTeam.add(new Midfielder("Max", 25, 6, "Away Team"));
        awayTeam.add(new Midfielder("Sam", 24, 12, "Away Team"));
        awayTeam.add(new Midfielder("Fer", 19, 7, "Away Team"));
        awayTeam.add(new Defender("Will", 30, 5, "Away Team"));
        awayTeam.add(new Defender("Doug", 28, 4, "Away Team"));
        awayTeam.add(new Defender("Tim", 26, 3, "Away Team"));
        awayTeam.add(new Defender("Casco", 31, 2, "Away Team"));
        awayTeam.add(new Goalkeeper("Kevin", 32, 1, "Away Team"));

        // Create coaches
        Coach homeCoach = new Coach("Peter", 56);
        Coach awayCoach = new Coach("Edward", 49);

        // Coaches give team instructions
        homeCoach.instructTeam();
        awayCoach.instructTeam();

        // Create a match
        Match match = new Match(homeTeam, awayTeam, stadium, referee);

        // Play the match
        match.playMatch();

        // After match ends, coaches cheer up their teams
        homeCoach.cheer();
        awayCoach.cheer();

    }
}