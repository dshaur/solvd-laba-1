package com.solvd.ta.lab2;

/*
 * This is the class for representing matches. It has four fields,
 * homeTeam, awayTeam, referee, and stadium, to store related objects.
 * The start() method is provided to start the match, which involves
 * letting both homeTeam and awayTeam play against each other.
 */

class Match {

    // Attributes and variables
    private Team homeTeam;
    private Team awayTeam;
    private Referee referee;
    private Stadium stadium;


    /* This is the constructor of the Match class which is used to initialize the fields homeTeam, awayTeam, referee
    and stadium with the values specified in the parameters. */
    Match(Team homeTeam, Team awayTeam, Referee referee, Stadium stadium) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.referee = referee;
        this.stadium = stadium;
    }

    // Setters and Getters from hw2 practice
    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

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
     * It stores the two teams playing in the match and contains a method to start the match.
     * When the start() method is called, it will cause the two teams to play against each other.
     * This is a simplified version that will incorporate more complex logic in the future as the project advances.
     */
    public void start() {
        System.out.println("Match started!");
        homeTeam.playMatch(awayTeam);
        awayTeam.playMatch(homeTeam);
        System.out.println("Match ended!");
    }
}