package com.solvd.ta.lab2;

/*
 * This is the class for representing matches. It has four fields,
 * homeTeam, awayTeam, referee, and stadium, to store related objects.
 * The playMatch() method is provided to start the match, which involves
 * letting both homeTeam and awayTeam play against each other.
 */

import java.util.ArrayList;
import java.util.Random;

class Match {

    // Attributes and variables
    private final ArrayList<Player> homeTeam;
    private final ArrayList<Player> awayTeam;
    private Referee referee;
    private Stadium stadium;

    private static final Score score = new Score();
    private static final Random random = new Random();

    /* This is the constructor of the Match class which is used to initialize the fields homeTeam, awayTeam, referee
    and stadium with the values specified in the parameters. */
    public Match(ArrayList<Player> homeTeam, ArrayList<Player> awayTeam, Stadium stadium, Referee referee) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
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
        System.out.println("The match between Boca Juniors and River Plate starts now at the Santiago Bernabeu stadium!");


        // Randomly determine which team gets possession first
        ArrayList<Player> teamWithPossession;
        if (random.nextBoolean()) {
            teamWithPossession = homeTeam;
            System.out.println(homeTeam.get(0).getName() + " starts with possession!");
        } else {
            teamWithPossession = awayTeam;
            System.out.println(awayTeam.get(0).getName() + " starts with possession!");
        }

        int count = 0;

        referee.whistle();

        // Play the match
        while (true) {
            count++;
            Player playerWithPossession = teamWithPossession.get(random.nextInt(teamWithPossession.size()));
            System.out.println(playerWithPossession.getName() + " has the ball.");
            // Simulate player actions
            playerWithPossession.performAction();
            // Randomly determine if the opposing team takes possession next
            if (random.nextBoolean()) {
                if (teamWithPossession == homeTeam) {
                    teamWithPossession = awayTeam;
                } else {
                    teamWithPossession = homeTeam;
                }
            }
            // Check if the match is over
            if (count == 20) {
                System.out.println("The match is over!");
                break;
            }
        }
        // Report the final score
        System.out.println("Boca Juniors " + score.getHomeScore() + " - " + score.getAwayScore() + " River Plate");
    }

    public static Score getScore() {
        return score;
    }
}