package com.solvd.ta.lab2;

/*
 * This is the class for representing matches. It has four fields,
 * homePlayers, awayPlayers, referee, and stadium, to store related objects.
 * The playMatch() method is provided to start the match, which involves
 * letting both homePlayers and awayPlayers play against each other.
 */

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

class Match {

    // Attributes and variables
    private final Team homeTeam;
    private final Team awayTeam;
    private final ArrayList<Player> homePlayers;
    private final ArrayList<Player> awayPlayers;
    private Referee referee;
    private Stadium stadium;

    private static final Score score = new Score();
    private static final Random random = new Random();

    /* This is the constructor of the Match class which is used to initialize the fields homePlayers, awayPlayers, referee
    and stadium with the values specified in the parameters. */
    public Match(Team homeTeam, Team awayTeam, ArrayList<Player> homePlayers, ArrayList<Player> awayPlayers, Stadium stadium, Referee referee) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homePlayers = homePlayers;
        this.awayPlayers = awayPlayers;
        this.stadium = stadium;
        this.referee = referee;
    }

    // Setters and Getters from hw2 practice

    public Referee getReferee() {
        return referee;
    }

    public void setReferee(Referee referee) {
        this.referee = referee;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    /*
     * This class represents a single match between two teams.
     */
    public void playMatch() {

        // Check if the stadium capacity is sufficient
        if (stadium.getCapacity() < 0 || stadium.getCapacity() > 50000) {
            try {
                throw new StadiumCapacityException("Stadium capacity is invalid or exceeded for the match.");
            } catch (StadiumCapacityException e) {

                // Handle the exception: display an error message or take appropriate actions
                System.err.println(e.getMessage());
                System.exit(1);
            }
        }

        // Check if the home team or away team is empty
        if (Objects.equals(homeTeam.getName(), "") || Objects.equals(awayTeam.getName(), "")) {
            try {
                throw new TeamNotFoundException("Home team or away team not found.");
            } catch (TeamNotFoundException e) {
                // Handle the exception: display an error message or take appropriate actions
                System.err.println(e.getMessage());
                System.exit(1);
            }
        }

        System.out.println("The match between " + homeTeam.getName() + " and " + awayTeam.getName() + " starts now at the " + stadium.getName() + " stadium!");


        // Check if the home Coach or away Coach is empty
        if (Objects.equals(homeTeam.getCoach().getName(), "") || Objects.equals(awayTeam.getCoach().getName(), "")) {
            try {
                throw new TeamNotFoundException("Home coach or away coach name not found.");
            } catch (TeamNotFoundException e) {
                // Handle the exception: display an error message or take appropriate actions
                System.err.println(e.getMessage());
                System.exit(1);
            }
        }

        // Coaches instruct their teams
        homeTeam.getCoach().instructTeam();
        awayTeam.getCoach().instructTeam();

        // Check if the referee is null
        if (Objects.equals(referee.getName(), "")) {
            try {
                throw new RefereeNotFoundException("Referee name not found.");
            } catch (RefereeNotFoundException e) {
                // Handle the exception: display an error message or take appropriate actions
                System.err.println(e.getMessage());
                System.exit(1);
            }
        }

        // Referee starts the game
        referee.whistle();

        // Randomly determine which team gets possession first
        ArrayList<Player> teamWithPossession;
        if (random.nextBoolean()) {

            // Check if the player with possession is empty
            if (Objects.equals(homePlayers.get(0).getName(), "")) {
                try {
                    throw new PlayerNotFoundException("Player's name with possession not found.");
                } catch (PlayerNotFoundException e) {

                    // Handle the exception: display an error message or take appropriate actions
                    System.err.println(e.getMessage());
                    System.exit(1);
                }
            }

            teamWithPossession = homePlayers;

            System.out.println(homePlayers.get(0).getName() + " starts with possession!");

        } else {

            // Check if the player with possession is empty
            if (Objects.equals(awayPlayers.get(0).getName(), "")) {
                try {
                    throw new PlayerNotFoundException("Player's name with possession not found.");
                } catch (PlayerNotFoundException e) {

                    // Handle the exception: display an error message or take appropriate actions
                    System.err.println(e.getMessage());
                    System.exit(1);
                }
            }

            teamWithPossession = awayPlayers;

            System.out.println(awayPlayers.get(0).getName() + " starts with possession!");
        }

        // Counter of actions performed to finalize the match
        int count = 0;

        // Play the match
        while (true) {
            count++;
            Player playerWithPossession = teamWithPossession.get(random.nextInt(teamWithPossession.size()));
            System.out.println(playerWithPossession.getName() + " has the ball.");
            // Simulate player actions
            playerWithPossession.performAction();
            // Randomly determine if the opposing team takes possession next
            if (random.nextBoolean()) {
                if (teamWithPossession == homePlayers) {
                    teamWithPossession = awayPlayers;
                } else {
                    teamWithPossession = homePlayers;
                }
            }
            // Check if the match is over according to the counter
            if (count == 20) {

                // The referee ends the match
                referee.whistle();
                System.out.println("The match is over!");

                // Once the match ends, coaches cheer up their teams
                homeTeam.getCoach().cheer();
                awayTeam.getCoach().cheer();
                break;
            }
        }

        // Report the final score
        System.out.println(homeTeam.getName() + " " + score.getHomeScore() + " - " + score.getAwayScore() + " " + awayTeam.getName());

        // Make the winner celebrate, otherwise it is a draw
        if (score.getHomeScore() > score.getAwayScore()) {
            homeTeam.celebrate();
        } else if (score.getHomeScore() < score.getAwayScore()) {
            awayTeam.celebrate();
        } else {
            System.out.println("It's a draw!");
        }

    }

    public static Score getScore() {
        return score;
    }
}