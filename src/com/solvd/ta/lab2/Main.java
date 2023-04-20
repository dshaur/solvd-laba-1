package com.solvd.ta.lab2;

/*
 * This program is used to create a match between two teams.
 * It instantiates two teams, a referee, a stadium and a match, and then calls the start() method on the match.
 */

public class Main {
    public static void main(String[] args) {

        /* This code creates two teams, a referee and a stadium to simulate a football match.
         * The home team has a coach, a goalkeeper, four defenders, four midfielders and two strikers.
         * The away team also has a coach, a goalkeeper, four defenders, four midfielders and two strikers.
         * The referee is Mike Taylor and the stadium that the match will be held in is the Santiago Bernabéu.
         */
        Coach homeCoach = new Coach("John Smith", 45);

        Goalkeeper homeGoalkeeper = new Goalkeeper("David Johnson", 28, 1);

        Defender[] homeDefenders = new Defender[]{
                new Defender("Chris Brown", 25, 2),
                new Defender("Mark Davis", 26, 3),
                new Defender("Paul Wilson", 23, 4),
                new Defender("Peter Clark", 22, 5),
        };

        Midfielder[] homeMidfielders = new Midfielder[]{
                new Midfielder("Alex Jones", 24, 6),
                new Midfielder("Andy Lee", 24, 7),
                new Midfielder("Brian Williams", 26, 8),
                new Midfielder("Charlie Turner", 27, 9),
        };

        Striker[] homeStrikers = new Striker[]{
                new Striker("Tom Smith", 28, 10),
                new Striker("Mike Johnson", 23, 11),
        };

        Team homeTeam = new Team("Home Team", homeCoach, homeGoalkeeper, homeDefenders, homeMidfielders, homeStrikers);

        Coach awayCoach = new Coach("Tom Brown", 42);

        Goalkeeper awayGoalkeeper = new Goalkeeper("Matt Davis", 30, 1);

        Defender[] awayDefenders = new Defender[]{
                new Defender("James Wilson", 24, 2),
                new Defender("Nick Clark", 26, 3),
                new Defender("Harry Turner", 27, 4),
                new Defender("George Jones", 25, 5),
        };

        Midfielder[] awayMidfielders = new Midfielder[]{
                new Midfielder("Dan Smith", 23, 6), new Midfielder("Sam Johnson", 24, 7),
                new Midfielder("Jack Brown", 26, 8),
                new Midfielder("Oliver Davis", 25, 9),
        };

        Striker[] awayStrikers = new Striker[]{
                new Striker("Ben Wilson", 28, 10),
                new Striker("Adam Clark", 23, 11),
        };

        Team awayTeam = new Team("Away Team", awayCoach, awayGoalkeeper, awayDefenders, awayMidfielders, awayStrikers);

        Referee referee = new Referee("Mike Taylor", 40);

        Stadium stadium = new Stadium("Santiago Bernabeu", 50000);

        // This code creates a new match object with the given home team, away team, referee and stadium.
        // The start() method is then called to start the match.
        Match match = new Match(homeTeam, awayTeam, referee, stadium);

        // Method calls for each Team's coach to motivate their players before the match
        homeCoach.motivateTeam();
        awayCoach.motivateTeam();

        // Method call for the Referee to signal the start of the match
        referee.whistle();

        // Method for starting the match between the teams
        match.start();
    }
}