package com.solvd.ta.lab2;

public class Score {

    private int homeScore;
    private int awayScore;

    public Score() {
        homeScore = 0;
        awayScore = 0;
    }

    public void homeScored() {
        homeScore++;
    }

    public void awayScored() {
        awayScore++;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

}
