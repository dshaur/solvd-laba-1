package com.solvd.ta.lab2;

/*
 * This class represents the Team model with attributes name, coach, goalkeeper, defenders, midfielders and strikers.
 * It provides getter and setter methods for each attribute, as well as the method playMatch to play a match against an opponent.
 */

import java.util.Arrays;
import java.util.Objects;

class Team {
    private String name;
    private Coach coach;
    private Goalkeeper goalkeeper;
    private Defender[] defenders;
    private Midfielder[] midfielders;
    private Striker[] strikers;

    Team(String name, Coach coach, Goalkeeper goalkeeper, Defender[] defenders, Midfielder[] midfielders, Striker[] strikers) {
        this.name = name;
        this.coach = coach;
        this.goalkeeper = goalkeeper;
        this.defenders = defenders;
        this.midfielders = midfielders;
        this.strikers = strikers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Goalkeeper getGoalkeeper() {
        return goalkeeper;
    }

    public void setGoalkeeper(Goalkeeper goalkeeper) {
        this.goalkeeper = goalkeeper;
    }

    public Defender[] getDefenders() {
        return defenders;
    }

    public void setDefenders(Defender[] defenders) {
        this.defenders = defenders;
    }

    public Midfielder[] getMidfielders() {
        return midfielders;
    }

    public void setMidfielders(Midfielder[] midfielders) {
        this.midfielders = midfielders;
    }

    public Striker[] getStrikers() {
        return strikers;
    }

    public void setStrikers(Striker[] strikers) {
        this.strikers = strikers;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", coach=" + coach +
                ", goalkeeper=" + goalkeeper +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name) &&
                Objects.equals(coach, team.coach) &&
                Objects.equals(goalkeeper, team.goalkeeper) &&
                Arrays.equals(defenders, team.defenders) &&
                Arrays.equals(midfielders, team.midfielders) &&
                Arrays.equals(strikers, team.strikers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, coach, goalkeeper);
        result = 31 * result + Arrays.hashCode(defenders);
        result = 31 * result + Arrays.hashCode(midfielders);
        result = 31 * result + Arrays.hashCode(strikers);
        return result;
    }

    public void playMatch(Team opponent) {
        System.out.println(this.getName() + " vs " + opponent.getName());
        for (Player player : this.getDefenders()) {
            player.performAction();
        }
        for (Player player : this.getMidfielders()) {
            player.performAction();
        }
        for (Player player : this.getStrikers()) {
            player.performAction();
        }
    }
}